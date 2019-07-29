'use strict'
var demoApp = angular.module('demo', ['ui.bootstrap', 'demo.controllers']);
demoApp.constant("CONSTANTS", {
    saveTopic: "/createTopic"
});