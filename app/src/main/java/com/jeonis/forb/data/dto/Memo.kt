package com.jeonis.forb.data.dto

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Memo : RealmObject() {

    @PrimaryKey
    var id: Long = Long.MIN_VALUE
    var title: String = ""
    var content: String = ""
    var type: String = ""
    var created: Long = Long.MIN_VALUE
    var updated: Long = Long.MIN_VALUE
    var removed: Long = Long.MIN_VALUE
    var due: Long = Long.MIN_VALUE
    var done: Boolean = false
}

