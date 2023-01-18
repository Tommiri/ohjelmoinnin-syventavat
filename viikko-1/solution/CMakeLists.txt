cmake_minimum_required(VERSION 3.24)
project(solution)

set(CMAKE_CXX_STANDARD 20)

add_executable(solution src/days.cpp src/Event.cpp include/Event.h)
