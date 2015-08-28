var $ = function (id) {
    return document.getElementById(id); 
}



var calculate_click = function(){

	var subtotal = parseFloat($("subtotal").value);
	var taxRate = parseFloat($("taxRate").value);
	$("salesTax").value = "";
	$("total").value = "";

	if(isNaN(subtotal) || subtotal<0){
		alert("Subtotal must be greater than 0");
	}else if (isNaN(taxRate) || taxRate < 0){
		alert("Tax rate must be greater than 0");
	}else{

		var salesTax = subtotal*(taxRate/100);
	
		salesTax = parseFloat(salesTax.toFixed(2));

		var total = subtotal + salesTax;
		
	
		$("salesTax").value = salesTax;
		$("total").value = total.toFixed(2);
	}
	
	
}

window.onload = function () {
	 $("calculate").onclick = calculate_click;
	 $("subtotal").focus;
	}