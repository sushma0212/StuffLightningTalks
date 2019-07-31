'use strict'
var app = angular.module('demo', ['ui.bootstrap']);  
    app.controller("StuffLightningTalksController", ["$scope", '$http', '$attrs',
    function($scope, $http, $attrs) {
    	$http.get("/getAllTopis")
	    .then(function (response) {$scope.allTopics = response.data;});
    	
    	$scope.countOf = function(text) {
    		var maxlength = parseInt($attrs.topicDescription, 120);
    	    var s = text ? text.split(/\s+/) : 0; // it splits the text on space/tab/enter
    	    
    	    	return s ? s.length : '';     	
    	};	
	$scope.saveTopic = function () {
        $http({
            method: 'POST',
            url: "/createTopic",
            data: {
            	topic: $scope.topic,
            	topicDescription: $scope.topicDescription,
            	emailAddress:$scope.email
            }
        });}
    
    }
]);