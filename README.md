<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="Documentation/images/logo.png" alt="Logo" width="80" height="80">
  </a>
  
   <h3 align="center">CoreBankingSystem</h3>
   <p align="center">
     Bienvenido a la Prueba Tecnica Desarrollador de Software.
   </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Tabla de Contenido</summary>
  <ol>
    <li>
      <a href="#about-the-project">Sobre el Projecto</a>
      <ul>
        <li><a href="#ejercicio-por-realizar">Ejercicio por realizar</a></li>
        <li><a href="#built-with">Stack Tecnológico</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Como empezar</a>
      <ul>
        <li><a href="#prerequisites">Prerrequisitos</a></li>
        <li><a href="#installation">Instalación</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## Sobre el Proyecto

Una compañía requiere diseñar un pequeño sistema bancario que soporte de cara a cliente final (interno y externo) toda la transaccionalidad integral de operaciones realizada por los usuarios. El sistema por diseñar debe tener como mínimo los siguientes requisitos:

* Un portal administrativo de cliente interno que permita crear los clientes, asignarles una cuenta, asignarles el saldo inicial y consultar los usuarios creados con el saldo de su cuenta.
* Un portal de cliente externo que contenga un mecanismo de autenticación para validar la identidad de los usuarios creados en el portal administrativo. Una vez que la identidad el cliente sea validado, el portal debe permitir al usuario realizar un conjunto de operaciones sobre la cuenta:

  * Consulta de saldo.
  * Retiros.
  * Consignaciones.
  * Transferencias a cuentas de otros clientes.
  * Consulta de movimientos.

<!-- EJERCICIO POR REALIZAR -->
## Ejercicio por realizar

Desarrollar el sistema bancario dando cumplimiento a las características mencionadas en la contextualización del problema. En la entrevista tendrá un espacio de 1 hora para sustentar e indicar como resolvió cada uno de los siguientes puntos:

1. _Análisis y diseño_: Definición de los patrones y modelo de diseño que considere necesarios implementar en el desarrollo de la solución.
2. _Stack tecnológico para desarrollo_: Lenguajes de programación seleccionados, el porqué de la elección y cuáles son las ventajas y desventajas de estos frente a la propuesta de solución planteada.
3. _Estándares y buenas prácticas de desarrollo_: Estrategias usadas para garantizar la calidad de los artefactos de software desarrollados para la solución.
4. _Aspectos adicionales_: Que aspectos adicionales considera necesarios aplicar para garantizar el que el desarrollo solvente la necesidad planteada en el contexto del problema.

Los artefactos de la prueba están organizados de la siguiente forma:

<!-- BUILT WITH -->
## Stack Tecnológico

Para el Sistema Bancario se establece el Lenguaje de Programación principal JAVA, específicamente la versión Java la Versión 17 LTS.

* Java 17 LTS.
* Spring Framework
* Spring Boot v2.7.4
* Spring MVC
* Spring Security
* Spring Data
* PostgreSQL

<!-- GETTING STARTED -->
## Como Comenzar

### Prerrequisitos

1. Instalación de los siguientes programas:
  * PostgreSQL
  * Java 17 LTS

2. Creación del usuario de conexión de la Base de Datos:

* SQL
  ```sql
  CREATE ROLE banking_admin WITH
    LOGIN
    NOSUPERUSER
    NOCREATEDB
    NOCREATEROLE
    INHERIT
    NOREPLICATION
    CONNECTION LIMIT -1
    PASSWORD 'xxxxxx';
  ```

### Instalación

**Carpeta Services:** 

Contiene los artefactos del código fuente de los servicios a desplegar.

**Carpeta Documentation:** 

Contiene los artefactos de documentación del sistema desarrollado.

### Tareas
- [ ] Definir el formato de Word para el Documento de Arquitectura de Software
