package de.skurt

class Field {
	
	String name
	String description
	String picUrl
	String xPosition
	String yPosition
	String xSize
	String ySize
	//List<String> questions
	String questions

    static constraints = {
		name maxSize:155
		description nullable:true, widget:'textarea'
		picUrl nullable:true, url:true
		xPosition nullable:true, maxSize:5, range:0..100
		yPosition nullable:true, maxSize:5, range:0..100
		xSize nullable:true, maxSize:5, range:0..100
		ySize nullable:true, maxSize:5, range:0..100
		questions nullable:true, widget:'textarea'
    }
	
	//static hasMany = [questions:String]
	
	String toString() {
		name
	}
}
