import com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

object ObjectMapper {
    val mapper: ObjectMapper = jacksonObjectMapper()
        .registerModules(JavaTimeModule())
        .configure(FAIL_ON_UNKNOWN_PROPERTIES, false)
}

/*

val personRequest = PersonRequest(name = "Daniel", age = 31)
val personRequestJson = mapper.writeValueAsString(createTargetRequest)

/*
