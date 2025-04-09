package com.example.salwano1

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object koneksi {
    private const val URL = "jdbc:postgresql://10.0.2.2:5432/twitter"
    private const val USER = "postgres"
    private const val PASSWORD = "kuanlinee"

    fun connection (): Connection?{
        return try{
            Class.forName("org.postgresql.Driver")
            DriverManager.getConnection(URL,USER, PASSWORD).also {
            }
        }catch (e: SQLException){
            e.printStackTrace()
            println("Hahahaha")
            null
        }
    }
}