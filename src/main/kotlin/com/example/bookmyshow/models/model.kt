package com.example.bookmyshow.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.Getter
import lombok.Setter

@Entity
@Getter
@Setter
class Ticket{
    @Id
    var id: Long = 0
    lateinit var name : String
}