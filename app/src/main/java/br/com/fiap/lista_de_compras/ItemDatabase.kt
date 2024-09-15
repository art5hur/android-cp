package br.com.fiap.lista_de_compras

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}