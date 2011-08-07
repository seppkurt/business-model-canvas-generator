import de.skurt.*

class BootStrap {

    def init = {
		Canvas canvas = new Canvas()
		
		def keyPartners = new Field(
			name:'Key Partners',
			description:"""<h3>motivations for partnerships:</h3>
Optimization and economy
Reduction of risk and uncertainty
Acquisition of particular resources and activities""",
			questions:"""Who are our Key Partners?
Who are our key suppliers?
Which Key Resources are we acquiring from partners?
Which Key Activities do partners perform?"""
			)
		keyPartners.save()
		def keyActivities = new Field(
			name:'Key Activities',
			description:"""<h3>categories</h3>
Production
Problem Solving
Platform/Network""",
			questions:"""What Key Activities do our Value Propositions require?
Our Distribution Channels?
Customer Relationships?
Revenue streams?"""
			)
		keyActivities.save()
		def keyResources = new Field(
			name:'Key Resources',
			description:"""<h3>types of resources</h3>
Physical
Intellectual (brand patents, copyrights, data)
Human
Financial""",
			questions:"""What Key Resources do our Value Propositions require?
Our Distribution Channels? Customer Relationships?
Revenue Streams?"""
			)
		keyResources.save()
		def valuePropositions = new Field(
			name:'Value Propositions',
			description:"""<h3>characteristics</h3>
Newness
Performance
Customization
“Getting the Job Done”
Design
Brand/Status
Price
Cost Reduction
Risk Reduction
Accessibility
Convenience/Usability""",
			questions:"""What value do we deliver to the customer?
Which one of our customer’s problems are we helping to solve?
What bundles of products and services are we offering to each Customer Segment?
Which customer needs are we satisfying?"""
			)
		valuePropositions.save()
		def customerRelationships = new Field(
			name:'Customer Relationships',
			description:"""<h3>examples</h3>
Personal assistance
Dedicated Personal Assistance
Self-Service
Automated Services
Communities
Co-creation""",
			questions:"""What type of relationship does each of our Customer
Segments expect us to establish and maintain with them?
Which ones have we established?
How are they integrated with the rest of our business model?
How costly are they?"""
			)
		customerRelationships.save()
		def customerSegments = new Field(
			name:'Customer Segments',
			description:"""Mass Market
Niche Market
Segmented
Diversified
Multi-sided Platform""",
			questions:"""For whom are we creating value?
Who are our most important customers?"""
			)
		customerSegments.save()
		def channels = new Field(
			name:'Channels',
			description:"""<h3>channel phases:</h3>
<ol><li><h4>1. Awareness</h4>
<p>How do we raise awareness about our company’s products and services?</p></li>
<li><h4>2. Evaluation</h4>
<p>How do we help customers evaluate our organization’s Value Proposition?</p></li>
<li><h4>3. Purchase</h4>
<p>How do we allow customers to purchase specific products and services?</p></li>
<li><h4>4. Delivery</h4>
<p>How do we deliver a Value Proposition to customers?</p></li>
<li><h4>5. After sales</h4>
<p>How do we provide post-purchase customer support?</p></li>
</ol>""",
			questions:"""Through which Channels do our Customer Segments
want to be reached?
How are we reaching them now?
How are our Channels integrated?
Which ones work best?
Which ones are most cost-efficient?
How are we integrating them with customer routines?"""
			)
		channels.save()
		def costStructure = new Field(
			name:'Cost Strucure',
			description:"""<h3>is your business more:</h3>
Cost Driven (leanest cost structure, low price value proposition, maximum automation, extensive outsourcing)
Value Driven ( focused on value creation, premium value proposition)
<h3>sample characteristics:</h3>
Fixed Costs (salaries, rents, utilities)
Variable costs
Economies of scale
Economies of scope""",
			questions:"""What are the most important costs inherent in our business model?
Which Key Resources are most expensive?
Which Key Activities are most expensive?"""
			)
		costStructure.save()
		def revenueStreams = new Field(
			name:'Revenue Stream',
			description:"""<h3>types:</h3>
Asset sale
Usage fee
Subscription Fees
Lending/Renting/Leasing
Licensing
Brokerage fees
Advertising
<h3>fixed pricing</h3>
List Price
Product feature dependent
Customer segment dependent
Volume dependent
<h3>dynamic pricing</h3>
Negotiation( bargaining)
Yield Management
Real-time-Market""",
			questions:"""For what value are our customers really willing to pay?
For what do they currently pay?
How are they currently paying?
How would they prefer to pay?
How much does each Revenue Stream contribute to overall revenues?"""
			)
		revenueStreams.save()

		canvas.keyPartners = keyPartners
		canvas.keyActivities = keyActivities
		canvas.keyResources = keyResources
		canvas.valuePropositions = valuePropositions
		canvas.customerRelationships = customerRelationships
		canvas.customerSegments = customerSegments
		canvas.channels = channels
		canvas.costStructure = costStructure
		canvas.revenueStreams = revenueStreams
		canvas.save()
		log.error canvas.errors
		
		CanvasInstance ci = new CanvasInstance()
		ci.save()
		log.error ci.errors
    }
    def destroy = {
    }
}
