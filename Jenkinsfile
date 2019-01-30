pipeline {

    agent any
    //def path1 = tool name: 'gradle-5.1.1', type 'gradle'
    //def path2 = tool name: 'gradle-4.7', type 'gradle'

   // tools {
   //         gradle 'GRADLE_LATEST'
   //       }

    stages{
        def path1 = tool name: 'gradle-5.1.1', type 'gradle'
        def path2 = tool name: 'gradle-4.7', type 'gradle'

         stage ('Hello 1'){
            steps {
                  echo '$(path1)*$(path2)*******************************123***********'
            }
         }

        // stage ('My build'){
        //    steps {
        //       sh 'gradle -version'
         //   }
         //}
    }







}