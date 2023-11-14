package com.example.kotlinscriptsourcerootdemo.db

databaseChangeLog {
    includeAll("")
    changeSet("test-1", "author") {
        createTable("test") {
            column(name = "test", type = "LONGTEXT") {
                constraints(nullable = false)
            }
        }
    }
}
