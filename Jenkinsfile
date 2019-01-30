pipeline {

    agent any
    //def path1 = tool name: 'gradle-5.1.1', type 'gradle'
    //def path2 = tool name: 'gradle-4.7', type 'gradle'

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