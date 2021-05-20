package com.example.foody

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Anotasi untuk menandai kelas Aplikasi di mana komponen Dagger harus dihasilkan.
// Karena semua komponen akan dibangun dalam kompilasi yang sama dengan aplikasi anotasi,
@HiltAndroidApp
class MyApplication: Application() {
}