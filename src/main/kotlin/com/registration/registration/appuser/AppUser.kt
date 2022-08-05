package com.registration.registration.appuser

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

data class AppUser(
  private val id: Long,
  private val name: String,
  private val username: String,
  private val email: String,
  private val password: String

) : UserDetails {
  override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
    TODO("Not yet implemented")
  }

  override fun getPassword(): String {
    TODO("Not yet implemented")
  }

  override fun getUsername(): String {
    TODO("Not yet implemented")
  }

  override fun isAccountNonExpired(): Boolean {
    TODO("Not yet implemented")
  }

  override fun isAccountNonLocked(): Boolean {
    TODO("Not yet implemented")
  }

  override fun isCredentialsNonExpired(): Boolean {
    TODO("Not yet implemented")
  }

  override fun isEnabled(): Boolean {
    TODO("Not yet implemented")
  }

}