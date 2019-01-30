pipeline {

    agent any

    tools {
            gradle "GRADLE_LATEST"
          }

        //stages{
        // stage ('Hello 1'){
        //    steps {
        //          echo '********************************123***********'
        //    }
        // }

         stage ('My build'){
            steps {
               sh 'gradle -version'
            }
         }







}