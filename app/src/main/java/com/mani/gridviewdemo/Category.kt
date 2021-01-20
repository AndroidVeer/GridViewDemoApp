package com.mani.gridviewdemo

class Category
{
    var catID : Int = 0
    var catName : String? = null
    var catImage : Int?= 0

    constructor(catID: Int, catName: String?, catImage: Int?) {
        this.catID = catID
        this.catName = catName
        this.catImage = catImage
    }
}