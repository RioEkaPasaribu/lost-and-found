package com.ifs21033.lostandfound.di

import android.content.Context
import com.ifs21033.lostandfound.data.repository.LostRepository
import com.ifs21033.lostandfound.data.pref.UserPreference
import com.ifs21033.lostandfound.data.pref.dataStore
import com.ifs21033.lostandfound.data.remote.retrofit.ApiConfig
import com.ifs21033.lostandfound.data.remote.retrofit.IApiService
import com.ifs21033.lostandfound.data.repository.AuthRepository
import com.ifs21033.lostandfound.data.repository.TodoRepository
import com.ifs21033.lostandfound.data.repository.UserRepository
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
object Injection {
    fun provideAuthRepository(context: Context): AuthRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        val user = runBlocking { pref.getSession().first() }
        val apiService: IApiService = ApiConfig.getApiService(user.token)
        return AuthRepository.getInstance(pref, apiService)
    }
    fun provideUserRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        val user = runBlocking { pref.getSession().first() }
        val apiService: IApiService = ApiConfig.getApiService(user.token)
        return UserRepository.getInstance(apiService)
    }
    fun provideTodoRepository(context: Context): TodoRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        val user = runBlocking { pref.getSession().first() }
        val apiService: IApiService = ApiConfig.getApiService(user.token)
        return TodoRepository.getInstance(apiService)
    }
    fun provideLostfoundRepository(context: Context): LostRepository{
        val pref = UserPreference.getInstance(context.dataStore)
        val user = runBlocking { pref.getSession().first() }
        val apiService: IApiService = ApiConfig.getApiService(user.token)
        return LostRepository.getInstance(apiService)
    }
}