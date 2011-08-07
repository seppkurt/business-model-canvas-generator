package de.skurt

class PublicController {

    def index = {
		[canvas: Canvas.get(1)]
	}
	
	def save = {
		CanvasInstance ci = new CanvasInstance()
		bindData(ci, params)
		if (ci.save()){
			redirect action:'index'
		}
		else {
			log.error ci.errors
			render view:"/public/index", model:[ci:ci, canvas: Canvas.get(1)]
		}
    }
}
