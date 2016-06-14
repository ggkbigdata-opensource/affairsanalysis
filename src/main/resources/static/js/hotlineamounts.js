/**
 * 
 */
$(document).ready(function(){
	var ctx = $("#myChart");

	var scatterChart = new Chart(ctx, {
	    type: 'line',
	    data: {
	        datasets: [{
	            label: 'Scatter Dataset',
	            data: [{
	                x: -10,
	                y: 0
	            }, {
	                x: 0,
	                y: 10
	            }, {
	                x: 10,
	                y: 5
	            }]
	        }]
	    },
	    options: {
	        scales: {
	            xAxes: [{
	                type: 'linear',
	                position: 'bottom'
	            }]
	        }
	    }
	});
});
