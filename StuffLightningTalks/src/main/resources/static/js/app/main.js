'use strict'
var app = angular.module('main', []);  
  app.controller('topicsCtrl', function($scope, $http) {
	    $http.get("/getAllTopis")
	    .then(function (response) {$scope.allTopics = response.data;});
});