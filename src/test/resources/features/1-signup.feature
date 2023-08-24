@Suite @SignUp
Feature: CP01 - Relizar el registro de un nuevo usuario

  Background: Realizar el registro de un nuevo usuario

    Given el usuario se registra en el sitio web

    Scenario: 1 - Realizar el correcto registro de usuario
      When ingresa username y password
     # Then la aplicación muestra mensaje: Sign up successful