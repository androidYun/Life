package com.gy.life.utils

import java.sql.Date

object DateUtils {
    fun getCurrentTime(): Date {
        val date = Date(System.currentTimeMillis())
        return date
    }
}