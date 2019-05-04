def call(cos) {
    sh """
    ls
    echo ${cos}
    pwd
    df -h
    """
}
