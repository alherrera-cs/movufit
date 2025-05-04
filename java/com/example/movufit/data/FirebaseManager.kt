package com.example.movufit.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

object FirebaseManager {
    val auth     = FirebaseAuth.getInstance()
    val firestore= FirebaseFirestore.getInstance()

    fun currentUserId(): String? = auth.currentUser?.uid

    // e.g. save a workout log:
    fun saveWorkout(userId: String, workout: Map<String, Any>, onComplete: (Boolean)->Unit) {
        firestore.collection("users")
            .document(userId)
            .collection("workouts")
            .add(workout)
            .addOnSuccessListener { onComplete(true) }
            .addOnFailureListener { onComplete(false) }
    }
}
