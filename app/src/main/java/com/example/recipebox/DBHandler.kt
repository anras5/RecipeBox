package com.example.recipebox

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHandler(context: Context, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int) : SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {
    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "recipeDB.db"
        val TABLE_RECIPES = "recipes"
        val COLUMN_ID = "id"
        val COLUMN_RECIPENAME = "recipename"
        val COLUMN_INGREDIENTS = "ingredients"
        val COLUMN_ACTIONS = "actions"
        val COLUMN_MINUTES = "minutes"
        val COLUMN_IMAGEID = "imageid"
        val COLUMN_TYPE = "type"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_RECIPES_TABLE = ("CREATE TABLE "+
                TABLE_RECIPES + "(" + COLUMN_ID + " INTEGER PRIMARY KEY, "
                + COLUMN_RECIPENAME + " TEXT, " + COLUMN_INGREDIENTS + " TEXT, " + COLUMN_ACTIONS +
                " TEXT, " + COLUMN_MINUTES + " INTEGER, " + COLUMN_IMAGEID + " INTEGER, " + COLUMN_TYPE + " TEXT" + ")")
        db.execSQL(CREATE_RECIPES_TABLE)
    }


    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_RECIPES")
        onCreate(db)
    }

    fun addRecipe(recipe: Recipe) {
        val values = ContentValues()
        values.put(COLUMN_ID, recipe.id)
        values.put(COLUMN_RECIPENAME, recipe.name)
        values.put(COLUMN_INGREDIENTS, recipe.ingredients)
        values.put(COLUMN_ACTIONS, recipe.actions)
        values.put(COLUMN_MINUTES, recipe.minutes)
        values.put(COLUMN_IMAGEID, recipe.imageId)
        values.put(COLUMN_TYPE, recipe.type)

        val db = this.writableDatabase
        val result = db.insert(TABLE_RECIPES, null, values)
        db.close()
    }

    fun findRecipe(id: Int):Recipe? {
        val query = "SELECT * FROM $TABLE_RECIPES WHERE $COLUMN_ID LIKE \"$id\""
        val db = this.writableDatabase
        val cursor = db.rawQuery(query, null)
        var recipe: Recipe? = null
        if (cursor.moveToFirst()) {
            val id = cursor.getInt(0)
            val name = cursor.getString(1)
            val ingredients = cursor.getString(2)
            val actions = cursor.getString(3)
            val minutes = cursor.getInt(4)
            val imageId = cursor.getInt(5)
            val type = cursor.getString(6)
            recipe = Recipe(id, name, ingredients, actions, minutes, imageId, type)
            cursor.close()
        }
        db.close()
        return recipe
    }

    fun deleteRecipe(recipename: String):Boolean {
        var result = false
        val query = "SELECT * FROM $TABLE_RECIPES WHERE $COLUMN_RECIPENAME LIKE \"$recipename\""
        val db = this.writableDatabase
        val cursor = db.rawQuery(query, null)
        if(cursor.moveToFirst()) {
            val id = cursor.getInt(0)
            db.delete(TABLE_RECIPES, COLUMN_ID + " = ?", arrayOf(id.toString()))
            cursor.close()
            result = true
        }
        db.close()
        return result
    }

    fun showAll():MutableList<Recipe> {
        val query = "SELECT * FROM $TABLE_RECIPES"
        val db = this.writableDatabase
        val cursor = db.rawQuery(query, null)
        var list: MutableList<Recipe> = mutableListOf()
        var recipe: Recipe? = null
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            val id = cursor.getInt(0)
            val name = cursor.getString(1)
            val ingredients = cursor.getString(2)
            val actions = cursor.getString(3)
            val minutes = cursor.getInt(4)
            val imageId = cursor.getInt(5)
            val type = cursor.getString(6)
            recipe = Recipe(id, name, ingredients, actions, minutes, imageId, type)
            list.add(recipe)
            cursor.moveToNext()
        }
        cursor.close()
        db.close()
        return list
    }
}
