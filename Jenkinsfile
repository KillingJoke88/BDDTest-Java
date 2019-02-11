pipeline {
    agent any
    tools {
        maven 'maven-3.3.3'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
				sh '''
					echo "PATH = ${PATH}"
					echo "M2_HOME = ${M2_HOME}"
				'''
            }
        }

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
