# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.17

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

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = C:\Users\pro10\AppData\Local\JetBrains\Toolbox\apps\CLion\ch-0\202.6948.80\bin\cmake\win\bin\cmake.exe

# The command to remove a file.
RM = C:\Users\pro10\AppData\Local\JetBrains\Toolbox\apps\CLion\ch-0\202.6948.80\bin\cmake\win\bin\cmake.exe -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "D:\InnoStudying\Programming Software Systems\Homework 4"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "D:\InnoStudying\Programming Software Systems\Homework 4\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Homework_4.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Homework_4.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Homework_4.dir/flags.make

CMakeFiles/Homework_4.dir/union.c.obj: CMakeFiles/Homework_4.dir/flags.make
CMakeFiles/Homework_4.dir/union.c.obj: ../union.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="D:\InnoStudying\Programming Software Systems\Homework 4\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Homework_4.dir/union.c.obj"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\Homework_4.dir\union.c.obj   -c "D:\InnoStudying\Programming Software Systems\Homework 4\union.c"

CMakeFiles/Homework_4.dir/union.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Homework_4.dir/union.c.i"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "D:\InnoStudying\Programming Software Systems\Homework 4\union.c" > CMakeFiles\Homework_4.dir\union.c.i

CMakeFiles/Homework_4.dir/union.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Homework_4.dir/union.c.s"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "D:\InnoStudying\Programming Software Systems\Homework 4\union.c" -o CMakeFiles\Homework_4.dir\union.c.s

# Object files for target Homework_4
Homework_4_OBJECTS = \
"CMakeFiles/Homework_4.dir/union.c.obj"

# External object files for target Homework_4
Homework_4_EXTERNAL_OBJECTS =

Homework_4.exe: CMakeFiles/Homework_4.dir/union.c.obj
Homework_4.exe: CMakeFiles/Homework_4.dir/build.make
Homework_4.exe: CMakeFiles/Homework_4.dir/linklibs.rsp
Homework_4.exe: CMakeFiles/Homework_4.dir/objects1.rsp
Homework_4.exe: CMakeFiles/Homework_4.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="D:\InnoStudying\Programming Software Systems\Homework 4\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable Homework_4.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Homework_4.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Homework_4.dir/build: Homework_4.exe

.PHONY : CMakeFiles/Homework_4.dir/build

CMakeFiles/Homework_4.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Homework_4.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Homework_4.dir/clean

CMakeFiles/Homework_4.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "D:\InnoStudying\Programming Software Systems\Homework 4" "D:\InnoStudying\Programming Software Systems\Homework 4" "D:\InnoStudying\Programming Software Systems\Homework 4\cmake-build-debug" "D:\InnoStudying\Programming Software Systems\Homework 4\cmake-build-debug" "D:\InnoStudying\Programming Software Systems\Homework 4\cmake-build-debug\CMakeFiles\Homework_4.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Homework_4.dir/depend

