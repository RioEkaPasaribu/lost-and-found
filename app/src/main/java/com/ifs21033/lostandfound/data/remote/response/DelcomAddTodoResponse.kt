package com.ifs21033.lostandfound.data.remote.response

import com.google.gson.annotations.SerializedName

data class DelcomAddTodoResponse(

	@field:SerializedName("data")
	val data: DataAddTodoResponse,

	@field:SerializedName("success")
	val success: Boolean,

	@field:SerializedName("message")
	val message: String
)

data class DataAddTodoResponse(

	@field:SerializedName("todo_id")
	val todoId: Int
)