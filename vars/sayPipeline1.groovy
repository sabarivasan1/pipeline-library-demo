
import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass
def call(Map params) {
pipeline {
    agent any
    stages {
        stage('DemoSayPipe1') {
            steps {
                echo 'Hello, world 1'
                sayHello "${param.name}"

                echo 'The value of foo is : ' + GlobalVars.foo

                script {
                    def person = new SampleClass()
                    person.age = "${param.age}"
                    person.increaseAge(10)
                    echo 'Incremented age, is now : ' + person.age
                    sayAge person.age
                }
            }
        }
    }
}
}
