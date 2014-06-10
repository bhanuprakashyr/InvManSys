myApp = angular.module('myAngularApp',[]);

myApp.controller('mainController',['$scope',function($scope){
	alert("hai dear");
	$scope.validateUser = function()
	{
		alert("hai darling "+$scope.user.Name);
		var userName = document.getElementById("userName").value;
		
		
	};
	
}]);

