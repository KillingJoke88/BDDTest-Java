pipeline {
    agent any
    tools {
        maven 'M2'
        jdk 'JAVA_HOME'
    }
    stages {


        stage ('Build') {
            steps {
					    sh 'mvn clean install' 
            }
            post {
                success {
					sh ''' 
						echo "Success"
					'''
                }
            }
        }
    }
}
