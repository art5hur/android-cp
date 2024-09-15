package br.com.fiap.lista_de_compras

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ItemModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int =0,
    val name: String,
)