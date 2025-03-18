package com.mhx.todolist.model.utils

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale

object DateTimeUtils {

    fun isValidDate(date : String , format :String ="dd/MM/yyyy"): Boolean {
        val dateFormat = SimpleDateFormat(format, Locale.getDefault())
        dateFormat.isLenient = false

        return try{
            dateFormat.parse(date)
            true
        } catch (e:ParseException) {
            false
        }
    }

    fun isValidTime(time: String, format: String = "HH:mm"): Boolean {
        val timeFormat = SimpleDateFormat(format, Locale.getDefault())
        timeFormat.isLenient = false

        return try {
            timeFormat.parse(time)
            true
        } catch (e: ParseException) {
            false
        }
    }
}