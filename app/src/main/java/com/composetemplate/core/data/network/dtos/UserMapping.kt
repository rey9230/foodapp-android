package com.composetemplate.core.data.network.dtos

import com.composetemplate.core.domain.model.User

fun UserDto.toUser(): User {
    return User(
        email = email,
        firstName = firstName,
        lastName = lastName,
        avatar = avatar
    )
}