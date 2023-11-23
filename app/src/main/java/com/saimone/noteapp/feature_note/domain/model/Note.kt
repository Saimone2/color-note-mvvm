package com.saimone.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saimone.noteapp.ui.theme.BabyBlue
import com.saimone.noteapp.ui.theme.LightGreen
import com.saimone.noteapp.ui.theme.RedOrange
import com.saimone.noteapp.ui.theme.RedPink
import com.saimone.noteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}