pipeline {

    agent any

    tools {
            gradle 'Gradle 5.1.1'
          }


    stages{

         stage ('Hello 1'){
            steps {
                  echo '*******************************123***********'
            }
         }

         stage ('My build'){
            steps {
               sh 'gradle build'
            }
         }
    }







}