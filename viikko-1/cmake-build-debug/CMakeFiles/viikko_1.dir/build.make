# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.25

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/tommi/School/ohjelmoinnin-syventavat/viikko-1

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/viikko_1.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/viikko_1.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/viikko_1.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/viikko_1.dir/flags.make

CMakeFiles/viikko_1.dir/src/days.cpp.o: CMakeFiles/viikko_1.dir/flags.make
CMakeFiles/viikko_1.dir/src/days.cpp.o: /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/days.cpp
CMakeFiles/viikko_1.dir/src/days.cpp.o: CMakeFiles/viikko_1.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/viikko_1.dir/src/days.cpp.o"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/viikko_1.dir/src/days.cpp.o -MF CMakeFiles/viikko_1.dir/src/days.cpp.o.d -o CMakeFiles/viikko_1.dir/src/days.cpp.o -c /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/days.cpp

CMakeFiles/viikko_1.dir/src/days.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/viikko_1.dir/src/days.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/days.cpp > CMakeFiles/viikko_1.dir/src/days.cpp.i

CMakeFiles/viikko_1.dir/src/days.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/viikko_1.dir/src/days.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/days.cpp -o CMakeFiles/viikko_1.dir/src/days.cpp.s

CMakeFiles/viikko_1.dir/src/Event.cpp.o: CMakeFiles/viikko_1.dir/flags.make
CMakeFiles/viikko_1.dir/src/Event.cpp.o: /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/Event.cpp
CMakeFiles/viikko_1.dir/src/Event.cpp.o: CMakeFiles/viikko_1.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/viikko_1.dir/src/Event.cpp.o"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/viikko_1.dir/src/Event.cpp.o -MF CMakeFiles/viikko_1.dir/src/Event.cpp.o.d -o CMakeFiles/viikko_1.dir/src/Event.cpp.o -c /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/Event.cpp

CMakeFiles/viikko_1.dir/src/Event.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/viikko_1.dir/src/Event.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/Event.cpp > CMakeFiles/viikko_1.dir/src/Event.cpp.i

CMakeFiles/viikko_1.dir/src/Event.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/viikko_1.dir/src/Event.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/src/Event.cpp -o CMakeFiles/viikko_1.dir/src/Event.cpp.s

# Object files for target viikko_1
viikko_1_OBJECTS = \
"CMakeFiles/viikko_1.dir/src/days.cpp.o" \
"CMakeFiles/viikko_1.dir/src/Event.cpp.o"

# External object files for target viikko_1
viikko_1_EXTERNAL_OBJECTS =

viikko_1: CMakeFiles/viikko_1.dir/src/days.cpp.o
viikko_1: CMakeFiles/viikko_1.dir/src/Event.cpp.o
viikko_1: CMakeFiles/viikko_1.dir/build.make
viikko_1: CMakeFiles/viikko_1.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Linking CXX executable viikko_1"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/viikko_1.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/viikko_1.dir/build: viikko_1
.PHONY : CMakeFiles/viikko_1.dir/build

CMakeFiles/viikko_1.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/viikko_1.dir/cmake_clean.cmake
.PHONY : CMakeFiles/viikko_1.dir/clean

CMakeFiles/viikko_1.dir/depend:
	cd /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/tommi/School/ohjelmoinnin-syventavat/viikko-1 /home/tommi/School/ohjelmoinnin-syventavat/viikko-1 /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug /home/tommi/School/ohjelmoinnin-syventavat/viikko-1/cmake-build-debug/CMakeFiles/viikko_1.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/viikko_1.dir/depend

