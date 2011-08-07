package de.skurt

class CanvasInstance {

	String designedFor
	String designedBy
	Date dateCreated
	Date lastUpdated
	String keyPartners
	String keyActivities
	String keyResources
	String valuePropositions
	String customerRelationships
	String channels
	String customerSegments
	String costStructure
	String revenueStreams
	
	static transients = ['hash']

    static constraints = {
		designedBy nullable:true, maxSize:255, widget:'textField'
		designedFor nullable:true, maxSize:255, widget:'textField'
		keyPartners nullable:true, widget:'textarea', blank:false
		keyActivities nullable:true, widget:'textarea', blank:false
		keyResources nullable:true, widget:'textarea', blank:false
		valuePropositions nullable:true, widget:'textarea', blank:false
		customerRelationships nullable:true, widget:'textarea', blank:false
		channels nullable:true, widget:'textarea', blank:false
		customerSegments nullable:true, widget:'textarea', blank:false
		costStructure nullable:true, widget:'textarea', blank:false
		revenueStreams nullable:true, widget:'textarea', blank:false
    }
}
