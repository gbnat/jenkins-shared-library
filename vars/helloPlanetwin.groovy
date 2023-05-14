def call(Map config = [:]) {
    echo "Hello Planet groovy ${config.name}. Today is ${config.dayOfWeek}."
    echo "Hello Planet groovy %{config.name}%. Today is %{config.dayOfWeek}%."
}
