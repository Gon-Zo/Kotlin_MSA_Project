package com.gonzo.api.domain.post

import com.gonzo.api.domain.BaseEntity
import lombok.NoArgsConstructor
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "POST")
@NoArgsConstructor
class Post : BaseEntity {

    constructor(title: String, content: String) {
        this.title = title
        this.content = content
    }

    @Column(name = "TITLE")
    private var title : String

    @Column(name = "CONTENT")
    private var content : String ?= null

}
