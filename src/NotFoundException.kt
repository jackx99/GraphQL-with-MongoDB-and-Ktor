package com.graphqltest

import java.lang.RuntimeException

class NotFoundException(message: String) : RuntimeException(message)