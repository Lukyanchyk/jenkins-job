folder('TestFolder') {
    displayName('TestFolder')
    description('Folder for XML Seed Jobs')
}

job("TestFolder/get_xml"){
    scm {
        github('Lukyanchyk/jenkins-job', 'main')
    }
    steps {
        shell("""
            ls -l /var/lib/jenkins/jobs/TestFolder/jobs/
            rm -rf /var/lib/jenkins/jobs/TestFolder/jobs/*
            pwd
            ls -l
            mv /var/lib/jenkins/workspace/TestFolder/get_xml/jobs/* /var/lib/jenkins/jobs/TestFolder/jobs/
            ls -l /var/lib/jenkins/jobs/TestFolder/jobs/
        """)
    }
}
