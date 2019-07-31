'use strict'
var app = angular.module('demo', ['ui.bootstrap']);  
    app.controller("StuffLightningTalksController", ["$scope", '$http',
    function($scope, $http) {
    	$http.get("/getAllTopis")
	    .then(function (response) {$scope.allTopics = response.data;});
    	
	$scope.saveTopic = function () {
        $http({
            method: 'POST',
            url: "/createTopic",
            data: {
            	topic: $scope.topic,
            	topicDescription: $scope.topicDescription,
            	emailAddress:"naren.btech@gmail.com"
            }
        });}
    
    }
]);