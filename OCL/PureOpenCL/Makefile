# c:\Git\Sourcecode\OCL>gcc -I. Source.cpp "C:\Program Files\NVIDIA Corporation\OpenCL\OpenCL64.dll" 
# -I "C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v6.5\include" -lm -o main.exe

OpenCLDLL = "C:\Program Files\NVIDIA Corporation\OpenCL\OpenCL.dll"
OPENCLHEADERS = "C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v6.5\include"
# For x64
# GCC = "C:\Program Files\mingw-w64\x86_64-4.9.2-posix-seh-rt_v3-rev1\mingw64\bin\gcc"

default: program

program: Source.c
	gcc -std=c99 -I $(OPENCLHEADERS) -I. Source.c $(OpenCLDLL) -lm -o main.exe

clean: 
	rm *.exe