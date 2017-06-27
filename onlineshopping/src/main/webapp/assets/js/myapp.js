$(function() {
	
	switch(menu){
	
	
	case 'About us':
		$('#about').addClass('active');
		break;
	
	case 'Contact us':
		$('#contact').addClass('active');
		break;
		
	case 'All Products':
		$('#listproducts').addClass('active');
		break;	
			
	default:
		$('#listproducts').addClass('active');
	    $('#a_'+menu).addClass('active');  
	    break;	
	}
	
	/*even we can use directely  $('#a_${category.name}).addClass('active'); */
});