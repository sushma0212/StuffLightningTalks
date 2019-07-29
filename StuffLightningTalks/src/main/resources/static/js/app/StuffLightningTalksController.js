'use strict'
var module = angular.module('demo.controllers', []);
module.controller("StuffLightningTalksController", ["$scope", '$http', "CONSTANTS",
    function($scope, $http, CONSTANTS) {
	$scope.saveTopic = function () {
        $http({
            method: 'POST',
            url: CONSTANTS.saveTopic,
            data: {
            	topic: $scope.topic,
            	topicDescription: $scope.topicDescription,
            	emailAddress:"naren.btech@gmail.com"
            }
        });
    
    };}
]);