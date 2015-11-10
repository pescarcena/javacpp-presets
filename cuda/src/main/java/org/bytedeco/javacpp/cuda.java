// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class cuda extends org.bytedeco.javacpp.presets.cuda {
    static { Loader.load(); }

// Parsed from <cuda.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #ifndef __cuda_cuda_h__
// #define __cuda_cuda_h__

// #include <stdlib.h>

/**
 * CUDA API versioning support
 */
// #if defined(CUDA_FORCE_API_VERSION)
// #else
    public static final int __CUDA_API_VERSION = 7050;
// #endif /* CUDA_FORCE_API_VERSION */

// #if defined(__CUDA_API_VERSION_INTERNAL) || defined(CUDA_API_PER_THREAD_DEFAULT_STREAM)
//     #define __CUDA_API_PER_THREAD_DEFAULT_STREAM
//     #define __CUDA_API_PTDS(api) api ## _ptds
//     #define __CUDA_API_PTSZ(api) api ## _ptsz
// #else
//     #define __CUDA_API_PTDS(api) api
//     #define __CUDA_API_PTSZ(api) api
// #endif

// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION >= 3020
// #endif /* __CUDA_API_VERSION_INTERNAL || __CUDA_API_VERSION >= 3020 */
// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION >= 4000
// #endif /* __CUDA_API_VERSION_INTERNAL || __CUDA_API_VERSION >= 4000 */
// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION >= 4010
// #endif /* __CUDA_API_VERSION_INTERNAL || __CUDA_API_VERSION >= 4010 */
// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION >= 6050
// #endif /* __CUDA_API_VERSION_INTERNAL || __CUDA_API_VERSION >= 6050 */
// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION >= 6050
// #endif /* __CUDA_API_VERSION_INTERNAL || __CUDA_API_VERSION >= 6050 */

// #if !defined(__CUDA_API_VERSION_INTERNAL)
// #if defined(__CUDA_API_VERSION) && __CUDA_API_VERSION >= 3020 && __CUDA_API_VERSION < 4010
// #endif /* __CUDA_API_VERSION && __CUDA_API_VERSION >= 3020 && __CUDA_API_VERSION < 4010 */
// #endif /* __CUDA_API_VERSION_INTERNAL */

// #if defined(__CUDA_API_PER_THREAD_DEFAULT_STREAM)
// #endif

/**
 * \file cuda.h
 * \brief Header file for the CUDA Toolkit application programming interface.
 *
 * \file cudaGL.h
 * \brief Header file for the OpenGL interoperability functions of the
 * low-level CUDA driver application programming interface.
 *
 * \file cudaD3D9.h
 * \brief Header file for the Direct3D 9 interoperability functions of the
 * low-level CUDA driver application programming interface.
 */

/**
 * \defgroup CUDA_TYPES Data types used by CUDA driver
 * \{
 */

/**
 * CUDA API version number
 */
public static final int CUDA_VERSION = 7050;

// #ifdef __cplusplus
// #endif

/**
 * CUDA device pointer
 * CUdeviceptr is defined as an unsigned integer type whose size matches the size of a pointer on the target platform.
 */ 
// #if __CUDA_API_VERSION >= 3020

// #if defined(_WIN64) || defined(__LP64__)
// #else
// #endif

// #endif /* __CUDA_API_VERSION >= 3020 */

/** CUDA device */
/** CUDA context */
@Opaque public static class CUctx_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUctx_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUctx_st(Pointer p) { super(p); }
}
/** CUDA module */
@Opaque public static class CUmod_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUmod_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmod_st(Pointer p) { super(p); }
}
/** CUDA function */
@Opaque public static class CUfunc_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUfunc_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUfunc_st(Pointer p) { super(p); }
}
/** CUDA array */
@Opaque public static class CUarray_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUarray_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUarray_st(Pointer p) { super(p); }
}
/** CUDA mipmapped array */
@Opaque public static class CUmipmappedArray_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUmipmappedArray_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmipmappedArray_st(Pointer p) { super(p); }
}
/** CUDA texture reference */
@Opaque public static class CUtexref_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUtexref_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUtexref_st(Pointer p) { super(p); }
}
/** CUDA surface reference */
@Opaque public static class CUsurfref_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUsurfref_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUsurfref_st(Pointer p) { super(p); }
}
/** CUDA event */
@Opaque public static class CUevent_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUevent_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUevent_st(Pointer p) { super(p); }
}
/** CUDA stream */
@Opaque public static class CUstream_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUstream_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUstream_st(Pointer p) { super(p); }
}
/** CUDA graphics interop resource */
@Opaque public static class CUgraphicsResource_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUgraphicsResource_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUgraphicsResource_st(Pointer p) { super(p); }
}
/** An opaque value that represents a CUDA texture object */
/** An opaque value that represents a CUDA surface object */

public static class CUuuid extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUuuid() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUuuid(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUuuid(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUuuid position(int position) {
        return (CUuuid)super.position(position);
    }

    public native @Cast("char") byte bytes(int i); public native CUuuid bytes(int i, byte bytes);
    @MemberGetter public native @Cast("char*") BytePointer bytes();
}


// #if __CUDA_API_VERSION >= 4010

/**
 * CUDA IPC handle size 
 */
public static final int CU_IPC_HANDLE_SIZE = 64;

/**
 * CUDA IPC event handle
 */
public static class CUipcEventHandle extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUipcEventHandle() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUipcEventHandle(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUipcEventHandle(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUipcEventHandle position(int position) {
        return (CUipcEventHandle)super.position(position);
    }

    public native @Cast("char") byte reserved(int i); public native CUipcEventHandle reserved(int i, byte reserved);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}

/**
 * CUDA IPC mem handle
 */
public static class CUipcMemHandle extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUipcMemHandle() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUipcMemHandle(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUipcMemHandle(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUipcMemHandle position(int position) {
        return (CUipcMemHandle)super.position(position);
    }

    public native @Cast("char") byte reserved(int i); public native CUipcMemHandle reserved(int i, byte reserved);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}

/**
 * CUDA Ipc Mem Flags
 */
/** enum CUipcMem_flags */
public static final int
    /** Automatically enable peer access between remote devices as needed */
    CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS =  0x1;

// #endif

/**
 * CUDA Mem Attach Flags
 */
/** enum CUmemAttach_flags */
public static final int
    /** Memory can be accessed by any stream on any device */
    CU_MEM_ATTACH_GLOBAL =  0x1,
    /** Memory cannot be accessed by any stream on any device */
    CU_MEM_ATTACH_HOST   =  0x2,
    /** Memory can only be accessed by a single stream on the associated device */
    CU_MEM_ATTACH_SINGLE =  0x4;

/**
 * Context creation flags
 */
/** enum CUctx_flags */
public static final int
    /** Automatic scheduling */
    CU_CTX_SCHED_AUTO          =  0x00,
    /** Set spin as default scheduling */
    CU_CTX_SCHED_SPIN          =  0x01,
    /** Set yield as default scheduling */
    CU_CTX_SCHED_YIELD         =  0x02,
    /** Set blocking synchronization as default scheduling */
    CU_CTX_SCHED_BLOCKING_SYNC =  0x04,
    /** Set blocking synchronization as default scheduling
                                         *  @deprecated This flag was deprecated as of CUDA 4.0
                                         *  and was replaced with ::CU_CTX_SCHED_BLOCKING_SYNC. */
    CU_CTX_BLOCKING_SYNC       =  0x04,
    CU_CTX_SCHED_MASK          =  0x07, 
    /** Support mapped pinned allocations */
    CU_CTX_MAP_HOST            =  0x08,
    /** Keep local memory allocation after launch */
    CU_CTX_LMEM_RESIZE_TO_MAX  =  0x10,
    CU_CTX_FLAGS_MASK          =  0x1f;

/**
 * Stream creation flags
 */
/** enum CUstream_flags */
public static final int
    /** Default stream flag */
    CU_STREAM_DEFAULT      =  0x0,
    /** Stream does not synchronize with stream 0 (the NULL stream) */
    CU_STREAM_NON_BLOCKING =  0x1;

/**
 * Legacy stream handle
 *
 * Stream handle that can be passed as a CUstream to use an implicit stream
 * with legacy synchronization behavior.
 *
 * See details of the \link_sync_behavior
 */
public static native @MemberGetter CUstream_st CU_STREAM_LEGACY();
public static final CUstream_st CU_STREAM_LEGACY = CU_STREAM_LEGACY();

/**
 * Per-thread stream handle
 *
 * Stream handle that can be passed as a CUstream to use an implicit stream
 * with per-thread synchronization behavior.
 *
 * See details of the \link_sync_behavior
 */
public static native @MemberGetter CUstream_st CU_STREAM_PER_THREAD();
public static final CUstream_st CU_STREAM_PER_THREAD = CU_STREAM_PER_THREAD();

/**
 * Event creation flags
 */
/** enum CUevent_flags */
public static final int
    /** Default event flag */
    CU_EVENT_DEFAULT        =  0x0,
    /** Event uses blocking synchronization */
    CU_EVENT_BLOCKING_SYNC  =  0x1,
    /** Event will not record timing data */
    CU_EVENT_DISABLE_TIMING =  0x2,
    /** Event is suitable for interprocess use. CU_EVENT_DISABLE_TIMING must be set */
    CU_EVENT_INTERPROCESS   =  0x4;

/**
 * Occupancy calculator flag
 */
/** enum CUoccupancy_flags */
public static final int
    /** Default behavior */
    CU_OCCUPANCY_DEFAULT                  =  0x0,
    /** Assume global caching is enabled and cannot be automatically turned off */
    CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE =  0x1;

/**
 * Array formats
 */
/** enum CUarray_format */
public static final int
    /** Unsigned 8-bit integers */
    CU_AD_FORMAT_UNSIGNED_INT8  =  0x01,
    /** Unsigned 16-bit integers */
    CU_AD_FORMAT_UNSIGNED_INT16 =  0x02,
    /** Unsigned 32-bit integers */
    CU_AD_FORMAT_UNSIGNED_INT32 =  0x03,
    /** Signed 8-bit integers */
    CU_AD_FORMAT_SIGNED_INT8    =  0x08,
    /** Signed 16-bit integers */
    CU_AD_FORMAT_SIGNED_INT16   =  0x09,
    /** Signed 32-bit integers */
    CU_AD_FORMAT_SIGNED_INT32   =  0x0a,
    /** 16-bit floating point */
    CU_AD_FORMAT_HALF           =  0x10,
    /** 32-bit floating point */
    CU_AD_FORMAT_FLOAT          =  0x20;

/**
 * Texture reference addressing modes
 */
/** enum CUaddress_mode */
public static final int
    /** Wrapping address mode */
    CU_TR_ADDRESS_MODE_WRAP   = 0,
    /** Clamp to edge address mode */
    CU_TR_ADDRESS_MODE_CLAMP  = 1,
    /** Mirror address mode */
    CU_TR_ADDRESS_MODE_MIRROR = 2,
    /** Border address mode */
    CU_TR_ADDRESS_MODE_BORDER = 3;

/**
 * Texture reference filtering modes
 */
/** enum CUfilter_mode */
public static final int
    /** Point filter mode */
    CU_TR_FILTER_MODE_POINT  = 0,
    /** Linear filter mode */
    CU_TR_FILTER_MODE_LINEAR = 1;

/**
 * Device properties
 */
/** enum CUdevice_attribute */
public static final int
    /** Maximum number of threads per block */
    CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK = 1,
    /** Maximum block dimension X */
    CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X = 2,
    /** Maximum block dimension Y */
    CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y = 3,
    /** Maximum block dimension Z */
    CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z = 4,
    /** Maximum grid dimension X */
    CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_X = 5,
    /** Maximum grid dimension Y */
    CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y = 6,
    /** Maximum grid dimension Z */
    CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z = 7,
    /** Maximum shared memory available per block in bytes */
    CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK = 8,
    /** Deprecated, use CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK */
    CU_DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK = 8,
    /** Memory available on device for __constant__ variables in a CUDA C kernel in bytes */
    CU_DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY = 9,
    /** Warp size in threads */
    CU_DEVICE_ATTRIBUTE_WARP_SIZE = 10,
    /** Maximum pitch in bytes allowed by memory copies */
    CU_DEVICE_ATTRIBUTE_MAX_PITCH = 11,
    /** Maximum number of 32-bit registers available per block */
    CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK = 12,
    /** Deprecated, use CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK */
    CU_DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK = 12,
    /** Typical clock frequency in kilohertz */
    CU_DEVICE_ATTRIBUTE_CLOCK_RATE = 13,
    /** Alignment requirement for textures */
    CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT = 14,
    /** Device can possibly copy memory and execute a kernel concurrently. Deprecated. Use instead CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT. */
    CU_DEVICE_ATTRIBUTE_GPU_OVERLAP = 15,
    /** Number of multiprocessors on device */
    CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT = 16,
    /** Specifies whether there is a run time limit on kernels */
    CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT = 17,
    /** Device is integrated with host memory */
    CU_DEVICE_ATTRIBUTE_INTEGRATED = 18,
    /** Device can map host memory into CUDA address space */
    CU_DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY = 19,
    /** Compute mode (See ::CUcomputemode for details) */
    CU_DEVICE_ATTRIBUTE_COMPUTE_MODE = 20,
    /** Maximum 1D texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH = 21,
    /** Maximum 2D texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH = 22,
    /** Maximum 2D texture height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT = 23,
    /** Maximum 3D texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH = 24,
    /** Maximum 3D texture height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT = 25,
    /** Maximum 3D texture depth */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH = 26,
    /** Maximum 2D layered texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH = 27,
    /** Maximum 2D layered texture height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT = 28,
    /** Maximum layers in a 2D layered texture */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS = 29,
    /** Deprecated, use CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH = 27,
    /** Deprecated, use CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT = 28,
    /** Deprecated, use CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES = 29,
    /** Alignment requirement for surfaces */
    CU_DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT = 30,
    /** Device can possibly execute multiple kernels concurrently */
    CU_DEVICE_ATTRIBUTE_CONCURRENT_KERNELS = 31,
    /** Device has ECC support enabled */
    CU_DEVICE_ATTRIBUTE_ECC_ENABLED = 32,
    /** PCI bus ID of the device */
    CU_DEVICE_ATTRIBUTE_PCI_BUS_ID = 33,
    /** PCI device ID of the device */
    CU_DEVICE_ATTRIBUTE_PCI_DEVICE_ID = 34,
    /** Device is using TCC driver model */
    CU_DEVICE_ATTRIBUTE_TCC_DRIVER = 35,
    /** Peak memory clock frequency in kilohertz */
    CU_DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE = 36,
    /** Global memory bus width in bits */
    CU_DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH = 37,
    /** Size of L2 cache in bytes */
    CU_DEVICE_ATTRIBUTE_L2_CACHE_SIZE = 38,
    /** Maximum resident threads per multiprocessor */
    CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR = 39,
    /** Number of asynchronous engines */
    CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT = 40,
    /** Device shares a unified address space with the host */
    CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING = 41,    
    /** Maximum 1D layered texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH = 42,
    /** Maximum layers in a 1D layered texture */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS = 43,
    /** Deprecated, do not use. */
    CU_DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER = 44,
    /** Maximum 2D texture width if CUDA_ARRAY3D_TEXTURE_GATHER is set */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH = 45,
    /** Maximum 2D texture height if CUDA_ARRAY3D_TEXTURE_GATHER is set */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT = 46,
    /** Alternate maximum 3D texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE = 47,
    /** Alternate maximum 3D texture height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE = 48,
    /** Alternate maximum 3D texture depth */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE = 49,
    /** PCI domain ID of the device */
    CU_DEVICE_ATTRIBUTE_PCI_DOMAIN_ID = 50,
    /** Pitch alignment requirement for textures */
    CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT = 51,
    /** Maximum cubemap texture width/height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH = 52,
    /** Maximum cubemap layered texture width/height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH = 53,
    /** Maximum layers in a cubemap layered texture */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS = 54,
    /** Maximum 1D surface width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH = 55,
    /** Maximum 2D surface width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH = 56,
    /** Maximum 2D surface height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT = 57,
    /** Maximum 3D surface width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH = 58,
    /** Maximum 3D surface height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT = 59,
    /** Maximum 3D surface depth */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH = 60,
    /** Maximum 1D layered surface width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH = 61,
    /** Maximum layers in a 1D layered surface */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS = 62,
    /** Maximum 2D layered surface width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH = 63,
    /** Maximum 2D layered surface height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT = 64,
    /** Maximum layers in a 2D layered surface */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS = 65,
    /** Maximum cubemap surface width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH = 66,
    /** Maximum cubemap layered surface width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH = 67,
    /** Maximum layers in a cubemap layered surface */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS = 68,
    /** Maximum 1D linear texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH = 69,
    /** Maximum 2D linear texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH = 70,
    /** Maximum 2D linear texture height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT = 71,
    /** Maximum 2D linear texture pitch in bytes */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH = 72,
    /** Maximum mipmapped 2D texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH = 73,
    /** Maximum mipmapped 2D texture height */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT = 74,
    /** Major compute capability version number */
    CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR = 75,     
    /** Minor compute capability version number */
    CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR = 76,
    /** Maximum mipmapped 1D texture width */
    CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH = 77,
    /** Device supports stream priorities */
    CU_DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED = 78,
    /** Device supports caching globals in L1 */
    CU_DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED = 79,
    /** Device supports caching locals in L1 */
    CU_DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED = 80,
    /** Maximum shared memory available per multiprocessor in bytes */
    CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR = 81,
    /** Maximum number of 32-bit registers available per multiprocessor */
    CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR = 82,
    /** Device can allocate managed memory on this system */
    CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY = 83,
    /** Device is on a multi-GPU board */
    CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD = 84, 
    /** Unique id for a group of devices on the same multi-GPU board */
    CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID = 85,
    CU_DEVICE_ATTRIBUTE_MAX = 86;

/**
 * Legacy device properties
 */
public static class CUdevprop extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUdevprop() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUdevprop(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUdevprop(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUdevprop position(int position) {
        return (CUdevprop)super.position(position);
    }

    /** Maximum number of threads per block */
    public native int maxThreadsPerBlock(); public native CUdevprop maxThreadsPerBlock(int maxThreadsPerBlock);
    /** Maximum size of each dimension of a block */
    public native int maxThreadsDim(int i); public native CUdevprop maxThreadsDim(int i, int maxThreadsDim);
    @MemberGetter public native IntPointer maxThreadsDim();
    /** Maximum size of each dimension of a grid */
    public native int maxGridSize(int i); public native CUdevprop maxGridSize(int i, int maxGridSize);
    @MemberGetter public native IntPointer maxGridSize();
    /** Shared memory available per block in bytes */
    public native int sharedMemPerBlock(); public native CUdevprop sharedMemPerBlock(int sharedMemPerBlock);
    /** Constant memory available on device in bytes */
    public native int totalConstantMemory(); public native CUdevprop totalConstantMemory(int totalConstantMemory);
    /** Warp size in threads */
    public native int SIMDWidth(); public native CUdevprop SIMDWidth(int SIMDWidth);
    /** Maximum pitch in bytes allowed by memory copies */
    public native int memPitch(); public native CUdevprop memPitch(int memPitch);
    /** 32-bit registers available per block */
    public native int regsPerBlock(); public native CUdevprop regsPerBlock(int regsPerBlock);
    /** Clock frequency in kilohertz */
    public native int clockRate(); public native CUdevprop clockRate(int clockRate);
    /** Alignment requirement for textures */
    public native int textureAlign(); public native CUdevprop textureAlign(int textureAlign);
}

/**
 * Pointer information
 */
/** enum CUpointer_attribute */
public static final int
    /** The ::CUcontext on which a pointer was allocated or registered */
    CU_POINTER_ATTRIBUTE_CONTEXT = 1,
    /** The ::CUmemorytype describing the physical location of a pointer */
    CU_POINTER_ATTRIBUTE_MEMORY_TYPE = 2,
    /** The address at which a pointer's memory may be accessed on the device */
    CU_POINTER_ATTRIBUTE_DEVICE_POINTER = 3,
    /** The address at which a pointer's memory may be accessed on the host */
    CU_POINTER_ATTRIBUTE_HOST_POINTER = 4,
    /** A pair of tokens for use with the nv-p2p.h Linux kernel interface */
    CU_POINTER_ATTRIBUTE_P2P_TOKENS = 5,
    /** Synchronize every synchronous memory operation initiated on this region */
    CU_POINTER_ATTRIBUTE_SYNC_MEMOPS = 6,
    /** A process-wide unique ID for an allocated memory region*/
    CU_POINTER_ATTRIBUTE_BUFFER_ID = 7,
    /** Indicates if the pointer points to managed memory */
    CU_POINTER_ATTRIBUTE_IS_MANAGED = 8;

/**
 * Function properties
 */
/** enum CUfunction_attribute */
public static final int
    /**
     * The maximum number of threads per block, beyond which a launch of the
     * function would fail. This number depends on both the function and the
     * device on which the function is currently loaded.
     */
    CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK = 0,

    /**
     * The size in bytes of statically-allocated shared memory required by
     * this function. This does not include dynamically-allocated shared
     * memory requested by the user at runtime.
     */
    CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES = 1,

    /**
     * The size in bytes of user-allocated constant memory required by this
     * function.
     */
    CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES = 2,

    /**
     * The size in bytes of local memory used by each thread of this function.
     */
    CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES = 3,

    /**
     * The number of registers used by each thread of this function.
     */
    CU_FUNC_ATTRIBUTE_NUM_REGS = 4,

    /**
     * The PTX virtual architecture version for which the function was
     * compiled. This value is the major PTX version * 10 + the minor PTX
     * version, so a PTX version 1.3 function would return the value 13.
     * Note that this may return the undefined value of 0 for cubins
     * compiled prior to CUDA 3.0.
     */
    CU_FUNC_ATTRIBUTE_PTX_VERSION = 5,

    /**
     * The binary architecture version for which the function was compiled.
     * This value is the major binary version * 10 + the minor binary version,
     * so a binary version 1.3 function would return the value 13. Note that
     * this will return a value of 10 for legacy cubins that do not have a
     * properly-encoded binary architecture version.
     */
    CU_FUNC_ATTRIBUTE_BINARY_VERSION = 6,

    /**
     * The attribute to indicate whether the function has been compiled with 
     * user specified option "-Xptxas --dlcm=ca" set .
     */
    CU_FUNC_ATTRIBUTE_CACHE_MODE_CA = 7,

    CU_FUNC_ATTRIBUTE_MAX = 8;

/**
 * Function cache configurations
 */
/** enum CUfunc_cache */
public static final int
    /** no preference for shared memory or L1 (default) */
    CU_FUNC_CACHE_PREFER_NONE    =  0x00,
    /** prefer larger shared memory and smaller L1 cache */
    CU_FUNC_CACHE_PREFER_SHARED  =  0x01,
    /** prefer larger L1 cache and smaller shared memory */
    CU_FUNC_CACHE_PREFER_L1      =  0x02,
    /** prefer equal sized L1 cache and shared memory */
    CU_FUNC_CACHE_PREFER_EQUAL   =  0x03;

/**
 * Shared memory configurations
 */
/** enum CUsharedconfig */
public static final int
    /** set default shared memory bank size */
    CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE    =  0x00,
    /** set shared memory bank width to four bytes */
    CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE  =  0x01,
    /** set shared memory bank width to eight bytes */
    CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE =  0x02;

/**
 * Memory types
 */
/** enum CUmemorytype */
public static final int
    /** Host memory */
    CU_MEMORYTYPE_HOST    =  0x01,
    /** Device memory */
    CU_MEMORYTYPE_DEVICE  =  0x02,
    /** Array memory */
    CU_MEMORYTYPE_ARRAY   =  0x03,
    /** Unified device or host memory */
    CU_MEMORYTYPE_UNIFIED =  0x04;

/**
 * Compute Modes
 */
/** enum CUcomputemode */
public static final int
    /** Default compute mode (Multiple contexts allowed per device) */
    CU_COMPUTEMODE_DEFAULT           = 0,
    /** Compute-exclusive-thread mode (Only one context used by a single thread can be present on this device at a time) */
    CU_COMPUTEMODE_EXCLUSIVE         = 1,
    /** Compute-prohibited mode (No contexts can be created on this device at this time) */
    CU_COMPUTEMODE_PROHIBITED        = 2,
    /** Compute-exclusive-process mode (Only one context used by a single process can be present on this device at a time) */
    CU_COMPUTEMODE_EXCLUSIVE_PROCESS = 3;

/**
 * Online compiler and linker options
 */
/** enum CUjit_option */
public static final int
    /**
     * Max number of registers that a thread may use.\n
     * Option type: unsigned int\n
     * Applies to: compiler only
     */
    CU_JIT_MAX_REGISTERS = 0,

    /**
     * IN: Specifies minimum number of threads per block to target compilation
     * for\n
     * OUT: Returns the number of threads the compiler actually targeted.
     * This restricts the resource utilization fo the compiler (e.g. max
     * registers) such that a block with the given number of threads should be
     * able to launch based on register limitations. Note, this option does not
     * currently take into account any other resource limitations, such as
     * shared memory utilization.\n
     * Cannot be combined with ::CU_JIT_TARGET.\n
     * Option type: unsigned int\n
     * Applies to: compiler only
     */
    CU_JIT_THREADS_PER_BLOCK = 1,

    /**
     * Overwrites the option value with the total wall clock time, in
     * milliseconds, spent in the compiler and linker\n
     * Option type: float\n
     * Applies to: compiler and linker
     */
    CU_JIT_WALL_TIME = 2,

    /**
     * Pointer to a buffer in which to print any log messages
     * that are informational in nature (the buffer size is specified via
     * option ::CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES)\n
     * Option type: char *\n
     * Applies to: compiler and linker
     */
    CU_JIT_INFO_LOG_BUFFER = 3,

    /**
     * IN: Log buffer size in bytes.  Log messages will be capped at this size
     * (including null terminator)\n
     * OUT: Amount of log buffer filled with messages\n
     * Option type: unsigned int\n
     * Applies to: compiler and linker
     */
    CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES = 4,

    /**
     * Pointer to a buffer in which to print any log messages that
     * reflect errors (the buffer size is specified via option
     * ::CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES)\n
     * Option type: char *\n
     * Applies to: compiler and linker
     */
    CU_JIT_ERROR_LOG_BUFFER = 5,

    /**
     * IN: Log buffer size in bytes.  Log messages will be capped at this size
     * (including null terminator)\n
     * OUT: Amount of log buffer filled with messages\n
     * Option type: unsigned int\n
     * Applies to: compiler and linker
     */
    CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES = 6,

    /**
     * Level of optimizations to apply to generated code (0 - 4), with 4
     * being the default and highest level of optimizations.\n
     * Option type: unsigned int\n
     * Applies to: compiler only
     */
    CU_JIT_OPTIMIZATION_LEVEL = 7,

    /**
     * No option value required. Determines the target based on the current
     * attached context (default)\n
     * Option type: No option value needed\n
     * Applies to: compiler and linker
     */
    CU_JIT_TARGET_FROM_CUCONTEXT = 8,

    /**
     * Target is chosen based on supplied ::CUjit_target.  Cannot be
     * combined with ::CU_JIT_THREADS_PER_BLOCK.\n
     * Option type: unsigned int for enumerated type ::CUjit_target\n
     * Applies to: compiler and linker
     */
    CU_JIT_TARGET = 9,

    /**
     * Specifies choice of fallback strategy if matching cubin is not found.
     * Choice is based on supplied ::CUjit_fallback.  This option cannot be
     * used with cuLink* APIs as the linker requires exact matches.\n
     * Option type: unsigned int for enumerated type ::CUjit_fallback\n
     * Applies to: compiler only
     */
    CU_JIT_FALLBACK_STRATEGY = 10,

    /**
     * Specifies whether to create debug information in output (-g)
     * (0: false, default)\n
     * Option type: int\n
     * Applies to: compiler and linker
     */
    CU_JIT_GENERATE_DEBUG_INFO = 11,

    /**
     * Generate verbose log messages (0: false, default)\n
     * Option type: int\n
     * Applies to: compiler and linker
     */
    CU_JIT_LOG_VERBOSE = 12,

    /**
     * Generate line number information (-lineinfo) (0: false, default)\n
     * Option type: int\n
     * Applies to: compiler only
     */
    CU_JIT_GENERATE_LINE_INFO = 13,

    /**
     * Specifies whether to enable caching explicitly (-dlcm) \n
     * Choice is based on supplied ::CUjit_cacheMode_enum.\n
     * Option type: unsigned int for enumerated type ::CUjit_cacheMode_enum\n
     * Applies to: compiler only
     */
    CU_JIT_CACHE_MODE = 14,

    CU_JIT_NUM_OPTIONS = 15;

/**
 * Online compilation targets
 */
/** enum CUjit_target */
public static final int
    /** Compute device class 1.0 */
    CU_TARGET_COMPUTE_10 = 10,
    /** Compute device class 1.1 */
    CU_TARGET_COMPUTE_11 = 11,
    /** Compute device class 1.2 */
    CU_TARGET_COMPUTE_12 = 12,
    /** Compute device class 1.3 */
    CU_TARGET_COMPUTE_13 = 13,
    /** Compute device class 2.0 */
    CU_TARGET_COMPUTE_20 = 20,
    /** Compute device class 2.1 */
    CU_TARGET_COMPUTE_21 = 21,
    /** Compute device class 3.0 */
    CU_TARGET_COMPUTE_30 = 30,
    /** Compute device class 3.2 */
    CU_TARGET_COMPUTE_32 = 32,
    /** Compute device class 3.5 */
    CU_TARGET_COMPUTE_35 = 35,
    /** Compute device class 3.7 */
    CU_TARGET_COMPUTE_37 = 37,
    /** Compute device class 5.0 */
    CU_TARGET_COMPUTE_50 = 50,
    /** Compute device class 5.2 */
    CU_TARGET_COMPUTE_52 = 52;

/**
 * Cubin matching fallback strategies
 */
/** enum CUjit_fallback */
public static final int
    /** Prefer to compile ptx if exact binary match not found */
    CU_PREFER_PTX = 0,

    /** Prefer to fall back to compatible binary code if exact match not found */
    CU_PREFER_BINARY = 1;

/**
 * Caching modes for dlcm 
 */
/** enum CUjit_cacheMode */
public static final int
    /** Compile with no -dlcm flag specified */
    CU_JIT_CACHE_OPTION_NONE = 0,
    /** Compile with L1 cache disabled */
    CU_JIT_CACHE_OPTION_CG = 1,
    /** Compile with L1 cache enabled */
    CU_JIT_CACHE_OPTION_CA = 2;

/**
 * Device code formats
 */
/** enum CUjitInputType */
public static final int
    /**
     * Compiled device-class-specific device code\n
     * Applicable options: none
     */
    CU_JIT_INPUT_CUBIN = 0,

    /**
     * PTX source code\n
     * Applicable options: PTX compiler options
     */
    CU_JIT_INPUT_PTX = 1,

    /**
     * Bundle of multiple cubins and/or PTX of some device code\n
     * Applicable options: PTX compiler options, ::CU_JIT_FALLBACK_STRATEGY
     */
    CU_JIT_INPUT_FATBINARY = 2,

    /**
     * Host object with embedded device code\n
     * Applicable options: PTX compiler options, ::CU_JIT_FALLBACK_STRATEGY
     */
    CU_JIT_INPUT_OBJECT = 3,

    /**
     * Archive of host objects with embedded device code\n
     * Applicable options: PTX compiler options, ::CU_JIT_FALLBACK_STRATEGY
     */
    CU_JIT_INPUT_LIBRARY = 4,

    CU_JIT_NUM_INPUT_TYPES = 5;

// #if __CUDA_API_VERSION >= 5050
@Opaque public static class CUlinkState_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUlinkState_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUlinkState_st(Pointer p) { super(p); }
}
// #endif /* __CUDA_API_VERSION >= 5050 */

/**
 * Flags to register a graphics resource
 */
/** enum CUgraphicsRegisterFlags */
public static final int
    CU_GRAPHICS_REGISTER_FLAGS_NONE           =  0x00,
    CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY      =  0x01,
    CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD  =  0x02,
    CU_GRAPHICS_REGISTER_FLAGS_SURFACE_LDST   =  0x04,
    CU_GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER =  0x08;

/**
 * Flags for mapping and unmapping interop resources
 */
/** enum CUgraphicsMapResourceFlags */
public static final int
    CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE          =  0x00,
    CU_GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY     =  0x01,
    CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD =  0x02;

/**
 * Array indices for cube faces
 */
/** enum CUarray_cubemap_face */
public static final int
    /** Positive X face of cubemap */
    CU_CUBEMAP_FACE_POSITIVE_X  =  0x00,
    /** Negative X face of cubemap */
    CU_CUBEMAP_FACE_NEGATIVE_X  =  0x01,
    /** Positive Y face of cubemap */
    CU_CUBEMAP_FACE_POSITIVE_Y  =  0x02,
    /** Negative Y face of cubemap */
    CU_CUBEMAP_FACE_NEGATIVE_Y  =  0x03,
    /** Positive Z face of cubemap */
    CU_CUBEMAP_FACE_POSITIVE_Z  =  0x04,
    /** Negative Z face of cubemap */
    CU_CUBEMAP_FACE_NEGATIVE_Z  =  0x05;

/**
 * Limits
 */
/** enum CUlimit */
public static final int
    /** GPU thread stack size */
    CU_LIMIT_STACK_SIZE                       =  0x00,
    /** GPU printf FIFO size */
    CU_LIMIT_PRINTF_FIFO_SIZE                 =  0x01,
    /** GPU malloc heap size */
    CU_LIMIT_MALLOC_HEAP_SIZE                 =  0x02,
    /** GPU device runtime launch synchronize depth */
    CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH           =  0x03,
    /** GPU device runtime pending launch count */
    CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT =  0x04,
    CU_LIMIT_MAX =  0x04 + 1;

/**
 * Resource types
 */
/** enum CUresourcetype */
public static final int
    /** Array resoure */
    CU_RESOURCE_TYPE_ARRAY           =  0x00,
    /** Mipmapped array resource */
    CU_RESOURCE_TYPE_MIPMAPPED_ARRAY =  0x01,
    /** Linear resource */
    CU_RESOURCE_TYPE_LINEAR          =  0x02,
    /** Pitch 2D resource */
    CU_RESOURCE_TYPE_PITCH2D         =  0x03;

/**
 * Error codes
 */
/** enum CUresult */
public static final int
    /**
     * The API call returned with no errors. In the case of query calls, this
     * can also mean that the operation being queried is complete (see
     * ::cuEventQuery() and ::cuStreamQuery()).
     */
    CUDA_SUCCESS                              = 0,

    /**
     * This indicates that one or more of the parameters passed to the API call
     * is not within an acceptable range of values.
     */
    CUDA_ERROR_INVALID_VALUE                  = 1,

    /**
     * The API call failed because it was unable to allocate enough memory to
     * perform the requested operation.
     */
    CUDA_ERROR_OUT_OF_MEMORY                  = 2,

    /**
     * This indicates that the CUDA driver has not been initialized with
     * ::cuInit() or that initialization has failed.
     */
    CUDA_ERROR_NOT_INITIALIZED                = 3,

    /**
     * This indicates that the CUDA driver is in the process of shutting down.
     */
    CUDA_ERROR_DEINITIALIZED                  = 4,

    /**
     * This indicates profiler is not initialized for this run. This can
     * happen when the application is running with external profiling tools
     * like visual profiler.
     */
    CUDA_ERROR_PROFILER_DISABLED              = 5,

    /**
     * @deprecated
     * This error return is deprecated as of CUDA 5.0. It is no longer an error
     * to attempt to enable/disable the profiling via ::cuProfilerStart or
     * ::cuProfilerStop without initialization.
     */
    CUDA_ERROR_PROFILER_NOT_INITIALIZED       = 6,

    /**
     * @deprecated
     * This error return is deprecated as of CUDA 5.0. It is no longer an error
     * to call cuProfilerStart() when profiling is already enabled.
     */
    CUDA_ERROR_PROFILER_ALREADY_STARTED       = 7,

    /**
     * @deprecated
     * This error return is deprecated as of CUDA 5.0. It is no longer an error
     * to call cuProfilerStop() when profiling is already disabled.
     */
    CUDA_ERROR_PROFILER_ALREADY_STOPPED       = 8,

    /**
     * This indicates that no CUDA-capable devices were detected by the installed
     * CUDA driver.
     */
    CUDA_ERROR_NO_DEVICE                      = 100,

    /**
     * This indicates that the device ordinal supplied by the user does not
     * correspond to a valid CUDA device.
     */
    CUDA_ERROR_INVALID_DEVICE                 = 101,


    /**
     * This indicates that the device kernel image is invalid. This can also
     * indicate an invalid CUDA module.
     */
    CUDA_ERROR_INVALID_IMAGE                  = 200,

    /**
     * This most frequently indicates that there is no context bound to the
     * current thread. This can also be returned if the context passed to an
     * API call is not a valid handle (such as a context that has had
     * ::cuCtxDestroy() invoked on it). This can also be returned if a user
     * mixes different API versions (i.e. 3010 context with 3020 API calls).
     * See ::cuCtxGetApiVersion() for more details.
     */
    CUDA_ERROR_INVALID_CONTEXT                = 201,

    /**
     * This indicated that the context being supplied as a parameter to the
     * API call was already the active context.
     * @deprecated
     * This error return is deprecated as of CUDA 3.2. It is no longer an
     * error to attempt to push the active context via ::cuCtxPushCurrent().
     */
    CUDA_ERROR_CONTEXT_ALREADY_CURRENT        = 202,

    /**
     * This indicates that a map or register operation has failed.
     */
    CUDA_ERROR_MAP_FAILED                     = 205,

    /**
     * This indicates that an unmap or unregister operation has failed.
     */
    CUDA_ERROR_UNMAP_FAILED                   = 206,

    /**
     * This indicates that the specified array is currently mapped and thus
     * cannot be destroyed.
     */
    CUDA_ERROR_ARRAY_IS_MAPPED                = 207,

    /**
     * This indicates that the resource is already mapped.
     */
    CUDA_ERROR_ALREADY_MAPPED                 = 208,

    /**
     * This indicates that there is no kernel image available that is suitable
     * for the device. This can occur when a user specifies code generation
     * options for a particular CUDA source file that do not include the
     * corresponding device configuration.
     */
    CUDA_ERROR_NO_BINARY_FOR_GPU              = 209,

    /**
     * This indicates that a resource has already been acquired.
     */
    CUDA_ERROR_ALREADY_ACQUIRED               = 210,

    /**
     * This indicates that a resource is not mapped.
     */
    CUDA_ERROR_NOT_MAPPED                     = 211,

    /**
     * This indicates that a mapped resource is not available for access as an
     * array.
     */
    CUDA_ERROR_NOT_MAPPED_AS_ARRAY            = 212,

    /**
     * This indicates that a mapped resource is not available for access as a
     * pointer.
     */
    CUDA_ERROR_NOT_MAPPED_AS_POINTER          = 213,

    /**
     * This indicates that an uncorrectable ECC error was detected during
     * execution.
     */
    CUDA_ERROR_ECC_UNCORRECTABLE              = 214,

    /**
     * This indicates that the ::CUlimit passed to the API call is not
     * supported by the active device.
     */
    CUDA_ERROR_UNSUPPORTED_LIMIT              = 215,

    /**
     * This indicates that the ::CUcontext passed to the API call can
     * only be bound to a single CPU thread at a time but is already 
     * bound to a CPU thread.
     */
    CUDA_ERROR_CONTEXT_ALREADY_IN_USE         = 216,

    /**
     * This indicates that peer access is not supported across the given
     * devices.
     */
    CUDA_ERROR_PEER_ACCESS_UNSUPPORTED        = 217,

    /**
     * This indicates that a PTX JIT compilation failed.
     */
    CUDA_ERROR_INVALID_PTX                    = 218,

    /**
     * This indicates an error with OpenGL or DirectX context.
     */
    CUDA_ERROR_INVALID_GRAPHICS_CONTEXT       = 219,

    /**
     * This indicates that the device kernel source is invalid.
     */
    CUDA_ERROR_INVALID_SOURCE                 = 300,

    /**
     * This indicates that the file specified was not found.
     */
    CUDA_ERROR_FILE_NOT_FOUND                 = 301,

    /**
     * This indicates that a link to a shared object failed to resolve.
     */
    CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND = 302,

    /**
     * This indicates that initialization of a shared object failed.
     */
    CUDA_ERROR_SHARED_OBJECT_INIT_FAILED      = 303,

    /**
     * This indicates that an OS call failed.
     */
    CUDA_ERROR_OPERATING_SYSTEM               = 304,

    /**
     * This indicates that a resource handle passed to the API call was not
     * valid. Resource handles are opaque types like ::CUstream and ::CUevent.
     */
    CUDA_ERROR_INVALID_HANDLE                 = 400,

    /**
     * This indicates that a named symbol was not found. Examples of symbols
     * are global/constant variable names, texture names, and surface names.
     */
    CUDA_ERROR_NOT_FOUND                      = 500,

    /**
     * This indicates that asynchronous operations issued previously have not
     * completed yet. This result is not actually an error, but must be indicated
     * differently than ::CUDA_SUCCESS (which indicates completion). Calls that
     * may return this value include ::cuEventQuery() and ::cuStreamQuery().
     */
    CUDA_ERROR_NOT_READY                      = 600,

    /**
     * While executing a kernel, the device encountered a
     * load or store instruction on an invalid memory address.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_ILLEGAL_ADDRESS                = 700,

    /**
     * This indicates that a launch did not occur because it did not have
     * appropriate resources. This error usually indicates that the user has
     * attempted to pass too many arguments to the device kernel, or the
     * kernel launch specifies too many threads for the kernel's register
     * count. Passing arguments of the wrong size (i.e. a 64-bit pointer
     * when a 32-bit int is expected) is equivalent to passing too many
     * arguments and can also result in this error.
     */
    CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES        = 701,

    /**
     * This indicates that the device kernel took too long to execute. This can
     * only occur if timeouts are enabled - see the device attribute
     * ::CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT for more information. The
     * context cannot be used (and must be destroyed similar to
     * ::CUDA_ERROR_LAUNCH_FAILED). All existing device memory allocations from
     * this context are invalid and must be reconstructed if the program is to
     * continue using CUDA.
     */
    CUDA_ERROR_LAUNCH_TIMEOUT                 = 702,

    /**
     * This error indicates a kernel launch that uses an incompatible texturing
     * mode.
     */
    CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING  = 703,
    
    /**
     * This error indicates that a call to ::cuCtxEnablePeerAccess() is
     * trying to re-enable peer access to a context which has already
     * had peer access to it enabled.
     */
    CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED    = 704,

    /**
     * This error indicates that ::cuCtxDisablePeerAccess() is 
     * trying to disable peer access which has not been enabled yet 
     * via ::cuCtxEnablePeerAccess(). 
     */
    CUDA_ERROR_PEER_ACCESS_NOT_ENABLED        = 705,

    /**
     * This error indicates that the primary context for the specified device
     * has already been initialized.
     */
    CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE         = 708,

    /**
     * This error indicates that the context current to the calling thread
     * has been destroyed using ::cuCtxDestroy, or is a primary context which
     * has not yet been initialized.
     */
    CUDA_ERROR_CONTEXT_IS_DESTROYED           = 709,

    /**
     * A device-side assert triggered during kernel execution. The context
     * cannot be used anymore, and must be destroyed. All existing device 
     * memory allocations from this context are invalid and must be 
     * reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_ASSERT                         = 710,

    /**
     * This error indicates that the hardware resources required to enable
     * peer access have been exhausted for one or more of the devices 
     * passed to ::cuCtxEnablePeerAccess().
     */
    CUDA_ERROR_TOO_MANY_PEERS                 = 711,

    /**
     * This error indicates that the memory range passed to ::cuMemHostRegister()
     * has already been registered.
     */
    CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED = 712,

    /**
     * This error indicates that the pointer passed to ::cuMemHostUnregister()
     * does not correspond to any currently registered memory region.
     */
    CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED     = 713,

    /**
     * While executing a kernel, the device encountered a stack error.
     * This can be due to stack corruption or exceeding the stack size limit.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_HARDWARE_STACK_ERROR           = 714,

    /**
     * While executing a kernel, the device encountered an illegal instruction.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_ILLEGAL_INSTRUCTION            = 715,

    /**
     * While executing a kernel, the device encountered a load or store instruction
     * on a memory address which is not aligned.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_MISALIGNED_ADDRESS             = 716,

    /**
     * While executing a kernel, the device encountered an instruction
     * which can only operate on memory locations in certain address spaces
     * (global, shared, or local), but was supplied a memory address not
     * belonging to an allowed address space.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_INVALID_ADDRESS_SPACE          = 717,

    /**
     * While executing a kernel, the device program counter wrapped its address space.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_INVALID_PC                     = 718,

    /**
     * An exception occurred on the device while executing a kernel. Common
     * causes include dereferencing an invalid device pointer and accessing
     * out of bounds shared memory. The context cannot be used, so it must
     * be destroyed (and a new one should be created). All existing device
     * memory allocations from this context are invalid and must be
     * reconstructed if the program is to continue using CUDA.
     */
    CUDA_ERROR_LAUNCH_FAILED                  = 719,


    /**
     * This error indicates that the attempted operation is not permitted.
     */
    CUDA_ERROR_NOT_PERMITTED                  = 800,

    /**
     * This error indicates that the attempted operation is not supported
     * on the current system or device.
     */
    CUDA_ERROR_NOT_SUPPORTED                  = 801,

    /**
     * This indicates that an unknown internal error has occurred.
     */
    CUDA_ERROR_UNKNOWN                        = 999;

// #ifdef _WIN32
// #define CUDA_CB __stdcall
// #else
// #define CUDA_CB
// #endif

/**
 * CUDA stream callback
 * @param hStream The stream the callback was added to, as passed to ::cuStreamAddCallback.  May be NULL.
 * @param status ::CUDA_SUCCESS or any persistent error on the stream.
 * @param userData User parameter provided at registration.
 */
@Convention("CUDA_CB") public static class CUstreamCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CUstreamCallback(Pointer p) { super(p); }
    protected CUstreamCallback() { allocate(); }
    private native void allocate();
    public native void call(CUstream_st hStream, @Cast("CUresult") int status, Pointer userData);
}

/**
 * Block size to per-block dynamic shared memory mapping for a certain
 * kernel @param blockSize Block size of the kernel.
 *
 * @return The dynamic shared memory needed by a block.
 */
@Convention("CUDA_CB") public static class CUoccupancyB2DSize extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CUoccupancyB2DSize(Pointer p) { super(p); }
    protected CUoccupancyB2DSize() { allocate(); }
    private native void allocate();
    public native @Cast("size_t") long call(int blockSize);
}

/**
 * If set, host memory is portable between CUDA contexts.
 * Flag for ::cuMemHostAlloc()
 */
public static final int CU_MEMHOSTALLOC_PORTABLE =        0x01;

/**
 * If set, host memory is mapped into CUDA address space and
 * ::cuMemHostGetDevicePointer() may be called on the host pointer.
 * Flag for ::cuMemHostAlloc()
 */
public static final int CU_MEMHOSTALLOC_DEVICEMAP =       0x02;

/**
 * If set, host memory is allocated as write-combined - fast to write,
 * faster to DMA, slow to read except via SSE4 streaming load instruction
 * (MOVNTDQA).
 * Flag for ::cuMemHostAlloc()
 */
public static final int CU_MEMHOSTALLOC_WRITECOMBINED =   0x04;

/**
 * If set, host memory is portable between CUDA contexts.
 * Flag for ::cuMemHostRegister()
 */
public static final int CU_MEMHOSTREGISTER_PORTABLE =     0x01;

/**
 * If set, host memory is mapped into CUDA address space and
 * ::cuMemHostGetDevicePointer() may be called on the host pointer.
 * Flag for ::cuMemHostRegister()
 */
public static final int CU_MEMHOSTREGISTER_DEVICEMAP =    0x02;

/**
 * If set, the passed memory pointer is treated as pointing to some
 * memory-mapped I/O space, e.g. belonging to a third-party PCIe device.
 * On Windows the flag is a no-op.
 * On Linux that memory is marked as non cache-coherent for the GPU and
 * is expected to be physically contiguous. It may return
 * CUDA_ERROR_NOT_PERMITTED if run as an unprivileged user,
 * CUDA_ERROR_NOT_SUPPORTED on older Linux kernel versions.
 * On all other platforms, it is not supported and CUDA_ERROR_NOT_SUPPORTED
 * is returned.
 * Flag for ::cuMemHostRegister()
 */
public static final int CU_MEMHOSTREGISTER_IOMEMORY =     0x04;

// #if __CUDA_API_VERSION >= 3020

/**
 * 2D memory copy parameters
 */
public static class CUDA_MEMCPY2D extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY2D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_MEMCPY2D(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY2D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_MEMCPY2D position(int position) {
        return (CUDA_MEMCPY2D)super.position(position);
    }

    /** Source X in bytes */
    public native @Cast("size_t") long srcXInBytes(); public native CUDA_MEMCPY2D srcXInBytes(long srcXInBytes);
    /** Source Y */
    public native @Cast("size_t") long srcY(); public native CUDA_MEMCPY2D srcY(long srcY);

    /** Source memory type (host, device, array) */
    public native @Cast("CUmemorytype") int srcMemoryType(); public native CUDA_MEMCPY2D srcMemoryType(int srcMemoryType);
    /** Source host pointer */
    @MemberGetter public native @Const Pointer srcHost();
    /** Source device pointer */
    public native @Cast("CUdeviceptr") long srcDevice(); public native CUDA_MEMCPY2D srcDevice(long srcDevice);
    /** Source array reference */
    public native CUarray_st srcArray(); public native CUDA_MEMCPY2D srcArray(CUarray_st srcArray);
    /** Source pitch (ignored when src is array) */
    public native @Cast("size_t") long srcPitch(); public native CUDA_MEMCPY2D srcPitch(long srcPitch);

    /** Destination X in bytes */
    public native @Cast("size_t") long dstXInBytes(); public native CUDA_MEMCPY2D dstXInBytes(long dstXInBytes);
    /** Destination Y */
    public native @Cast("size_t") long dstY(); public native CUDA_MEMCPY2D dstY(long dstY);

    /** Destination memory type (host, device, array) */
    public native @Cast("CUmemorytype") int dstMemoryType(); public native CUDA_MEMCPY2D dstMemoryType(int dstMemoryType);
    /** Destination host pointer */
    public native Pointer dstHost(); public native CUDA_MEMCPY2D dstHost(Pointer dstHost);
    /** Destination device pointer */
    public native @Cast("CUdeviceptr") long dstDevice(); public native CUDA_MEMCPY2D dstDevice(long dstDevice);
    /** Destination array reference */
    public native CUarray_st dstArray(); public native CUDA_MEMCPY2D dstArray(CUarray_st dstArray);
    /** Destination pitch (ignored when dst is array) */
    public native @Cast("size_t") long dstPitch(); public native CUDA_MEMCPY2D dstPitch(long dstPitch);

    /** Width of 2D memory copy in bytes */
    public native @Cast("size_t") long WidthInBytes(); public native CUDA_MEMCPY2D WidthInBytes(long WidthInBytes);
    /** Height of 2D memory copy */
    public native @Cast("size_t") long Height(); public native CUDA_MEMCPY2D Height(long Height);
}

/**
 * 3D memory copy parameters
 */
public static class CUDA_MEMCPY3D extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY3D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_MEMCPY3D(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY3D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_MEMCPY3D position(int position) {
        return (CUDA_MEMCPY3D)super.position(position);
    }

    /** Source X in bytes */
    public native @Cast("size_t") long srcXInBytes(); public native CUDA_MEMCPY3D srcXInBytes(long srcXInBytes);
    /** Source Y */
    public native @Cast("size_t") long srcY(); public native CUDA_MEMCPY3D srcY(long srcY);
    /** Source Z */
    public native @Cast("size_t") long srcZ(); public native CUDA_MEMCPY3D srcZ(long srcZ);
    /** Source LOD */
    public native @Cast("size_t") long srcLOD(); public native CUDA_MEMCPY3D srcLOD(long srcLOD);
    /** Source memory type (host, device, array) */
    public native @Cast("CUmemorytype") int srcMemoryType(); public native CUDA_MEMCPY3D srcMemoryType(int srcMemoryType);
    /** Source host pointer */
    @MemberGetter public native @Const Pointer srcHost();
    /** Source device pointer */
    public native @Cast("CUdeviceptr") long srcDevice(); public native CUDA_MEMCPY3D srcDevice(long srcDevice);
    /** Source array reference */
    public native CUarray_st srcArray(); public native CUDA_MEMCPY3D srcArray(CUarray_st srcArray);
    /** Must be NULL */
    public native Pointer reserved0(); public native CUDA_MEMCPY3D reserved0(Pointer reserved0);
    /** Source pitch (ignored when src is array) */
    public native @Cast("size_t") long srcPitch(); public native CUDA_MEMCPY3D srcPitch(long srcPitch);
    /** Source height (ignored when src is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long srcHeight(); public native CUDA_MEMCPY3D srcHeight(long srcHeight);

    /** Destination X in bytes */
    public native @Cast("size_t") long dstXInBytes(); public native CUDA_MEMCPY3D dstXInBytes(long dstXInBytes);
    /** Destination Y */
    public native @Cast("size_t") long dstY(); public native CUDA_MEMCPY3D dstY(long dstY);
    /** Destination Z */
    public native @Cast("size_t") long dstZ(); public native CUDA_MEMCPY3D dstZ(long dstZ);
    /** Destination LOD */
    public native @Cast("size_t") long dstLOD(); public native CUDA_MEMCPY3D dstLOD(long dstLOD);
    /** Destination memory type (host, device, array) */
    public native @Cast("CUmemorytype") int dstMemoryType(); public native CUDA_MEMCPY3D dstMemoryType(int dstMemoryType);
    /** Destination host pointer */
    public native Pointer dstHost(); public native CUDA_MEMCPY3D dstHost(Pointer dstHost);
    /** Destination device pointer */
    public native @Cast("CUdeviceptr") long dstDevice(); public native CUDA_MEMCPY3D dstDevice(long dstDevice);
    /** Destination array reference */
    public native CUarray_st dstArray(); public native CUDA_MEMCPY3D dstArray(CUarray_st dstArray);
    /** Must be NULL */
    public native Pointer reserved1(); public native CUDA_MEMCPY3D reserved1(Pointer reserved1);
    /** Destination pitch (ignored when dst is array) */
    public native @Cast("size_t") long dstPitch(); public native CUDA_MEMCPY3D dstPitch(long dstPitch);
    /** Destination height (ignored when dst is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long dstHeight(); public native CUDA_MEMCPY3D dstHeight(long dstHeight);

    /** Width of 3D memory copy in bytes */
    public native @Cast("size_t") long WidthInBytes(); public native CUDA_MEMCPY3D WidthInBytes(long WidthInBytes);
    /** Height of 3D memory copy */
    public native @Cast("size_t") long Height(); public native CUDA_MEMCPY3D Height(long Height);
    /** Depth of 3D memory copy */
    public native @Cast("size_t") long Depth(); public native CUDA_MEMCPY3D Depth(long Depth);
}

/**
 * 3D memory cross-context copy parameters
 */
public static class CUDA_MEMCPY3D_PEER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY3D_PEER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_MEMCPY3D_PEER(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY3D_PEER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_MEMCPY3D_PEER position(int position) {
        return (CUDA_MEMCPY3D_PEER)super.position(position);
    }

    /** Source X in bytes */
    public native @Cast("size_t") long srcXInBytes(); public native CUDA_MEMCPY3D_PEER srcXInBytes(long srcXInBytes);
    /** Source Y */
    public native @Cast("size_t") long srcY(); public native CUDA_MEMCPY3D_PEER srcY(long srcY);
    /** Source Z */
    public native @Cast("size_t") long srcZ(); public native CUDA_MEMCPY3D_PEER srcZ(long srcZ);
    /** Source LOD */
    public native @Cast("size_t") long srcLOD(); public native CUDA_MEMCPY3D_PEER srcLOD(long srcLOD);
    /** Source memory type (host, device, array) */
    public native @Cast("CUmemorytype") int srcMemoryType(); public native CUDA_MEMCPY3D_PEER srcMemoryType(int srcMemoryType);
    /** Source host pointer */
    @MemberGetter public native @Const Pointer srcHost();
    /** Source device pointer */
    public native @Cast("CUdeviceptr") long srcDevice(); public native CUDA_MEMCPY3D_PEER srcDevice(long srcDevice);
    /** Source array reference */
    public native CUarray_st srcArray(); public native CUDA_MEMCPY3D_PEER srcArray(CUarray_st srcArray);
    /** Source context (ignored with srcMemoryType is ::CU_MEMORYTYPE_ARRAY) */
    public native CUctx_st srcContext(); public native CUDA_MEMCPY3D_PEER srcContext(CUctx_st srcContext);
    /** Source pitch (ignored when src is array) */
    public native @Cast("size_t") long srcPitch(); public native CUDA_MEMCPY3D_PEER srcPitch(long srcPitch);
    /** Source height (ignored when src is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long srcHeight(); public native CUDA_MEMCPY3D_PEER srcHeight(long srcHeight);

    /** Destination X in bytes */
    public native @Cast("size_t") long dstXInBytes(); public native CUDA_MEMCPY3D_PEER dstXInBytes(long dstXInBytes);
    /** Destination Y */
    public native @Cast("size_t") long dstY(); public native CUDA_MEMCPY3D_PEER dstY(long dstY);
    /** Destination Z */
    public native @Cast("size_t") long dstZ(); public native CUDA_MEMCPY3D_PEER dstZ(long dstZ);
    /** Destination LOD */
    public native @Cast("size_t") long dstLOD(); public native CUDA_MEMCPY3D_PEER dstLOD(long dstLOD);
    /** Destination memory type (host, device, array) */
    public native @Cast("CUmemorytype") int dstMemoryType(); public native CUDA_MEMCPY3D_PEER dstMemoryType(int dstMemoryType);
    /** Destination host pointer */
    public native Pointer dstHost(); public native CUDA_MEMCPY3D_PEER dstHost(Pointer dstHost);
    /** Destination device pointer */
    public native @Cast("CUdeviceptr") long dstDevice(); public native CUDA_MEMCPY3D_PEER dstDevice(long dstDevice);
    /** Destination array reference */
    public native CUarray_st dstArray(); public native CUDA_MEMCPY3D_PEER dstArray(CUarray_st dstArray);
    /** Destination context (ignored with dstMemoryType is ::CU_MEMORYTYPE_ARRAY) */
    public native CUctx_st dstContext(); public native CUDA_MEMCPY3D_PEER dstContext(CUctx_st dstContext);
    /** Destination pitch (ignored when dst is array) */
    public native @Cast("size_t") long dstPitch(); public native CUDA_MEMCPY3D_PEER dstPitch(long dstPitch);
    /** Destination height (ignored when dst is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long dstHeight(); public native CUDA_MEMCPY3D_PEER dstHeight(long dstHeight);

    /** Width of 3D memory copy in bytes */
    public native @Cast("size_t") long WidthInBytes(); public native CUDA_MEMCPY3D_PEER WidthInBytes(long WidthInBytes);
    /** Height of 3D memory copy */
    public native @Cast("size_t") long Height(); public native CUDA_MEMCPY3D_PEER Height(long Height);
    /** Depth of 3D memory copy */
    public native @Cast("size_t") long Depth(); public native CUDA_MEMCPY3D_PEER Depth(long Depth);
}

/**
 * Array descriptor
 */
public static class CUDA_ARRAY_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_ARRAY_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_ARRAY_DESCRIPTOR(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_ARRAY_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_ARRAY_DESCRIPTOR position(int position) {
        return (CUDA_ARRAY_DESCRIPTOR)super.position(position);
    }

    /** Width of array */
    public native @Cast("size_t") long Width(); public native CUDA_ARRAY_DESCRIPTOR Width(long Width);
    /** Height of array */
    public native @Cast("size_t") long Height(); public native CUDA_ARRAY_DESCRIPTOR Height(long Height);

    /** Array format */
    public native @Cast("CUarray_format") int Format(); public native CUDA_ARRAY_DESCRIPTOR Format(int Format);
    /** Channels per array element */
    public native @Cast("unsigned int") int NumChannels(); public native CUDA_ARRAY_DESCRIPTOR NumChannels(int NumChannels);
}

/**
 * 3D array descriptor
 */
public static class CUDA_ARRAY3D_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_ARRAY3D_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_ARRAY3D_DESCRIPTOR(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_ARRAY3D_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_ARRAY3D_DESCRIPTOR position(int position) {
        return (CUDA_ARRAY3D_DESCRIPTOR)super.position(position);
    }

    /** Width of 3D array */
    public native @Cast("size_t") long Width(); public native CUDA_ARRAY3D_DESCRIPTOR Width(long Width);
    /** Height of 3D array */
    public native @Cast("size_t") long Height(); public native CUDA_ARRAY3D_DESCRIPTOR Height(long Height);
    /** Depth of 3D array */
    public native @Cast("size_t") long Depth(); public native CUDA_ARRAY3D_DESCRIPTOR Depth(long Depth);

    /** Array format */
    public native @Cast("CUarray_format") int Format(); public native CUDA_ARRAY3D_DESCRIPTOR Format(int Format);
    /** Channels per array element */
    public native @Cast("unsigned int") int NumChannels(); public native CUDA_ARRAY3D_DESCRIPTOR NumChannels(int NumChannels);
    /** Flags */
    public native @Cast("unsigned int") int Flags(); public native CUDA_ARRAY3D_DESCRIPTOR Flags(int Flags);
}

// #endif /* __CUDA_API_VERSION >= 3020 */

// #if __CUDA_API_VERSION >= 5000

/**
 * CUDA Resource descriptor
 */
public static class CUDA_RESOURCE_DESC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_RESOURCE_DESC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_RESOURCE_DESC(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_RESOURCE_DESC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_RESOURCE_DESC position(int position) {
        return (CUDA_RESOURCE_DESC)super.position(position);
    }

    /** Resource type */
    public native @Cast("CUresourcetype") int resType(); public native CUDA_RESOURCE_DESC resType(int resType);

            /** CUDA array */
            @Name("res.array.hArray") public native CUarray_st res_array_hArray(); public native CUDA_RESOURCE_DESC res_array_hArray(CUarray_st res_array_hArray);
            /** CUDA mipmapped array */
            @Name("res.mipmap.hMipmappedArray") public native CUmipmappedArray_st res_mipmap_hMipmappedArray(); public native CUDA_RESOURCE_DESC res_mipmap_hMipmappedArray(CUmipmappedArray_st res_mipmap_hMipmappedArray);
            /** Device pointer */
            @Name("res.linear.devPtr") public native @Cast("CUdeviceptr") long res_linear_devPtr(); public native CUDA_RESOURCE_DESC res_linear_devPtr(long res_linear_devPtr);
            /** Array format */
            @Name("res.linear.format") public native @Cast("CUarray_format") int res_linear_format(); public native CUDA_RESOURCE_DESC res_linear_format(int res_linear_format);
            /** Channels per array element */
            @Name("res.linear.numChannels") public native @Cast("unsigned int") int res_linear_numChannels(); public native CUDA_RESOURCE_DESC res_linear_numChannels(int res_linear_numChannels);
            /** Size in bytes */
            @Name("res.linear.sizeInBytes") public native @Cast("size_t") long res_linear_sizeInBytes(); public native CUDA_RESOURCE_DESC res_linear_sizeInBytes(long res_linear_sizeInBytes);
            /** Device pointer */
            @Name("res.pitch2D.devPtr") public native @Cast("CUdeviceptr") long res_pitch2D_devPtr(); public native CUDA_RESOURCE_DESC res_pitch2D_devPtr(long res_pitch2D_devPtr);
            /** Array format */
            @Name("res.pitch2D.format") public native @Cast("CUarray_format") int res_pitch2D_format(); public native CUDA_RESOURCE_DESC res_pitch2D_format(int res_pitch2D_format);
            /** Channels per array element */
            @Name("res.pitch2D.numChannels") public native @Cast("unsigned int") int res_pitch2D_numChannels(); public native CUDA_RESOURCE_DESC res_pitch2D_numChannels(int res_pitch2D_numChannels);
            /** Width of the array in elements */
            @Name("res.pitch2D.width") public native @Cast("size_t") long res_pitch2D_width(); public native CUDA_RESOURCE_DESC res_pitch2D_width(long res_pitch2D_width);
            /** Height of the array in elements */
            @Name("res.pitch2D.height") public native @Cast("size_t") long res_pitch2D_height(); public native CUDA_RESOURCE_DESC res_pitch2D_height(long res_pitch2D_height);
            /** Pitch between two rows in bytes */
            @Name("res.pitch2D.pitchInBytes") public native @Cast("size_t") long res_pitch2D_pitchInBytes(); public native CUDA_RESOURCE_DESC res_pitch2D_pitchInBytes(long res_pitch2D_pitchInBytes);
            @Name("res.reserved.reserved") public native int res_reserved_reserved(int i); public native CUDA_RESOURCE_DESC res_reserved_reserved(int i, int res_reserved_reserved);
            @Name("res.reserved.reserved") @MemberGetter public native IntPointer res_reserved_reserved();

    /** Flags (must be zero) */
    public native @Cast("unsigned int") int flags(); public native CUDA_RESOURCE_DESC flags(int flags);
}

/**
 * Texture descriptor
 */
public static class CUDA_TEXTURE_DESC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_TEXTURE_DESC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_TEXTURE_DESC(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_TEXTURE_DESC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_TEXTURE_DESC position(int position) {
        return (CUDA_TEXTURE_DESC)super.position(position);
    }

    /** Address modes */
    public native @Cast("CUaddress_mode") int addressMode(int i); public native CUDA_TEXTURE_DESC addressMode(int i, int addressMode);
    @MemberGetter public native @Cast("CUaddress_mode*") IntPointer addressMode();
    /** Filter mode */
    public native @Cast("CUfilter_mode") int filterMode(); public native CUDA_TEXTURE_DESC filterMode(int filterMode);
    /** Flags */
    public native @Cast("unsigned int") int flags(); public native CUDA_TEXTURE_DESC flags(int flags);
    /** Maximum anisotropy ratio */
    public native @Cast("unsigned int") int maxAnisotropy(); public native CUDA_TEXTURE_DESC maxAnisotropy(int maxAnisotropy);
    /** Mipmap filter mode */
    public native @Cast("CUfilter_mode") int mipmapFilterMode(); public native CUDA_TEXTURE_DESC mipmapFilterMode(int mipmapFilterMode);
    /** Mipmap level bias */
    public native float mipmapLevelBias(); public native CUDA_TEXTURE_DESC mipmapLevelBias(float mipmapLevelBias);
    /** Mipmap minimum level clamp */
    public native float minMipmapLevelClamp(); public native CUDA_TEXTURE_DESC minMipmapLevelClamp(float minMipmapLevelClamp);
    /** Mipmap maximum level clamp */
    public native float maxMipmapLevelClamp(); public native CUDA_TEXTURE_DESC maxMipmapLevelClamp(float maxMipmapLevelClamp);
    public native int reserved(int i); public native CUDA_TEXTURE_DESC reserved(int i, int reserved);
    @MemberGetter public native IntPointer reserved();
}

/**
 * Resource view format
 */
/** enum CUresourceViewFormat */
public static final int
    /** No resource view format (use underlying resource format) */
    CU_RES_VIEW_FORMAT_NONE          =  0x00,
    /** 1 channel unsigned 8-bit integers */
    CU_RES_VIEW_FORMAT_UINT_1X8      =  0x01,
    /** 2 channel unsigned 8-bit integers */
    CU_RES_VIEW_FORMAT_UINT_2X8      =  0x02,
    /** 4 channel unsigned 8-bit integers */
    CU_RES_VIEW_FORMAT_UINT_4X8      =  0x03,
    /** 1 channel signed 8-bit integers */
    CU_RES_VIEW_FORMAT_SINT_1X8      =  0x04,
    /** 2 channel signed 8-bit integers */
    CU_RES_VIEW_FORMAT_SINT_2X8      =  0x05,
    /** 4 channel signed 8-bit integers */
    CU_RES_VIEW_FORMAT_SINT_4X8      =  0x06,
    /** 1 channel unsigned 16-bit integers */
    CU_RES_VIEW_FORMAT_UINT_1X16     =  0x07,
    /** 2 channel unsigned 16-bit integers */
    CU_RES_VIEW_FORMAT_UINT_2X16     =  0x08,
    /** 4 channel unsigned 16-bit integers */
    CU_RES_VIEW_FORMAT_UINT_4X16     =  0x09,
    /** 1 channel signed 16-bit integers */
    CU_RES_VIEW_FORMAT_SINT_1X16     =  0x0a,
    /** 2 channel signed 16-bit integers */
    CU_RES_VIEW_FORMAT_SINT_2X16     =  0x0b,
    /** 4 channel signed 16-bit integers */
    CU_RES_VIEW_FORMAT_SINT_4X16     =  0x0c,
    /** 1 channel unsigned 32-bit integers */
    CU_RES_VIEW_FORMAT_UINT_1X32     =  0x0d,
    /** 2 channel unsigned 32-bit integers */
    CU_RES_VIEW_FORMAT_UINT_2X32     =  0x0e,
    /** 4 channel unsigned 32-bit integers */
    CU_RES_VIEW_FORMAT_UINT_4X32     =  0x0f,
    /** 1 channel signed 32-bit integers */
    CU_RES_VIEW_FORMAT_SINT_1X32     =  0x10,
    /** 2 channel signed 32-bit integers */
    CU_RES_VIEW_FORMAT_SINT_2X32     =  0x11,
    /** 4 channel signed 32-bit integers */
    CU_RES_VIEW_FORMAT_SINT_4X32     =  0x12,
    /** 1 channel 16-bit floating point */
    CU_RES_VIEW_FORMAT_FLOAT_1X16    =  0x13,
    /** 2 channel 16-bit floating point */
    CU_RES_VIEW_FORMAT_FLOAT_2X16    =  0x14,
    /** 4 channel 16-bit floating point */
    CU_RES_VIEW_FORMAT_FLOAT_4X16    =  0x15,
    /** 1 channel 32-bit floating point */
    CU_RES_VIEW_FORMAT_FLOAT_1X32    =  0x16,
    /** 2 channel 32-bit floating point */
    CU_RES_VIEW_FORMAT_FLOAT_2X32    =  0x17,
    /** 4 channel 32-bit floating point */
    CU_RES_VIEW_FORMAT_FLOAT_4X32    =  0x18,
    /** Block compressed 1 */
    CU_RES_VIEW_FORMAT_UNSIGNED_BC1  =  0x19,
    /** Block compressed 2 */
    CU_RES_VIEW_FORMAT_UNSIGNED_BC2  =  0x1a,
    /** Block compressed 3 */
    CU_RES_VIEW_FORMAT_UNSIGNED_BC3  =  0x1b,
    /** Block compressed 4 unsigned */
    CU_RES_VIEW_FORMAT_UNSIGNED_BC4  =  0x1c,
    /** Block compressed 4 signed */
    CU_RES_VIEW_FORMAT_SIGNED_BC4    =  0x1d,
    /** Block compressed 5 unsigned */
    CU_RES_VIEW_FORMAT_UNSIGNED_BC5  =  0x1e,
    /** Block compressed 5 signed */
    CU_RES_VIEW_FORMAT_SIGNED_BC5    =  0x1f,
    /** Block compressed 6 unsigned half-float */
    CU_RES_VIEW_FORMAT_UNSIGNED_BC6H =  0x20,
    /** Block compressed 6 signed half-float */
    CU_RES_VIEW_FORMAT_SIGNED_BC6H   =  0x21,
    /** Block compressed 7 */
    CU_RES_VIEW_FORMAT_UNSIGNED_BC7  =  0x22;

/**
 * Resource view descriptor
 */
public static class CUDA_RESOURCE_VIEW_DESC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_RESOURCE_VIEW_DESC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_RESOURCE_VIEW_DESC(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_RESOURCE_VIEW_DESC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_RESOURCE_VIEW_DESC position(int position) {
        return (CUDA_RESOURCE_VIEW_DESC)super.position(position);
    }

    /** Resource view format */
    public native @Cast("CUresourceViewFormat") int format(); public native CUDA_RESOURCE_VIEW_DESC format(int format);
    /** Width of the resource view */
    public native @Cast("size_t") long width(); public native CUDA_RESOURCE_VIEW_DESC width(long width);
    /** Height of the resource view */
    public native @Cast("size_t") long height(); public native CUDA_RESOURCE_VIEW_DESC height(long height);
    /** Depth of the resource view */
    public native @Cast("size_t") long depth(); public native CUDA_RESOURCE_VIEW_DESC depth(long depth);
    /** First defined mipmap level */
    public native @Cast("unsigned int") int firstMipmapLevel(); public native CUDA_RESOURCE_VIEW_DESC firstMipmapLevel(int firstMipmapLevel);
    /** Last defined mipmap level */
    public native @Cast("unsigned int") int lastMipmapLevel(); public native CUDA_RESOURCE_VIEW_DESC lastMipmapLevel(int lastMipmapLevel);
    /** First layer index */
    public native @Cast("unsigned int") int firstLayer(); public native CUDA_RESOURCE_VIEW_DESC firstLayer(int firstLayer);
    /** Last layer index */
    public native @Cast("unsigned int") int lastLayer(); public native CUDA_RESOURCE_VIEW_DESC lastLayer(int lastLayer);
    public native @Cast("unsigned int") int reserved(int i); public native CUDA_RESOURCE_VIEW_DESC reserved(int i, int reserved);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}

/**
 * GPU Direct v3 tokens
 */
public static class CUDA_POINTER_ATTRIBUTE_P2P_TOKENS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS position(int position) {
        return (CUDA_POINTER_ATTRIBUTE_P2P_TOKENS)super.position(position);
    }

    public native @Cast("unsigned long long") long p2pToken(); public native CUDA_POINTER_ATTRIBUTE_P2P_TOKENS p2pToken(long p2pToken);
    public native @Cast("unsigned int") int vaSpaceToken(); public native CUDA_POINTER_ATTRIBUTE_P2P_TOKENS vaSpaceToken(int vaSpaceToken);
}

// #endif /* __CUDA_API_VERSION >= 5000 */

/**
 * If set, the CUDA array is a collection of layers, where each layer is either a 1D
 * or a 2D array and the Depth member of CUDA_ARRAY3D_DESCRIPTOR specifies the number 
 * of layers, not the depth of a 3D array.
 */
public static final int CUDA_ARRAY3D_LAYERED =        0x01;

/**
 * Deprecated, use CUDA_ARRAY3D_LAYERED
 */
public static final int CUDA_ARRAY3D_2DARRAY =        0x01;

/**
 * This flag must be set in order to bind a surface reference
 * to the CUDA array
 */
public static final int CUDA_ARRAY3D_SURFACE_LDST =   0x02;

/**
 * If set, the CUDA array is a collection of six 2D arrays, representing faces of a cube. The
 * width of such a CUDA array must be equal to its height, and Depth must be six.
 * If ::CUDA_ARRAY3D_LAYERED flag is also set, then the CUDA array is a collection of cubemaps
 * and Depth must be a multiple of six.
 */
public static final int CUDA_ARRAY3D_CUBEMAP =        0x04;

/**
 * This flag must be set in order to perform texture gather operations
 * on a CUDA array.
 */
public static final int CUDA_ARRAY3D_TEXTURE_GATHER = 0x08;

/**
 * This flag if set indicates that the CUDA
 * array is a DEPTH_TEXTURE.
*/
public static final int CUDA_ARRAY3D_DEPTH_TEXTURE = 0x10;

/**
 * Override the texref format with a format inferred from the array.
 * Flag for ::cuTexRefSetArray()
 */
public static final int CU_TRSA_OVERRIDE_FORMAT = 0x01;

/**
 * Read the texture as integers rather than promoting the values to floats
 * in the range [0,1].
 * Flag for ::cuTexRefSetFlags()
 */
public static final int CU_TRSF_READ_AS_INTEGER =         0x01;

/**
 * Use normalized texture coordinates in the range [0,1) instead of [0,dim).
 * Flag for ::cuTexRefSetFlags()
 */
public static final int CU_TRSF_NORMALIZED_COORDINATES =  0x02;

/**
 * Perform sRGB->linear conversion during texture read.
 * Flag for ::cuTexRefSetFlags()
 */
public static final int CU_TRSF_SRGB =  0x10;

/**
 * End of array terminator for the \p extra parameter to
 * ::cuLaunchKernel
 */
public static native @MemberGetter Pointer CU_LAUNCH_PARAM_END();
public static final Pointer CU_LAUNCH_PARAM_END = CU_LAUNCH_PARAM_END();

/**
 * Indicator that the next value in the \p extra parameter to
 * ::cuLaunchKernel will be a pointer to a buffer containing all kernel
 * parameters used for launching kernel \p f.  This buffer needs to
 * honor all alignment/padding requirements of the individual parameters.
 * If ::CU_LAUNCH_PARAM_BUFFER_SIZE is not also specified in the
 * \p extra array, then ::CU_LAUNCH_PARAM_BUFFER_POINTER will have no
 * effect.
 */
public static native @MemberGetter Pointer CU_LAUNCH_PARAM_BUFFER_POINTER();
public static final Pointer CU_LAUNCH_PARAM_BUFFER_POINTER = CU_LAUNCH_PARAM_BUFFER_POINTER();

/**
 * Indicator that the next value in the \p extra parameter to
 * ::cuLaunchKernel will be a pointer to a size_t which contains the
 * size of the buffer specified with ::CU_LAUNCH_PARAM_BUFFER_POINTER.
 * It is required that ::CU_LAUNCH_PARAM_BUFFER_POINTER also be specified
 * in the \p extra array if the value associated with
 * ::CU_LAUNCH_PARAM_BUFFER_SIZE is not zero.
 */
public static native @MemberGetter Pointer CU_LAUNCH_PARAM_BUFFER_SIZE();
public static final Pointer CU_LAUNCH_PARAM_BUFFER_SIZE = CU_LAUNCH_PARAM_BUFFER_SIZE();

/**
 * For texture references loaded into the module, use default texunit from
 * texture reference.
 */
public static final int CU_PARAM_TR_DEFAULT = -1;

/** \} */ /* END CUDA_TYPES */

// #ifdef _WIN32
// #define CUDAAPI __stdcall
// #else
// #define CUDAAPI
// #endif

/**
 * \defgroup CUDA_ERROR Error Handling
 *
 * ___MANBRIEF___ error handling functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the error handling functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

/**
 * \brief Gets the string description of an error code
 *
 * Sets \p *pStr to the address of a NULL-terminated string description
 * of the error code \p error.
 * If the error code is not recognized, ::CUDA_ERROR_INVALID_VALUE
 * will be returned and \p *pStr will be set to the NULL address.
 *
 * @param error - Error code to convert to string
 * @param pStr - Address of the string pointer.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::CUresult
 */
public static native @Cast("CUresult") int cuGetErrorString(@Cast("CUresult") int error, @Cast("const char**") PointerPointer pStr);
public static native @Cast("CUresult") int cuGetErrorString(@Cast("CUresult") int error, @Cast("const char**") @ByPtrPtr BytePointer pStr);
public static native @Cast("CUresult") int cuGetErrorString(@Cast("CUresult") int error, @Cast("const char**") @ByPtrPtr ByteBuffer pStr);
public static native @Cast("CUresult") int cuGetErrorString(@Cast("CUresult") int error, @Cast("const char**") @ByPtrPtr byte[] pStr);

/**
 * \brief Gets the string representation of an error code enum name
 *
 * Sets \p *pStr to the address of a NULL-terminated string representation
 * of the name of the enum error code \p error.
 * If the error code is not recognized, ::CUDA_ERROR_INVALID_VALUE
 * will be returned and \p *pStr will be set to the NULL address.
 *
 * @param error - Error code to convert to string
 * @param pStr - Address of the string pointer.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::CUresult
 */
public static native @Cast("CUresult") int cuGetErrorName(@Cast("CUresult") int error, @Cast("const char**") PointerPointer pStr);
public static native @Cast("CUresult") int cuGetErrorName(@Cast("CUresult") int error, @Cast("const char**") @ByPtrPtr BytePointer pStr);
public static native @Cast("CUresult") int cuGetErrorName(@Cast("CUresult") int error, @Cast("const char**") @ByPtrPtr ByteBuffer pStr);
public static native @Cast("CUresult") int cuGetErrorName(@Cast("CUresult") int error, @Cast("const char**") @ByPtrPtr byte[] pStr);

/** \} */ /* END CUDA_ERROR */

/**
 * \defgroup CUDA_INITIALIZE Initialization
 *
 * ___MANBRIEF___ initialization functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the initialization functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

/**
 * \brief Initialize the CUDA driver API
 *
 * Initializes the driver API and must be called before any other function from
 * the driver API. Currently, the \p Flags parameter must be 0. If ::cuInit()
 * has not been called, any function from the driver API will return
 * ::CUDA_ERROR_NOT_INITIALIZED.
 *
 * @param Flags - Initialization flag for CUDA.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 */
public static native @Cast("CUresult") int cuInit(@Cast("unsigned int") int Flags);

/** \} */ /* END CUDA_INITIALIZE */

/**
 * \defgroup CUDA_VERSION Version Management
 *
 * ___MANBRIEF___ version management functions of the low-level CUDA driver
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the version management functions of the low-level
 * CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Returns the CUDA driver version
 *
 * Returns in \p *driverVersion the version number of the installed CUDA
 * driver. This function automatically returns ::CUDA_ERROR_INVALID_VALUE if
 * the \p driverVersion argument is NULL.
 *
 * @param driverVersion - Returns the CUDA driver version
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 */
public static native @Cast("CUresult") int cuDriverGetVersion(IntPointer driverVersion);
public static native @Cast("CUresult") int cuDriverGetVersion(IntBuffer driverVersion);
public static native @Cast("CUresult") int cuDriverGetVersion(int[] driverVersion);

/** \} */ /* END CUDA_VERSION */

/**
 * \defgroup CUDA_DEVICE Device Management
 *
 * ___MANBRIEF___ device management functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the device management functions of the low-level
 * CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Returns a handle to a compute device
 *
 * Returns in \p *device a device handle given an ordinal in the range <b>[0,
 * ::cuDeviceGetCount()-1]</b>.
 *
 * @param device  - Returned device handle
 * @param ordinal - Device number to get handle for
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa
 * ::cuDeviceGetAttribute,
 * ::cuDeviceGetCount,
 * ::cuDeviceGetName,
 * ::cuDeviceTotalMem
 */
public static native @Cast("CUresult") int cuDeviceGet(@Cast("CUdevice*") IntPointer device, int ordinal);
public static native @Cast("CUresult") int cuDeviceGet(@Cast("CUdevice*") IntBuffer device, int ordinal);
public static native @Cast("CUresult") int cuDeviceGet(@Cast("CUdevice*") int[] device, int ordinal);

/**
 * \brief Returns the number of compute-capable devices
 *
 * Returns in \p *count the number of devices with compute capability greater
 * than or equal to 1.0 that are available for execution. If there is no such
 * device, ::cuDeviceGetCount() returns 0.
 *
 * @param count - Returned number of compute-capable devices
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa
 * ::cuDeviceGetAttribute,
 * ::cuDeviceGetName,
 * ::cuDeviceGet,
 * ::cuDeviceTotalMem
 */
public static native @Cast("CUresult") int cuDeviceGetCount(IntPointer count);
public static native @Cast("CUresult") int cuDeviceGetCount(IntBuffer count);
public static native @Cast("CUresult") int cuDeviceGetCount(int[] count);

/**
 * \brief Returns an identifer string for the device
 *
 * Returns an ASCII string identifying the device \p dev in the NULL-terminated
 * string pointed to by \p name. \p len specifies the maximum length of the
 * string that may be returned.
 *
 * @param name - Returned identifier string for the device
 * @param len  - Maximum length of string to store in \p name
 * @param dev  - Device to get identifier string for
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa
 * ::cuDeviceGetAttribute,
 * ::cuDeviceGetCount,
 * ::cuDeviceGet,
 * ::cuDeviceTotalMem
 */
public static native @Cast("CUresult") int cuDeviceGetName(@Cast("char*") BytePointer name, int len, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceGetName(@Cast("char*") ByteBuffer name, int len, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceGetName(@Cast("char*") byte[] name, int len, @Cast("CUdevice") int dev);

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Returns the total amount of memory on the device
 *
 * Returns in \p *bytes the total amount of memory available on the device
 * \p dev in bytes.
 *
 * @param bytes - Returned memory available on device in bytes
 * @param dev   - Device handle
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa
 * ::cuDeviceGetAttribute,
 * ::cuDeviceGetCount,
 * ::cuDeviceGetName,
 * ::cuDeviceGet,
 */
public static native @Cast("CUresult") int cuDeviceTotalMem(@Cast("size_t*") SizeTPointer bytes, @Cast("CUdevice") int dev);
// #endif /* __CUDA_API_VERSION >= 3020 */

/**
 * \brief Returns information about the device
 *
 * Returns in \p *pi the integer value of the attribute \p attrib on device
 * \p dev. The supported attributes are:
 * - ::CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK: Maximum number of threads per
 *   block;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X: Maximum x-dimension of a block;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y: Maximum y-dimension of a block;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z: Maximum z-dimension of a block;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_X: Maximum x-dimension of a grid;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y: Maximum y-dimension of a grid;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z: Maximum z-dimension of a grid;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK: Maximum amount of
 *   shared memory available to a thread block in bytes;
 * - ::CU_DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY: Memory available on device for
 *   __constant__ variables in a CUDA C kernel in bytes;
 * - ::CU_DEVICE_ATTRIBUTE_WARP_SIZE: Warp size in threads;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_PITCH: Maximum pitch in bytes allowed by the
 *   memory copy functions that involve memory regions allocated through
 *   ::cuMemAllocPitch();
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH: Maximum 1D 
 *  texture width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH: Maximum width
 *  for a 1D texture bound to linear memory;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH: Maximum 
 *  mipmapped 1D texture width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH: Maximum 2D 
 *  texture width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT: Maximum 2D 
 *  texture height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH: Maximum width
 *  for a 2D texture bound to linear memory;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT: Maximum height
 *  for a 2D texture bound to linear memory;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH: Maximum pitch
 *  in bytes for a 2D texture bound to linear memory;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH: Maximum 
 *  mipmapped 2D texture width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT: Maximum
 *  mipmapped 2D texture height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH: Maximum 3D 
 *  texture width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT: Maximum 3D 
 *  texture height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH: Maximum 3D 
 *  texture depth;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE: 
 *  Alternate maximum 3D texture width, 0 if no alternate
 *  maximum 3D texture size is supported;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE: 
 *  Alternate maximum 3D texture height, 0 if no alternate
 *  maximum 3D texture size is supported;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE: 
 *  Alternate maximum 3D texture depth, 0 if no alternate
 *  maximum 3D texture size is supported;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH:
 *  Maximum cubemap texture width or height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH: 
 *  Maximum 1D layered texture width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS: 
 *   Maximum layers in a 1D layered texture;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH: 
 *  Maximum 2D layered texture width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT: 
 *   Maximum 2D layered texture height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS: 
 *   Maximum layers in a 2D layered texture;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH: 
 *   Maximum cubemap layered texture width or height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS: 
 *   Maximum layers in a cubemap layered texture;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH:
 *   Maximum 1D surface width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH:
 *   Maximum 2D surface width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT:
 *   Maximum 2D surface height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH:
 *   Maximum 3D surface width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT:
 *   Maximum 3D surface height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH:
 *   Maximum 3D surface depth;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH:
 *   Maximum 1D layered surface width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS:
 *   Maximum layers in a 1D layered surface;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH:
 *   Maximum 2D layered surface width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT:
 *   Maximum 2D layered surface height;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS:
 *   Maximum layers in a 2D layered surface;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH:
 *   Maximum cubemap surface width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH:
 *   Maximum cubemap layered surface width;
 * - ::CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS:
 *   Maximum layers in a cubemap layered surface;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK: Maximum number of 32-bit
 *   registers available to a thread block;
 * - ::CU_DEVICE_ATTRIBUTE_CLOCK_RATE: The typical clock frequency in kilohertz;
 * - ::CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT: Alignment requirement; texture
 *   base addresses aligned to ::textureAlign bytes do not need an offset
 *   applied to texture fetches;
 * - ::CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT: Pitch alignment requirement
 *   for 2D texture references bound to pitched memory;
 * - ::CU_DEVICE_ATTRIBUTE_GPU_OVERLAP: 1 if the device can concurrently copy
 *   memory between host and device while executing a kernel, or 0 if not;
 * - ::CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT: Number of multiprocessors on
 *   the device;
 * - ::CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT: 1 if there is a run time limit
 *   for kernels executed on the device, or 0 if not;
 * - ::CU_DEVICE_ATTRIBUTE_INTEGRATED: 1 if the device is integrated with the
 *   memory subsystem, or 0 if not;
 * - ::CU_DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY: 1 if the device can map host
 *   memory into the CUDA address space, or 0 if not;
 * - ::CU_DEVICE_ATTRIBUTE_COMPUTE_MODE: Compute mode that device is currently
 *   in. Available modes are as follows:
 *   - ::CU_COMPUTEMODE_DEFAULT: Default mode - Device is not restricted and
 *     can have multiple CUDA contexts present at a single time.
 *   - ::CU_COMPUTEMODE_EXCLUSIVE: Compute-exclusive mode - Device can have
 *     only one CUDA context present on it at a time.
 *   - ::CU_COMPUTEMODE_PROHIBITED: Compute-prohibited mode - Device is
 *     prohibited from creating new CUDA contexts.
 *   - ::CU_COMPUTEMODE_EXCLUSIVE_PROCESS:  Compute-exclusive-process mode - Device
 *     can have only one context used by a single process at a time.
 * - ::CU_DEVICE_ATTRIBUTE_CONCURRENT_KERNELS: 1 if the device supports
 *   executing multiple kernels within the same context simultaneously, or 0 if
 *   not. It is not guaranteed that multiple kernels will be resident
 *   on the device concurrently so this feature should not be relied upon for
 *   correctness;
 * - ::CU_DEVICE_ATTRIBUTE_ECC_ENABLED: 1 if error correction is enabled on the
 *    device, 0 if error correction is disabled or not supported by the device;
 * - ::CU_DEVICE_ATTRIBUTE_PCI_BUS_ID: PCI bus identifier of the device;
 * - ::CU_DEVICE_ATTRIBUTE_PCI_DEVICE_ID: PCI device (also known as slot) identifier
 *   of the device;
 * - ::CU_DEVICE_ATTRIBUTE_TCC_DRIVER: 1 if the device is using a TCC driver. TCC
 *    is only available on Tesla hardware running Windows Vista or later;
 * - ::CU_DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE: Peak memory clock frequency in kilohertz;
 * - ::CU_DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH: Global memory bus width in bits;
 * - ::CU_DEVICE_ATTRIBUTE_L2_CACHE_SIZE: Size of L2 cache in bytes. 0 if the device doesn't have L2 cache;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR: Maximum resident threads per multiprocessor;
 * - ::CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING: 1 if the device shares a unified address space with 
 *   the host, or 0 if not;
 * - ::CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR: Major compute capability version number;
 * - ::CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR: Minor compute capability version number;
 * - ::CU_DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED: 1 if device supports caching globals 
 *    in L1 cache, 0 if caching globals in L1 cache is not supported by the device;
 * - ::CU_DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED: 1 if device supports caching locals 
 *    in L1 cache, 0 if caching locals in L1 cache is not supported by the device;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR: Maximum amount of
 *   shared memory available to a multiprocessor in bytes; this amount is shared
 *   by all thread blocks simultaneously resident on a multiprocessor;
 * - ::CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR: Maximum number of 32-bit
 *   registers available to a multiprocessor; this number is shared by all thread
 *   blocks simultaneously resident on a multiprocessor;
 * - ::CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY: 1 if device supports allocating managed memory
 *   on this system, 0 if allocating managed memory is not supported by the device on this system.
 * - ::CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD: 1 if device is on a multi-GPU board, 0 if not.
 * - ::CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID: Unique identifier for a group of devices
 *   associated with the same board. Devices on the same multi-GPU board will share the same identifier.
 *
 * @param pi     - Returned device attribute value
 * @param attrib - Device attribute to query
 * @param dev    - Device handle
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa
 * ::cuDeviceGetCount,
 * ::cuDeviceGetName,
 * ::cuDeviceGet,
 * ::cuDeviceTotalMem
 */
public static native @Cast("CUresult") int cuDeviceGetAttribute(IntPointer pi, @Cast("CUdevice_attribute") int attrib, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceGetAttribute(IntBuffer pi, @Cast("CUdevice_attribute") int attrib, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceGetAttribute(int[] pi, @Cast("CUdevice_attribute") int attrib, @Cast("CUdevice") int dev);

/** \} */ /* END CUDA_DEVICE */

/**
 * \defgroup CUDA_DEVICE_DEPRECATED Device Management [DEPRECATED]
 *
 * ___MANBRIEF___ deprecated device management functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the device management functions of the low-level
 * CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Returns properties for a selected device
 *
 * @deprecated
 *
 * This function was deprecated as of CUDA 5.0 and replaced by ::cuDeviceGetAttribute().
 *
 * Returns in \p *prop the properties of device \p dev. The ::CUdevprop
 * structure is defined as:
 *
 * <pre>{@code
     typedef struct CUdevprop_st {
     int maxThreadsPerBlock;
     int maxThreadsDim[3];
     int maxGridSize[3];
     int sharedMemPerBlock;
     int totalConstantMemory;
     int SIMDWidth;
     int memPitch;
     int regsPerBlock;
     int clockRate;
     int textureAlign
  } CUdevprop;
 * }</pre>
 * where:
 *
 * - ::maxThreadsPerBlock is the maximum number of threads per block;
 * - ::maxThreadsDim[3] is the maximum sizes of each dimension of a block;
 * - ::maxGridSize[3] is the maximum sizes of each dimension of a grid;
 * - ::sharedMemPerBlock is the total amount of shared memory available per
 *   block in bytes;
 * - ::totalConstantMemory is the total amount of constant memory available on
 *   the device in bytes;
 * - ::SIMDWidth is the warp size;
 * - ::memPitch is the maximum pitch allowed by the memory copy functions that
 *   involve memory regions allocated through ::cuMemAllocPitch();
 * - ::regsPerBlock is the total number of registers available per block;
 * - ::clockRate is the clock frequency in kilohertz;
 * - ::textureAlign is the alignment requirement; texture base addresses that
 *   are aligned to ::textureAlign bytes do not need an offset applied to
 *   texture fetches.
 *
 * @param prop - Returned properties of device
 * @param dev  - Device to get properties for
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa
 * ::cuDeviceGetAttribute,
 * ::cuDeviceGetCount,
 * ::cuDeviceGetName,
 * ::cuDeviceGet,
 * ::cuDeviceTotalMem
 */
public static native @Cast("CUresult") int cuDeviceGetProperties(CUdevprop prop, @Cast("CUdevice") int dev);

/**
 * \brief Returns the compute capability of the device
 *
 * @deprecated
 *
 * This function was deprecated as of CUDA 5.0 and its functionality superceded
 * by ::cuDeviceGetAttribute(). 
 *
 * Returns in \p *major and \p *minor the major and minor revision numbers that
 * define the compute capability of the device \p dev.
 *
 * @param major - Major revision number
 * @param minor - Minor revision number
 * @param dev   - Device handle
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa
 * ::cuDeviceGetAttribute,
 * ::cuDeviceGetCount,
 * ::cuDeviceGetName,
 * ::cuDeviceGet,
 * ::cuDeviceTotalMem
 */
public static native @Cast("CUresult") int cuDeviceComputeCapability(IntPointer major, IntPointer minor, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceComputeCapability(IntBuffer major, IntBuffer minor, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceComputeCapability(int[] major, int[] minor, @Cast("CUdevice") int dev);

/** \} */ /* END CUDA_DEVICE_DEPRECATED */

/**
 * \defgroup CUDA_PRIMARY_CTX Primary Context Management
 *
 * ___MANBRIEF___ primary context management functions of the low-level CUDA driver
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the primary context management functions of the low-level
 * CUDA driver application programming interface.
 *
 * The primary context unique per device and it's shared with CUDA runtime API.
 * Those functions allows seemless integration with other libraries using CUDA.
 *
 * \{
 */

// #if __CUDA_API_VERSION >= 7000

/**
 * \brief Retain the primary context on the GPU
 *
 * Retains the primary context on the device, creating it if necessary,
 * increasing its usage count. The caller must call
 * ::cuDevicePrimaryCtxRelease() when done using the context.
 * Unlike ::cuCtxCreate() the newly created context is not pushed onto the stack.
 *
 * Context creation will fail with ::CUDA_ERROR_UNKNOWN if the compute mode of
 * the device is ::CU_COMPUTEMODE_PROHIBITED. Similarly, context creation will
 * also fail with ::CUDA_ERROR_UNKNOWN if the compute mode for the device is
 * set to ::CU_COMPUTEMODE_EXCLUSIVE and there is already an active, non-primary,
 * context on the device. The function ::cuDeviceGetAttribute() can be used with
 * ::CU_DEVICE_ATTRIBUTE_COMPUTE_MODE to determine the compute mode of the
 * device. The <i>nvidia-smi</i> tool can be used to set the compute mode for
 * devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a
 * -h option to it.
 *
 * Please note that the primary context always supports pinned allocations. Other
 * flags can be specified by ::cuDevicePrimaryCtxSetFlags().
 *
 * @param pctx  - Returned context handle of the new context
 * @param dev   - Device for which primary context is requested
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_DEVICE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 * \sa ::cuDevicePrimaryCtxRelease,
 * ::cuDevicePrimaryCtxSetFlags,
 * ::cuCtxCreate,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuDevicePrimaryCtxRetain(@ByPtrPtr CUctx_st pctx, @Cast("CUdevice") int dev);

/**
 * \brief Release the primary context on the GPU
 *
 * Releases the primary context interop on the device by decreasing the usage
 * count by 1. If the usage drops to 0 the primary context of device \p dev
 * will be destroyed regardless of how many threads it is current to.
 *
 * Please note that unlike ::cuCtxDestroy() this method does not pop the context
 * from stack in any circumstances.
 *
 * @param dev - Device which primary context is released
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa ::cuDevicePrimaryCtxRetain,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuDevicePrimaryCtxRelease(@Cast("CUdevice") int dev);

/**
 * \brief Set flags for the primary context
 *
 * Sets the flags for the primary context on the device overwriting perviously
 * set ones. If the primary context is already created
 * ::CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE is returned.
 *
 * The three LSBs of the \p flags parameter can be used to control how the OS
 * thread, which owns the CUDA context at the time of an API call, interacts
 * with the OS scheduler when waiting for results from the GPU. Only one of
 * the scheduling flags can be set when creating a context.
 *
 * - ::CU_CTX_SCHED_SPIN: Instruct CUDA to actively spin when waiting for
 * results from the GPU. This can decrease latency when waiting for the GPU,
 * but may lower the performance of CPU threads if they are performing work in
 * parallel with the CUDA thread.
 *
 * - ::CU_CTX_SCHED_YIELD: Instruct CUDA to yield its thread when waiting for
 * results from the GPU. This can increase latency when waiting for the GPU,
 * but can increase the performance of CPU threads performing work in parallel
 * with the GPU.
 *
 * - ::CU_CTX_SCHED_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a
 * synchronization primitive when waiting for the GPU to finish work.
 *
 * - ::CU_CTX_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a
 * synchronization primitive when waiting for the GPU to finish work. <br>
 * <b>Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was
 * replaced with ::CU_CTX_SCHED_BLOCKING_SYNC.
 *
 * - ::CU_CTX_SCHED_AUTO: The default value if the \p flags parameter is zero,
 * uses a heuristic based on the number of active CUDA contexts in the
 * process \e C and the number of logical processors in the system \e P. If
 * \e C > \e P, then CUDA will yield to other OS threads when waiting for
 * the GPU (::CU_CTX_SCHED_YIELD), otherwise CUDA will not yield while
 * waiting for results and actively spin on the processor (::CU_CTX_SCHED_SPIN).
 * However, on low power devices like Tegra, it always defaults to
 * ::CU_CTX_SCHED_BLOCKING_SYNC.
 *
 * - ::CU_CTX_LMEM_RESIZE_TO_MAX: Instruct CUDA to not reduce local memory
 * after resizing local memory for a kernel. This can prevent thrashing by
 * local memory allocations when launching many kernels with high local
 * memory usage at the cost of potentially increased memory usage.
 *
 * @param dev   - Device for which the primary context flags are set
 * @param flags - New flags for the device
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_DEVICE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE
 * \notefnerr
 *
 * \sa ::cuDevicePrimaryCtxRetain,
 * ::cuDevicePrimaryCtxGetState,
 * ::cuCtxCreate,
 * ::cuCtxGetFlags
 */
public static native @Cast("CUresult") int cuDevicePrimaryCtxSetFlags(@Cast("CUdevice") int dev, @Cast("unsigned int") int flags);

/**
 * \brief Get the state of the primary context
 *
 * Returns in \p *flags the flags for the primary context of \p dev, and in
 * \p *active whether it is active.  See ::cuDevicePrimaryCtxSetFlags for flag
 * values.
 *
 * @param dev    - Device to get primary context flags for
 * @param flags  - Pointer to store flags
 * @param active - Pointer to store context state; 0 = inactive, 1 = active
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_DEVICE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * \notefnerr
 *
 * \sa ::cuDevicePrimaryCtxSetFlags,
 * ::cuCtxGetFlags
 */
public static native @Cast("CUresult") int cuDevicePrimaryCtxGetState(@Cast("CUdevice") int dev, @Cast("unsigned int*") IntPointer flags, IntPointer active);
public static native @Cast("CUresult") int cuDevicePrimaryCtxGetState(@Cast("CUdevice") int dev, @Cast("unsigned int*") IntBuffer flags, IntBuffer active);
public static native @Cast("CUresult") int cuDevicePrimaryCtxGetState(@Cast("CUdevice") int dev, @Cast("unsigned int*") int[] flags, int[] active);

/**
 * \brief Destroy all allocations and reset all state on the primary context
 *
 * Explicitly destroys and cleans up all resources associated with the current
 * device in the current process.
 *
 * Note that it is responsibility of the calling function to ensure that no
 * other module in the process is using the device any more. For that reason
 * it is recommended to use ::cuDevicePrimaryCtxRelease() in most cases.
 * However it is safe for other modules to call ::cuDevicePrimaryCtxRelease()
 * even after resetting the device.
 *
 * @param dev - Device for which primary context is destroyed
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_DEVICE,
 * ::CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE
 * \notefnerr
 *
 * \sa ::cuDevicePrimaryCtxRetain,
 * ::cuDevicePrimaryCtxRelease,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 *
 */
public static native @Cast("CUresult") int cuDevicePrimaryCtxReset(@Cast("CUdevice") int dev);

// #endif /* __CUDA_API_VERSION >= 7000 */

/** \} */ /* END CUDA_PRIMARY_CTX */


/**
 * \defgroup CUDA_CTX Context Management
 *
 * ___MANBRIEF___ context management functions of the low-level CUDA driver
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the context management functions of the low-level
 * CUDA driver application programming interface.
 *
 * \{
 */

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Create a CUDA context
 *
 * Creates a new CUDA context and associates it with the calling thread. The
 * \p flags parameter is described below. The context is created with a usage
 * count of 1 and the caller of ::cuCtxCreate() must call ::cuCtxDestroy() or
 * when done using the context. If a context is already current to the thread, 
 * it is supplanted by the newly created context and may be restored by a subsequent 
 * call to ::cuCtxPopCurrent().
 *
 * The three LSBs of the \p flags parameter can be used to control how the OS
 * thread, which owns the CUDA context at the time of an API call, interacts
 * with the OS scheduler when waiting for results from the GPU. Only one of
 * the scheduling flags can be set when creating a context.
 *
 * - ::CU_CTX_SCHED_SPIN: Instruct CUDA to actively spin when waiting for
 * results from the GPU. This can decrease latency when waiting for the GPU,
 * but may lower the performance of CPU threads if they are performing work in
 * parallel with the CUDA thread.
 *
 * - ::CU_CTX_SCHED_YIELD: Instruct CUDA to yield its thread when waiting for
 * results from the GPU. This can increase latency when waiting for the GPU,
 * but can increase the performance of CPU threads performing work in parallel
 * with the GPU.
 * 
 * - ::CU_CTX_SCHED_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a
 * synchronization primitive when waiting for the GPU to finish work.
 *
 * - ::CU_CTX_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a
 * synchronization primitive when waiting for the GPU to finish work. <br>
 * <b>Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was
 * replaced with ::CU_CTX_SCHED_BLOCKING_SYNC. 
 *
 * - ::CU_CTX_SCHED_AUTO: The default value if the \p flags parameter is zero,
 * uses a heuristic based on the number of active CUDA contexts in the
 * process \e C and the number of logical processors in the system \e P. If
 * \e C > \e P, then CUDA will yield to other OS threads when waiting for 
 * the GPU (::CU_CTX_SCHED_YIELD), otherwise CUDA will not yield while 
 * waiting for results and actively spin on the processor (::CU_CTX_SCHED_SPIN). 
 * However, on low power devices like Tegra, it always defaults to 
 * ::CU_CTX_SCHED_BLOCKING_SYNC.
 *
 * - ::CU_CTX_MAP_HOST: Instruct CUDA to support mapped pinned allocations.
 * This flag must be set in order to allocate pinned host memory that is
 * accessible to the GPU.
 *
 * - ::CU_CTX_LMEM_RESIZE_TO_MAX: Instruct CUDA to not reduce local memory
 * after resizing local memory for a kernel. This can prevent thrashing by
 * local memory allocations when launching many kernels with high local
 * memory usage at the cost of potentially increased memory usage.
 *
 * Context creation will fail with ::CUDA_ERROR_UNKNOWN if the compute mode of
 * the device is ::CU_COMPUTEMODE_PROHIBITED. Similarly, context creation will
 * also fail with ::CUDA_ERROR_UNKNOWN if the compute mode for the device is
 * set to ::CU_COMPUTEMODE_EXCLUSIVE and there is already an active context on
 * the device. The function ::cuDeviceGetAttribute() can be used with
 * ::CU_DEVICE_ATTRIBUTE_COMPUTE_MODE to determine the compute mode of the
 * device. The <i>nvidia-smi</i> tool can be used to set the compute mode for
 * devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a
 * -h option to it.
 *
 * @param pctx  - Returned context handle of the new context
 * @param flags - Context creation flags
 * @param dev   - Device to create context on
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_DEVICE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 * \sa ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxCreate(@ByPtrPtr CUctx_st pctx, @Cast("unsigned int") int flags, @Cast("CUdevice") int dev);
// #endif /* __CUDA_API_VERSION >= 3020 */

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Destroy a CUDA context
 *
 * Destroys the CUDA context specified by \p ctx.  The context \p ctx will be
 * destroyed regardless of how many threads it is current to.
 * It is the responsibility of the calling function to ensure that no API
 * call issues using \p ctx while ::cuCtxDestroy() is executing.
 *
 * If \p ctx is current to the calling thread then \p ctx will also be 
 * popped from the current thread's context stack (as though ::cuCtxPopCurrent()
 * were called).  If \p ctx is current to other threads, then \p ctx will
 * remain current to those threads, and attempting to access \p ctx from
 * those threads will result in the error ::CUDA_ERROR_CONTEXT_IS_DESTROYED.
 *
 * @param ctx - Context to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxDestroy(CUctx_st ctx);
// #endif /* __CUDA_API_VERSION >= 4000 */

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Pushes a context on the current CPU thread
 *
 * Pushes the given context \p ctx onto the CPU thread's stack of current
 * contexts. The specified context becomes the CPU thread's current context, so
 * all CUDA functions that operate on the current context are affected.
 *
 * The previous current context may be made current again by calling
 * ::cuCtxDestroy() or ::cuCtxPopCurrent().
 *
 * @param ctx - Context to push
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxPushCurrent(CUctx_st ctx);

/**
 * \brief Pops the current CUDA context from the current CPU thread.
 *
 * Pops the current CUDA context from the CPU thread and passes back the 
 * old context handle in \p *pctx. That context may then be made current 
 * to a different CPU thread by calling ::cuCtxPushCurrent().
 *
 * If a context was current to the CPU thread before ::cuCtxCreate() or
 * ::cuCtxPushCurrent() was called, this function makes that context current to
 * the CPU thread again.
 *
 * @param pctx - Returned new context handle
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxPopCurrent(@ByPtrPtr CUctx_st pctx);

/**
 * \brief Binds the specified CUDA context to the calling CPU thread
 *
 * Binds the specified CUDA context to the calling CPU thread.
 * If \p ctx is NULL then the CUDA context previously bound to the
 * calling CPU thread is unbound and ::CUDA_SUCCESS is returned.
 *
 * If there exists a CUDA context stack on the calling CPU thread, this
 * will replace the top of that stack with \p ctx.  
 * If \p ctx is NULL then this will be equivalent to popping the top
 * of the calling CPU thread's CUDA context stack (or a no-op if the
 * calling CPU thread's CUDA context stack is empty).
 *
 * @param ctx - Context to bind to the calling CPU thread
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT
 * \notefnerr
 *
 * \sa ::cuCtxGetCurrent, ::cuCtxCreate, ::cuCtxDestroy
 */
public static native @Cast("CUresult") int cuCtxSetCurrent(CUctx_st ctx);

/**
 * \brief Returns the CUDA context bound to the calling CPU thread.
 *
 * Returns in \p *pctx the CUDA context bound to the calling CPU thread.
 * If no context is bound to the calling CPU thread then \p *pctx is
 * set to NULL and ::CUDA_SUCCESS is returned.
 *
 * @param pctx - Returned context handle
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * \notefnerr
 *
 * \sa ::cuCtxSetCurrent, ::cuCtxCreate, ::cuCtxDestroy
 */
public static native @Cast("CUresult") int cuCtxGetCurrent(@ByPtrPtr CUctx_st pctx);
// #endif /* __CUDA_API_VERSION >= 4000 */

/**
 * \brief Returns the device ID for the current context
 *
 * Returns in \p *device the ordinal of the current context's device.
 *
 * @param device - Returned device ID for the current context
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxGetDevice(@Cast("CUdevice*") IntPointer device);
public static native @Cast("CUresult") int cuCtxGetDevice(@Cast("CUdevice*") IntBuffer device);
public static native @Cast("CUresult") int cuCtxGetDevice(@Cast("CUdevice*") int[] device);

// #if __CUDA_API_VERSION >= 7000
/**
 * \brief Returns the flags for the current context
 *
 * Returns in \p *flags the flags of the current context. See ::cuCtxCreate
 * for flag values.
 *
 * @param flags - Pointer to store flags of current context
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetCurrent,
 * ::cuCtxGetDevice
 * ::cuCtxGetLimit,
 * ::cuCtxGetSharedMemConfig,
 * ::cuCtxGetStreamPriorityRange
 */
public static native @Cast("CUresult") int cuCtxGetFlags(@Cast("unsigned int*") IntPointer flags);
public static native @Cast("CUresult") int cuCtxGetFlags(@Cast("unsigned int*") IntBuffer flags);
public static native @Cast("CUresult") int cuCtxGetFlags(@Cast("unsigned int*") int[] flags);
// #endif /* __CUDA_API_VERSION >= 7000 */

/**
 * \brief Block for a context's tasks to complete
 *
 * Blocks until the device has completed all preceding requested tasks.
 * ::cuCtxSynchronize() returns an error if one of the preceding tasks failed.
 * If the context was created with the ::CU_CTX_SCHED_BLOCKING_SYNC flag, the 
 * CPU thread will block until the GPU context has finished its work.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit
 */
public static native @Cast("CUresult") int cuCtxSynchronize();

/**
 * \brief Set resource limits
 *
 * Setting \p limit to \p value is a request by the application to update
 * the current limit maintained by the context. The driver is free to
 * modify the requested value to meet h/w requirements (this could be
 * clamping to minimum or maximum values, rounding up to nearest element
 * size, etc). The application can use ::cuCtxGetLimit() to find out exactly
 * what the limit has been set to.
 *
 * Setting each ::CUlimit has its own specific restrictions, so each is
 * discussed here.
 *
 * - ::CU_LIMIT_STACK_SIZE controls the stack size in bytes of each GPU thread.
 *   This limit is only applicable to devices of compute capability 2.0 and
 *   higher. Attempting to set this limit on devices of compute capability
 *   less than 2.0 will result in the error ::CUDA_ERROR_UNSUPPORTED_LIMIT
 *   being returned.
 *
 * - ::CU_LIMIT_PRINTF_FIFO_SIZE controls the size in bytes of the FIFO used
 *   by the ::printf() device system call. Setting ::CU_LIMIT_PRINTF_FIFO_SIZE
 *   must be performed before launching any kernel that uses the ::printf()
 *   device system call, otherwise ::CUDA_ERROR_INVALID_VALUE will be returned.
 *   This limit is only applicable to devices of compute capability 2.0 and
 *   higher. Attempting to set this limit on devices of compute capability
 *   less than 2.0 will result in the error ::CUDA_ERROR_UNSUPPORTED_LIMIT
 *   being returned.
 *
 * - ::CU_LIMIT_MALLOC_HEAP_SIZE controls the size in bytes of the heap used
 *   by the ::malloc() and ::free() device system calls. Setting
 *   ::CU_LIMIT_MALLOC_HEAP_SIZE must be performed before launching any kernel
 *   that uses the ::malloc() or ::free() device system calls, otherwise
 *   ::CUDA_ERROR_INVALID_VALUE will be returned. This limit is only applicable
 *   to devices of compute capability 2.0 and higher. Attempting to set this
 *   limit on devices of compute capability less than 2.0 will result in the
 *   error ::CUDA_ERROR_UNSUPPORTED_LIMIT being returned.
 *
 * - ::CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH controls the maximum nesting depth of
 *   a grid at which a thread can safely call ::cudaDeviceSynchronize(). Setting
 *   this limit must be performed before any launch of a kernel that uses the 
 *   device runtime and calls ::cudaDeviceSynchronize() above the default sync
 *   depth, two levels of grids. Calls to ::cudaDeviceSynchronize() will fail 
 *   with error code ::cudaErrorSyncDepthExceeded if the limitation is 
 *   violated. This limit can be set smaller than the default or up the maximum
 *   launch depth of 24. When setting this limit, keep in mind that additional
 *   levels of sync depth require the driver to reserve large amounts of device
 *   memory which can no longer be used for user allocations. If these 
 *   reservations of device memory fail, ::cuCtxSetLimit will return 
 *   ::CUDA_ERROR_OUT_OF_MEMORY, and the limit can be reset to a lower value.
 *   This limit is only applicable to devices of compute capability 3.5 and
 *   higher. Attempting to set this limit on devices of compute capability less
 *   than 3.5 will result in the error ::CUDA_ERROR_UNSUPPORTED_LIMIT being 
 *   returned.
 *
 * - ::CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT controls the maximum number of
 *   outstanding device runtime launches that can be made from the current
 *   context. A grid is outstanding from the point of launch up until the grid
 *   is known to have been completed. Device runtime launches which violate 
 *   this limitation fail and return ::cudaErrorLaunchPendingCountExceeded when
 *   ::cudaGetLastError() is called after launch. If more pending launches than
 *   the default (2048 launches) are needed for a module using the device
 *   runtime, this limit can be increased. Keep in mind that being able to
 *   sustain additional pending launches will require the driver to reserve
 *   larger amounts of device memory upfront which can no longer be used for
 *   allocations. If these reservations fail, ::cuCtxSetLimit will return
 *   ::CUDA_ERROR_OUT_OF_MEMORY, and the limit can be reset to a lower value.
 *   This limit is only applicable to devices of compute capability 3.5 and
 *   higher. Attempting to set this limit on devices of compute capability less
 *   than 3.5 will result in the error ::CUDA_ERROR_UNSUPPORTED_LIMIT being
 *   returned.
 *
 * @param limit - Limit to set
 * @param value - Size of limit
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_UNSUPPORTED_LIMIT,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxSetLimit(@Cast("CUlimit") int limit, @Cast("size_t") long value);

/**
 * \brief Returns resource limits
 *
 * Returns in \p *pvalue the current size of \p limit.  The supported
 * ::CUlimit values are:
 * - ::CU_LIMIT_STACK_SIZE: stack size in bytes of each GPU thread.
 * - ::CU_LIMIT_PRINTF_FIFO_SIZE: size in bytes of the FIFO used by the
 *   ::printf() device system call.
 * - ::CU_LIMIT_MALLOC_HEAP_SIZE: size in bytes of the heap used by the
 *   ::malloc() and ::free() device system calls.
 * - ::CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH: maximum grid depth at which a thread
 *   can issue the device runtime call ::cudaDeviceSynchronize() to wait on
 *   child grid launches to complete.
 * - ::CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT: maximum number of outstanding
 *   device runtime launches that can be made from this context.
 *
 * @param limit  - Limit to query
 * @param pvalue - Returned size of limit
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_UNSUPPORTED_LIMIT
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxGetLimit(@Cast("size_t*") SizeTPointer pvalue, @Cast("CUlimit") int limit);

/**
 * \brief Returns the preferred cache configuration for the current context.
 *
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this function returns through \p pconfig the preferred cache configuration
 * for the current context. This is only a preference. The driver will use
 * the requested configuration if possible, but it is free to choose a different
 * configuration if required to execute functions.
 *
 * This will return a \p pconfig of ::CU_FUNC_CACHE_PREFER_NONE on devices
 * where the size of the L1 cache and shared memory are fixed.
 *
 * The supported cache configurations are:
 * - ::CU_FUNC_CACHE_PREFER_NONE: no preference for shared memory or L1 (default)
 * - ::CU_FUNC_CACHE_PREFER_SHARED: prefer larger shared memory and smaller L1 cache
 * - ::CU_FUNC_CACHE_PREFER_L1: prefer larger L1 cache and smaller shared memory
 * - ::CU_FUNC_CACHE_PREFER_EQUAL: prefer equal sized L1 cache and shared memory
 *
 * @param pconfig - Returned cache configuration
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize,
 * ::cuFuncSetCacheConfig
 */
public static native @Cast("CUresult") int cuCtxGetCacheConfig(@Cast("CUfunc_cache*") IntPointer pconfig);
public static native @Cast("CUresult") int cuCtxGetCacheConfig(@Cast("CUfunc_cache*") IntBuffer pconfig);
public static native @Cast("CUresult") int cuCtxGetCacheConfig(@Cast("CUfunc_cache*") int[] pconfig);

/**
 * \brief Sets the preferred cache configuration for the current context.
 *
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this sets through \p config the preferred cache configuration for
 * the current context. This is only a preference. The driver will use
 * the requested configuration if possible, but it is free to choose a different
 * configuration if required to execute the function. Any function preference
 * set via ::cuFuncSetCacheConfig() will be preferred over this context-wide
 * setting. Setting the context-wide cache configuration to
 * ::CU_FUNC_CACHE_PREFER_NONE will cause subsequent kernel launches to prefer
 * to not change the cache configuration unless required to launch the kernel.
 *
 * This setting does nothing on devices where the size of the L1 cache and
 * shared memory are fixed.
 *
 * Launching a kernel with a different preference than the most recent
 * preference setting may insert a device-side synchronization point.
 *
 * The supported cache configurations are:
 * - ::CU_FUNC_CACHE_PREFER_NONE: no preference for shared memory or L1 (default)
 * - ::CU_FUNC_CACHE_PREFER_SHARED: prefer larger shared memory and smaller L1 cache
 * - ::CU_FUNC_CACHE_PREFER_L1: prefer larger L1 cache and smaller shared memory
 * - ::CU_FUNC_CACHE_PREFER_EQUAL: prefer equal sized L1 cache and shared memory
 *
 * @param config - Requested cache configuration
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize,
 * ::cuFuncSetCacheConfig
 */
public static native @Cast("CUresult") int cuCtxSetCacheConfig(@Cast("CUfunc_cache") int config);

// #if __CUDA_API_VERSION >= 4020
/**
 * \brief Returns the current shared memory configuration for the current context.
 *
 * This function will return in \p pConfig the current size of shared memory banks
 * in the current context. On devices with configurable shared memory banks, 
 * ::cuCtxSetSharedMemConfig can be used to change this setting, so that all 
 * subsequent kernel launches will by default use the new bank size. When 
 * ::cuCtxGetSharedMemConfig is called on devices without configurable shared 
 * memory, it will return the fixed bank size of the hardware.
 *
 * The returned bank configurations can be either:
 * - ::CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE:  shared memory bank width is 
 *   four bytes.
 * - ::CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE: shared memory bank width will
 *   eight bytes.
 *
 * @param pConfig - returned shared memory configuration
 * @return 
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize,
 * ::cuCtxGetSharedMemConfig,
 * ::cuFuncSetCacheConfig,
 */
public static native @Cast("CUresult") int cuCtxGetSharedMemConfig(@Cast("CUsharedconfig*") IntPointer pConfig);
public static native @Cast("CUresult") int cuCtxGetSharedMemConfig(@Cast("CUsharedconfig*") IntBuffer pConfig);
public static native @Cast("CUresult") int cuCtxGetSharedMemConfig(@Cast("CUsharedconfig*") int[] pConfig);

/**
 * \brief Sets the shared memory configuration for the current context.
 *
 * On devices with configurable shared memory banks, this function will set
 * the context's shared memory bank size which is used for subsequent kernel 
 * launches. 
 *
 * Changed the shared memory configuration between launches may insert a device
 * side synchronization point between those launches.
 *
 * Changing the shared memory bank size will not increase shared memory usage
 * or affect occupancy of kernels, but may have major effects on performance. 
 * Larger bank sizes will allow for greater potential bandwidth to shared memory,
 * but will change what kinds of accesses to shared memory will result in bank 
 * conflicts.
 *
 * This function will do nothing on devices with fixed shared memory bank size.
 *
 * The supported bank configurations are:
 * - ::CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE: set bank width to the default initial
 *   setting (currently, four bytes).
 * - ::CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE: set shared memory bank width to
 *   be natively four bytes.
 * - ::CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE: set shared memory bank width to
 *   be natively eight bytes.
 *
 * @param config - requested shared memory configuration
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize,
 * ::cuCtxGetSharedMemConfig,
 * ::cuFuncSetCacheConfig,
 */
public static native @Cast("CUresult") int cuCtxSetSharedMemConfig(@Cast("CUsharedconfig") int config);
// #endif

/**
 * \brief Gets the context's API version.
 *
 * Returns a version number in \p version corresponding to the capabilities of
 * the context (e.g. 3010 or 3020), which library developers can use to direct
 * callers to a specific API version. If \p ctx is NULL, returns the API version
 * used to create the currently bound context.
 *
 * Note that new API versions are only introduced when context capabilities are
 * changed that break binary compatibility, so the API version and driver version
 * may be different. For example, it is valid for the API version to be 3020 while
 * the driver version is 4020.
 *
 * @param ctx     - Context to check
 * @param version - Pointer to version
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxGetApiVersion(CUctx_st ctx, @Cast("unsigned int*") IntPointer version);
public static native @Cast("CUresult") int cuCtxGetApiVersion(CUctx_st ctx, @Cast("unsigned int*") IntBuffer version);
public static native @Cast("CUresult") int cuCtxGetApiVersion(CUctx_st ctx, @Cast("unsigned int*") int[] version);

/**
 * \brief Returns numerical values that correspond to the least and
 * greatest stream priorities.
 *
 * Returns in \p *leastPriority and \p *greatestPriority the numerical values that correspond
 * to the least and greatest stream priorities respectively. Stream priorities
 * follow a convention where lower numbers imply greater priorities. The range of
 * meaningful stream priorities is given by [\p *greatestPriority, \p *leastPriority].
 * If the user attempts to create a stream with a priority value that is
 * outside the meaningful range as specified by this API, the priority is
 * automatically clamped down or up to either \p *leastPriority or \p *greatestPriority
 * respectively. See ::cuStreamCreateWithPriority for details on creating a
 * priority stream.
 * A NULL may be passed in for \p *leastPriority or \p *greatestPriority if the value
 * is not desired.
 *
 * This function will return '0' in both \p *leastPriority and \p *greatestPriority if
 * the current context's device does not support stream priorities
 * (see ::cuDeviceGetAttribute).
 *
 * @param leastPriority    - Pointer to an int in which the numerical value for least
 *                           stream priority is returned
 * @param greatestPriority - Pointer to an int in which the numerical value for greatest
 *                           stream priority is returned
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE,
 * \notefnerr
 *
 * \sa ::cuStreamCreateWithPriority,
 * ::cuStreamGetPriority,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxGetStreamPriorityRange(IntPointer leastPriority, IntPointer greatestPriority);
public static native @Cast("CUresult") int cuCtxGetStreamPriorityRange(IntBuffer leastPriority, IntBuffer greatestPriority);
public static native @Cast("CUresult") int cuCtxGetStreamPriorityRange(int[] leastPriority, int[] greatestPriority);

/** \} */ /* END CUDA_CTX */

/**
 * \defgroup CUDA_CTX_DEPRECATED Context Management [DEPRECATED]
 *
 * ___MANBRIEF___ deprecated context management functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the deprecated context management functions of the low-level
 * CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Increment a context's usage-count
 *
 * @deprecated
 *
 * Note that this function is deprecated and should not be used.
 *
 * Increments the usage count of the context and passes back a context handle
 * in \p *pctx that must be passed to ::cuCtxDetach() when the application is
 * done with the context. ::cuCtxAttach() fails if there is no context current
 * to the thread.
 *
 * Currently, the \p flags parameter must be 0.
 *
 * @param pctx  - Returned context handle of the current context
 * @param flags - Context attach flags (must be 0)
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxDetach,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxAttach(@ByPtrPtr CUctx_st pctx, @Cast("unsigned int") int flags);

/**
 * \brief Decrement a context's usage-count
 *
 * @deprecated
 *
 * Note that this function is deprecated and should not be used.
 *
 * Decrements the usage count of the context \p ctx, and destroys the context
 * if the usage count goes to 0. The context must be a handle that was passed
 * back by ::cuCtxCreate() or ::cuCtxAttach(), and must be current to the
 * calling thread.
 *
 * @param ctx - Context to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT
 * \notefnerr
 *
 * \sa ::cuCtxCreate,
 * ::cuCtxDestroy,
 * ::cuCtxGetApiVersion,
 * ::cuCtxGetCacheConfig,
 * ::cuCtxGetDevice,
 * ::cuCtxGetFlags,
 * ::cuCtxGetLimit,
 * ::cuCtxPopCurrent,
 * ::cuCtxPushCurrent,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxSetLimit,
 * ::cuCtxSynchronize
 */
public static native @Cast("CUresult") int cuCtxDetach(CUctx_st ctx);

/** \} */ /* END CUDA_CTX_DEPRECATED */


/**
 * \defgroup CUDA_MODULE Module Management
 *
 * ___MANBRIEF___ module management functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the module management functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

/**
 * \brief Loads a compute module
 *
 * Takes a filename \p fname and loads the corresponding module \p module into
 * the current context. The CUDA driver API does not attempt to lazily
 * allocate the resources needed by a module; if the memory for functions and
 * data (constant and global) needed by the module cannot be allocated,
 * ::cuModuleLoad() fails. The file should be a \e cubin file as output by
 * \b nvcc, or a \e PTX file either as output by \b nvcc or handwritten, or
 * a \e fatbin file as output by \b nvcc from toolchain 4.0 or later.
 *
 * @param module - Returned module
 * @param fname  - Filename of module to load
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_PTX,
 * ::CUDA_ERROR_NOT_FOUND,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_FILE_NOT_FOUND,
 * ::CUDA_ERROR_NO_BINARY_FOR_GPU,
 * ::CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetGlobal,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoadData,
 * ::cuModuleLoadDataEx,
 * ::cuModuleLoadFatBinary,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleLoad(@ByPtrPtr CUmod_st module, @Cast("const char*") BytePointer fname);
public static native @Cast("CUresult") int cuModuleLoad(@ByPtrPtr CUmod_st module, String fname);

/**
 * \brief Load a module's data
 *
 * Takes a pointer \p image and loads the corresponding module \p module into
 * the current context. The pointer may be obtained by mapping a \e cubin or
 * \e PTX or \e fatbin file, passing a \e cubin or \e PTX or \e fatbin file
 * as a NULL-terminated text string, or incorporating a \e cubin or \e fatbin
 * object into the executable resources and using operating system calls such
 * as Windows \c FindResource() to obtain the pointer.
 *
 * @param module - Returned module
 * @param image  - Module data to load
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_PTX,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_NO_BINARY_FOR_GPU,
 * ::CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetGlobal,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadDataEx,
 * ::cuModuleLoadFatBinary,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleLoadData(@ByPtrPtr CUmod_st module, @Const Pointer image);

/**
 * \brief Load a module's data with options
 *
 * Takes a pointer \p image and loads the corresponding module \p module into
 * the current context. The pointer may be obtained by mapping a \e cubin or
 * \e PTX or \e fatbin file, passing a \e cubin or \e PTX or \e fatbin file
 * as a NULL-terminated text string, or incorporating a \e cubin or \e fatbin
 * object into the executable resources and using operating system calls such
 * as Windows \c FindResource() to obtain the pointer. Options are passed as
 * an array via \p options and any corresponding parameters are passed in
 * \p optionValues. The number of total options is supplied via \p numOptions.
 * Any outputs will be returned via \p optionValues. 
 *
 * @param module       - Returned module
 * @param image        - Module data to load
 * @param numOptions   - Number of options
 * @param options      - Options for JIT
 * @param optionValues - Option values for JIT
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_PTX,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_NO_BINARY_FOR_GPU,
 * ::CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetGlobal,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadData,
 * ::cuModuleLoadFatBinary,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleLoadDataEx(@ByPtrPtr CUmod_st module, @Const Pointer image, @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") PointerPointer optionValues);
public static native @Cast("CUresult") int cuModuleLoadDataEx(@ByPtrPtr CUmod_st module, @Const Pointer image, @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuModuleLoadDataEx(@ByPtrPtr CUmod_st module, @Const Pointer image, @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntBuffer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuModuleLoadDataEx(@ByPtrPtr CUmod_st module, @Const Pointer image, @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") int[] options, @Cast("void**") @ByPtrPtr Pointer optionValues);

/**
 * \brief Load a module's data
 *
 * Takes a pointer \p fatCubin and loads the corresponding module \p module
 * into the current context. The pointer represents a <i>fat binary</i> object,
 * which is a collection of different \e cubin and/or \e PTX files, all
 * representing the same device code, but compiled and optimized for different
 * architectures.
 *
 * Prior to CUDA 4.0, there was no documented API for constructing and using
 * fat binary objects by programmers.  Starting with CUDA 4.0, fat binary
 * objects can be constructed by providing the <i>-fatbin option</i> to \b nvcc.
 * More information can be found in the \b nvcc document.
 *
 * @param module   - Returned module
 * @param fatCubin - Fat binary to load
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_PTX,
 * ::CUDA_ERROR_NOT_FOUND,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_NO_BINARY_FOR_GPU,
 * ::CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetGlobal,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadData,
 * ::cuModuleLoadDataEx,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleLoadFatBinary(@ByPtrPtr CUmod_st module, @Const Pointer fatCubin);

/**
 * \brief Unloads a module
 *
 * Unloads a module \p hmod from the current context.
 *
 * @param hmod - Module to unload
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetGlobal,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadData,
 * ::cuModuleLoadDataEx,
 * ::cuModuleLoadFatBinary
 */
public static native @Cast("CUresult") int cuModuleUnload(CUmod_st hmod);

/**
 * \brief Returns a function handle
 *
 * Returns in \p *hfunc the handle of the function of name \p name located in
 * module \p hmod. If no function of that name exists, ::cuModuleGetFunction()
 * returns ::CUDA_ERROR_NOT_FOUND.
 *
 * @param hfunc - Returned function handle
 * @param hmod  - Module to retrieve function from
 * @param name  - Name of function to retrieve
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_NOT_FOUND
 * \notefnerr
 *
 * \sa ::cuModuleGetGlobal,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadData,
 * ::cuModuleLoadDataEx,
 * ::cuModuleLoadFatBinary,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleGetFunction(@ByPtrPtr CUfunc_st hfunc, CUmod_st hmod, @Cast("const char*") BytePointer name);
public static native @Cast("CUresult") int cuModuleGetFunction(@ByPtrPtr CUfunc_st hfunc, CUmod_st hmod, String name);

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Returns a global pointer from a module
 *
 * Returns in \p *dptr and \p *bytes the base pointer and size of the
 * global of name \p name located in module \p hmod. If no variable of that name
 * exists, ::cuModuleGetGlobal() returns ::CUDA_ERROR_NOT_FOUND. Both
 * parameters \p dptr and \p bytes are optional. If one of them is
 * NULL, it is ignored.
 *
 * @param dptr  - Returned global device pointer
 * @param bytes - Returned global size in bytes
 * @param hmod  - Module to retrieve global from
 * @param name  - Name of global to retrieve
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_NOT_FOUND
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadData,
 * ::cuModuleLoadDataEx,
 * ::cuModuleLoadFatBinary,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleGetGlobal(@Cast("CUdeviceptr*") LongPointer dptr, @Cast("size_t*") SizeTPointer bytes, CUmod_st hmod, @Cast("const char*") BytePointer name);
public static native @Cast("CUresult") int cuModuleGetGlobal(@Cast("CUdeviceptr*") LongBuffer dptr, @Cast("size_t*") SizeTPointer bytes, CUmod_st hmod, String name);
public static native @Cast("CUresult") int cuModuleGetGlobal(@Cast("CUdeviceptr*") long[] dptr, @Cast("size_t*") SizeTPointer bytes, CUmod_st hmod, @Cast("const char*") BytePointer name);
public static native @Cast("CUresult") int cuModuleGetGlobal(@Cast("CUdeviceptr*") LongPointer dptr, @Cast("size_t*") SizeTPointer bytes, CUmod_st hmod, String name);
public static native @Cast("CUresult") int cuModuleGetGlobal(@Cast("CUdeviceptr*") LongBuffer dptr, @Cast("size_t*") SizeTPointer bytes, CUmod_st hmod, @Cast("const char*") BytePointer name);
public static native @Cast("CUresult") int cuModuleGetGlobal(@Cast("CUdeviceptr*") long[] dptr, @Cast("size_t*") SizeTPointer bytes, CUmod_st hmod, String name);
// #endif /* __CUDA_API_VERSION >= 3020 */

/**
 * \brief Returns a handle to a texture reference
 *
 * Returns in \p *pTexRef the handle of the texture reference of name \p name
 * in the module \p hmod. If no texture reference of that name exists,
 * ::cuModuleGetTexRef() returns ::CUDA_ERROR_NOT_FOUND. This texture reference
 * handle should not be destroyed, since it will be destroyed when the module
 * is unloaded.
 *
 * @param pTexRef  - Returned texture reference
 * @param hmod     - Module to retrieve texture reference from
 * @param name     - Name of texture reference to retrieve
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_NOT_FOUND
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetGlobal,
 * ::cuModuleGetSurfRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadData,
 * ::cuModuleLoadDataEx,
 * ::cuModuleLoadFatBinary,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleGetTexRef(@ByPtrPtr CUtexref_st pTexRef, CUmod_st hmod, @Cast("const char*") BytePointer name);
public static native @Cast("CUresult") int cuModuleGetTexRef(@ByPtrPtr CUtexref_st pTexRef, CUmod_st hmod, String name);

/**
 * \brief Returns a handle to a surface reference
 *
 * Returns in \p *pSurfRef the handle of the surface reference of name \p name
 * in the module \p hmod. If no surface reference of that name exists,
 * ::cuModuleGetSurfRef() returns ::CUDA_ERROR_NOT_FOUND.
 *
 * @param pSurfRef  - Returned surface reference
 * @param hmod     - Module to retrieve surface reference from
 * @param name     - Name of surface reference to retrieve
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_NOT_FOUND
 * \notefnerr
 *
 * \sa ::cuModuleGetFunction,
 * ::cuModuleGetGlobal,
 * ::cuModuleGetTexRef,
 * ::cuModuleLoad,
 * ::cuModuleLoadData,
 * ::cuModuleLoadDataEx,
 * ::cuModuleLoadFatBinary,
 * ::cuModuleUnload
 */
public static native @Cast("CUresult") int cuModuleGetSurfRef(@ByPtrPtr CUsurfref_st pSurfRef, CUmod_st hmod, @Cast("const char*") BytePointer name);
public static native @Cast("CUresult") int cuModuleGetSurfRef(@ByPtrPtr CUsurfref_st pSurfRef, CUmod_st hmod, String name);

// #if __CUDA_API_VERSION >= 5050

/**
 * \brief Creates a pending JIT linker invocation.
 *
 * If the call is successful, the caller owns the returned CUlinkState, which
 * should eventually be destroyed with ::cuLinkDestroy.  The
 * device code machine size (32 or 64 bit) will match the calling application.
 *
 * Both linker and compiler options may be specified.  Compiler options will
 * be applied to inputs to this linker action which must be compiled from PTX.
 * The options ::CU_JIT_WALL_TIME,
 * ::CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES, and ::CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES
 * will accumulate data until the CUlinkState is destroyed.
 *
 * \p optionValues must remain valid for the life of the CUlinkState if output
 * options are used.  No other references to inputs are maintained after this
 * call returns.
 *
 * @param numOptions   Size of options arrays
 * @param options      Array of linker and compiler options
 * @param optionValues Array of option values, each cast to void *
 * @param stateOut     On success, this will contain a CUlinkState to specify
 *                     and complete this action
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuLinkAddData,
 * ::cuLinkAddFile,
 * ::cuLinkComplete,
 * ::cuLinkDestroy
 */
public static native @Cast("CUresult") int cuLinkCreate(@Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") PointerPointer optionValues, @ByPtrPtr CUlinkState_st stateOut);
public static native @Cast("CUresult") int cuLinkCreate(@Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") @ByPtrPtr Pointer optionValues, @ByPtrPtr CUlinkState_st stateOut);
public static native @Cast("CUresult") int cuLinkCreate(@Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntBuffer options, @Cast("void**") @ByPtrPtr Pointer optionValues, @ByPtrPtr CUlinkState_st stateOut);
public static native @Cast("CUresult") int cuLinkCreate(@Cast("unsigned int") int numOptions, @Cast("CUjit_option*") int[] options, @Cast("void**") @ByPtrPtr Pointer optionValues, @ByPtrPtr CUlinkState_st stateOut);

/**
 * \brief Add an input to a pending linker invocation
 *
 * Ownership of \p data is retained by the caller.  No reference is retained to any
 * inputs after this call returns.
 *
 * This method accepts only compiler options, which are used if the data must
 * be compiled from PTX, and does not accept any of
 * ::CU_JIT_WALL_TIME, ::CU_JIT_INFO_LOG_BUFFER, ::CU_JIT_ERROR_LOG_BUFFER,
 * ::CU_JIT_TARGET_FROM_CUCONTEXT, or ::CU_JIT_TARGET.
 *
 * @param state        A pending linker action.
 * @param type         The type of the input data.
 * @param data         The input data.  PTX must be NULL-terminated.
 * @param size         The length of the input data.
 * @param name         An optional name for this input in log messages.
 * @param numOptions   Size of options.
 * @param options      Options to be applied only for this input (overrides options from ::cuLinkCreate).
 * @param optionValues Array of option values, each cast to void *.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_IMAGE,
 * ::CUDA_ERROR_INVALID_PTX,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_NO_BINARY_FOR_GPU
 *
 * \sa ::cuLinkCreate,
 * ::cuLinkAddFile,
 * ::cuLinkComplete,
 * ::cuLinkDestroy
 */
public static native @Cast("CUresult") int cuLinkAddData(CUlinkState_st state, @Cast("CUjitInputType") int type, Pointer data, @Cast("size_t") long size, @Cast("const char*") BytePointer name,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") PointerPointer optionValues);
public static native @Cast("CUresult") int cuLinkAddData(CUlinkState_st state, @Cast("CUjitInputType") int type, Pointer data, @Cast("size_t") long size, @Cast("const char*") BytePointer name,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddData(CUlinkState_st state, @Cast("CUjitInputType") int type, Pointer data, @Cast("size_t") long size, String name,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntBuffer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddData(CUlinkState_st state, @Cast("CUjitInputType") int type, Pointer data, @Cast("size_t") long size, @Cast("const char*") BytePointer name,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") int[] options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddData(CUlinkState_st state, @Cast("CUjitInputType") int type, Pointer data, @Cast("size_t") long size, String name,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddData(CUlinkState_st state, @Cast("CUjitInputType") int type, Pointer data, @Cast("size_t") long size, @Cast("const char*") BytePointer name,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntBuffer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddData(CUlinkState_st state, @Cast("CUjitInputType") int type, Pointer data, @Cast("size_t") long size, String name,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") int[] options, @Cast("void**") @ByPtrPtr Pointer optionValues);

/**
 * \brief Add a file input to a pending linker invocation
 *
 * No reference is retained to any inputs after this call returns.
 *
 * This method accepts only compiler options, which are used if the input
 * must be compiled from PTX, and does not accept any of
 * ::CU_JIT_WALL_TIME, ::CU_JIT_INFO_LOG_BUFFER, ::CU_JIT_ERROR_LOG_BUFFER,
 * ::CU_JIT_TARGET_FROM_CUCONTEXT, or ::CU_JIT_TARGET.
 *
 * This method is equivalent to invoking ::cuLinkAddData on the contents
 * of the file.
 *
 * @param state        A pending linker action
 * @param type         The type of the input data
 * @param path         Path to the input file
 * @param numOptions   Size of options
 * @param options      Options to be applied only for this input (overrides options from ::cuLinkCreate)
 * @param optionValues Array of option values, each cast to void *
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_FILE_NOT_FOUND
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_IMAGE,
 * ::CUDA_ERROR_INVALID_PTX,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_NO_BINARY_FOR_GPU
 *
 * \sa ::cuLinkCreate,
 * ::cuLinkAddData,
 * ::cuLinkComplete,
 * ::cuLinkDestroy
 */
public static native @Cast("CUresult") int cuLinkAddFile(CUlinkState_st state, @Cast("CUjitInputType") int type, @Cast("const char*") BytePointer path,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") PointerPointer optionValues);
public static native @Cast("CUresult") int cuLinkAddFile(CUlinkState_st state, @Cast("CUjitInputType") int type, @Cast("const char*") BytePointer path,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddFile(CUlinkState_st state, @Cast("CUjitInputType") int type, String path,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntBuffer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddFile(CUlinkState_st state, @Cast("CUjitInputType") int type, @Cast("const char*") BytePointer path,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") int[] options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddFile(CUlinkState_st state, @Cast("CUjitInputType") int type, String path,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntPointer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddFile(CUlinkState_st state, @Cast("CUjitInputType") int type, @Cast("const char*") BytePointer path,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") IntBuffer options, @Cast("void**") @ByPtrPtr Pointer optionValues);
public static native @Cast("CUresult") int cuLinkAddFile(CUlinkState_st state, @Cast("CUjitInputType") int type, String path,
    @Cast("unsigned int") int numOptions, @Cast("CUjit_option*") int[] options, @Cast("void**") @ByPtrPtr Pointer optionValues);

/**
 * \brief Complete a pending linker invocation
 *
 * Completes the pending linker action and returns the cubin image for the linked
 * device code, which can be used with ::cuModuleLoadData.  The cubin is owned by
 * \p state, so it should be loaded before \p state is destroyed via ::cuLinkDestroy.
 * This call does not destroy \p state.
 *
 * @param state    A pending linker invocation
 * @param cubinOut On success, this will point to the output image
 * @param sizeOut  Optional parameter to receive the size of the generated image
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 *
 * \sa ::cuLinkCreate,
 * ::cuLinkAddData,
 * ::cuLinkAddFile,
 * ::cuLinkDestroy,
 * ::cuModuleLoadData
 */
public static native @Cast("CUresult") int cuLinkComplete(CUlinkState_st state, @Cast("void**") PointerPointer cubinOut, @Cast("size_t*") SizeTPointer sizeOut);
public static native @Cast("CUresult") int cuLinkComplete(CUlinkState_st state, @Cast("void**") @ByPtrPtr Pointer cubinOut, @Cast("size_t*") SizeTPointer sizeOut);

/**
 * \brief Destroys state for a JIT linker invocation.
 *
 * @param state State object for the linker invocation
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_HANDLE
 *
 * \sa ::cuLinkCreate
 */
public static native @Cast("CUresult") int cuLinkDestroy(CUlinkState_st state);

// #endif /* __CUDA_API_VERSION >= 5050 */

/** \} */ /* END CUDA_MODULE */


/**
 * \defgroup CUDA_MEM Memory Management
 *
 * ___MANBRIEF___ memory management functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the memory management functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Gets free and total memory
 *
 * Returns in \p *free and \p *total respectively, the free and total amount of
 * memory available for allocation by the CUDA context, in bytes.
 *
 * @param free  - Returned free memory in bytes
 * @param total - Returned total memory in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemGetInfo(@Cast("size_t*") SizeTPointer free, @Cast("size_t*") SizeTPointer total);

/**
 * \brief Allocates device memory
 *
 * Allocates \p bytesize bytes of linear memory on the device and returns in
 * \p *dptr a pointer to the allocated memory. The allocated memory is suitably
 * aligned for any kind of variable. The memory is not cleared. If \p bytesize
 * is 0, ::cuMemAlloc() returns ::CUDA_ERROR_INVALID_VALUE.
 *
 * @param dptr     - Returned device pointer
 * @param bytesize - Requested allocation size in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemAlloc(@Cast("CUdeviceptr*") LongPointer dptr, @Cast("size_t") long bytesize);
public static native @Cast("CUresult") int cuMemAlloc(@Cast("CUdeviceptr*") LongBuffer dptr, @Cast("size_t") long bytesize);
public static native @Cast("CUresult") int cuMemAlloc(@Cast("CUdeviceptr*") long[] dptr, @Cast("size_t") long bytesize);

/**
 * \brief Allocates pitched device memory
 *
 * Allocates at least \p WidthInBytes * \p Height bytes of linear memory on
 * the device and returns in \p *dptr a pointer to the allocated memory. The
 * function may pad the allocation to ensure that corresponding pointers in
 * any given row will continue to meet the alignment requirements for
 * coalescing as the address is updated from row to row. \p ElementSizeBytes
 * specifies the size of the largest reads and writes that will be performed
 * on the memory range. \p ElementSizeBytes may be 4, 8 or 16 (since coalesced
 * memory transactions are not possible on other data sizes). If
 * \p ElementSizeBytes is smaller than the actual read/write size of a kernel,
 * the kernel will run correctly, but possibly at reduced speed. The pitch
 * returned in \p *pPitch by ::cuMemAllocPitch() is the width in bytes of the
 * allocation. The intended usage of pitch is as a separate parameter of the
 * allocation, used to compute addresses within the 2D array. Given the row
 * and column of an array element of type \b T, the address is computed as:
 * <pre>{@code
   T* pElement = (T*)((char*)BaseAddress + Row * Pitch) + Column;
 * }</pre>
 *
 * The pitch returned by ::cuMemAllocPitch() is guaranteed to work with
 * ::cuMemcpy2D() under all circumstances. For allocations of 2D arrays, it is
 * recommended that programmers consider performing pitch allocations using
 * ::cuMemAllocPitch(). Due to alignment restrictions in the hardware, this is
 * especially true if the application will be performing 2D memory copies
 * between different regions of device memory (whether linear memory or CUDA
 * arrays).
 *
 * The byte alignment of the pitch returned by ::cuMemAllocPitch() is guaranteed
 * to match or exceed the alignment requirement for texture binding with
 * ::cuTexRefSetAddress2D().
 *
 * @param dptr             - Returned device pointer
 * @param pPitch           - Returned pitch of allocation in bytes
 * @param WidthInBytes     - Requested allocation width in bytes
 * @param Height           - Requested allocation height in rows
 * @param ElementSizeBytes - Size of largest reads/writes for range
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemAllocPitch(@Cast("CUdeviceptr*") LongPointer dptr, @Cast("size_t*") SizeTPointer pPitch, @Cast("size_t") long WidthInBytes, @Cast("size_t") long Height, @Cast("unsigned int") int ElementSizeBytes);
public static native @Cast("CUresult") int cuMemAllocPitch(@Cast("CUdeviceptr*") LongBuffer dptr, @Cast("size_t*") SizeTPointer pPitch, @Cast("size_t") long WidthInBytes, @Cast("size_t") long Height, @Cast("unsigned int") int ElementSizeBytes);
public static native @Cast("CUresult") int cuMemAllocPitch(@Cast("CUdeviceptr*") long[] dptr, @Cast("size_t*") SizeTPointer pPitch, @Cast("size_t") long WidthInBytes, @Cast("size_t") long Height, @Cast("unsigned int") int ElementSizeBytes);

/**
 * \brief Frees device memory
 *
 * Frees the memory space pointed to by \p dptr, which must have been returned
 * by a previous call to ::cuMemAlloc() or ::cuMemAllocPitch().
 *
 * @param dptr - Pointer to memory to free
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemFree(@Cast("CUdeviceptr") long dptr);

/**
 * \brief Get information on memory allocations
 *
 * Returns the base address in \p *pbase and size in \p *psize of the
 * allocation by ::cuMemAlloc() or ::cuMemAllocPitch() that contains the input
 * pointer \p dptr. Both parameters \p pbase and \p psize are optional. If one
 * of them is NULL, it is ignored.
 *
 * @param pbase - Returned base address
 * @param psize - Returned size of device memory allocation
 * @param dptr  - Device pointer to query
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemGetAddressRange(@Cast("CUdeviceptr*") LongPointer pbase, @Cast("size_t*") SizeTPointer psize, @Cast("CUdeviceptr") long dptr);
public static native @Cast("CUresult") int cuMemGetAddressRange(@Cast("CUdeviceptr*") LongBuffer pbase, @Cast("size_t*") SizeTPointer psize, @Cast("CUdeviceptr") long dptr);
public static native @Cast("CUresult") int cuMemGetAddressRange(@Cast("CUdeviceptr*") long[] pbase, @Cast("size_t*") SizeTPointer psize, @Cast("CUdeviceptr") long dptr);

/**
 * \brief Allocates page-locked host memory
 *
 * Allocates \p bytesize bytes of host memory that is page-locked and
 * accessible to the device. The driver tracks the virtual memory ranges
 * allocated with this function and automatically accelerates calls to
 * functions such as ::cuMemcpy(). Since the memory can be accessed directly by
 * the device, it can be read or written with much higher bandwidth than
 * pageable memory obtained with functions such as ::malloc(). Allocating
 * excessive amounts of memory with ::cuMemAllocHost() may degrade system
 * performance, since it reduces the amount of memory available to the system
 * for paging. As a result, this function is best used sparingly to allocate
 * staging areas for data exchange between host and device.
 *
 * Note all host memory allocated using ::cuMemHostAlloc() will automatically
 * be immediately accessible to all contexts on all devices which support unified
 * addressing (as may be queried using ::CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING).
 * The device pointer that may be used to access this host memory from those 
 * contexts is always equal to the returned host pointer \p *pp.
 * See \ref CUDA_UNIFIED for additional details.
 *
 * @param pp       - Returned host pointer to page-locked memory
 * @param bytesize - Requested allocation size in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemAllocHost(@Cast("void**") PointerPointer pp, @Cast("size_t") long bytesize);
public static native @Cast("CUresult") int cuMemAllocHost(@Cast("void**") @ByPtrPtr Pointer pp, @Cast("size_t") long bytesize);
// #endif /* __CUDA_API_VERSION >= 3020 */

/**
 * \brief Frees page-locked host memory
 *
 * Frees the memory space pointed to by \p p, which must have been returned by
 * a previous call to ::cuMemAllocHost().
 *
 * @param p - Pointer to memory to free
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemFreeHost(Pointer p);

/**
 * \brief Allocates page-locked host memory
 *
 * Allocates \p bytesize bytes of host memory that is page-locked and accessible
 * to the device. The driver tracks the virtual memory ranges allocated with
 * this function and automatically accelerates calls to functions such as
 * ::cuMemcpyHtoD(). Since the memory can be accessed directly by the device,
 * it can be read or written with much higher bandwidth than pageable memory
 * obtained with functions such as ::malloc(). Allocating excessive amounts of
 * pinned memory may degrade system performance, since it reduces the amount
 * of memory available to the system for paging. As a result, this function is
 * best used sparingly to allocate staging areas for data exchange between
 * host and device.
 *
 * The \p Flags parameter enables different options to be specified that
 * affect the allocation, as follows.
 *
 * - ::CU_MEMHOSTALLOC_PORTABLE: The memory returned by this call will be
 *   considered as pinned memory by all CUDA contexts, not just the one that
 *   performed the allocation.
 *
 * - ::CU_MEMHOSTALLOC_DEVICEMAP: Maps the allocation into the CUDA address
 *   space. The device pointer to the memory may be obtained by calling
 *   ::cuMemHostGetDevicePointer(). This feature is available only on GPUs
 *   with compute capability greater than or equal to 1.1.
 *
 * - ::CU_MEMHOSTALLOC_WRITECOMBINED: Allocates the memory as write-combined
 *   (WC). WC memory can be transferred across the PCI Express bus more
 *   quickly on some system configurations, but cannot be read efficiently by
 *   most CPUs. WC memory is a good option for buffers that will be written by
 *   the CPU and read by the GPU via mapped pinned memory or host->device
 *   transfers.
 *
 * All of these flags are orthogonal to one another: a developer may allocate
 * memory that is portable, mapped and/or write-combined with no restrictions.
 *
 * The CUDA context must have been created with the ::CU_CTX_MAP_HOST flag in
 * order for the ::CU_MEMHOSTALLOC_DEVICEMAP flag to have any effect.
 *
 * The ::CU_MEMHOSTALLOC_DEVICEMAP flag may be specified on CUDA contexts for
 * devices that do not support mapped pinned memory. The failure is deferred
 * to ::cuMemHostGetDevicePointer() because the memory may be mapped into
 * other CUDA contexts via the ::CU_MEMHOSTALLOC_PORTABLE flag.
 *
 * The memory allocated by this function must be freed with ::cuMemFreeHost().
 *
 * Note all host memory allocated using ::cuMemHostAlloc() will automatically
 * be immediately accessible to all contexts on all devices which support unified
 * addressing (as may be queried using ::CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING).
 * Unless the flag ::CU_MEMHOSTALLOC_WRITECOMBINED is specified, the device pointer 
 * that may be used to access this host memory from those contexts is always equal 
 * to the returned host pointer \p *pp.  If the flag ::CU_MEMHOSTALLOC_WRITECOMBINED
 * is specified, then the function ::cuMemHostGetDevicePointer() must be used
 * to query the device pointer, even if the context supports unified addressing.
 * See \ref CUDA_UNIFIED for additional details.
 *
 * @param pp       - Returned host pointer to page-locked memory
 * @param bytesize - Requested allocation size in bytes
 * @param Flags    - Flags for allocation request
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemHostAlloc(@Cast("void**") PointerPointer pp, @Cast("size_t") long bytesize, @Cast("unsigned int") int Flags);
public static native @Cast("CUresult") int cuMemHostAlloc(@Cast("void**") @ByPtrPtr Pointer pp, @Cast("size_t") long bytesize, @Cast("unsigned int") int Flags);

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Passes back device pointer of mapped pinned memory
 *
 * Passes back the device pointer \p pdptr corresponding to the mapped, pinned
 * host buffer \p p allocated by ::cuMemHostAlloc.
 *
 * ::cuMemHostGetDevicePointer() will fail if the ::CU_MEMHOSTALLOC_DEVICEMAP
 * flag was not specified at the time the memory was allocated, or if the
 * function is called on a GPU that does not support mapped pinned memory.
 *
 * \p Flags provides for future releases. For now, it must be set to 0.
 *
 * @param pdptr - Returned device pointer
 * @param p     - Host pointer
 * @param Flags - Options (must be 0)
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemHostGetDevicePointer(@Cast("CUdeviceptr*") LongPointer pdptr, Pointer p, @Cast("unsigned int") int Flags);
public static native @Cast("CUresult") int cuMemHostGetDevicePointer(@Cast("CUdeviceptr*") LongBuffer pdptr, Pointer p, @Cast("unsigned int") int Flags);
public static native @Cast("CUresult") int cuMemHostGetDevicePointer(@Cast("CUdeviceptr*") long[] pdptr, Pointer p, @Cast("unsigned int") int Flags);
// #endif /* __CUDA_API_VERSION >= 3020 */

/**
 * \brief Passes back flags that were used for a pinned allocation
 *
 * Passes back the flags \p pFlags that were specified when allocating
 * the pinned host buffer \p p allocated by ::cuMemHostAlloc.
 *
 * ::cuMemHostGetFlags() will fail if the pointer does not reside in
 * an allocation performed by ::cuMemAllocHost() or ::cuMemHostAlloc().
 *
 * @param pFlags - Returned flags word
 * @param p     - Host pointer
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuMemAllocHost, ::cuMemHostAlloc
 */
public static native @Cast("CUresult") int cuMemHostGetFlags(@Cast("unsigned int*") IntPointer pFlags, Pointer p);
public static native @Cast("CUresult") int cuMemHostGetFlags(@Cast("unsigned int*") IntBuffer pFlags, Pointer p);
public static native @Cast("CUresult") int cuMemHostGetFlags(@Cast("unsigned int*") int[] pFlags, Pointer p);

// #if __CUDA_API_VERSION >= 6000

/**
 * \brief Allocates memory that will be automatically managed by the Unified Memory system
 *
 * Allocates \p bytesize bytes of managed memory on the device and returns in
 * \p *dptr a pointer to the allocated memory. If the device doesn't support
 * allocating managed memory, ::CUDA_ERROR_NOT_SUPPORTED is returned. Support
 * for managed memory can be queried using the device attribute
 * ::CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY. The allocated memory is suitably
 * aligned for any kind of variable. The memory is not cleared. If \p bytesize
 * is 0, ::cuMemAllocManaged returns ::CUDA_ERROR_INVALID_VALUE. The pointer
 * is valid on the CPU and on all GPUs in the system that support managed memory.
 * All accesses to this pointer must obey the Unified Memory programming model.
 *
 * \p flags specifies the default stream association for this allocation.
 * \p flags must be one of ::CU_MEM_ATTACH_GLOBAL or ::CU_MEM_ATTACH_HOST. If
 * ::CU_MEM_ATTACH_GLOBAL is specified, then this memory is accessible from
 * any stream on any device. If ::CU_MEM_ATTACH_HOST is specified, then the
 * allocation is created with initial visibility restricted to host access only;
 * an explicit call to ::cuStreamAttachMemAsync will be required to enable access
 * on the device.
 *
 * If the association is later changed via ::cuStreamAttachMemAsync to
 * a single stream, the default association as specifed during ::cuMemAllocManaged
 * is restored when that stream is destroyed. For __managed__ variables, the
 * default association is always ::CU_MEM_ATTACH_GLOBAL. Note that destroying a
 * stream is an asynchronous operation, and as a result, the change to default
 * association won't happen until all work in the stream has completed.
 *
 * Memory allocated with ::cuMemAllocManaged should be released with ::cuMemFree.
 *
 * On a multi-GPU system with peer-to-peer support, where multiple GPUs support
 * managed memory, the physical storage is created on the GPU which is active
 * at the time ::cuMemAllocManaged is called. All other GPUs will reference the
 * data at reduced bandwidth via peer mappings over the PCIe bus. The Unified
 * Memory management system does not migrate memory between GPUs.
 *
 * On a multi-GPU system where multiple GPUs support managed memory, but not
 * all pairs of such GPUs have peer-to-peer support between them, the physical
 * storage is created in 'zero-copy' or system memory. All GPUs will reference
 * the data at reduced bandwidth over the PCIe bus. In these circumstances,
 * use of the environment variable, CUDA_VISIBLE_DEVICES, is recommended to
 * restrict CUDA to only use those GPUs that have peer-to-peer support.
 * Alternatively, users can also set CUDA_MANAGED_FORCE_DEVICE_ALLOC to a
 * non-zero value to force the driver to always use device memory for physical storage.
 * When this environment variable is set to a non-zero value, all contexts created in
 * that process on devices that support managed memory have to be peer-to-peer compatible
 * with each other. Context creation will fail if a context is created on a device that
 * supports managed memory and is not peer-to-peer compatible with any of the other
 * managed memory supporting devices on which contexts were previously created, even if
 * those contexts have been destroyed. These environment variables are described
 * in the CUDA programming guide under the "CUDA environment variables" section.
 *
 * @param dptr     - Returned device pointer
 * @param bytesize - Requested allocation size in bytes
 * @param flags    - Must be one of ::CU_MEM_ATTACH_GLOBAL or ::CU_MEM_ATTACH_HOST
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_NOT_SUPPORTED,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32,
 * ::cuDeviceGetAttribute, ::cuStreamAttachMemAsync
 */
public static native @Cast("CUresult") int cuMemAllocManaged(@Cast("CUdeviceptr*") LongPointer dptr, @Cast("size_t") long bytesize, @Cast("unsigned int") int flags);
public static native @Cast("CUresult") int cuMemAllocManaged(@Cast("CUdeviceptr*") LongBuffer dptr, @Cast("size_t") long bytesize, @Cast("unsigned int") int flags);
public static native @Cast("CUresult") int cuMemAllocManaged(@Cast("CUdeviceptr*") long[] dptr, @Cast("size_t") long bytesize, @Cast("unsigned int") int flags);

// #endif /* __CUDA_API_VERSION >= 6000 */

// #if __CUDA_API_VERSION >= 4010

/**
 * \brief Returns a handle to a compute device
 *
 * Returns in \p *device a device handle given a PCI bus ID string.
 *
 * @param dev      - Returned device handle
 *
 * @param pciBusId - String in one of the following forms: 
 * [domain]:[bus]:[device].[function]
 * [domain]:[bus]:[device]
 * [bus]:[device].[function]
 * where \p domain, \p bus, \p device, and \p function are all hexadecimal values
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa ::cuDeviceGet, ::cuDeviceGetAttribute, ::cuDeviceGetPCIBusId
 */
public static native @Cast("CUresult") int cuDeviceGetByPCIBusId(@Cast("CUdevice*") IntPointer dev, @Cast("const char*") BytePointer pciBusId);
public static native @Cast("CUresult") int cuDeviceGetByPCIBusId(@Cast("CUdevice*") IntBuffer dev, String pciBusId);
public static native @Cast("CUresult") int cuDeviceGetByPCIBusId(@Cast("CUdevice*") int[] dev, @Cast("const char*") BytePointer pciBusId);
public static native @Cast("CUresult") int cuDeviceGetByPCIBusId(@Cast("CUdevice*") IntPointer dev, String pciBusId);
public static native @Cast("CUresult") int cuDeviceGetByPCIBusId(@Cast("CUdevice*") IntBuffer dev, @Cast("const char*") BytePointer pciBusId);
public static native @Cast("CUresult") int cuDeviceGetByPCIBusId(@Cast("CUdevice*") int[] dev, String pciBusId);

/**
 * \brief Returns a PCI Bus Id string for the device
 *
 * Returns an ASCII string identifying the device \p dev in the NULL-terminated
 * string pointed to by \p pciBusId. \p len specifies the maximum length of the
 * string that may be returned.
 *
 * @param pciBusId - Returned identifier string for the device in the following format
 * [domain]:[bus]:[device].[function]
 * where \p domain, \p bus, \p device, and \p function are all hexadecimal values.
 * pciBusId should be large enough to store 13 characters including the NULL-terminator.
 *
 * @param len      - Maximum length of string to store in \p name
 *
 * @param dev      - Device to get identifier string for
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa ::cuDeviceGet, ::cuDeviceGetAttribute, ::cuDeviceGetByPCIBusId
 */
public static native @Cast("CUresult") int cuDeviceGetPCIBusId(@Cast("char*") BytePointer pciBusId, int len, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceGetPCIBusId(@Cast("char*") ByteBuffer pciBusId, int len, @Cast("CUdevice") int dev);
public static native @Cast("CUresult") int cuDeviceGetPCIBusId(@Cast("char*") byte[] pciBusId, int len, @Cast("CUdevice") int dev);

/**
 * \brief Gets an interprocess handle for a previously allocated event
 *
 * Takes as input a previously allocated event. This event must have been 
 * created with the ::CU_EVENT_INTERPROCESS and ::CU_EVENT_DISABLE_TIMING 
 * flags set. This opaque handle may be copied into other processes and
 * opened with ::cuIpcOpenEventHandle to allow efficient hardware
 * synchronization between GPU work in different processes.
 *
 * After the event has been opened in the importing process, 
 * ::cuEventRecord, ::cuEventSynchronize, ::cuStreamWaitEvent and 
 * ::cuEventQuery may be used in either process. Performing operations 
 * on the imported event after the exported event has been freed 
 * with ::cuEventDestroy will result in undefined behavior.
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param pHandle - Pointer to a user allocated CUipcEventHandle
 *                    in which to return the opaque event handle
 * @param event   - Event allocated with ::CU_EVENT_INTERPROCESS and 
 *                    ::CU_EVENT_DISABLE_TIMING flags.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_MAP_FAILED
 *
 * \sa 
 * ::cuEventCreate, 
 * ::cuEventDestroy, 
 * ::cuEventSynchronize,
 * ::cuEventQuery,
 * ::cuStreamWaitEvent,
 * ::cuIpcOpenEventHandle,
 * ::cuIpcGetMemHandle,
 * ::cuIpcOpenMemHandle,
 * ::cuIpcCloseMemHandle
 */
public static native @Cast("CUresult") int cuIpcGetEventHandle(CUipcEventHandle pHandle, CUevent_st event);

/**
 * \brief Opens an interprocess event handle for use in the current process
 *
 * Opens an interprocess event handle exported from another process with 
 * ::cuIpcGetEventHandle. This function returns a ::CUevent that behaves like 
 * a locally created event with the ::CU_EVENT_DISABLE_TIMING flag specified. 
 * This event must be freed with ::cuEventDestroy.
 *
 * Performing operations on the imported event after the exported event has 
 * been freed with ::cuEventDestroy will result in undefined behavior.
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param phEvent - Returns the imported event
 * @param handle  - Interprocess handle to open
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_MAP_FAILED,
 * ::CUDA_ERROR_PEER_ACCESS_UNSUPPORTED,
 * ::CUDA_ERROR_INVALID_HANDLE
 *
 * \sa
 * ::cuEventCreate, 
 * ::cuEventDestroy, 
 * ::cuEventSynchronize,
 * ::cuEventQuery,
 * ::cuStreamWaitEvent,
 * ::cuIpcGetEventHandle,
 * ::cuIpcGetMemHandle,
 * ::cuIpcOpenMemHandle,
 * ::cuIpcCloseMemHandle
 */
public static native @Cast("CUresult") int cuIpcOpenEventHandle(@ByPtrPtr CUevent_st phEvent, @ByVal CUipcEventHandle handle);

/**
 * \brief Gets an interprocess memory handle for an existing device memory
 * allocation
 *
 * Takes a pointer to the base of an existing device memory allocation created 
 * with ::cuMemAlloc and exports it for use in another process. This is a 
 * lightweight operation and may be called multiple times on an allocation
 * without adverse effects. 
 *
 * If a region of memory is freed with ::cuMemFree and a subsequent call
 * to ::cuMemAlloc returns memory with the same device address,
 * ::cuIpcGetMemHandle will return a unique handle for the
 * new memory. 
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param pHandle - Pointer to user allocated ::CUipcMemHandle to return
 *                    the handle in.
 * @param dptr    - Base pointer to previously allocated device memory 
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_MAP_FAILED,
 * 
 * \sa
 * ::cuMemAlloc,
 * ::cuMemFree,
 * ::cuIpcGetEventHandle,
 * ::cuIpcOpenEventHandle,
 * ::cuIpcOpenMemHandle,
 * ::cuIpcCloseMemHandle
 */
public static native @Cast("CUresult") int cuIpcGetMemHandle(CUipcMemHandle pHandle, @Cast("CUdeviceptr") long dptr);

/**
 * \brief Opens an interprocess memory handle exported from another process
 * and returns a device pointer usable in the local process.
 *
 * Maps memory exported from another process with ::cuIpcGetMemHandle into
 * the current device address space. For contexts on different devices 
 * ::cuIpcOpenMemHandle can attempt to enable peer access between the
 * devices as if the user called ::cuCtxEnablePeerAccess. This behavior is 
 * controlled by the ::CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS flag. 
 * ::cuDeviceCanAccessPeer can determine if a mapping is possible.
 *
 * Contexts that may open ::CUipcMemHandles are restricted in the following way.
 * ::CUipcMemHandles from each ::CUdevice in a given process may only be opened 
 * by one ::CUcontext per ::CUdevice per other process.
 *
 * Memory returned from ::cuIpcOpenMemHandle must be freed with
 * ::cuIpcCloseMemHandle.
 *
 * Calling ::cuMemFree on an exported memory region before calling
 * ::cuIpcCloseMemHandle in the importing context will result in undefined
 * behavior.
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 * 
 * @param pdptr  - Returned device pointer
 * @param handle - ::CUipcMemHandle to open
 * @param Flags  - Flags for this operation. Must be specified as ::CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_MAP_FAILED,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_TOO_MANY_PEERS
 *
 * \note No guarantees are made about the address returned in \p *pdptr.  
 * In particular, multiple processes may not receive the same address for the same \p handle.
 *
 * \sa
 * ::cuMemAlloc,
 * ::cuMemFree,
 * ::cuIpcGetEventHandle,
 * ::cuIpcOpenEventHandle,
 * ::cuIpcGetMemHandle,
 * ::cuIpcCloseMemHandle,
 * ::cuCtxEnablePeerAccess,
 * ::cuDeviceCanAccessPeer,
 */
public static native @Cast("CUresult") int cuIpcOpenMemHandle(@Cast("CUdeviceptr*") LongPointer pdptr, @ByVal CUipcMemHandle handle, @Cast("unsigned int") int Flags);
public static native @Cast("CUresult") int cuIpcOpenMemHandle(@Cast("CUdeviceptr*") LongBuffer pdptr, @ByVal CUipcMemHandle handle, @Cast("unsigned int") int Flags);
public static native @Cast("CUresult") int cuIpcOpenMemHandle(@Cast("CUdeviceptr*") long[] pdptr, @ByVal CUipcMemHandle handle, @Cast("unsigned int") int Flags);

/**
 * \brief Close memory mapped with ::cuIpcOpenMemHandle
 * 
 * Unmaps memory returnd by ::cuIpcOpenMemHandle. The original allocation
 * in the exporting process as well as imported mappings in other processes
 * will be unaffected.
 *
 * Any resources used to enable peer access will be freed if this is the
 * last mapping using them.
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param dptr - Device pointer returned by ::cuIpcOpenMemHandle
 * 
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_MAP_FAILED,
 * ::CUDA_ERROR_INVALID_HANDLE,
 *
 * \sa
 * ::cuMemAlloc,
 * ::cuMemFree,
 * ::cuIpcGetEventHandle,
 * ::cuIpcOpenEventHandle,
 * ::cuIpcGetMemHandle,
 * ::cuIpcOpenMemHandle,
 */
public static native @Cast("CUresult") int cuIpcCloseMemHandle(@Cast("CUdeviceptr") long dptr);

// #endif /* __CUDA_API_VERSION >= 4010 */

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Registers an existing host memory range for use by CUDA
 *
 * Page-locks the memory range specified by \p p and \p bytesize and maps it
 * for the device(s) as specified by \p Flags. This memory range also is added
 * to the same tracking mechanism as ::cuMemHostAlloc to automatically accelerate
 * calls to functions such as ::cuMemcpyHtoD(). Since the memory can be accessed 
 * directly by the device, it can be read or written with much higher bandwidth 
 * than pageable memory that has not been registered.  Page-locking excessive
 * amounts of memory may degrade system performance, since it reduces the amount
 * of memory available to the system for paging. As a result, this function is
 * best used sparingly to register staging areas for data exchange between
 * host and device.
 *
 * This function has limited support on Mac OS X. OS 10.7 or higher is required.
 *
 * The \p Flags parameter enables different options to be specified that
 * affect the allocation, as follows.
 *
 * - ::CU_MEMHOSTREGISTER_PORTABLE: The memory returned by this call will be
 *   considered as pinned memory by all CUDA contexts, not just the one that
 *   performed the allocation.
 *
 * - ::CU_MEMHOSTREGISTER_DEVICEMAP: Maps the allocation into the CUDA address
 *   space. The device pointer to the memory may be obtained by calling
 *   ::cuMemHostGetDevicePointer(). This feature is available only on GPUs
 *   with compute capability greater than or equal to 1.1.
 *
 * - ::CU_MEMHOSTREGISTER_IOMEMORY: The pointer is treated as pointing to some
 *   I/O memory space, e.g. the PCI Express resource of a 3rd party device.
 *
 * All of these flags are orthogonal to one another: a developer may page-lock
 * memory that is portable or mapped with no restrictions.
 *
 * The CUDA context must have been created with the ::CU_CTX_MAP_HOST flag in
 * order for the ::CU_MEMHOSTREGISTER_DEVICEMAP flag to have any effect.
 *
 * The ::CU_MEMHOSTREGISTER_DEVICEMAP flag may be specified on CUDA contexts for
 * devices that do not support mapped pinned memory. The failure is deferred
 * to ::cuMemHostGetDevicePointer() because the memory may be mapped into
 * other CUDA contexts via the ::CU_MEMHOSTREGISTER_PORTABLE flag.
 *
 * The memory page-locked by this function must be unregistered with 
 * ::cuMemHostUnregister().
 *
 * @param p        - Host pointer to memory to page-lock
 * @param bytesize - Size in bytes of the address range to page-lock
 * @param Flags    - Flags for allocation request
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED,
 * ::CUDA_ERROR_NOT_PERMITTED,
 * ::CUDA_ERROR_NOT_SUPPORTED
 * \notefnerr
 *
 * \sa ::cuMemHostUnregister, ::cuMemHostGetFlags, ::cuMemHostGetDevicePointer
 */
public static native @Cast("CUresult") int cuMemHostRegister(Pointer p, @Cast("size_t") long bytesize, @Cast("unsigned int") int Flags);

/**
 * \brief Unregisters a memory range that was registered with cuMemHostRegister.
 *
 * Unmaps the memory range whose base address is specified by \p p, and makes
 * it pageable again.
 *
 * The base address must be the same one specified to ::cuMemHostRegister().
 *
 * @param p - Host pointer to memory to unregister
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED,
 * \notefnerr
 *
 * \sa ::cuMemHostRegister
 */
public static native @Cast("CUresult") int cuMemHostUnregister(Pointer p);

/**
 * \brief Copies memory
 *
 * Copies data between two pointers. 
 * \p dst and \p src are base pointers of the destination and source, respectively.  
 * \p ByteCount specifies the number of bytes to copy.
 * Note that this function infers the type of the transfer (host to host, host to 
 *   device, device to device, or device to host) from the pointer values.  This
 *   function is only allowed in contexts which support unified addressing.
 *
 * @param dst - Destination unified virtual address space pointer
 * @param src - Source unified virtual address space pointer
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpy(@Cast("CUdeviceptr") long dst, @Cast("CUdeviceptr") long src, @Cast("size_t") long ByteCount);

/**
 * \brief Copies device memory between two contexts
 *
 * Copies from device memory in one context to device memory in another
 * context. \p dstDevice is the base device pointer of the destination memory 
 * and \p dstContext is the destination context.  \p srcDevice is the base 
 * device pointer of the source memory and \p srcContext is the source pointer.  
 * \p ByteCount specifies the number of bytes to copy.
 *
 * @param dstDevice  - Destination device pointer
 * @param dstContext - Destination context
 * @param srcDevice  - Source device pointer
 * @param srcContext - Source context
 * @param ByteCount  - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuMemcpyDtoD, ::cuMemcpy3DPeer, ::cuMemcpyDtoDAsync, ::cuMemcpyPeerAsync,
 * ::cuMemcpy3DPeerAsync
 */
public static native @Cast("CUresult") int cuMemcpyPeer(@Cast("CUdeviceptr") long dstDevice, CUctx_st dstContext, @Cast("CUdeviceptr") long srcDevice, CUctx_st srcContext, @Cast("size_t") long ByteCount);

// #endif /* __CUDA_API_VERSION >= 4000 */

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Copies memory from Host to Device
 *
 * Copies from host memory to device memory. \p dstDevice and \p srcHost are
 * the base addresses of the destination and source, respectively. \p ByteCount
 * specifies the number of bytes to copy.
 *
 * @param dstDevice - Destination device pointer
 * @param srcHost   - Source host pointer
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyHtoD(@Cast("CUdeviceptr") long dstDevice, @Const Pointer srcHost, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory from Device to Host
 *
 * Copies from device to host memory. \p dstHost and \p srcDevice specify the
 * base pointers of the destination and source, respectively. \p ByteCount
 * specifies the number of bytes to copy.
 *
 * @param dstHost   - Destination host pointer
 * @param srcDevice - Source device pointer
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyDtoH(Pointer dstHost, @Cast("CUdeviceptr") long srcDevice, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory from Device to Device
 *
 * Copies from device memory to device memory. \p dstDevice and \p srcDevice
 * are the base pointers of the destination and source, respectively.
 * \p ByteCount specifies the number of bytes to copy.
 *
 * @param dstDevice - Destination device pointer
 * @param srcDevice - Source device pointer
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyDtoD(@Cast("CUdeviceptr") long dstDevice, @Cast("CUdeviceptr") long srcDevice, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory from Device to Array
 *
 * Copies from device memory to a 1D CUDA array. \p dstArray and \p dstOffset
 * specify the CUDA array handle and starting index of the destination data.
 * \p srcDevice specifies the base pointer of the source. \p ByteCount
 * specifies the number of bytes to copy.
 *
 * @param dstArray  - Destination array
 * @param dstOffset - Offset in bytes of destination array
 * @param srcDevice - Source device pointer
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyDtoA(CUarray_st dstArray, @Cast("size_t") long dstOffset, @Cast("CUdeviceptr") long srcDevice, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory from Array to Device
 *
 * Copies from one 1D CUDA array to device memory. \p dstDevice specifies the
 * base pointer of the destination and must be naturally aligned with the CUDA
 * array elements. \p srcArray and \p srcOffset specify the CUDA array handle
 * and the offset in bytes into the array where the copy is to begin.
 * \p ByteCount specifies the number of bytes to copy and must be evenly
 * divisible by the array element size.
 *
 * @param dstDevice - Destination device pointer
 * @param srcArray  - Source array
 * @param srcOffset - Offset in bytes of source array
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyAtoD(@Cast("CUdeviceptr") long dstDevice, CUarray_st srcArray, @Cast("size_t") long srcOffset, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory from Host to Array
 *
 * Copies from host memory to a 1D CUDA array. \p dstArray and \p dstOffset
 * specify the CUDA array handle and starting offset in bytes of the destination
 * data.  \p pSrc specifies the base address of the source. \p ByteCount specifies
 * the number of bytes to copy.
 *
 * @param dstArray  - Destination array
 * @param dstOffset - Offset in bytes of destination array
 * @param srcHost   - Source host pointer
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyHtoA(CUarray_st dstArray, @Cast("size_t") long dstOffset, @Const Pointer srcHost, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory from Array to Host
 *
 * Copies from one 1D CUDA array to host memory. \p dstHost specifies the base
 * pointer of the destination. \p srcArray and \p srcOffset specify the CUDA
 * array handle and starting offset in bytes of the source data.
 * \p ByteCount specifies the number of bytes to copy.
 *
 * @param dstHost   - Destination device pointer
 * @param srcArray  - Source array
 * @param srcOffset - Offset in bytes of source array
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyAtoH(Pointer dstHost, CUarray_st srcArray, @Cast("size_t") long srcOffset, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory from Array to Array
 *
 * Copies from one 1D CUDA array to another. \p dstArray and \p srcArray
 * specify the handles of the destination and source CUDA arrays for the copy,
 * respectively. \p dstOffset and \p srcOffset specify the destination and
 * source offsets in bytes into the CUDA arrays. \p ByteCount is the number of
 * bytes to be copied. The size of the elements in the CUDA arrays need not be
 * the same format, but the elements must be the same size; and count must be
 * evenly divisible by that size.
 *
 * @param dstArray  - Destination array
 * @param dstOffset - Offset in bytes of destination array
 * @param srcArray  - Source array
 * @param srcOffset - Offset in bytes of source array
 * @param ByteCount - Size of memory copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpyAtoA(CUarray_st dstArray, @Cast("size_t") long dstOffset, CUarray_st srcArray, @Cast("size_t") long srcOffset, @Cast("size_t") long ByteCount);

/**
 * \brief Copies memory for 2D arrays
 *
 * Perform a 2D memory copy according to the parameters specified in \p pCopy.
 * The ::CUDA_MEMCPY2D structure is defined as:
 *
 * <pre>{@code
   typedef struct CUDA_MEMCPY2D_st {
      unsigned int srcXInBytes, srcY;
      CUmemorytype srcMemoryType;
          const void *srcHost;
          CUdeviceptr srcDevice;
          CUarray srcArray;
          unsigned int srcPitch;

      unsigned int dstXInBytes, dstY;
      CUmemorytype dstMemoryType;
          void *dstHost;
          CUdeviceptr dstDevice;
          CUarray dstArray;
          unsigned int dstPitch;

      unsigned int WidthInBytes;
      unsigned int Height;
   } CUDA_MEMCPY2D;
 * }</pre>
 * where:
 * - ::srcMemoryType and ::dstMemoryType specify the type of memory of the
 *   source and destination, respectively; ::CUmemorytype_enum is defined as:
 *
 * <pre>{@code
   typedef enum CUmemorytype_enum {
      CU_MEMORYTYPE_HOST = 0x01,
      CU_MEMORYTYPE_DEVICE = 0x02,
      CU_MEMORYTYPE_ARRAY = 0x03,
      CU_MEMORYTYPE_UNIFIED = 0x04
   } CUmemorytype;
 * }</pre>
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::srcDevice and ::srcPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::srcArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_HOST, ::srcHost and ::srcPitch
 * specify the (host) base address of the source data and the bytes per row to
 * apply. ::srcArray is ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_DEVICE, ::srcDevice and ::srcPitch
 * specify the (device) base address of the source data and the bytes per row
 * to apply. ::srcArray is ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_ARRAY, ::srcArray specifies the
 * handle of the source data. ::srcHost, ::srcDevice and ::srcPitch are
 * ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_HOST, ::dstHost and ::dstPitch
 * specify the (host) base address of the destination data and the bytes per
 * row to apply. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::dstDevice and ::dstPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::dstArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_DEVICE, ::dstDevice and ::dstPitch
 * specify the (device) base address of the destination data and the bytes per
 * row to apply. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_ARRAY, ::dstArray specifies the
 * handle of the destination data. ::dstHost, ::dstDevice and ::dstPitch are
 * ignored.
 *
 * - ::srcXInBytes and ::srcY specify the base address of the source data for
 *   the copy.
 *
 * \par
 * For host pointers, the starting address is
 * <pre>{@code
  void* Start = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::srcXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::dstXInBytes and ::dstY specify the base address of the destination data
 *   for the copy.
 *
 * \par
 * For host pointers, the base address is
 * <pre>{@code
  void* dstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::dstXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::WidthInBytes and ::Height specify the width (in bytes) and height of
 *   the 2D copy being performed.
 * - If specified, ::srcPitch must be greater than or equal to ::WidthInBytes +
 *   ::srcXInBytes, and ::dstPitch must be greater than or equal to
 *   ::WidthInBytes + dstXInBytes.
 *
 * \par
 * ::cuMemcpy2D() returns an error if any pitch is greater than the maximum
 * allowed (::CU_DEVICE_ATTRIBUTE_MAX_PITCH). ::cuMemAllocPitch() passes back
 * pitches that always work with ::cuMemcpy2D(). On intra-device memory copies
 * (device to device, CUDA array to device, CUDA array to CUDA array),
 * ::cuMemcpy2D() may fail for pitches not computed by ::cuMemAllocPitch().
 * ::cuMemcpy2DUnaligned() does not have this restriction, but may run
 * significantly slower in the cases where ::cuMemcpy2D() would have returned
 * an error code.
 *
 * @param pCopy - Parameters for the memory copy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpy2D(@Const CUDA_MEMCPY2D pCopy);

/**
 * \brief Copies memory for 2D arrays
 *
 * Perform a 2D memory copy according to the parameters specified in \p pCopy.
 * The ::CUDA_MEMCPY2D structure is defined as:
 *
 * <pre>{@code
   typedef struct CUDA_MEMCPY2D_st {
      unsigned int srcXInBytes, srcY;
      CUmemorytype srcMemoryType;
      const void *srcHost;
      CUdeviceptr srcDevice;
      CUarray srcArray;
      unsigned int srcPitch;
      unsigned int dstXInBytes, dstY;
      CUmemorytype dstMemoryType;
      void *dstHost;
      CUdeviceptr dstDevice;
      CUarray dstArray;
      unsigned int dstPitch;
      unsigned int WidthInBytes;
      unsigned int Height;
   } CUDA_MEMCPY2D;
 * }</pre>
 * where:
 * - ::srcMemoryType and ::dstMemoryType specify the type of memory of the
 *   source and destination, respectively; ::CUmemorytype_enum is defined as:
 *
 * <pre>{@code
   typedef enum CUmemorytype_enum {
      CU_MEMORYTYPE_HOST = 0x01,
      CU_MEMORYTYPE_DEVICE = 0x02,
      CU_MEMORYTYPE_ARRAY = 0x03,
      CU_MEMORYTYPE_UNIFIED = 0x04
   } CUmemorytype;
 * }</pre>
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::srcDevice and ::srcPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::srcArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_HOST, ::srcHost and ::srcPitch
 * specify the (host) base address of the source data and the bytes per row to
 * apply. ::srcArray is ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_DEVICE, ::srcDevice and ::srcPitch
 * specify the (device) base address of the source data and the bytes per row
 * to apply. ::srcArray is ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_ARRAY, ::srcArray specifies the
 * handle of the source data. ::srcHost, ::srcDevice and ::srcPitch are
 * ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::dstDevice and ::dstPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::dstArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_HOST, ::dstHost and ::dstPitch
 * specify the (host) base address of the destination data and the bytes per
 * row to apply. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_DEVICE, ::dstDevice and ::dstPitch
 * specify the (device) base address of the destination data and the bytes per
 * row to apply. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_ARRAY, ::dstArray specifies the
 * handle of the destination data. ::dstHost, ::dstDevice and ::dstPitch are
 * ignored.
 *
 * - ::srcXInBytes and ::srcY specify the base address of the source data for
 *   the copy.
 *
 * \par
 * For host pointers, the starting address is
 * <pre>{@code
  void* Start = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::srcXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::dstXInBytes and ::dstY specify the base address of the destination data
 *   for the copy.
 *
 * \par
 * For host pointers, the base address is
 * <pre>{@code
  void* dstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::dstXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::WidthInBytes and ::Height specify the width (in bytes) and height of
 *   the 2D copy being performed.
 * - If specified, ::srcPitch must be greater than or equal to ::WidthInBytes +
 *   ::srcXInBytes, and ::dstPitch must be greater than or equal to
 *   ::WidthInBytes + dstXInBytes.
 *
 * \par
 * ::cuMemcpy2D() returns an error if any pitch is greater than the maximum
 * allowed (::CU_DEVICE_ATTRIBUTE_MAX_PITCH). ::cuMemAllocPitch() passes back
 * pitches that always work with ::cuMemcpy2D(). On intra-device memory copies
 * (device to device, CUDA array to device, CUDA array to CUDA array),
 * ::cuMemcpy2D() may fail for pitches not computed by ::cuMemAllocPitch().
 * ::cuMemcpy2DUnaligned() does not have this restriction, but may run
 * significantly slower in the cases where ::cuMemcpy2D() would have returned
 * an error code.
 *
 * @param pCopy - Parameters for the memory copy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpy2DUnaligned(@Const CUDA_MEMCPY2D pCopy);

/**
 * \brief Copies memory for 3D arrays
 *
 * Perform a 3D memory copy according to the parameters specified in
 * \p pCopy. The ::CUDA_MEMCPY3D structure is defined as:
 *
 * <pre>{@code
        typedef struct CUDA_MEMCPY3D_st {

            unsigned int srcXInBytes, srcY, srcZ;
            unsigned int srcLOD;
            CUmemorytype srcMemoryType;
                const void *srcHost;
                CUdeviceptr srcDevice;
                CUarray srcArray;
                unsigned int srcPitch;  // ignored when src is array
                unsigned int srcHeight; // ignored when src is array; may be 0 if Depth==1

            unsigned int dstXInBytes, dstY, dstZ;
            unsigned int dstLOD;
            CUmemorytype dstMemoryType;
                void *dstHost;
                CUdeviceptr dstDevice;
                CUarray dstArray;
                unsigned int dstPitch;  // ignored when dst is array
                unsigned int dstHeight; // ignored when dst is array; may be 0 if Depth==1

            unsigned int WidthInBytes;
            unsigned int Height;
            unsigned int Depth;
        } CUDA_MEMCPY3D;
 * }</pre>
 * where:
 * - ::srcMemoryType and ::dstMemoryType specify the type of memory of the
 *   source and destination, respectively; ::CUmemorytype_enum is defined as:
 *
 * <pre>{@code
   typedef enum CUmemorytype_enum {
      CU_MEMORYTYPE_HOST = 0x01,
      CU_MEMORYTYPE_DEVICE = 0x02,
      CU_MEMORYTYPE_ARRAY = 0x03,
      CU_MEMORYTYPE_UNIFIED = 0x04
   } CUmemorytype;
 * }</pre>
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::srcDevice and ::srcPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::srcArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_HOST, ::srcHost, ::srcPitch and
 * ::srcHeight specify the (host) base address of the source data, the bytes
 * per row, and the height of each 2D slice of the 3D array. ::srcArray is
 * ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_DEVICE, ::srcDevice, ::srcPitch and
 * ::srcHeight specify the (device) base address of the source data, the bytes
 * per row, and the height of each 2D slice of the 3D array. ::srcArray is
 * ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_ARRAY, ::srcArray specifies the
 * handle of the source data. ::srcHost, ::srcDevice, ::srcPitch and
 * ::srcHeight are ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::dstDevice and ::dstPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::dstArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_HOST, ::dstHost and ::dstPitch
 * specify the (host) base address of the destination data, the bytes per row,
 * and the height of each 2D slice of the 3D array. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_DEVICE, ::dstDevice and ::dstPitch
 * specify the (device) base address of the destination data, the bytes per
 * row, and the height of each 2D slice of the 3D array. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_ARRAY, ::dstArray specifies the
 * handle of the destination data. ::dstHost, ::dstDevice, ::dstPitch and
 * ::dstHeight are ignored.
 *
 * - ::srcXInBytes, ::srcY and ::srcZ specify the base address of the source
 *   data for the copy.
 *
 * \par
 * For host pointers, the starting address is
 * <pre>{@code
  void* Start = (void*)((char*)srcHost+(srcZ*srcHeight+srcY)*srcPitch + srcXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr Start = srcDevice+(srcZ*srcHeight+srcY)*srcPitch+srcXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::srcXInBytes must be evenly divisible by the array
 * element size.
 *
 * - dstXInBytes, ::dstY and ::dstZ specify the base address of the
 *   destination data for the copy.
 *
 * \par
 * For host pointers, the base address is
 * <pre>{@code
  void* dstStart = (void*)((char*)dstHost+(dstZ*dstHeight+dstY)*dstPitch + dstXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr dstStart = dstDevice+(dstZ*dstHeight+dstY)*dstPitch+dstXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::dstXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::WidthInBytes, ::Height and ::Depth specify the width (in bytes), height
 *   and depth of the 3D copy being performed.
 * - If specified, ::srcPitch must be greater than or equal to ::WidthInBytes +
 *   ::srcXInBytes, and ::dstPitch must be greater than or equal to
 *   ::WidthInBytes + dstXInBytes.
 * - If specified, ::srcHeight must be greater than or equal to ::Height +
 *   ::srcY, and ::dstHeight must be greater than or equal to ::Height + ::dstY.
 *
 * \par
 * ::cuMemcpy3D() returns an error if any pitch is greater than the maximum
 * allowed (::CU_DEVICE_ATTRIBUTE_MAX_PITCH).
 *
 * The ::srcLOD and ::dstLOD members of the ::CUDA_MEMCPY3D structure must be
 * set to 0.
 *
 * @param pCopy - Parameters for the memory copy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemcpy3D(@Const CUDA_MEMCPY3D pCopy);
// #endif /* __CUDA_API_VERSION >= 3020 */

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Copies memory between contexts
 *
 * Perform a 3D memory copy according to the parameters specified in
 * \p pCopy.  See the definition of the ::CUDA_MEMCPY3D_PEER structure
 * for documentation of its parameters.
 *
 * @param pCopy - Parameters for the memory copy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_sync
 *
 * \sa ::cuMemcpyDtoD, ::cuMemcpyPeer, ::cuMemcpyDtoDAsync, ::cuMemcpyPeerAsync,
 * ::cuMemcpy3DPeerAsync
 */
public static native @Cast("CUresult") int cuMemcpy3DPeer(@Const CUDA_MEMCPY3D_PEER pCopy);

/**
 * \brief Copies memory asynchronously
 *
 * Copies data between two pointers. 
 * \p dst and \p src are base pointers of the destination and source, respectively.  
 * \p ByteCount specifies the number of bytes to copy.
 * Note that this function infers the type of the transfer (host to host, host to 
 *   device, device to device, or device to host) from the pointer values.  This
 *   function is only allowed in contexts which support unified addressing.
 *
 * @param dst       - Destination unified virtual address space pointer
 * @param src       - Source unified virtual address space pointer
 * @param ByteCount - Size of memory copy in bytes
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpyAsync(@Cast("CUdeviceptr") long dst, @Cast("CUdeviceptr") long src, @Cast("size_t") long ByteCount, CUstream_st hStream);

/**
 * \brief Copies device memory between two contexts asynchronously.
 *
 * Copies from device memory in one context to device memory in another
 * context. \p dstDevice is the base device pointer of the destination memory 
 * and \p dstContext is the destination context.  \p srcDevice is the base 
 * device pointer of the source memory and \p srcContext is the source pointer.  
 * \p ByteCount specifies the number of bytes to copy.
 *
 * @param dstDevice  - Destination device pointer
 * @param dstContext - Destination context
 * @param srcDevice  - Source device pointer
 * @param srcContext - Source context
 * @param ByteCount  - Size of memory copy in bytes
 * @param hStream    - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuMemcpyDtoD, ::cuMemcpyPeer, ::cuMemcpy3DPeer, ::cuMemcpyDtoDAsync, 
 * ::cuMemcpy3DPeerAsync
 */
public static native @Cast("CUresult") int cuMemcpyPeerAsync(@Cast("CUdeviceptr") long dstDevice, CUctx_st dstContext, @Cast("CUdeviceptr") long srcDevice, CUctx_st srcContext, @Cast("size_t") long ByteCount, CUstream_st hStream);
// #endif /* __CUDA_API_VERSION >= 4000 */

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Copies memory from Host to Device
 *
 * Copies from host memory to device memory. \p dstDevice and \p srcHost are
 * the base addresses of the destination and source, respectively. \p ByteCount
 * specifies the number of bytes to copy.
 *
 * @param dstDevice - Destination device pointer
 * @param srcHost   - Source host pointer
 * @param ByteCount - Size of memory copy in bytes
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpyHtoDAsync(@Cast("CUdeviceptr") long dstDevice, @Const Pointer srcHost, @Cast("size_t") long ByteCount, CUstream_st hStream);

/**
 * \brief Copies memory from Device to Host
 *
 * Copies from device to host memory. \p dstHost and \p srcDevice specify the
 * base pointers of the destination and source, respectively. \p ByteCount
 * specifies the number of bytes to copy.
 *
 * @param dstHost   - Destination host pointer
 * @param srcDevice - Source device pointer
 * @param ByteCount - Size of memory copy in bytes
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpyDtoHAsync(Pointer dstHost, @Cast("CUdeviceptr") long srcDevice, @Cast("size_t") long ByteCount, CUstream_st hStream);

/**
 * \brief Copies memory from Device to Device
 *
 * Copies from device memory to device memory. \p dstDevice and \p srcDevice
 * are the base pointers of the destination and source, respectively.
 * \p ByteCount specifies the number of bytes to copy.
 *
 * @param dstDevice - Destination device pointer
 * @param srcDevice - Source device pointer
 * @param ByteCount - Size of memory copy in bytes
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpyDtoDAsync(@Cast("CUdeviceptr") long dstDevice, @Cast("CUdeviceptr") long srcDevice, @Cast("size_t") long ByteCount, CUstream_st hStream);

/**
 * \brief Copies memory from Host to Array
 *
 * Copies from host memory to a 1D CUDA array. \p dstArray and \p dstOffset
 * specify the CUDA array handle and starting offset in bytes of the
 * destination data. \p srcHost specifies the base address of the source.
 * \p ByteCount specifies the number of bytes to copy.
 *
 * @param dstArray  - Destination array
 * @param dstOffset - Offset in bytes of destination array
 * @param srcHost   - Source host pointer
 * @param ByteCount - Size of memory copy in bytes
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpyHtoAAsync(CUarray_st dstArray, @Cast("size_t") long dstOffset, @Const Pointer srcHost, @Cast("size_t") long ByteCount, CUstream_st hStream);

/**
 * \brief Copies memory from Array to Host
 *
 * Copies from one 1D CUDA array to host memory. \p dstHost specifies the base
 * pointer of the destination. \p srcArray and \p srcOffset specify the CUDA
 * array handle and starting offset in bytes of the source data.
 * \p ByteCount specifies the number of bytes to copy.
 *
 * @param dstHost   - Destination pointer
 * @param srcArray  - Source array
 * @param srcOffset - Offset in bytes of source array
 * @param ByteCount - Size of memory copy in bytes
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpyAtoHAsync(Pointer dstHost, CUarray_st srcArray, @Cast("size_t") long srcOffset, @Cast("size_t") long ByteCount, CUstream_st hStream);

/**
 * \brief Copies memory for 2D arrays
 *
 * Perform a 2D memory copy according to the parameters specified in \p pCopy.
 * The ::CUDA_MEMCPY2D structure is defined as:
 *
 * <pre>{@code
   typedef struct CUDA_MEMCPY2D_st {
      unsigned int srcXInBytes, srcY;
      CUmemorytype srcMemoryType;
      const void *srcHost;
      CUdeviceptr srcDevice;
      CUarray srcArray;
      unsigned int srcPitch;
      unsigned int dstXInBytes, dstY;
      CUmemorytype dstMemoryType;
      void *dstHost;
      CUdeviceptr dstDevice;
      CUarray dstArray;
      unsigned int dstPitch;
      unsigned int WidthInBytes;
      unsigned int Height;
   } CUDA_MEMCPY2D;
 * }</pre>
 * where:
 * - ::srcMemoryType and ::dstMemoryType specify the type of memory of the
 *   source and destination, respectively; ::CUmemorytype_enum is defined as:
 *
 * <pre>{@code
   typedef enum CUmemorytype_enum {
      CU_MEMORYTYPE_HOST = 0x01,
      CU_MEMORYTYPE_DEVICE = 0x02,
      CU_MEMORYTYPE_ARRAY = 0x03,
      CU_MEMORYTYPE_UNIFIED = 0x04
   } CUmemorytype;
 * }</pre>
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_HOST, ::srcHost and ::srcPitch
 * specify the (host) base address of the source data and the bytes per row to
 * apply. ::srcArray is ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::srcDevice and ::srcPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::srcArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_DEVICE, ::srcDevice and ::srcPitch
 * specify the (device) base address of the source data and the bytes per row
 * to apply. ::srcArray is ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_ARRAY, ::srcArray specifies the
 * handle of the source data. ::srcHost, ::srcDevice and ::srcPitch are
 * ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::dstDevice and ::dstPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::dstArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_HOST, ::dstHost and ::dstPitch
 * specify the (host) base address of the destination data and the bytes per
 * row to apply. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_DEVICE, ::dstDevice and ::dstPitch
 * specify the (device) base address of the destination data and the bytes per
 * row to apply. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_ARRAY, ::dstArray specifies the
 * handle of the destination data. ::dstHost, ::dstDevice and ::dstPitch are
 * ignored.
 *
 * - ::srcXInBytes and ::srcY specify the base address of the source data for
 *   the copy.
 *
 * \par
 * For host pointers, the starting address is
 * <pre>{@code
  void* Start = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::srcXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::dstXInBytes and ::dstY specify the base address of the destination data
 *   for the copy.
 *
 * \par
 * For host pointers, the base address is
 * <pre>{@code
  void* dstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::dstXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::WidthInBytes and ::Height specify the width (in bytes) and height of
 *   the 2D copy being performed.
 * - If specified, ::srcPitch must be greater than or equal to ::WidthInBytes +
 *   ::srcXInBytes, and ::dstPitch must be greater than or equal to
 *   ::WidthInBytes + dstXInBytes.
 * - If specified, ::srcPitch must be greater than or equal to ::WidthInBytes +
 *   ::srcXInBytes, and ::dstPitch must be greater than or equal to
 *   ::WidthInBytes + dstXInBytes.
 * - If specified, ::srcHeight must be greater than or equal to ::Height +
 *   ::srcY, and ::dstHeight must be greater than or equal to ::Height + ::dstY.
 *
 * \par
 * ::cuMemcpy2DAsync() returns an error if any pitch is greater than the maximum
 * allowed (::CU_DEVICE_ATTRIBUTE_MAX_PITCH). ::cuMemAllocPitch() passes back
 * pitches that always work with ::cuMemcpy2D(). On intra-device memory copies
 * (device to device, CUDA array to device, CUDA array to CUDA array),
 * ::cuMemcpy2DAsync() may fail for pitches not computed by ::cuMemAllocPitch().
 *
 * @param pCopy   - Parameters for the memory copy
 * @param hStream - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpy2DAsync(@Const CUDA_MEMCPY2D pCopy, CUstream_st hStream);

/**
 * \brief Copies memory for 3D arrays
 *
 * Perform a 3D memory copy according to the parameters specified in
 * \p pCopy. The ::CUDA_MEMCPY3D structure is defined as:
 *
 * <pre>{@code
        typedef struct CUDA_MEMCPY3D_st {

            unsigned int srcXInBytes, srcY, srcZ;
            unsigned int srcLOD;
            CUmemorytype srcMemoryType;
                const void *srcHost;
                CUdeviceptr srcDevice;
                CUarray srcArray;
                unsigned int srcPitch;  // ignored when src is array
                unsigned int srcHeight; // ignored when src is array; may be 0 if Depth==1

            unsigned int dstXInBytes, dstY, dstZ;
            unsigned int dstLOD;
            CUmemorytype dstMemoryType;
                void *dstHost;
                CUdeviceptr dstDevice;
                CUarray dstArray;
                unsigned int dstPitch;  // ignored when dst is array
                unsigned int dstHeight; // ignored when dst is array; may be 0 if Depth==1

            unsigned int WidthInBytes;
            unsigned int Height;
            unsigned int Depth;
        } CUDA_MEMCPY3D;
 * }</pre>
 * where:
 * - ::srcMemoryType and ::dstMemoryType specify the type of memory of the
 *   source and destination, respectively; ::CUmemorytype_enum is defined as:
 *
 * <pre>{@code
   typedef enum CUmemorytype_enum {
      CU_MEMORYTYPE_HOST = 0x01,
      CU_MEMORYTYPE_DEVICE = 0x02,
      CU_MEMORYTYPE_ARRAY = 0x03,
      CU_MEMORYTYPE_UNIFIED = 0x04
   } CUmemorytype;
 * }</pre>
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::srcDevice and ::srcPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::srcArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_HOST, ::srcHost, ::srcPitch and
 * ::srcHeight specify the (host) base address of the source data, the bytes
 * per row, and the height of each 2D slice of the 3D array. ::srcArray is
 * ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_DEVICE, ::srcDevice, ::srcPitch and
 * ::srcHeight specify the (device) base address of the source data, the bytes
 * per row, and the height of each 2D slice of the 3D array. ::srcArray is
 * ignored.
 *
 * \par
 * If ::srcMemoryType is ::CU_MEMORYTYPE_ARRAY, ::srcArray specifies the
 * handle of the source data. ::srcHost, ::srcDevice, ::srcPitch and
 * ::srcHeight are ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_UNIFIED, ::dstDevice and ::dstPitch
 *   specify the (unified virtual address space) base address of the source data 
 *   and the bytes per row to apply.  ::dstArray is ignored.  
 * This value may be used only if unified addressing is supported in the calling 
 *   context.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_HOST, ::dstHost and ::dstPitch
 * specify the (host) base address of the destination data, the bytes per row,
 * and the height of each 2D slice of the 3D array. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_DEVICE, ::dstDevice and ::dstPitch
 * specify the (device) base address of the destination data, the bytes per
 * row, and the height of each 2D slice of the 3D array. ::dstArray is ignored.
 *
 * \par
 * If ::dstMemoryType is ::CU_MEMORYTYPE_ARRAY, ::dstArray specifies the
 * handle of the destination data. ::dstHost, ::dstDevice, ::dstPitch and
 * ::dstHeight are ignored.
 *
 * - ::srcXInBytes, ::srcY and ::srcZ specify the base address of the source
 *   data for the copy.
 *
 * \par
 * For host pointers, the starting address is
 * <pre>{@code
  void* Start = (void*)((char*)srcHost+(srcZ*srcHeight+srcY)*srcPitch + srcXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr Start = srcDevice+(srcZ*srcHeight+srcY)*srcPitch+srcXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::srcXInBytes must be evenly divisible by the array
 * element size.
 *
 * - dstXInBytes, ::dstY and ::dstZ specify the base address of the
 *   destination data for the copy.
 *
 * \par
 * For host pointers, the base address is
 * <pre>{@code
  void* dstStart = (void*)((char*)dstHost+(dstZ*dstHeight+dstY)*dstPitch + dstXInBytes);
 * }</pre>
 *
 * \par
 * For device pointers, the starting address is
 * <pre>{@code
  CUdeviceptr dstStart = dstDevice+(dstZ*dstHeight+dstY)*dstPitch+dstXInBytes;
 * }</pre>
 *
 * \par
 * For CUDA arrays, ::dstXInBytes must be evenly divisible by the array
 * element size.
 *
 * - ::WidthInBytes, ::Height and ::Depth specify the width (in bytes), height
 *   and depth of the 3D copy being performed.
 * - If specified, ::srcPitch must be greater than or equal to ::WidthInBytes +
 *   ::srcXInBytes, and ::dstPitch must be greater than or equal to
 *   ::WidthInBytes + dstXInBytes.
 * - If specified, ::srcHeight must be greater than or equal to ::Height +
 *   ::srcY, and ::dstHeight must be greater than or equal to ::Height + ::dstY.
 *
 * \par
 * ::cuMemcpy3DAsync() returns an error if any pitch is greater than the maximum
 * allowed (::CU_DEVICE_ATTRIBUTE_MAX_PITCH).
 *
 * The ::srcLOD and ::dstLOD members of the ::CUDA_MEMCPY3D structure must be
 * set to 0.
 *
 * @param pCopy - Parameters for the memory copy
 * @param hStream - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemcpy3DAsync(@Const CUDA_MEMCPY3D pCopy, CUstream_st hStream);
// #endif /* __CUDA_API_VERSION >= 3020 */

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Copies memory between contexts asynchronously.
 *
 * Perform a 3D memory copy according to the parameters specified in
 * \p pCopy.  See the definition of the ::CUDA_MEMCPY3D_PEER structure
 * for documentation of its parameters.
 *
 * @param pCopy - Parameters for the memory copy
 * @param hStream - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cuMemcpyDtoD, ::cuMemcpyPeer, ::cuMemcpyDtoDAsync, ::cuMemcpyPeerAsync,
 * ::cuMemcpy3DPeerAsync
 */
public static native @Cast("CUresult") int cuMemcpy3DPeerAsync(@Const CUDA_MEMCPY3D_PEER pCopy, CUstream_st hStream);
// #endif /* __CUDA_API_VERSION >= 4000 */

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Initializes device memory
 *
 * Sets the memory range of \p N 8-bit values to the specified value
 * \p uc.
 *
 * @param dstDevice - Destination device pointer
 * @param uc        - Value to set
 * @param N         - Number of elements
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD8(@Cast("CUdeviceptr") long dstDevice, @Cast("unsigned char") byte uc, @Cast("size_t") long N);

/**
 * \brief Initializes device memory
 *
 * Sets the memory range of \p N 16-bit values to the specified value
 * \p us. The \p dstDevice pointer must be two byte aligned.
 *
 * @param dstDevice - Destination device pointer
 * @param us        - Value to set
 * @param N         - Number of elements
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD16(@Cast("CUdeviceptr") long dstDevice, @Cast("unsigned short") short us, @Cast("size_t") long N);

/**
 * \brief Initializes device memory
 *
 * Sets the memory range of \p N 32-bit values to the specified value
 * \p ui. The \p dstDevice pointer must be four byte aligned.
 *
 * @param dstDevice - Destination device pointer
 * @param ui        - Value to set
 * @param N         - Number of elements
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD32(@Cast("CUdeviceptr") long dstDevice, @Cast("unsigned int") int ui, @Cast("size_t") long N);

/**
 * \brief Initializes device memory
 *
 * Sets the 2D memory range of \p Width 8-bit values to the specified value
 * \p uc. \p Height specifies the number of rows to set, and \p dstPitch
 * specifies the number of bytes between each row. This function performs
 * fastest when the pitch is one that has been passed back by
 * ::cuMemAllocPitch().
 *
 * @param dstDevice - Destination device pointer
 * @param dstPitch  - Pitch of destination device pointer
 * @param uc        - Value to set
 * @param Width     - Width of row
 * @param Height    - Number of rows
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD2D8(@Cast("CUdeviceptr") long dstDevice, @Cast("size_t") long dstPitch, @Cast("unsigned char") byte uc, @Cast("size_t") long Width, @Cast("size_t") long Height);

/**
 * \brief Initializes device memory
 *
 * Sets the 2D memory range of \p Width 16-bit values to the specified value
 * \p us. \p Height specifies the number of rows to set, and \p dstPitch
 * specifies the number of bytes between each row. The \p dstDevice pointer
 * and \p dstPitch offset must be two byte aligned. This function performs
 * fastest when the pitch is one that has been passed back by
 * ::cuMemAllocPitch().
 *
 * @param dstDevice - Destination device pointer
 * @param dstPitch  - Pitch of destination device pointer
 * @param us        - Value to set
 * @param Width     - Width of row
 * @param Height    - Number of rows
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD2D16(@Cast("CUdeviceptr") long dstDevice, @Cast("size_t") long dstPitch, @Cast("unsigned short") short us, @Cast("size_t") long Width, @Cast("size_t") long Height);

/**
 * \brief Initializes device memory
 *
 * Sets the 2D memory range of \p Width 32-bit values to the specified value
 * \p ui. \p Height specifies the number of rows to set, and \p dstPitch
 * specifies the number of bytes between each row. The \p dstDevice pointer
 * and \p dstPitch offset must be four byte aligned. This function performs
 * fastest when the pitch is one that has been passed back by
 * ::cuMemAllocPitch().
 *
 * @param dstDevice - Destination device pointer
 * @param dstPitch  - Pitch of destination device pointer
 * @param ui        - Value to set
 * @param Width     - Width of row
 * @param Height    - Number of rows
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD2D32(@Cast("CUdeviceptr") long dstDevice, @Cast("size_t") long dstPitch, @Cast("unsigned int") int ui, @Cast("size_t") long Width, @Cast("size_t") long Height);

/**
 * \brief Sets device memory
 *
 * Sets the memory range of \p N 8-bit values to the specified value
 * \p uc.
 *
 * @param dstDevice - Destination device pointer
 * @param uc        - Value to set
 * @param N         - Number of elements
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD8Async(@Cast("CUdeviceptr") long dstDevice, @Cast("unsigned char") byte uc, @Cast("size_t") long N, CUstream_st hStream);

/**
 * \brief Sets device memory
 *
 * Sets the memory range of \p N 16-bit values to the specified value
 * \p us. The \p dstDevice pointer must be two byte aligned.
 *
 * @param dstDevice - Destination device pointer
 * @param us        - Value to set
 * @param N         - Number of elements
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD16Async(@Cast("CUdeviceptr") long dstDevice, @Cast("unsigned short") short us, @Cast("size_t") long N, CUstream_st hStream);

/**
 * \brief Sets device memory
 *
 * Sets the memory range of \p N 32-bit values to the specified value
 * \p ui. The \p dstDevice pointer must be four byte aligned.
 *
 * @param dstDevice - Destination device pointer
 * @param ui        - Value to set
 * @param N         - Number of elements
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuMemsetD32Async(@Cast("CUdeviceptr") long dstDevice, @Cast("unsigned int") int ui, @Cast("size_t") long N, CUstream_st hStream);

/**
 * \brief Sets device memory
 *
 * Sets the 2D memory range of \p Width 8-bit values to the specified value
 * \p uc. \p Height specifies the number of rows to set, and \p dstPitch
 * specifies the number of bytes between each row. This function performs
 * fastest when the pitch is one that has been passed back by
 * ::cuMemAllocPitch().
 *
 * @param dstDevice - Destination device pointer
 * @param dstPitch  - Pitch of destination device pointer
 * @param uc        - Value to set
 * @param Width     - Width of row
 * @param Height    - Number of rows
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD2D8Async(@Cast("CUdeviceptr") long dstDevice, @Cast("size_t") long dstPitch, @Cast("unsigned char") byte uc, @Cast("size_t") long Width, @Cast("size_t") long Height, CUstream_st hStream);

/**
 * \brief Sets device memory
 *
 * Sets the 2D memory range of \p Width 16-bit values to the specified value
 * \p us. \p Height specifies the number of rows to set, and \p dstPitch
 * specifies the number of bytes between each row. The \p dstDevice pointer 
 * and \p dstPitch offset must be two byte aligned. This function performs
 * fastest when the pitch is one that has been passed back by
 * ::cuMemAllocPitch().
 *
 * @param dstDevice - Destination device pointer
 * @param dstPitch  - Pitch of destination device pointer
 * @param us        - Value to set
 * @param Width     - Width of row
 * @param Height    - Number of rows
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D32, ::cuMemsetD2D32Async,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD2D16Async(@Cast("CUdeviceptr") long dstDevice, @Cast("size_t") long dstPitch, @Cast("unsigned short") short us, @Cast("size_t") long Width, @Cast("size_t") long Height, CUstream_st hStream);

/**
 * \brief Sets device memory
 *
 * Sets the 2D memory range of \p Width 32-bit values to the specified value
 * \p ui. \p Height specifies the number of rows to set, and \p dstPitch
 * specifies the number of bytes between each row. The \p dstDevice pointer
 * and \p dstPitch offset must be four byte aligned. This function performs
 * fastest when the pitch is one that has been passed back by
 * ::cuMemAllocPitch().
 *
 * @param dstDevice - Destination device pointer
 * @param dstPitch  - Pitch of destination device pointer
 * @param ui        - Value to set
 * @param Width     - Width of row
 * @param Height    - Number of rows
 * @param hStream   - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D8Async,
 * ::cuMemsetD2D16, ::cuMemsetD2D16Async, ::cuMemsetD2D32,
 * ::cuMemsetD8, ::cuMemsetD8Async, ::cuMemsetD16, ::cuMemsetD16Async,
 * ::cuMemsetD32, ::cuMemsetD32Async
 */
public static native @Cast("CUresult") int cuMemsetD2D32Async(@Cast("CUdeviceptr") long dstDevice, @Cast("size_t") long dstPitch, @Cast("unsigned int") int ui, @Cast("size_t") long Width, @Cast("size_t") long Height, CUstream_st hStream);

/**
 * \brief Creates a 1D or 2D CUDA array
 *
 * Creates a CUDA array according to the ::CUDA_ARRAY_DESCRIPTOR structure
 * \p pAllocateArray and returns a handle to the new CUDA array in \p *pHandle.
 * The ::CUDA_ARRAY_DESCRIPTOR is defined as:
 *
 * <pre>{@code
    typedef struct {
        unsigned int Width;
        unsigned int Height;
        CUarray_format Format;
        unsigned int NumChannels;
    } CUDA_ARRAY_DESCRIPTOR;
 * }</pre>
 * where:
 *
 * - \p Width, and \p Height are the width, and height of the CUDA array (in
 * elements); the CUDA array is one-dimensional if height is 0, two-dimensional
 * otherwise;
 * - ::Format specifies the format of the elements; ::CUarray_format is
 * defined as:
 * <pre>{@code
    typedef enum CUarray_format_enum {
        CU_AD_FORMAT_UNSIGNED_INT8 = 0x01,
        CU_AD_FORMAT_UNSIGNED_INT16 = 0x02,
        CU_AD_FORMAT_UNSIGNED_INT32 = 0x03,
        CU_AD_FORMAT_SIGNED_INT8 = 0x08,
        CU_AD_FORMAT_SIGNED_INT16 = 0x09,
        CU_AD_FORMAT_SIGNED_INT32 = 0x0a,
        CU_AD_FORMAT_HALF = 0x10,
        CU_AD_FORMAT_FLOAT = 0x20
    } CUarray_format;
 *  }</pre>
 * - \p NumChannels specifies the number of packed components per CUDA array
 * element; it may be 1, 2, or 4;
 *
 * Here are examples of CUDA array descriptions:
 *
 * Description for a CUDA array of 2048 floats:
 * <pre>{@code
    CUDA_ARRAY_DESCRIPTOR desc;
    desc.Format = CU_AD_FORMAT_FLOAT;
    desc.NumChannels = 1;
    desc.Width = 2048;
    desc.Height = 1;
 * }</pre>
 *
 * Description for a 64 x 64 CUDA array of floats:
 * <pre>{@code
    CUDA_ARRAY_DESCRIPTOR desc;
    desc.Format = CU_AD_FORMAT_FLOAT;
    desc.NumChannels = 1;
    desc.Width = 64;
    desc.Height = 64;
 * }</pre>
 *
 * Description for a \p width x \p height CUDA array of 64-bit, 4x16-bit
 * float16's:
 * <pre>{@code
    CUDA_ARRAY_DESCRIPTOR desc;
    desc.FormatFlags = CU_AD_FORMAT_HALF;
    desc.NumChannels = 4;
    desc.Width = width;
    desc.Height = height;
 * }</pre>
 *
 * Description for a \p width x \p height CUDA array of 16-bit elements, each
 * of which is two 8-bit unsigned chars:
 * <pre>{@code
    CUDA_ARRAY_DESCRIPTOR arrayDesc;
    desc.FormatFlags = CU_AD_FORMAT_UNSIGNED_INT8;
    desc.NumChannels = 2;
    desc.Width = width;
    desc.Height = height;
 * }</pre>
 *
 * @param pHandle        - Returned array
 * @param pAllocateArray - Array descriptor
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuArrayCreate(@ByPtrPtr CUarray_st pHandle, @Const CUDA_ARRAY_DESCRIPTOR pAllocateArray);

/**
 * \brief Get a 1D or 2D CUDA array descriptor
 *
 * Returns in \p *pArrayDescriptor a descriptor containing information on the
 * format and dimensions of the CUDA array \p hArray. It is useful for
 * subroutines that have been passed a CUDA array, but need to know the CUDA
 * array parameters for validation or other purposes.
 *
 * @param pArrayDescriptor - Returned array descriptor
 * @param hArray           - Array to get descriptor of
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuArrayGetDescriptor(CUDA_ARRAY_DESCRIPTOR pArrayDescriptor, CUarray_st hArray);
// #endif /* __CUDA_API_VERSION >= 3020 */


/**
 * \brief Destroys a CUDA array
 *
 * Destroys the CUDA array \p hArray.
 *
 * @param hArray - Array to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_ARRAY_IS_MAPPED
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuArrayDestroy(CUarray_st hArray);

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Creates a 3D CUDA array
 *
 * Creates a CUDA array according to the ::CUDA_ARRAY3D_DESCRIPTOR structure
 * \p pAllocateArray and returns a handle to the new CUDA array in \p *pHandle.
 * The ::CUDA_ARRAY3D_DESCRIPTOR is defined as:
 *
 * <pre>{@code
    typedef struct {
        unsigned int Width;
        unsigned int Height;
        unsigned int Depth;
        CUarray_format Format;
        unsigned int NumChannels;
        unsigned int Flags;
    } CUDA_ARRAY3D_DESCRIPTOR;
 * }</pre>
 * where:
 *
 * - \p Width, \p Height, and \p Depth are the width, height, and depth of the
 * CUDA array (in elements); the following types of CUDA arrays can be allocated:
 *     - A 1D array is allocated if \p Height and \p Depth extents are both zero.
 *     - A 2D array is allocated if only \p Depth extent is zero.
 *     - A 3D array is allocated if all three extents are non-zero.
 *     - A 1D layered CUDA array is allocated if only \p Height is zero and the 
 *       ::CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 1D array. The number 
 *       of layers is determined by the depth extent.
 *     - A 2D layered CUDA array is allocated if all three extents are non-zero and 
 *       the ::CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 2D array. The number 
 *       of layers is determined by the depth extent.
 *     - A cubemap CUDA array is allocated if all three extents are non-zero and the
 *       ::CUDA_ARRAY3D_CUBEMAP flag is set. \p Width must be equal to \p Height, and 
 *       \p Depth must be six. A cubemap is a special type of 2D layered CUDA array, 
 *       where the six layers represent the six faces of a cube. The order of the six 
 *       layers in memory is the same as that listed in ::CUarray_cubemap_face.
 *     - A cubemap layered CUDA array is allocated if all three extents are non-zero, 
 *       and both, ::CUDA_ARRAY3D_CUBEMAP and ::CUDA_ARRAY3D_LAYERED flags are set. 
 *       \p Width must be equal to \p Height, and \p Depth must be a multiple of six. 
 *       A cubemap layered CUDA array is a special type of 2D layered CUDA array that 
 *       consists of a collection of cubemaps. The first six layers represent the first 
 *       cubemap, the next six layers form the second cubemap, and so on.
 *
 * - ::Format specifies the format of the elements; ::CUarray_format is
 * defined as:
 * <pre>{@code
    typedef enum CUarray_format_enum {
        CU_AD_FORMAT_UNSIGNED_INT8 = 0x01,
        CU_AD_FORMAT_UNSIGNED_INT16 = 0x02,
        CU_AD_FORMAT_UNSIGNED_INT32 = 0x03,
        CU_AD_FORMAT_SIGNED_INT8 = 0x08,
        CU_AD_FORMAT_SIGNED_INT16 = 0x09,
        CU_AD_FORMAT_SIGNED_INT32 = 0x0a,
        CU_AD_FORMAT_HALF = 0x10,
        CU_AD_FORMAT_FLOAT = 0x20
    } CUarray_format;
 *  }</pre>
 *
 * - \p NumChannels specifies the number of packed components per CUDA array
 * element; it may be 1, 2, or 4;
 *
 * - ::Flags may be set to 
 *   - ::CUDA_ARRAY3D_LAYERED to enable creation of layered CUDA arrays. If this flag is set, 
 *     \p Depth specifies the number of layers, not the depth of a 3D array.
 *   - ::CUDA_ARRAY3D_SURFACE_LDST to enable surface references to be bound to the CUDA array.  
 *     If this flag is not set, ::cuSurfRefSetArray will fail when attempting to bind the CUDA array 
 *     to a surface reference.
 *   - ::CUDA_ARRAY3D_CUBEMAP to enable creation of cubemaps. If this flag is set, \p Width must be
 *     equal to \p Height, and \p Depth must be six. If the ::CUDA_ARRAY3D_LAYERED flag is also set,
 *     then \p Depth must be a multiple of six.
 *   - ::CUDA_ARRAY3D_TEXTURE_GATHER to indicate that the CUDA array will be used for texture gather.
 *     Texture gather can only be performed on 2D CUDA arrays.
 *
 * \p Width, \p Height and \p Depth must meet certain size requirements as listed in the following table. 
 * All values are specified in elements. Note that for brevity's sake, the full name of the device attribute 
 * is not specified. For ex., TEXTURE1D_WIDTH refers to the device attribute 
 * ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH.
 *
 * Note that 2D CUDA arrays have different size requirements if the ::CUDA_ARRAY3D_TEXTURE_GATHER flag 
 * is set. \p Width and \p Height must not be greater than ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH 
 * and ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT respectively, in that case.
 *
 * <table>
 * <tr><td><b>CUDA array type</b></td>
 * <td><b>Valid extents that must always be met<br>{(width range in elements), (height range), 
 * (depth range)}</b></td>
 * <td><b>Valid extents with CUDA_ARRAY3D_SURFACE_LDST set<br> 
 * {(width range in elements), (height range), (depth range)}</b></td></tr>
 * <tr><td>1D</td>
 * <td><small>{ (1,TEXTURE1D_WIDTH), 0, 0 }</small></td>
 * <td><small>{ (1,SURFACE1D_WIDTH), 0, 0 }</small></td></tr>
 * <tr><td>2D</td>
 * <td><small>{ (1,TEXTURE2D_WIDTH), (1,TEXTURE2D_HEIGHT), 0 }</small></td>
 * <td><small>{ (1,SURFACE2D_WIDTH), (1,SURFACE2D_HEIGHT), 0 }</small></td></tr>
 * <tr><td>3D</td>
 * <td><small>{ (1,TEXTURE3D_WIDTH), (1,TEXTURE3D_HEIGHT), (1,TEXTURE3D_DEPTH) }
 * <br>OR<br>{ (1,TEXTURE3D_WIDTH_ALTERNATE), (1,TEXTURE3D_HEIGHT_ALTERNATE), 
 * (1,TEXTURE3D_DEPTH_ALTERNATE) }</small></td>
 * <td><small>{ (1,SURFACE3D_WIDTH), (1,SURFACE3D_HEIGHT), 
 * (1,SURFACE3D_DEPTH) }</small></td></tr>
 * <tr><td>1D Layered</td>
 * <td><small>{ (1,TEXTURE1D_LAYERED_WIDTH), 0, 
 * (1,TEXTURE1D_LAYERED_LAYERS) }</small></td>
 * <td><small>{ (1,SURFACE1D_LAYERED_WIDTH), 0, 
 * (1,SURFACE1D_LAYERED_LAYERS) }</small></td></tr>
 * <tr><td>2D Layered</td>
 * <td><small>{ (1,TEXTURE2D_LAYERED_WIDTH), (1,TEXTURE2D_LAYERED_HEIGHT), 
 * (1,TEXTURE2D_LAYERED_LAYERS) }</small></td>
 * <td><small>{ (1,SURFACE2D_LAYERED_WIDTH), (1,SURFACE2D_LAYERED_HEIGHT), 
 * (1,SURFACE2D_LAYERED_LAYERS) }</small></td></tr>
 * <tr><td>Cubemap</td>
 * <td><small>{ (1,TEXTURECUBEMAP_WIDTH), (1,TEXTURECUBEMAP_WIDTH), 6 }</small></td>
 * <td><small>{ (1,SURFACECUBEMAP_WIDTH), 
 * (1,SURFACECUBEMAP_WIDTH), 6 }</small></td></tr>
 * <tr><td>Cubemap Layered</td>
 * <td><small>{ (1,TEXTURECUBEMAP_LAYERED_WIDTH), (1,TEXTURECUBEMAP_LAYERED_WIDTH), 
 * (1,TEXTURECUBEMAP_LAYERED_LAYERS) }</small></td>
 * <td><small>{ (1,SURFACECUBEMAP_LAYERED_WIDTH), (1,SURFACECUBEMAP_LAYERED_WIDTH), 
 * (1,SURFACECUBEMAP_LAYERED_LAYERS) }</small></td></tr>
 * </table>
 *
 * Here are examples of CUDA array descriptions:
 *
 * Description for a CUDA array of 2048 floats:
 * <pre>{@code
    CUDA_ARRAY3D_DESCRIPTOR desc;
    desc.Format = CU_AD_FORMAT_FLOAT;
    desc.NumChannels = 1;
    desc.Width = 2048;
    desc.Height = 0;
    desc.Depth = 0;
 * }</pre>
 *
 * Description for a 64 x 64 CUDA array of floats:
 * <pre>{@code
    CUDA_ARRAY3D_DESCRIPTOR desc;
    desc.Format = CU_AD_FORMAT_FLOAT;
    desc.NumChannels = 1;
    desc.Width = 64;
    desc.Height = 64;
    desc.Depth = 0;
 * }</pre>
 *
 * Description for a \p width x \p height x \p depth CUDA array of 64-bit,
 * 4x16-bit float16's:
 * <pre>{@code
    CUDA_ARRAY3D_DESCRIPTOR desc;
    desc.FormatFlags = CU_AD_FORMAT_HALF;
    desc.NumChannels = 4;
    desc.Width = width;
    desc.Height = height;
    desc.Depth = depth;
 * }</pre>
 *
 * @param pHandle        - Returned array
 * @param pAllocateArray - 3D array descriptor
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 * \sa ::cuArray3DGetDescriptor, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuArray3DCreate(@ByPtrPtr CUarray_st pHandle, @Const CUDA_ARRAY3D_DESCRIPTOR pAllocateArray);

/**
 * \brief Get a 3D CUDA array descriptor
 *
 * Returns in \p *pArrayDescriptor a descriptor containing information on the
 * format and dimensions of the CUDA array \p hArray. It is useful for
 * subroutines that have been passed a CUDA array, but need to know the CUDA
 * array parameters for validation or other purposes.
 *
 * This function may be called on 1D and 2D arrays, in which case the \p Height
 * and/or \p Depth members of the descriptor struct will be set to 0.
 *
 * @param pArrayDescriptor - Returned 3D array descriptor
 * @param hArray           - 3D array to get descriptor of
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE
 * \notefnerr
 *
 * \sa ::cuArray3DCreate, ::cuArrayCreate,
 * ::cuArrayDestroy, ::cuArrayGetDescriptor, ::cuMemAlloc, ::cuMemAllocHost,
 * ::cuMemAllocPitch, ::cuMemcpy2D, ::cuMemcpy2DAsync, ::cuMemcpy2DUnaligned,
 * ::cuMemcpy3D, ::cuMemcpy3DAsync, ::cuMemcpyAtoA, ::cuMemcpyAtoD,
 * ::cuMemcpyAtoH, ::cuMemcpyAtoHAsync, ::cuMemcpyDtoA, ::cuMemcpyDtoD, ::cuMemcpyDtoDAsync,
 * ::cuMemcpyDtoH, ::cuMemcpyDtoHAsync, ::cuMemcpyHtoA, ::cuMemcpyHtoAAsync,
 * ::cuMemcpyHtoD, ::cuMemcpyHtoDAsync, ::cuMemFree, ::cuMemFreeHost,
 * ::cuMemGetAddressRange, ::cuMemGetInfo, ::cuMemHostAlloc,
 * ::cuMemHostGetDevicePointer, ::cuMemsetD2D8, ::cuMemsetD2D16,
 * ::cuMemsetD2D32, ::cuMemsetD8, ::cuMemsetD16, ::cuMemsetD32
 */
public static native @Cast("CUresult") int cuArray3DGetDescriptor(CUDA_ARRAY3D_DESCRIPTOR pArrayDescriptor, CUarray_st hArray);
// #endif /* __CUDA_API_VERSION >= 3020 */

// #if __CUDA_API_VERSION >= 5000

/**
 * \brief Creates a CUDA mipmapped array
 *
 * Creates a CUDA mipmapped array according to the ::CUDA_ARRAY3D_DESCRIPTOR structure
 * \p pMipmappedArrayDesc and returns a handle to the new CUDA mipmapped array in \p *pHandle.
 * \p numMipmapLevels specifies the number of mipmap levels to be allocated. This value is
 * clamped to the range [1, 1 + floor(log2(max(width, height, depth)))].
 *
 * The ::CUDA_ARRAY3D_DESCRIPTOR is defined as:
 *
 * <pre>{@code
    typedef struct {
        unsigned int Width;
        unsigned int Height;
        unsigned int Depth;
        CUarray_format Format;
        unsigned int NumChannels;
        unsigned int Flags;
    } CUDA_ARRAY3D_DESCRIPTOR;
 * }</pre>
 * where:
 *
 * - \p Width, \p Height, and \p Depth are the width, height, and depth of the
 * CUDA array (in elements); the following types of CUDA arrays can be allocated:
 *     - A 1D mipmapped array is allocated if \p Height and \p Depth extents are both zero.
 *     - A 2D mipmapped array is allocated if only \p Depth extent is zero.
 *     - A 3D mipmapped array is allocated if all three extents are non-zero.
 *     - A 1D layered CUDA mipmapped array is allocated if only \p Height is zero and the 
 *       ::CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 1D array. The number 
 *       of layers is determined by the depth extent.
 *     - A 2D layered CUDA mipmapped array is allocated if all three extents are non-zero and 
 *       the ::CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 2D array. The number 
 *       of layers is determined by the depth extent.
 *     - A cubemap CUDA mipmapped array is allocated if all three extents are non-zero and the
 *       ::CUDA_ARRAY3D_CUBEMAP flag is set. \p Width must be equal to \p Height, and 
 *       \p Depth must be six. A cubemap is a special type of 2D layered CUDA array, 
 *       where the six layers represent the six faces of a cube. The order of the six 
 *       layers in memory is the same as that listed in ::CUarray_cubemap_face.
 *     - A cubemap layered CUDA mipmapped array is allocated if all three extents are non-zero, 
 *       and both, ::CUDA_ARRAY3D_CUBEMAP and ::CUDA_ARRAY3D_LAYERED flags are set. 
 *       \p Width must be equal to \p Height, and \p Depth must be a multiple of six. 
 *       A cubemap layered CUDA array is a special type of 2D layered CUDA array that 
 *       consists of a collection of cubemaps. The first six layers represent the first 
 *       cubemap, the next six layers form the second cubemap, and so on.
 *
 * - ::Format specifies the format of the elements; ::CUarray_format is
 * defined as:
 * <pre>{@code
    typedef enum CUarray_format_enum {
        CU_AD_FORMAT_UNSIGNED_INT8 = 0x01,
        CU_AD_FORMAT_UNSIGNED_INT16 = 0x02,
        CU_AD_FORMAT_UNSIGNED_INT32 = 0x03,
        CU_AD_FORMAT_SIGNED_INT8 = 0x08,
        CU_AD_FORMAT_SIGNED_INT16 = 0x09,
        CU_AD_FORMAT_SIGNED_INT32 = 0x0a,
        CU_AD_FORMAT_HALF = 0x10,
        CU_AD_FORMAT_FLOAT = 0x20
    } CUarray_format;
 *  }</pre>
 *
 * - \p NumChannels specifies the number of packed components per CUDA array
 * element; it may be 1, 2, or 4;
 *
 * - ::Flags may be set to 
 *   - ::CUDA_ARRAY3D_LAYERED to enable creation of layered CUDA mipmapped arrays. If this flag is set, 
 *     \p Depth specifies the number of layers, not the depth of a 3D array.
 *   - ::CUDA_ARRAY3D_SURFACE_LDST to enable surface references to be bound to individual mipmap levels of
 *     the CUDA mipmapped array. If this flag is not set, ::cuSurfRefSetArray will fail when attempting to 
 *     bind a mipmap level of the CUDA mipmapped array to a surface reference.
  *   - ::CUDA_ARRAY3D_CUBEMAP to enable creation of mipmapped cubemaps. If this flag is set, \p Width must be
 *     equal to \p Height, and \p Depth must be six. If the ::CUDA_ARRAY3D_LAYERED flag is also set,
 *     then \p Depth must be a multiple of six.
 *   - ::CUDA_ARRAY3D_TEXTURE_GATHER to indicate that the CUDA mipmapped array will be used for texture gather.
 *     Texture gather can only be performed on 2D CUDA mipmapped arrays.
 *
 * \p Width, \p Height and \p Depth must meet certain size requirements as listed in the following table. 
 * All values are specified in elements. Note that for brevity's sake, the full name of the device attribute 
 * is not specified. For ex., TEXTURE1D_MIPMAPPED_WIDTH refers to the device attribute 
 * ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH.
 *
 * <table>
 * <tr><td><b>CUDA array type</b></td>
 * <td><b>Valid extents that must always be met<br>{(width range in elements), (height range), 
 * (depth range)}</b></td></tr>
 * <tr><td>1D</td>
 * <td><small>{ (1,TEXTURE1D_MIPMAPPED_WIDTH), 0, 0 }</small></td></tr>
 * <tr><td>2D</td>
 * <td><small>{ (1,TEXTURE2D_MIPMAPPED_WIDTH), (1,TEXTURE2D_MIPMAPPED_HEIGHT), 0 }</small></td></tr>
 * <tr><td>3D</td>
 * <td><small>{ (1,TEXTURE3D_WIDTH), (1,TEXTURE3D_HEIGHT), (1,TEXTURE3D_DEPTH) }
 * <br>OR<br>{ (1,TEXTURE3D_WIDTH_ALTERNATE), (1,TEXTURE3D_HEIGHT_ALTERNATE), 
 * (1,TEXTURE3D_DEPTH_ALTERNATE) }</small></td></tr>
 * <tr><td>1D Layered</td>
 * <td><small>{ (1,TEXTURE1D_LAYERED_WIDTH), 0, 
 * (1,TEXTURE1D_LAYERED_LAYERS) }</small></td></tr>
 * <tr><td>2D Layered</td>
 * <td><small>{ (1,TEXTURE2D_LAYERED_WIDTH), (1,TEXTURE2D_LAYERED_HEIGHT), 
 * (1,TEXTURE2D_LAYERED_LAYERS) }</small></td></tr>
 * <tr><td>Cubemap</td>
 * <td><small>{ (1,TEXTURECUBEMAP_WIDTH), (1,TEXTURECUBEMAP_WIDTH), 6 }</small></td></tr>
 * <tr><td>Cubemap Layered</td>
 * <td><small>{ (1,TEXTURECUBEMAP_LAYERED_WIDTH), (1,TEXTURECUBEMAP_LAYERED_WIDTH), 
 * (1,TEXTURECUBEMAP_LAYERED_LAYERS) }</small></td></tr>
 * </table>
 *
 *
 * @param pHandle             - Returned mipmapped array
 * @param pMipmappedArrayDesc - mipmapped array descriptor
 * @param numMipmapLevels     - Number of mipmap levels
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 * \sa ::cuMipmappedArrayDestroy, ::cuMipmappedArrayGetLevel, ::cuArrayCreate,
 */
public static native @Cast("CUresult") int cuMipmappedArrayCreate(@ByPtrPtr CUmipmappedArray_st pHandle, @Const CUDA_ARRAY3D_DESCRIPTOR pMipmappedArrayDesc, @Cast("unsigned int") int numMipmapLevels);

/**
 * \brief Gets a mipmap level of a CUDA mipmapped array
 *
 * Returns in \p *pLevelArray a CUDA array that represents a single mipmap level
 * of the CUDA mipmapped array \p hMipmappedArray.
 *
 * If \p level is greater than the maximum number of levels in this mipmapped array,
 * ::CUDA_ERROR_INVALID_VALUE is returned.
 *
 * @param pLevelArray     - Returned mipmap level CUDA array
 * @param hMipmappedArray - CUDA mipmapped array
 * @param level           - Mipmap level
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE
 * \notefnerr
 *
 * \sa ::cuMipmappedArrayCreate, ::cuMipmappedArrayDestroy, ::cuArrayCreate,
 */
public static native @Cast("CUresult") int cuMipmappedArrayGetLevel(@ByPtrPtr CUarray_st pLevelArray, CUmipmappedArray_st hMipmappedArray, @Cast("unsigned int") int level);

/**
 * \brief Destroys a CUDA mipmapped array
 *
 * Destroys the CUDA mipmapped array \p hMipmappedArray.
 *
 * @param hMipmappedArray - Mipmapped array to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_ARRAY_IS_MAPPED
 * \notefnerr
 *
 * \sa ::cuMipmappedArrayCreate, ::cuMipmappedArrayGetLevel, ::cuArrayCreate,
 */
public static native @Cast("CUresult") int cuMipmappedArrayDestroy(CUmipmappedArray_st hMipmappedArray);

// #endif /* __CUDA_API_VERSION >= 5000 */

/** \} */ /* END CUDA_MEM */

/**
 * \defgroup CUDA_UNIFIED Unified Addressing
 *
 * ___MANBRIEF___ unified addressing functions of the low-level CUDA driver
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the unified addressing functions of the 
 * low-level CUDA driver application programming interface.
 *
 * \{
 *
 * \section CUDA_UNIFIED_overview Overview
 *
 * CUDA devices can share a unified address space with the host.  
 * For these devices there is no distinction between a device
 * pointer and a host pointer -- the same pointer value may be 
 * used to access memory from the host program and from a kernel 
 * running on the device (with exceptions enumerated below).
 *
 * \section CUDA_UNIFIED_support Supported Platforms
 * 
 * Whether or not a device supports unified addressing may be 
 * queried by calling ::cuDeviceGetAttribute() with the device 
 * attribute ::CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING.
 *
 * Unified addressing is automatically enabled in 64-bit processes 
 * on devices with compute capability greater than or equal to 2.0.
 *
 * \section CUDA_UNIFIED_lookup Looking Up Information from Pointer Values
 *
 * It is possible to look up information about the memory which backs a 
 * pointer value.  For instance, one may want to know if a pointer points
 * to host or device memory.  As another example, in the case of device 
 * memory, one may want to know on which CUDA device the memory 
 * resides.  These properties may be queried using the function 
 * ::cuPointerGetAttribute()
 *
 * Since pointers are unique, it is not necessary to specify information
 * about the pointers specified to the various copy functions in the 
 * CUDA API.  The function ::cuMemcpy() may be used to perform a copy
 * between two pointers, ignoring whether they point to host or device
 * memory (making ::cuMemcpyHtoD(), ::cuMemcpyDtoD(), and ::cuMemcpyDtoH()
 * unnecessary for devices supporting unified addressing).  For 
 * multidimensional copies, the memory type ::CU_MEMORYTYPE_UNIFIED may be
 * used to specify that the CUDA driver should infer the location of the
 * pointer from its value.
 *
 * \section CUDA_UNIFIED_automaphost Automatic Mapping of Host Allocated Host Memory
 *
 * All host memory allocated in all contexts using ::cuMemAllocHost() and
 * ::cuMemHostAlloc() is always directly accessible from all contexts on
 * all devices that support unified addressing.  This is the case regardless 
 * of whether or not the flags ::CU_MEMHOSTALLOC_PORTABLE and
 * ::CU_MEMHOSTALLOC_DEVICEMAP are specified.
 *
 * The pointer value through which allocated host memory may be accessed 
 * in kernels on all devices that support unified addressing is the same 
 * as the pointer value through which that memory is accessed on the host,
 * so it is not necessary to call ::cuMemHostGetDevicePointer() to get the device 
 * pointer for these allocations.
 * 
 * Note that this is not the case for memory allocated using the flag
 * ::CU_MEMHOSTALLOC_WRITECOMBINED, as discussed below.
 *
 * \section CUDA_UNIFIED_autopeerregister Automatic Registration of Peer Memory
 *
 * Upon enabling direct access from a context that supports unified addressing 
 * to another peer context that supports unified addressing using 
 * ::cuCtxEnablePeerAccess() all memory allocated in the peer context using 
 * ::cuMemAlloc() and ::cuMemAllocPitch() will immediately be accessible 
 * by the current context.  The device pointer value through
 * which any peer memory may be accessed in the current context
 * is the same pointer value through which that memory may be
 * accessed in the peer context.
 *
 * \section CUDA_UNIFIED_exceptions Exceptions, Disjoint Addressing
 * 
 * Not all memory may be accessed on devices through the same pointer
 * value through which they are accessed on the host.  These exceptions
 * are host memory registered using ::cuMemHostRegister() and host memory
 * allocated using the flag ::CU_MEMHOSTALLOC_WRITECOMBINED.  For these 
 * exceptions, there exists a distinct host and device address for the
 * memory.  The device address is guaranteed to not overlap any valid host
 * pointer range and is guaranteed to have the same value across all 
 * contexts that support unified addressing.  
 * 
 * This device address may be queried using ::cuMemHostGetDevicePointer() 
 * when a context using unified addressing is current.  Either the host 
 * or the unified device pointer value may be used to refer to this memory 
 * through ::cuMemcpy() and similar functions using the 
 * ::CU_MEMORYTYPE_UNIFIED memory type.
 *
 */

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Returns information about a pointer
 * 
 * The supported attributes are:
 * 
 * - ::CU_POINTER_ATTRIBUTE_CONTEXT: 
 * 
 *      Returns in \p *data the ::CUcontext in which \p ptr was allocated or 
 *      registered.   
 *      The type of \p data must be ::CUcontext *.  
 *      
 *      If \p ptr was not allocated by, mapped by, or registered with
 *      a ::CUcontext which uses unified virtual addressing then 
 *      ::CUDA_ERROR_INVALID_VALUE is returned.
 * 
 * - ::CU_POINTER_ATTRIBUTE_MEMORY_TYPE: 
 *    
 *      Returns in \p *data the physical memory type of the memory that 
 *      \p ptr addresses as a ::CUmemorytype enumerated value.
 *      The type of \p data must be unsigned int.
 *      
 *      If \p ptr addresses device memory then \p *data is set to 
 *      ::CU_MEMORYTYPE_DEVICE.  The particular ::CUdevice on which the 
 *      memory resides is the ::CUdevice of the ::CUcontext returned by the 
 *      ::CU_POINTER_ATTRIBUTE_CONTEXT attribute of \p ptr.
 *      
 *      If \p ptr addresses host memory then \p *data is set to 
 *      ::CU_MEMORYTYPE_HOST.
 *      
 *      If \p ptr was not allocated by, mapped by, or registered with
 *      a ::CUcontext which uses unified virtual addressing then 
 *      ::CUDA_ERROR_INVALID_VALUE is returned.
 *
 *      If the current ::CUcontext does not support unified virtual 
 *      addressing then ::CUDA_ERROR_INVALID_CONTEXT is returned.
 *    
 * - ::CU_POINTER_ATTRIBUTE_DEVICE_POINTER:
 * 
 *      Returns in \p *data the device pointer value through which
 *      \p ptr may be accessed by kernels running in the current 
 *      ::CUcontext.
 *      The type of \p data must be CUdeviceptr *.
 * 
 *      If there exists no device pointer value through which
 *      kernels running in the current ::CUcontext may access
 *      \p ptr then ::CUDA_ERROR_INVALID_VALUE is returned.
 * 
 *      If there is no current ::CUcontext then 
 *      ::CUDA_ERROR_INVALID_CONTEXT is returned.
 *      
 *      Except in the exceptional disjoint addressing cases discussed 
 *      below, the value returned in \p *data will equal the input 
 *      value \p ptr.
 * 
 * - ::CU_POINTER_ATTRIBUTE_HOST_POINTER:
 * 
 *      Returns in \p *data the host pointer value through which 
 *      \p ptr may be accessed by by the host program.
 *      The type of \p data must be void **.
 *      If there exists no host pointer value through which
 *      the host program may directly access \p ptr then 
 *      ::CUDA_ERROR_INVALID_VALUE is returned.
 * 
 *      Except in the exceptional disjoint addressing cases discussed 
 *      below, the value returned in \p *data will equal the input 
 *      value \p ptr.
 *
 * - ::CU_POINTER_ATTRIBUTE_P2P_TOKENS:
 *
 *      Returns in \p *data two tokens for use with the nv-p2p.h Linux
 *      kernel interface. \p data must be a struct of type
 *      CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.
 *
 *      \p ptr must be a pointer to memory obtained from :cuMemAlloc().
 *      Note that p2pToken and vaSpaceToken are only valid for the
 *      lifetime of the source allocation. A subsequent allocation at
 *      the same address may return completely different tokens.
 *      Querying this attribute has a side effect of setting the attribute
 *      ::CU_POINTER_ATTRIBUTE_SYNC_MEMOPS for the region of memory that
 *      \p ptr points to.
 * 
 * - ::CU_POINTER_ATTRIBUTE_SYNC_MEMOPS:
 *
 *      A boolean attribute which when set, ensures that synchronous memory operations
 *      initiated on the region of memory that \p ptr points to will always synchronize.
 *      See further documentation in the section titled "API synchronization behavior"
 *      to learn more about cases when synchronous memory operations can
 *      exhibit asynchronous behavior.
 *
 * - ::CU_POINTER_ATTRIBUTE_BUFFER_ID:
 *
 *      Returns in \p *data a buffer ID which is guaranteed to be unique within the process.
 *      \p data must point to an unsigned long long.
 *
 *      \p ptr must be a pointer to memory obtained from a CUDA memory allocation API.
 *      Every memory allocation from any of the CUDA memory allocation APIs will
 *      have a unique ID over a process lifetime. Subsequent allocations do not reuse IDs
 *      from previous freed allocations. IDs are only unique within a single process.
 *
 *
 * - ::CU_POINTER_ATTRIBUTE_IS_MANAGED:
 *
 *      Returns in \p *data a boolean that indicates whether the pointer points to
 *      managed memory or not.
 *
 * \par
 *
 * Note that for most allocations in the unified virtual address space
 * the host and device pointer for accessing the allocation will be the 
 * same.  The exceptions to this are
 *  - user memory registered using ::cuMemHostRegister 
 *  - host memory allocated using ::cuMemHostAlloc with the 
 *    ::CU_MEMHOSTALLOC_WRITECOMBINED flag
 * For these types of allocation there will exist separate, disjoint host 
 * and device addresses for accessing the allocation.  In particular 
 *  - The host address will correspond to an invalid unmapped device address 
 *    (which will result in an exception if accessed from the device) 
 *  - The device address will correspond to an invalid unmapped host address 
 *    (which will result in an exception if accessed from the host).
 * For these types of allocations, querying ::CU_POINTER_ATTRIBUTE_HOST_POINTER 
 * and ::CU_POINTER_ATTRIBUTE_DEVICE_POINTER may be used to retrieve the host 
 * and device addresses from either address.
 *
 * @param data      - Returned pointer attribute value
 * @param attribute - Pointer attribute to query
 * @param ptr       - Pointer
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa cuPointerSetAttribute,
 * ::cuMemAlloc,
 * ::cuMemFree,
 * ::cuMemAllocHost,
 * ::cuMemFreeHost,
 * ::cuMemHostAlloc,
 * ::cuMemHostRegister,
 * ::cuMemHostUnregister
 */
public static native @Cast("CUresult") int cuPointerGetAttribute(Pointer data, @Cast("CUpointer_attribute") int attribute, @Cast("CUdeviceptr") long ptr);
// #endif /* __CUDA_API_VERSION >= 4000 */

// #if __CUDA_API_VERSION >= 6000
/**
 * \brief Set attributes on a previously allocated memory region
 *
 * The supported attributes are:
 *
 * - ::CU_POINTER_ATTRIBUTE_SYNC_MEMOPS:
 *
 *      A boolean attribute that can either be set (1) or unset (0). When set,
 *      the region of memory that \p ptr points to is guaranteed to always synchronize
 *      memory operations that are synchronous. If there are some previously initiated
 *      synchronous memory operations that are pending when this attribute is set, the
 *      function does not return until those memory operations are complete.
 *      See further documentation in the section titled "API synchronization behavior"
 *      to learn more about cases when synchronous memory operations can
 *      exhibit asynchronous behavior.
 *      \p value will be considered as a pointer to an unsigned integer to which this attribute is to be set.
 *
 * @param value     - Pointer to memory containing the value to be set
 * @param attribute - Pointer attribute to set
 * @param ptr       - Pointer to a memory region allocated using CUDA memory allocation APIs
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa ::cuPointerGetAttribute,
 * ::cuPointerGetAttributes,
 * ::cuMemAlloc,
 * ::cuMemFree,
 * ::cuMemAllocHost,
 * ::cuMemFreeHost,
 * ::cuMemHostAlloc,
 * ::cuMemHostRegister,
 * ::cuMemHostUnregister
 */
public static native @Cast("CUresult") int cuPointerSetAttribute(@Const Pointer value, @Cast("CUpointer_attribute") int attribute, @Cast("CUdeviceptr") long ptr);
// #endif /* __CUDA_API_VERSION >= 6000 */

// #if __CUDA_API_VERSION >= 7000
/**
 * \brief Returns information about a pointer.
 *
 * The supported attributes are (refer to ::cuPointerGetAttribute for attribute descriptions and restrictions):
 *
 * - ::CU_POINTER_ATTRIBUTE_CONTEXT
 * - ::CU_POINTER_ATTRIBUTE_MEMORY_TYPE
 * - ::CU_POINTER_ATTRIBUTE_DEVICE_POINTER
 * - ::CU_POINTER_ATTRIBUTE_HOST_POINTER
 * - ::CU_POINTER_ATTRIBUTE_SYNC_MEMOPS
 * - ::CU_POINTER_ATTRIBUTE_BUFFER_ID
 * - ::CU_POINTER_ATTRIBUTE_IS_MANAGED
 *
 * @param numAttributes - Number of attributes to query
 * @param attributes    - An array of attributes to query
 *                      (numAttributes and the number of attributes in this array should match)
 * @param data          - A two-dimensional array containing pointers to memory
 *                      locations where the result of each attribute query will be written to.
 * @param ptr           - Pointer to query
 *
 * Unlike ::cuPointerGetAttribute, this function will not return an error when the \p ptr
 * encountered is not a valid CUDA pointer. Instead, the attributes are assigned default NULL values
 * and CUDA_SUCCESS is returned.
 *
 * If \p ptr was not allocated by, mapped by, or registered with a ::CUcontext which uses UVA
 * (Unified Virtual Addressing), ::CUDA_ERROR_INVALID_CONTEXT is returned.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa ::cuPointerGetAttribute,
 * ::cuPointerSetAttribute
 */
public static native @Cast("CUresult") int cuPointerGetAttributes(@Cast("unsigned int") int numAttributes, @Cast("CUpointer_attribute*") IntPointer attributes, @Cast("void**") PointerPointer data, @Cast("CUdeviceptr") long ptr);
public static native @Cast("CUresult") int cuPointerGetAttributes(@Cast("unsigned int") int numAttributes, @Cast("CUpointer_attribute*") IntPointer attributes, @Cast("void**") @ByPtrPtr Pointer data, @Cast("CUdeviceptr") long ptr);
public static native @Cast("CUresult") int cuPointerGetAttributes(@Cast("unsigned int") int numAttributes, @Cast("CUpointer_attribute*") IntBuffer attributes, @Cast("void**") @ByPtrPtr Pointer data, @Cast("CUdeviceptr") long ptr);
public static native @Cast("CUresult") int cuPointerGetAttributes(@Cast("unsigned int") int numAttributes, @Cast("CUpointer_attribute*") int[] attributes, @Cast("void**") @ByPtrPtr Pointer data, @Cast("CUdeviceptr") long ptr);
// #endif /* __CUDA_API_VERSION >= 7000 */

/** \} */ /* END CUDA_UNIFIED */

/**
 * \defgroup CUDA_STREAM Stream Management
 *
 * ___MANBRIEF___ stream management functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the stream management functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

/**
 * \brief Create a stream
 *
 * Creates a stream and returns a handle in \p phStream.  The \p Flags argument
 * determines behaviors of the stream.  Valid values for \p Flags are:
 * - ::CU_STREAM_DEFAULT: Default stream creation flag.
 * - ::CU_STREAM_NON_BLOCKING: Specifies that work running in the created 
 *   stream may run concurrently with work in stream 0 (the NULL stream), and that
 *   the created stream should perform no implicit synchronization with stream 0.
 *
 * @param phStream - Returned newly created stream
 * @param Flags    - Parameters for stream creation
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuStreamDestroy,
 * ::cuStreamCreateWithPriority,
 * ::cuStreamGetPriority,
 * ::cuStreamGetFlags,
 * ::cuStreamWaitEvent,
 * ::cuStreamQuery,
 * ::cuStreamSynchronize,
 * ::cuStreamAddCallback
 */
public static native @Cast("CUresult") int cuStreamCreate(@ByPtrPtr CUstream_st phStream, @Cast("unsigned int") int Flags);

/**
 * \brief Create a stream with the given priority
 *
 * Creates a stream with the specified priority and returns a handle in \p phStream.
 * This API alters the scheduler priority of work in the stream. Work in a higher
 * priority stream may preempt work already executing in a low priority stream.
 *
 * \p priority follows a convention where lower numbers represent higher priorities.
 * '0' represents default priority. The range of meaningful numerical priorities can
 * be queried using ::cuCtxGetStreamPriorityRange. If the specified priority is
 * outside the numerical range returned by ::cuCtxGetStreamPriorityRange,
 * it will automatically be clamped to the lowest or the highest number in the range.
 *
 * @param phStream    - Returned newly created stream
 * @param flags       - Flags for stream creation. See ::cuStreamCreate for a list of
 *                      valid flags
 * @param priority    - Stream priority. Lower numbers represent higher priorities.
 *                      See ::cuCtxGetStreamPriorityRange for more information about
 *                      meaningful stream priorities that can be passed.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \note Stream priorities are supported only on Quadro and Tesla GPUs
 * with compute capability 3.5 or higher.
 *
 * \note In the current implementation, only compute kernels launched in
 * priority streams are affected by the stream's priority. Stream priorities have
 * no effect on host-to-device and device-to-host memory operations.
 *
 * \sa ::cuStreamDestroy,
 * ::cuStreamCreate,
 * ::cuStreamGetPriority,
 * ::cuCtxGetStreamPriorityRange,
 * ::cuStreamGetFlags,
 * ::cuStreamWaitEvent,
 * ::cuStreamQuery,
 * ::cuStreamSynchronize,
 * ::cuStreamAddCallback
 */
public static native @Cast("CUresult") int cuStreamCreateWithPriority(@ByPtrPtr CUstream_st phStream, @Cast("unsigned int") int flags, int priority);


/**
 * \brief Query the priority of a given stream
 *
 * Query the priority of a stream created using ::cuStreamCreate or ::cuStreamCreateWithPriority
 * and return the priority in \p priority. Note that if the stream was created with a
 * priority outside the numerical range returned by ::cuCtxGetStreamPriorityRange,
 * this function returns the clamped priority.
 * See ::cuStreamCreateWithPriority for details about priority clamping.
 *
 * @param hStream    - Handle to the stream to be queried
 * @param priority   - Pointer to a signed integer in which the stream's priority is returned
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuStreamDestroy,
 * ::cuStreamCreate,
 * ::cuStreamCreateWithPriority,
 * ::cuCtxGetStreamPriorityRange,
 * ::cuStreamGetFlags
 */
public static native @Cast("CUresult") int cuStreamGetPriority(CUstream_st hStream, IntPointer priority);
public static native @Cast("CUresult") int cuStreamGetPriority(CUstream_st hStream, IntBuffer priority);
public static native @Cast("CUresult") int cuStreamGetPriority(CUstream_st hStream, int[] priority);

/**
 * \brief Query the flags of a given stream
 *
 * Query the flags of a stream created using ::cuStreamCreate or ::cuStreamCreateWithPriority
 * and return the flags in \p flags.
 *
 * @param hStream    - Handle to the stream to be queried
 * @param flags      - Pointer to an unsigned integer in which the stream's flags are returned
 *                     The value returned in \p flags is a logical 'OR' of all flags that
 *                     were used while creating this stream. See ::cuStreamCreate for the list
 *                     of valid flags
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa ::cuStreamDestroy,
 * ::cuStreamCreate,
 * ::cuStreamGetPriority
 */
public static native @Cast("CUresult") int cuStreamGetFlags(CUstream_st hStream, @Cast("unsigned int*") IntPointer flags);
public static native @Cast("CUresult") int cuStreamGetFlags(CUstream_st hStream, @Cast("unsigned int*") IntBuffer flags);
public static native @Cast("CUresult") int cuStreamGetFlags(CUstream_st hStream, @Cast("unsigned int*") int[] flags);


/**
 * \brief Make a compute stream wait on an event
 *
 * Makes all future work submitted to \p hStream wait until \p hEvent
 * reports completion before beginning execution.  This synchronization
 * will be performed efficiently on the device.  The event \p hEvent may
 * be from a different context than \p hStream, in which case this function
 * will perform cross-device synchronization.
 *
 * The stream \p hStream will wait only for the completion of the most recent
 * host call to ::cuEventRecord() on \p hEvent.  Once this call has returned,
 * any functions (including ::cuEventRecord() and ::cuEventDestroy()) may be
 * called on \p hEvent again, and subsequent calls will not have any
 * effect on \p hStream.
 *
 * If ::cuEventRecord() has not been called on \p hEvent, this call acts as if
 * the record has already completed, and so is a functional no-op.
 *
 * @param hStream - Stream to wait
 * @param hEvent  - Event to wait on (may not be NULL)
 * @param Flags   - Parameters for the operation (must be 0)
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuStreamCreate,
 * ::cuEventRecord,
 * ::cuStreamQuery,
 * ::cuStreamSynchronize,
 * ::cuStreamAddCallback,
 * ::cuStreamDestroy
 */
public static native @Cast("CUresult") int cuStreamWaitEvent(CUstream_st hStream, CUevent_st hEvent, @Cast("unsigned int") int Flags);

/**
 * \brief Add a callback to a compute stream
 *
 * Adds a callback to be called on the host after all currently enqueued
 * items in the stream have completed.  For each 
 * cuStreamAddCallback call, the callback will be executed exactly once.
 * The callback will block later work in the stream until it is finished.
 *
 * The callback may be passed ::CUDA_SUCCESS or an error code.  In the event
 * of a device error, all subsequently executed callbacks will receive an
 * appropriate ::CUresult.
 *
 * Callbacks must not make any CUDA API calls.  Attempting to use a CUDA API
 * will result in ::CUDA_ERROR_NOT_PERMITTED.  Callbacks must not perform any
 * synchronization that may depend on outstanding device work or other callbacks
 * that are not mandated to run earlier.  Callbacks without a mandated order
 * (in independent streams) execute in undefined order and may be serialized.
 *
 * This API requires compute capability 1.1 or greater.  See
 * ::cuDeviceGetAttribute or ::cuDeviceGetProperties to query compute
 * capability.  Attempting to use this API with earlier compute versions will
 * return ::CUDA_ERROR_NOT_SUPPORTED.
 *
 * For the purposes of Unified Memory, callback execution makes a number of
 * guarantees:
 * <ul>
 *   <li>The callback stream is considered idle for the duration of the
 *   callback.  Thus, for example, a callback may always use memory attached
 *   to the callback stream.</li>
 *   <li>The start of execution of a callback has the same effect as
 *   synchronizing an event recorded in the same stream immediately prior to
 *   the callback.  It thus synchronizes streams which have been "joined"
 *   prior to the callback.</li>
 *   <li>Adding device work to any stream does not have the effect of making
 *   the stream active until all preceding callbacks have executed.  Thus, for
 *   example, a callback might use global attached memory even if work has
 *   been added to another stream, if it has been properly ordered with an
 *   event.</li>
 *   <li>Completion of a callback does not cause a stream to become
 *   active except as described above.  The callback stream will remain idle
 *   if no device work follows the callback, and will remain idle across
 *   consecutive callbacks without device work in between.  Thus, for example,
 *   stream synchronization can be done by signaling from a callback at the
 *   end of the stream.</li>
 * </ul>
 *
 * @param hStream  - Stream to add callback to
 * @param callback - The function to call once preceding stream operations are complete
 * @param userData - User specified data to be passed to the callback function
 * @param flags    - Reserved for future use, must be 0
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_SUPPORTED
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuStreamCreate,
 * ::cuStreamQuery,
 * ::cuStreamSynchronize,
 * ::cuStreamWaitEvent,
 * ::cuStreamDestroy,
 * ::cuMemAllocManaged,
 * ::cuStreamAttachMemAsync
 */
public static native @Cast("CUresult") int cuStreamAddCallback(CUstream_st hStream, CUstreamCallback callback, Pointer userData, @Cast("unsigned int") int flags);

// #if __CUDA_API_VERSION >= 6000

/**
 * \brief Attach memory to a stream asynchronously
 *
 * Enqueues an operation in \p hStream to specify stream association of
 * \p length bytes of memory starting from \p dptr. This function is a
 * stream-ordered operation, meaning that it is dependent on, and will
 * only take effect when, previous work in stream has completed. Any
 * previous association is automatically replaced.
 *
 * \p dptr must point to an address within managed memory space declared
 * using the __managed__ keyword or allocated with ::cuMemAllocManaged.
 *
 * \p length must be zero, to indicate that the entire allocation's
 * stream association is being changed. Currently, it's not possible
 * to change stream association for a portion of an allocation.
 *
 * The stream association is specified using \p flags which must be
 * one of ::CUmemAttach_flags.
 * If the ::CU_MEM_ATTACH_GLOBAL flag is specified, the memory can be accessed
 * by any stream on any device.
 * If the ::CU_MEM_ATTACH_HOST flag is specified, the program makes a guarantee
 * that it won't access the memory on the device from any stream.
 * If the ::CU_MEM_ATTACH_SINGLE flag is specified, the program makes a guarantee
 * that it will only access the memory on the device from \p hStream. It is illegal
 * to attach singly to the NULL stream, because the NULL stream is a virtual global
 * stream and not a specific stream. An error will be returned in this case.
 *
 * When memory is associated with a single stream, the Unified Memory system will
 * allow CPU access to this memory region so long as all operations in \p hStream
 * have completed, regardless of whether other streams are active. In effect,
 * this constrains exclusive ownership of the managed memory region by
 * an active GPU to per-stream activity instead of whole-GPU activity.
 *
 * Accessing memory on the device from streams that are not associated with
 * it will produce undefined results. No error checking is performed by the
 * Unified Memory system to ensure that kernels launched into other streams
 * do not access this region. 
 *
 * It is a program's responsibility to order calls to ::cuStreamAttachMemAsync
 * via events, synchronization or other means to ensure legal access to memory
 * at all times. Data visibility and coherency will be changed appropriately
 * for all kernels which follow a stream-association change.
 *
 * If \p hStream is destroyed while data is associated with it, the association is
 * removed and the association reverts to the default visibility of the allocation
 * as specified at ::cuMemAllocManaged. For __managed__ variables, the default
 * association is always ::CU_MEM_ATTACH_GLOBAL. Note that destroying a stream is an
 * asynchronous operation, and as a result, the change to default association won't
 * happen until all work in the stream has completed.
 *
 * @param hStream - Stream in which to enqueue the attach operation
 * @param dptr    - Pointer to memory (must be a pointer to managed memory)
 * @param length  - Length of memory (must be zero)
 * @param flags   - Must be one of ::CUmemAttach_flags
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_SUPPORTED
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuStreamCreate,
 * ::cuStreamQuery,
 * ::cuStreamSynchronize,
 * ::cuStreamWaitEvent,
 * ::cuStreamDestroy,
 * ::cuMemAllocManaged
 */
public static native @Cast("CUresult") int cuStreamAttachMemAsync(CUstream_st hStream, @Cast("CUdeviceptr") long dptr, @Cast("size_t") long length, @Cast("unsigned int") int flags);

// #endif /* __CUDA_API_VERSION >= 6000 */

/**
 * \brief Determine status of a compute stream
 *
 * Returns ::CUDA_SUCCESS if all operations in the stream specified by
 * \p hStream have completed, or ::CUDA_ERROR_NOT_READY if not.
 *
 * For the purposes of Unified Memory, a return value of ::CUDA_SUCCESS
 * is equivalent to having called ::cuStreamSynchronize().
 *
 * @param hStream - Stream to query status of
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_READY
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuStreamCreate,
 * ::cuStreamWaitEvent,
 * ::cuStreamDestroy,
 * ::cuStreamSynchronize,
 * ::cuStreamAddCallback
 */
public static native @Cast("CUresult") int cuStreamQuery(CUstream_st hStream);

/**
 * \brief Wait until a stream's tasks are completed
 *
 * Waits until the device has completed all operations in the stream specified
 * by \p hStream. If the context was created with the 
 * ::CU_CTX_SCHED_BLOCKING_SYNC flag, the CPU thread will block until the
 * stream is finished with all of its tasks.
 *
 * @param hStream - Stream to wait for
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuStreamCreate,
 * ::cuStreamDestroy,
 * ::cuStreamWaitEvent,
 * ::cuStreamQuery,
 * ::cuStreamAddCallback
 */
public static native @Cast("CUresult") int cuStreamSynchronize(CUstream_st hStream);

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Destroys a stream
 *
 * Destroys the stream specified by \p hStream.  
 *
 * In case the device is still doing work in the stream \p hStream
 * when ::cuStreamDestroy() is called, the function will return immediately 
 * and the resources associated with \p hStream will be released automatically 
 * once the device has completed all work in \p hStream.
 *
 * @param hStream - Stream to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuStreamCreate,
 * ::cuStreamWaitEvent,
 * ::cuStreamQuery,
 * ::cuStreamSynchronize,
 * ::cuStreamAddCallback
 */
public static native @Cast("CUresult") int cuStreamDestroy(CUstream_st hStream);
// #endif /* __CUDA_API_VERSION >= 4000 */

/** \} */ /* END CUDA_STREAM */


/**
 * \defgroup CUDA_EVENT Event Management
 *
 * ___MANBRIEF___ event management functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the event management functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

/**
 * \brief Creates an event
 *
 * Creates an event *phEvent with the flags specified via \p Flags. Valid flags
 * include:
 * - ::CU_EVENT_DEFAULT: Default event creation flag.
 * - ::CU_EVENT_BLOCKING_SYNC: Specifies that the created event should use blocking
 *   synchronization.  A CPU thread that uses ::cuEventSynchronize() to wait on
 *   an event created with this flag will block until the event has actually
 *   been recorded.
 * - ::CU_EVENT_DISABLE_TIMING: Specifies that the created event does not need
 *   to record timing data.  Events created with this flag specified and
 *   the ::CU_EVENT_BLOCKING_SYNC flag not specified will provide the best
 *   performance when used with ::cuStreamWaitEvent() and ::cuEventQuery().
 * - ::CU_EVENT_INTERPROCESS: Specifies that the created event may be used as an
 *   interprocess event by ::cuIpcGetEventHandle(). ::CU_EVENT_INTERPROCESS must
 *   be specified along with ::CU_EVENT_DISABLE_TIMING.
 *
 * @param phEvent - Returns newly created event
 * @param Flags   - Event creation flags
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_OUT_OF_MEMORY
 * \notefnerr
 *
 * \sa
 * ::cuEventRecord,
 * ::cuEventQuery,
 * ::cuEventSynchronize,
 * ::cuEventDestroy,
 * ::cuEventElapsedTime
 */
public static native @Cast("CUresult") int cuEventCreate(@ByPtrPtr CUevent_st phEvent, @Cast("unsigned int") int Flags);

/**
 * \brief Records an event
 *
 * Records an event. See note on NULL stream behavior. Since operation is
 * asynchronous, ::cuEventQuery or ::cuEventSynchronize() must be used
 * to determine when the event has actually been recorded.
 *
 * If ::cuEventRecord() has previously been called on \p hEvent, then this
 * call will overwrite any existing state in \p hEvent.  Any subsequent calls
 * which examine the status of \p hEvent will only examine the completion of
 * this most recent call to ::cuEventRecord().
 *
 * It is necessary that \p hEvent and \p hStream be created on the same context.
 *
 * @param hEvent  - Event to record
 * @param hStream - Stream to record event for
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuEventCreate,
 * ::cuEventQuery,
 * ::cuEventSynchronize,
 * ::cuStreamWaitEvent,
 * ::cuEventDestroy,
 * ::cuEventElapsedTime
 */
public static native @Cast("CUresult") int cuEventRecord(CUevent_st hEvent, CUstream_st hStream);

/**
 * \brief Queries an event's status
 *
 * Query the status of all device work preceding the most recent
 * call to ::cuEventRecord() (in the appropriate compute streams,
 * as specified by the arguments to ::cuEventRecord()).
 *
 * If this work has successfully been completed by the device, or if
 * ::cuEventRecord() has not been called on \p hEvent, then ::CUDA_SUCCESS is
 * returned. If this work has not yet been completed by the device then
 * ::CUDA_ERROR_NOT_READY is returned.
 *
 * For the purposes of Unified Memory, a return value of ::CUDA_SUCCESS
 * is equivalent to having called ::cuEventSynchronize().
 *
 * @param hEvent - Event to query
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_NOT_READY
 * \notefnerr
 *
 * \sa ::cuEventCreate,
 * ::cuEventRecord,
 * ::cuEventSynchronize,
 * ::cuEventDestroy,
 * ::cuEventElapsedTime
 */
public static native @Cast("CUresult") int cuEventQuery(CUevent_st hEvent);

/**
 * \brief Waits for an event to complete
 *
 * Wait until the completion of all device work preceding the most recent
 * call to ::cuEventRecord() (in the appropriate compute streams, as specified
 * by the arguments to ::cuEventRecord()).
 *
 * If ::cuEventRecord() has not been called on \p hEvent, ::CUDA_SUCCESS is
 * returned immediately.
 *
 * Waiting for an event that was created with the ::CU_EVENT_BLOCKING_SYNC
 * flag will cause the calling CPU thread to block until the event has
 * been completed by the device.  If the ::CU_EVENT_BLOCKING_SYNC flag has
 * not been set, then the CPU thread will busy-wait until the event has
 * been completed by the device.
 *
 * @param hEvent - Event to wait for
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE
 * \notefnerr
 *
 * \sa ::cuEventCreate,
 * ::cuEventRecord,
 * ::cuEventQuery,
 * ::cuEventDestroy,
 * ::cuEventElapsedTime
 */
public static native @Cast("CUresult") int cuEventSynchronize(CUevent_st hEvent);

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Destroys an event
 *
 * Destroys the event specified by \p hEvent.
 *
 * In case \p hEvent has been recorded but has not yet been completed
 * when ::cuEventDestroy() is called, the function will return immediately and 
 * the resources associated with \p hEvent will be released automatically once
 * the device has completed \p hEvent.
 *
 * @param hEvent - Event to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE
 * \notefnerr
 *
 * \sa ::cuEventCreate,
 * ::cuEventRecord,
 * ::cuEventQuery,
 * ::cuEventSynchronize,
 * ::cuEventElapsedTime
 */
public static native @Cast("CUresult") int cuEventDestroy(CUevent_st hEvent);
// #endif /* __CUDA_API_VERSION >= 4000 */

/**
 * \brief Computes the elapsed time between two events
 *
 * Computes the elapsed time between two events (in milliseconds with a
 * resolution of around 0.5 microseconds).
 *
 * If either event was last recorded in a non-NULL stream, the resulting time
 * may be greater than expected (even if both used the same stream handle). This
 * happens because the ::cuEventRecord() operation takes place asynchronously
 * and there is no guarantee that the measured latency is actually just between
 * the two events. Any number of other different stream operations could execute
 * in between the two measured events, thus altering the timing in a significant
 * way.
 *
 * If ::cuEventRecord() has not been called on either event then
 * ::CUDA_ERROR_INVALID_HANDLE is returned. If ::cuEventRecord() has been called
 * on both events but one or both of them has not yet been completed (that is,
 * ::cuEventQuery() would return ::CUDA_ERROR_NOT_READY on at least one of the
 * events), ::CUDA_ERROR_NOT_READY is returned. If either event was created with
 * the ::CU_EVENT_DISABLE_TIMING flag, then this function will return
 * ::CUDA_ERROR_INVALID_HANDLE.
 *
 * @param pMilliseconds - Time between \p hStart and \p hEnd in ms
 * @param hStart        - Starting event
 * @param hEnd          - Ending event
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_READY
 * \notefnerr
 *
 * \sa ::cuEventCreate,
 * ::cuEventRecord,
 * ::cuEventQuery,
 * ::cuEventSynchronize,
 * ::cuEventDestroy
 */
public static native @Cast("CUresult") int cuEventElapsedTime(FloatPointer pMilliseconds, CUevent_st hStart, CUevent_st hEnd);
public static native @Cast("CUresult") int cuEventElapsedTime(FloatBuffer pMilliseconds, CUevent_st hStart, CUevent_st hEnd);
public static native @Cast("CUresult") int cuEventElapsedTime(float[] pMilliseconds, CUevent_st hStart, CUevent_st hEnd);

/** \} */ /* END CUDA_EVENT */

/**
 * \defgroup CUDA_EXEC Execution Control
 *
 * ___MANBRIEF___ execution control functions of the low-level CUDA driver API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the execution control functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

/**
 * \brief Returns information about a function
 *
 * Returns in \p *pi the integer value of the attribute \p attrib on the kernel
 * given by \p hfunc. The supported attributes are:
 * - ::CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK: The maximum number of threads
 *   per block, beyond which a launch of the function would fail. This number
 *   depends on both the function and the device on which the function is
 *   currently loaded.
 * - ::CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES: The size in bytes of
 *   statically-allocated shared memory per block required by this function.
 *   This does not include dynamically-allocated shared memory requested by
 *   the user at runtime.
 * - ::CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES: The size in bytes of user-allocated
 *   constant memory required by this function.
 * - ::CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES: The size in bytes of local memory
 *   used by each thread of this function.
 * - ::CU_FUNC_ATTRIBUTE_NUM_REGS: The number of registers used by each thread
 *   of this function.
 * - ::CU_FUNC_ATTRIBUTE_PTX_VERSION: The PTX virtual architecture version for
 *   which the function was compiled. This value is the major PTX version * 10
 *   + the minor PTX version, so a PTX version 1.3 function would return the
 *   value 13. Note that this may return the undefined value of 0 for cubins
 *   compiled prior to CUDA 3.0.
 * - ::CU_FUNC_ATTRIBUTE_BINARY_VERSION: The binary architecture version for
 *   which the function was compiled. This value is the major binary
 *   version * 10 + the minor binary version, so a binary version 1.3 function
 *   would return the value 13. Note that this will return a value of 10 for
 *   legacy cubins that do not have a properly-encoded binary architecture
 *   version.
 * - ::CU_FUNC_CACHE_MODE_CA: The attribute to indicate whether the function has  
 *   been compiled with user specified option "-Xptxas --dlcm=ca" set .
 *
 * @param pi     - Returned attribute value
 * @param attrib - Attribute requested
 * @param hfunc  - Function to query attribute of
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuCtxGetCacheConfig,
 * ::cuCtxSetCacheConfig,
 * ::cuFuncSetCacheConfig,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuFuncGetAttribute(IntPointer pi, @Cast("CUfunction_attribute") int attrib, CUfunc_st hfunc);
public static native @Cast("CUresult") int cuFuncGetAttribute(IntBuffer pi, @Cast("CUfunction_attribute") int attrib, CUfunc_st hfunc);
public static native @Cast("CUresult") int cuFuncGetAttribute(int[] pi, @Cast("CUfunction_attribute") int attrib, CUfunc_st hfunc);

/**
 * \brief Sets the preferred cache configuration for a device function
 *
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this sets through \p config the preferred cache configuration for
 * the device function \p hfunc. This is only a preference. The driver will use
 * the requested configuration if possible, but it is free to choose a different
 * configuration if required to execute \p hfunc.  Any context-wide preference
 * set via ::cuCtxSetCacheConfig() will be overridden by this per-function
 * setting unless the per-function setting is ::CU_FUNC_CACHE_PREFER_NONE. In
 * that case, the current context-wide setting will be used.
 *
 * This setting does nothing on devices where the size of the L1 cache and
 * shared memory are fixed.
 *
 * Launching a kernel with a different preference than the most recent
 * preference setting may insert a device-side synchronization point.
 *
 *
 * The supported cache configurations are:
 * - ::CU_FUNC_CACHE_PREFER_NONE: no preference for shared memory or L1 (default)
 * - ::CU_FUNC_CACHE_PREFER_SHARED: prefer larger shared memory and smaller L1 cache
 * - ::CU_FUNC_CACHE_PREFER_L1: prefer larger L1 cache and smaller shared memory
 * - ::CU_FUNC_CACHE_PREFER_EQUAL: prefer equal sized L1 cache and shared memory
 *
 * @param hfunc  - Kernel to configure cache for
 * @param config - Requested cache configuration
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT
 * \notefnerr
 *
 * \sa ::cuCtxGetCacheConfig,
 * ::cuCtxSetCacheConfig,
 * ::cuFuncGetAttribute,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuFuncSetCacheConfig(CUfunc_st hfunc, @Cast("CUfunc_cache") int config);

// #if __CUDA_API_VERSION >= 4020
/**
 * \brief Sets the shared memory configuration for a device function.
 *
 * On devices with configurable shared memory banks, this function will 
 * force all subsequent launches of the specified device function to have
 * the given shared memory bank size configuration. On any given launch of the
 * function, the shared memory configuration of the device will be temporarily
 * changed if needed to suit the function's preferred configuration. Changes in
 * shared memory configuration between subsequent launches of functions, 
 * may introduce a device side synchronization point.
 *
 * Any per-function setting of shared memory bank size set via 
 * ::cuFuncSetSharedMemConfig will override the context wide setting set with
 * ::cuCtxSetSharedMemConfig.
 *
 * Changing the shared memory bank size will not increase shared memory usage
 * or affect occupancy of kernels, but may have major effects on performance. 
 * Larger bank sizes will allow for greater potential bandwidth to shared memory,
 * but will change what kinds of accesses to shared memory will result in bank 
 * conflicts.
 *
 * This function will do nothing on devices with fixed shared memory bank size.
 *
 * The supported bank configurations are:
 * - ::CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE: use the context's shared memory 
 *   configuration when launching this function.
 * - ::CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE: set shared memory bank width to
 *   be natively four bytes when launching this function.
 * - ::CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE: set shared memory bank width to
 *   be natively eight bytes when launching this function.
 *
 * @param hfunc  - kernel to be given a shared memory config
 * @param config - requested shared memory configuration
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT
 * \notefnerr
 *
 * \sa ::cuCtxGetCacheConfig,
 * ::cuCtxSetCacheConfig,
 * ::cuCtxGetSharedMemConfig,
 * ::cuCtxSetSharedMemConfig,
 * ::cuFuncGetAttribute,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuFuncSetSharedMemConfig(CUfunc_st hfunc, @Cast("CUsharedconfig") int config);
// #endif

// #if __CUDA_API_VERSION >= 4000
/**
 * \brief Launches a CUDA function
 *
 * Invokes the kernel \p f on a \p gridDimX x \p gridDimY x \p gridDimZ
 * grid of blocks. Each block contains \p blockDimX x \p blockDimY x
 * \p blockDimZ threads.
 *
 * \p sharedMemBytes sets the amount of dynamic shared memory that will be
 * available to each thread block.
 *
 * Kernel parameters to \p f can be specified in one of two ways:
 *
 * 1) Kernel parameters can be specified via \p kernelParams.  If \p f
 * has N parameters, then \p kernelParams needs to be an array of N
 * pointers.  Each of \p kernelParams[0] through \p kernelParams[N-1]
 * must point to a region of memory from which the actual kernel
 * parameter will be copied.  The number of kernel parameters and their
 * offsets and sizes do not need to be specified as that information is
 * retrieved directly from the kernel's image.
 *
 * 2) Kernel parameters can also be packaged by the application into
 * a single buffer that is passed in via the \p extra parameter.
 * This places the burden on the application of knowing each kernel
 * parameter's size and alignment/padding within the buffer.  Here is
 * an example of using the \p extra parameter in this manner:
 * <pre>{@code
    size_t argBufferSize;
    char argBuffer[256];

    // populate argBuffer and argBufferSize

    void *config[] = {
        CU_LAUNCH_PARAM_BUFFER_POINTER, argBuffer,
        CU_LAUNCH_PARAM_BUFFER_SIZE,    &argBufferSize,
        CU_LAUNCH_PARAM_END
    };
    status = cuLaunchKernel(f, gx, gy, gz, bx, by, bz, sh, s, NULL, config);
 * }</pre>
 *
 * The \p extra parameter exists to allow ::cuLaunchKernel to take
 * additional less commonly used arguments.  \p extra specifies a list of
 * names of extra settings and their corresponding values.  Each extra
 * setting name is immediately followed by the corresponding value.  The
 * list must be terminated with either NULL or ::CU_LAUNCH_PARAM_END.
 *
 * - ::CU_LAUNCH_PARAM_END, which indicates the end of the \p extra
 *   array;
 * - ::CU_LAUNCH_PARAM_BUFFER_POINTER, which specifies that the next
 *   value in \p extra will be a pointer to a buffer containing all
 *   the kernel parameters for launching kernel \p f;
 * - ::CU_LAUNCH_PARAM_BUFFER_SIZE, which specifies that the next
 *   value in \p extra will be a pointer to a size_t containing the
 *   size of the buffer specified with ::CU_LAUNCH_PARAM_BUFFER_POINTER;
 *
 * The error ::CUDA_ERROR_INVALID_VALUE will be returned if kernel
 * parameters are specified with both \p kernelParams and \p extra
 * (i.e. both \p kernelParams and \p extra are non-NULL).
 *
 * Calling ::cuLaunchKernel() sets persistent function state that is
 * the same as function state set through the following deprecated APIs:
 *  ::cuFuncSetBlockShape(),
 *  ::cuFuncSetSharedSize(),
 *  ::cuParamSetSize(),
 *  ::cuParamSeti(),
 *  ::cuParamSetf(),
 *  ::cuParamSetv().
 *
 * When the kernel \p f is launched via ::cuLaunchKernel(), the previous
 * block shape, shared size and parameter info associated with \p f
 * is overwritten.
 *
 * Note that to use ::cuLaunchKernel(), the kernel \p f must either have
 * been compiled with toolchain version 3.2 or later so that it will
 * contain kernel parameter information, or have no kernel parameters.
 * If either of these conditions is not met, then ::cuLaunchKernel() will
 * return ::CUDA_ERROR_INVALID_IMAGE.
 *
 * @param f              - Kernel to launch
 * @param gridDimX       - Width of grid in blocks
 * @param gridDimY       - Height of grid in blocks
 * @param gridDimZ       - Depth of grid in blocks
 * @param blockDimX      - X dimension of each thread block
 * @param blockDimY      - Y dimension of each thread block
 * @param blockDimZ      - Z dimension of each thread block
 * @param sharedMemBytes - Dynamic shared-memory size per thread block in bytes
 * @param hStream        - Stream identifier
 * @param kernelParams   - Array of pointers to kernel parameters
 * @param extra          - Extra options
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_IMAGE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_LAUNCH_FAILED,
 * ::CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES,
 * ::CUDA_ERROR_LAUNCH_TIMEOUT,
 * ::CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuCtxGetCacheConfig,
 * ::cuCtxSetCacheConfig,
 * ::cuFuncSetCacheConfig,
 * ::cuFuncGetAttribute
 */
public static native @Cast("CUresult") int cuLaunchKernel(CUfunc_st f,
                                @Cast("unsigned int") int gridDimX,
                                @Cast("unsigned int") int gridDimY,
                                @Cast("unsigned int") int gridDimZ,
                                @Cast("unsigned int") int blockDimX,
                                @Cast("unsigned int") int blockDimY,
                                @Cast("unsigned int") int blockDimZ,
                                @Cast("unsigned int") int sharedMemBytes,
                                CUstream_st hStream,
                                @Cast("void**") PointerPointer kernelParams,
                                @Cast("void**") PointerPointer extra);
public static native @Cast("CUresult") int cuLaunchKernel(CUfunc_st f,
                                @Cast("unsigned int") int gridDimX,
                                @Cast("unsigned int") int gridDimY,
                                @Cast("unsigned int") int gridDimZ,
                                @Cast("unsigned int") int blockDimX,
                                @Cast("unsigned int") int blockDimY,
                                @Cast("unsigned int") int blockDimZ,
                                @Cast("unsigned int") int sharedMemBytes,
                                CUstream_st hStream,
                                @Cast("void**") @ByPtrPtr Pointer kernelParams,
                                @Cast("void**") @ByPtrPtr Pointer extra);
// #endif /* __CUDA_API_VERSION >= 4000 */

/** \} */ /* END CUDA_EXEC */

/**
 * \defgroup CUDA_EXEC_DEPRECATED Execution Control [DEPRECATED]
 *
 * ___MANBRIEF___ deprecated execution control functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the deprecated execution control functions of the
 * low-level CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Sets the block-dimensions for the function
 *
 * @deprecated
 *
 * Specifies the \p x, \p y, and \p z dimensions of the thread blocks that are
 * created when the kernel given by \p hfunc is launched.
 *
 * @param hfunc - Kernel to specify dimensions of
 * @param x     - X dimension
 * @param y     - Y dimension
 * @param z     - Z dimension
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuFuncSetSharedSize,
 * ::cuFuncSetCacheConfig,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSeti,
 * ::cuParamSetf,
 * ::cuParamSetv,
 * ::cuLaunch,
 * ::cuLaunchGrid,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuFuncSetBlockShape(CUfunc_st hfunc, int x, int y, int z);

/**
 * \brief Sets the dynamic shared-memory size for the function
 *
 * @deprecated
 *
 * Sets through \p bytes the amount of dynamic shared memory that will be
 * available to each thread block when the kernel given by \p hfunc is launched.
 *
 * @param hfunc - Kernel to specify dynamic shared-memory size for
 * @param bytes - Dynamic shared-memory size per thread in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetCacheConfig,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSeti,
 * ::cuParamSetf,
 * ::cuParamSetv,
 * ::cuLaunch,
 * ::cuLaunchGrid,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuFuncSetSharedSize(CUfunc_st hfunc, @Cast("unsigned int") int bytes);

/**
 * \brief Sets the parameter size for the function
 *
 * @deprecated
 *
 * Sets through \p numbytes the total size in bytes needed by the function
 * parameters of the kernel corresponding to \p hfunc.
 *
 * @param hfunc    - Kernel to set parameter size for
 * @param numbytes - Size of parameter list in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetSharedSize,
 * ::cuFuncGetAttribute,
 * ::cuParamSetf,
 * ::cuParamSeti,
 * ::cuParamSetv,
 * ::cuLaunch,
 * ::cuLaunchGrid,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuParamSetSize(CUfunc_st hfunc, @Cast("unsigned int") int numbytes);

/**
 * \brief Adds an integer parameter to the function's argument list
 *
 * @deprecated
 *
 * Sets an integer parameter that will be specified the next time the
 * kernel corresponding to \p hfunc will be invoked. \p offset is a byte offset.
 *
 * @param hfunc  - Kernel to add parameter to
 * @param offset - Offset to add parameter to argument list
 * @param value  - Value of parameter
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetSharedSize,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSetf,
 * ::cuParamSetv,
 * ::cuLaunch,
 * ::cuLaunchGrid,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuParamSeti(CUfunc_st hfunc, int offset, @Cast("unsigned int") int value);

/**
 * \brief Adds a floating-point parameter to the function's argument list
 *
 * @deprecated
 *
 * Sets a floating-point parameter that will be specified the next time the
 * kernel corresponding to \p hfunc will be invoked. \p offset is a byte offset.
 *
 * @param hfunc  - Kernel to add parameter to
 * @param offset - Offset to add parameter to argument list
 * @param value  - Value of parameter
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetSharedSize,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSeti,
 * ::cuParamSetv,
 * ::cuLaunch,
 * ::cuLaunchGrid,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuParamSetf(CUfunc_st hfunc, int offset, float value);

/**
 * \brief Adds arbitrary data to the function's argument list
 *
 * @deprecated
 *
 * Copies an arbitrary amount of data (specified in \p numbytes) from \p ptr
 * into the parameter space of the kernel corresponding to \p hfunc. \p offset
 * is a byte offset.
 *
 * @param hfunc    - Kernel to add data to
 * @param offset   - Offset to add data to argument list
 * @param ptr      - Pointer to arbitrary data
 * @param numbytes - Size of data to copy in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetSharedSize,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSetf,
 * ::cuParamSeti,
 * ::cuLaunch,
 * ::cuLaunchGrid,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuParamSetv(CUfunc_st hfunc, int offset, Pointer ptr, @Cast("unsigned int") int numbytes);

/**
 * \brief Launches a CUDA function
 *
 * @deprecated
 *
 * Invokes the kernel \p f on a 1 x 1 x 1 grid of blocks. The block
 * contains the number of threads specified by a previous call to
 * ::cuFuncSetBlockShape().
 *
 * @param f - Kernel to launch
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_LAUNCH_FAILED,
 * ::CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES,
 * ::CUDA_ERROR_LAUNCH_TIMEOUT,
 * ::CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetSharedSize,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSetf,
 * ::cuParamSeti,
 * ::cuParamSetv,
 * ::cuLaunchGrid,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuLaunch(CUfunc_st f);

/**
 * \brief Launches a CUDA function
 *
 * @deprecated
 *
 * Invokes the kernel \p f on a \p grid_width x \p grid_height grid of
 * blocks. Each block contains the number of threads specified by a previous
 * call to ::cuFuncSetBlockShape().
 *
 * @param f           - Kernel to launch
 * @param grid_width  - Width of grid in blocks
 * @param grid_height - Height of grid in blocks
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_LAUNCH_FAILED,
 * ::CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES,
 * ::CUDA_ERROR_LAUNCH_TIMEOUT,
 * ::CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetSharedSize,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSetf,
 * ::cuParamSeti,
 * ::cuParamSetv,
 * ::cuLaunch,
 * ::cuLaunchGridAsync,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuLaunchGrid(CUfunc_st f, int grid_width, int grid_height);

/**
 * \brief Launches a CUDA function
 *
 * @deprecated
 *
 * Invokes the kernel \p f on a \p grid_width x \p grid_height grid of
 * blocks. Each block contains the number of threads specified by a previous
 * call to ::cuFuncSetBlockShape().
 *
 * @param f           - Kernel to launch
 * @param grid_width  - Width of grid in blocks
 * @param grid_height - Height of grid in blocks
 * @param hStream     - Stream identifier
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_LAUNCH_FAILED,
 * ::CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES,
 * ::CUDA_ERROR_LAUNCH_TIMEOUT,
 * ::CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING,
 * ::CUDA_ERROR_SHARED_OBJECT_INIT_FAILED
 *
 * \note In certain cases where cubins are created with no ABI (i.e., using \p ptxas \p --abi-compile \p no), 
 *       this function may serialize kernel launches. In order to force the CUDA driver to retain 
 *		 asynchronous behavior, set the ::CU_CTX_LMEM_RESIZE_TO_MAX flag during context creation (see ::cuCtxCreate).
 *       
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cuFuncSetBlockShape,
 * ::cuFuncSetSharedSize,
 * ::cuFuncGetAttribute,
 * ::cuParamSetSize,
 * ::cuParamSetf,
 * ::cuParamSeti,
 * ::cuParamSetv,
 * ::cuLaunch,
 * ::cuLaunchGrid,
 * ::cuLaunchKernel
 */
public static native @Cast("CUresult") int cuLaunchGridAsync(CUfunc_st f, int grid_width, int grid_height, CUstream_st hStream);


/**
 * \brief Adds a texture-reference to the function's argument list
 *
 * @deprecated
 *
 * Makes the CUDA array or linear memory bound to the texture reference
 * \p hTexRef available to a device program as a texture. In this version of
 * CUDA, the texture-reference must be obtained via ::cuModuleGetTexRef() and
 * the \p texunit parameter must be set to ::CU_PARAM_TR_DEFAULT.
 *
 * @param hfunc   - Kernel to add texture-reference to
 * @param texunit - Texture unit (must be ::CU_PARAM_TR_DEFAULT)
 * @param hTexRef - Texture-reference to add to argument list
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 */
public static native @Cast("CUresult") int cuParamSetTexRef(CUfunc_st hfunc, int texunit, CUtexref_st hTexRef);
/** \} */ /* END CUDA_EXEC_DEPRECATED */


// #if __CUDA_API_VERSION >= 6050
/**
 * \defgroup CUDA_OCCUPANCY Occupancy
 *
 * ___MANBRIEF___ occupancy calculation functions of the low-level CUDA driver
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the occupancy calculation functions of the low-level CUDA
 * driver application programming interface.
 *
 * \{
 */

/**
 * \brief Returns occupancy of a function
 *
 * Returns in \p *numBlocks the number of the maximum active blocks per
 * streaming multiprocessor.
 *
 * @param numBlocks       - Returned occupancy
 * @param func            - Kernel for which occupancy is calculated
 * @param blockSize       - Block size the kernel is intended to be launched with
 * @param dynamicSMemSize - Per-block dynamic shared memory usage intended, in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 */
public static native @Cast("CUresult") int cuOccupancyMaxActiveBlocksPerMultiprocessor(IntPointer numBlocks, CUfunc_st func, int blockSize, @Cast("size_t") long dynamicSMemSize);
public static native @Cast("CUresult") int cuOccupancyMaxActiveBlocksPerMultiprocessor(IntBuffer numBlocks, CUfunc_st func, int blockSize, @Cast("size_t") long dynamicSMemSize);
public static native @Cast("CUresult") int cuOccupancyMaxActiveBlocksPerMultiprocessor(int[] numBlocks, CUfunc_st func, int blockSize, @Cast("size_t") long dynamicSMemSize);

/**
 * \brief Returns occupancy of a function
 *
 * Returns in \p *numBlocks the number of the maximum active blocks per
 * streaming multiprocessor.
 *
 * The \p Flags parameter controls how special cases are handled. The
 * valid flags are:
 *
 * - ::CU_OCCUPANCY_DEFAULT, which maintains the default behavior as
 *   ::cuOccupancyMaxActiveBlocksPerMultiprocessor;
 *
 * - ::CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE, which suppresses the
 *   default behavior on platform where global caching affects
 *   occupancy. On such platforms, if caching is enabled, but
 *   per-block SM resource usage would result in zero occupancy, the
 *   occupancy calculator will calculate the occupancy as if caching
 *   is disabled. Setting ::CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE makes
 *   the occupancy calculator to return 0 in such cases. More information
 *   can be found about this feature in the "Unified L1/Texture Cache"
 *   section of the Maxwell tuning guide.
 *
 * @param numBlocks       - Returned occupancy
 * @param func            - Kernel for which occupancy is calculated
 * @param blockSize       - Block size the kernel is intended to be launched with
 * @param dynamicSMemSize - Per-block dynamic shared memory usage intended, in bytes
 * @param flags           - Requested behavior for the occupancy calculator
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 */
public static native @Cast("CUresult") int cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(IntPointer numBlocks, CUfunc_st func, int blockSize, @Cast("size_t") long dynamicSMemSize, @Cast("unsigned int") int flags);
public static native @Cast("CUresult") int cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(IntBuffer numBlocks, CUfunc_st func, int blockSize, @Cast("size_t") long dynamicSMemSize, @Cast("unsigned int") int flags);
public static native @Cast("CUresult") int cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(int[] numBlocks, CUfunc_st func, int blockSize, @Cast("size_t") long dynamicSMemSize, @Cast("unsigned int") int flags);
    
/**
 * \brief Suggest a launch configuration with reasonable occupancy
 *
 * Returns in \p *blockSize a reasonable block size that can achieve
 * the maximum occupancy (or, the maximum number of active warps with
 * the fewest blocks per multiprocessor), and in \p *minGridSize the
 * minimum grid size to achieve the maximum occupancy.
 *
 * If \p blockSizeLimit is 0, the configurator will use the maximum
 * block size permitted by the device / function instead.
 *
 * If per-block dynamic shared memory allocation is not needed, the
 * user should leave both \p blockSizeToDynamicSMemSize and \p
 * dynamicSMemSize as 0.
 *
 * If per-block dynamic shared memory allocation is needed, then if
 * the dynamic shared memory size is constant regardless of block
 * size, the size should be passed through \p dynamicSMemSize, and \p
 * blockSizeToDynamicSMemSize should be NULL.
 *
 * Otherwise, if the per-block dynamic shared memory size varies with
 * different block sizes, the user needs to provide a unary function
 * through \p blockSizeToDynamicSMemSize that computes the dynamic
 * shared memory needed by \p func for any given block size. \p
 * dynamicSMemSize is ignored. An example signature is:
 *
 * <pre>{@code
 *    // Take block size, returns dynamic shared memory needed
 *    size_t blockToSmem(int blockSize);
 * }</pre>
 *
 * @param minGridSize - Returned minimum grid size needed to achieve the maximum occupancy
 * @param blockSize   - Returned maximum block size that can achieve the maximum occupancy
 * @param func        - Kernel for which launch configuration is calculated
 * @param blockSizeToDynamicSMemSize - A function that calculates how much per-block dynamic shared memory \p func uses based on the block size
 * @param dynamicSMemSize - Dynamic shared memory usage intended, in bytes
 * @param blockSizeLimit  - The maximum block size \p func is designed to handle
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 */
public static native @Cast("CUresult") int cuOccupancyMaxPotentialBlockSize(IntPointer minGridSize, IntPointer blockSize, CUfunc_st func, CUoccupancyB2DSize blockSizeToDynamicSMemSize, @Cast("size_t") long dynamicSMemSize, int blockSizeLimit);
public static native @Cast("CUresult") int cuOccupancyMaxPotentialBlockSize(IntBuffer minGridSize, IntBuffer blockSize, CUfunc_st func, CUoccupancyB2DSize blockSizeToDynamicSMemSize, @Cast("size_t") long dynamicSMemSize, int blockSizeLimit);
public static native @Cast("CUresult") int cuOccupancyMaxPotentialBlockSize(int[] minGridSize, int[] blockSize, CUfunc_st func, CUoccupancyB2DSize blockSizeToDynamicSMemSize, @Cast("size_t") long dynamicSMemSize, int blockSizeLimit);

/**
 * \brief Suggest a launch configuration with reasonable occupancy
 *
 * An extended version of ::cuOccupancyMaxPotentialBlockSize. In
 * addition to arguments passed to ::cuOccupancyMaxPotentialBlockSize,
 * ::cuOccupancyMaxPotentialBlockSizeWithFlags also takes a \p Flags
 * parameter.
 *
 * The \p Flags parameter controls how special cases are handled. The
 * valid flags are:
 *
 * - ::CU_OCCUPANCY_DEFAULT, which maintains the default behavior as
 *   ::cuOccupancyMaxPotentialBlockSize;
 *
 * - ::CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE, which suppresses the
 *   default behavior on platform where global caching affects
 *   occupancy. On such platforms, the launch configurations that
 *   produces maximal occupancy might not support global
 *   caching. Setting ::CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE
 *   guarantees that the the produced launch configuration is global
 *   caching compatible at a potential cost of occupancy. More information
 *   can be found about this feature in the "Unified L1/Texture Cache"
 *   section of the Maxwell tuning guide.
 *
 * @param minGridSize - Returned minimum grid size needed to achieve the maximum occupancy
 * @param blockSize   - Returned maximum block size that can achieve the maximum occupancy
 * @param func        - Kernel for which launch configuration is calculated
 * @param blockSizeToDynamicSMemSize - A function that calculates how much per-block dynamic shared memory \p func uses based on the block size
 * @param dynamicSMemSize - Dynamic shared memory usage intended, in bytes
 * @param blockSizeLimit  - The maximum block size \p func is designed to handle
 * @param flags       - Options
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 */
public static native @Cast("CUresult") int cuOccupancyMaxPotentialBlockSizeWithFlags(IntPointer minGridSize, IntPointer blockSize, CUfunc_st func, CUoccupancyB2DSize blockSizeToDynamicSMemSize, @Cast("size_t") long dynamicSMemSize, int blockSizeLimit, @Cast("unsigned int") int flags);
public static native @Cast("CUresult") int cuOccupancyMaxPotentialBlockSizeWithFlags(IntBuffer minGridSize, IntBuffer blockSize, CUfunc_st func, CUoccupancyB2DSize blockSizeToDynamicSMemSize, @Cast("size_t") long dynamicSMemSize, int blockSizeLimit, @Cast("unsigned int") int flags);
public static native @Cast("CUresult") int cuOccupancyMaxPotentialBlockSizeWithFlags(int[] minGridSize, int[] blockSize, CUfunc_st func, CUoccupancyB2DSize blockSizeToDynamicSMemSize, @Cast("size_t") long dynamicSMemSize, int blockSizeLimit, @Cast("unsigned int") int flags);

/** \} */ /* END CUDA_OCCUPANCY */
// #endif /* __CUDA_API_VERSION >= 6050 */

/**
 * \defgroup CUDA_TEXREF Texture Reference Management
 *
 * ___MANBRIEF___ texture reference management functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the texture reference management functions of the
 * low-level CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Binds an array as a texture reference
 *
 * Binds the CUDA array \p hArray to the texture reference \p hTexRef. Any
 * previous address or CUDA array state associated with the texture reference
 * is superseded by this function. \p Flags must be set to
 * ::CU_TRSA_OVERRIDE_FORMAT. Any CUDA array previously bound to \p hTexRef is
 * unbound.
 *
 * @param hTexRef - Texture reference to bind
 * @param hArray  - Array to bind
 * @param Flags   - Options (must be ::CU_TRSA_OVERRIDE_FORMAT)
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetArray(CUtexref_st hTexRef, CUarray_st hArray, @Cast("unsigned int") int Flags);

/**
 * \brief Binds a mipmapped array to a texture reference
 *
 * Binds the CUDA mipmapped array \p hMipmappedArray to the texture reference \p hTexRef.
 * Any previous address or CUDA array state associated with the texture reference
 * is superseded by this function. \p Flags must be set to ::CU_TRSA_OVERRIDE_FORMAT. 
 * Any CUDA array previously bound to \p hTexRef is unbound.
 *
 * @param hTexRef         - Texture reference to bind
 * @param hMipmappedArray - Mipmapped array to bind
 * @param Flags           - Options (must be ::CU_TRSA_OVERRIDE_FORMAT)
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetMipmappedArray(CUtexref_st hTexRef, CUmipmappedArray_st hMipmappedArray, @Cast("unsigned int") int Flags);

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Binds an address as a texture reference
 *
 * Binds a linear address range to the texture reference \p hTexRef. Any
 * previous address or CUDA array state associated with the texture reference
 * is superseded by this function. Any memory previously bound to \p hTexRef
 * is unbound.
 *
 * Since the hardware enforces an alignment requirement on texture base
 * addresses, ::cuTexRefSetAddress() passes back a byte offset in
 * \p *ByteOffset that must be applied to texture fetches in order to read from
 * the desired memory. This offset must be divided by the texel size and
 * passed to kernels that read from the texture so they can be applied to the
 * ::tex1Dfetch() function.
 *
 * If the device memory pointer was returned from ::cuMemAlloc(), the offset
 * is guaranteed to be 0 and NULL may be passed as the \p ByteOffset parameter.
 *
 * The total number of elements (or texels) in the linear address range
 * cannot exceed ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH.
 * The number of elements is computed as (\p bytes / bytesPerElement),
 * where bytesPerElement is determined from the data format and number of 
 * components set using ::cuTexRefSetFormat().
 *
 * @param ByteOffset - Returned byte offset
 * @param hTexRef    - Texture reference to bind
 * @param dptr       - Device pointer to bind
 * @param bytes      - Size of memory to bind in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetAddress(@Cast("size_t*") SizeTPointer ByteOffset, CUtexref_st hTexRef, @Cast("CUdeviceptr") long dptr, @Cast("size_t") long bytes);

/**
 * \brief Binds an address as a 2D texture reference
 *
 * Binds a linear address range to the texture reference \p hTexRef. Any
 * previous address or CUDA array state associated with the texture reference
 * is superseded by this function. Any memory previously bound to \p hTexRef
 * is unbound.
 *
 * Using a ::tex2D() function inside a kernel requires a call to either
 * ::cuTexRefSetArray() to bind the corresponding texture reference to an
 * array, or ::cuTexRefSetAddress2D() to bind the texture reference to linear
 * memory.
 *
 * Function calls to ::cuTexRefSetFormat() cannot follow calls to
 * ::cuTexRefSetAddress2D() for the same texture reference.
 *
 * It is required that \p dptr be aligned to the appropriate hardware-specific
 * texture alignment. You can query this value using the device attribute
 * ::CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT. If an unaligned \p dptr is
 * supplied, ::CUDA_ERROR_INVALID_VALUE is returned.
 *
 * \p Pitch has to be aligned to the hardware-specific texture pitch alignment.
 * This value can be queried using the device attribute 
 * ::CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT. If an unaligned \p Pitch is 
 * supplied, ::CUDA_ERROR_INVALID_VALUE is returned.
 *
 * Width and Height, which are specified in elements (or texels), cannot exceed
 * ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH and
 * ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT respectively.
 * \p Pitch, which is specified in bytes, cannot exceed 
 * ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH.
 *
 * @param hTexRef - Texture reference to bind
 * @param desc    - Descriptor of CUDA array
 * @param dptr    - Device pointer to bind
 * @param Pitch   - Line pitch in bytes
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetAddress2D(CUtexref_st hTexRef, @Const CUDA_ARRAY_DESCRIPTOR desc, @Cast("CUdeviceptr") long dptr, @Cast("size_t") long Pitch);
// #endif /* __CUDA_API_VERSION >= 3020 */

/**
 * \brief Sets the format for a texture reference
 *
 * Specifies the format of the data to be read by the texture reference
 * \p hTexRef. \p fmt and \p NumPackedComponents are exactly analogous to the
 * ::Format and ::NumChannels members of the ::CUDA_ARRAY_DESCRIPTOR structure:
 * They specify the format of each component and the number of components per
 * array element.
 *
 * @param hTexRef             - Texture reference
 * @param fmt                 - Format to set
 * @param NumPackedComponents - Number of components per array element
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetFormat(CUtexref_st hTexRef, @Cast("CUarray_format") int fmt, int NumPackedComponents);

/**
 * \brief Sets the addressing mode for a texture reference
 *
 * Specifies the addressing mode \p am for the given dimension \p dim of the
 * texture reference \p hTexRef. If \p dim is zero, the addressing mode is
 * applied to the first parameter of the functions used to fetch from the
 * texture; if \p dim is 1, the second, and so on. ::CUaddress_mode is defined
 * as:
 * <pre>{@code
   typedef enum CUaddress_mode_enum {
      CU_TR_ADDRESS_MODE_WRAP = 0,
      CU_TR_ADDRESS_MODE_CLAMP = 1,
      CU_TR_ADDRESS_MODE_MIRROR = 2,
      CU_TR_ADDRESS_MODE_BORDER = 3
   } CUaddress_mode;
 * }</pre>
 *
 * Note that this call has no effect if \p hTexRef is bound to linear memory.
 * Also, if the flag, ::CU_TRSF_NORMALIZED_COORDINATES, is not set, the only 
 * supported address mode is ::CU_TR_ADDRESS_MODE_CLAMP.
 *
 * @param hTexRef - Texture reference
 * @param dim     - Dimension
 * @param am      - Addressing mode to set
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetAddressMode(CUtexref_st hTexRef, int dim, @Cast("CUaddress_mode") int am);

/**
 * \brief Sets the filtering mode for a texture reference
 *
 * Specifies the filtering mode \p fm to be used when reading memory through
 * the texture reference \p hTexRef. ::CUfilter_mode_enum is defined as:
 *
 * <pre>{@code
   typedef enum CUfilter_mode_enum {
      CU_TR_FILTER_MODE_POINT = 0,
      CU_TR_FILTER_MODE_LINEAR = 1
   } CUfilter_mode;
 * }</pre>
 *
 * Note that this call has no effect if \p hTexRef is bound to linear memory.
 *
 * @param hTexRef - Texture reference
 * @param fm      - Filtering mode to set
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetFilterMode(CUtexref_st hTexRef, @Cast("CUfilter_mode") int fm);

/**
 * \brief Sets the mipmap filtering mode for a texture reference
 *
 * Specifies the mipmap filtering mode \p fm to be used when reading memory through
 * the texture reference \p hTexRef. ::CUfilter_mode_enum is defined as:
 *
 * <pre>{@code
   typedef enum CUfilter_mode_enum {
      CU_TR_FILTER_MODE_POINT = 0,
      CU_TR_FILTER_MODE_LINEAR = 1
   } CUfilter_mode;
 * }</pre>
 *
 * Note that this call has no effect if \p hTexRef is not bound to a mipmapped array.
 *
 * @param hTexRef - Texture reference
 * @param fm      - Filtering mode to set
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetMipmapFilterMode(CUtexref_st hTexRef, @Cast("CUfilter_mode") int fm);

/**
 * \brief Sets the mipmap level bias for a texture reference
 *
 * Specifies the mipmap level bias \p bias to be added to the specified mipmap level when 
 * reading memory through the texture reference \p hTexRef.
 *
 * Note that this call has no effect if \p hTexRef is not bound to a mipmapped array.
 *
 * @param hTexRef - Texture reference
 * @param bias    - Mipmap level bias
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetMipmapLevelBias(CUtexref_st hTexRef, float bias);

/**
 * \brief Sets the mipmap min/max mipmap level clamps for a texture reference
 *
 * Specifies the min/max mipmap level clamps, \p minMipmapLevelClamp and \p maxMipmapLevelClamp
 * respectively, to be used when reading memory through the texture reference 
 * \p hTexRef.
 *
 * Note that this call has no effect if \p hTexRef is not bound to a mipmapped array.
 *
 * @param hTexRef        - Texture reference
 * @param minMipmapLevelClamp - Mipmap min level clamp
 * @param maxMipmapLevelClamp - Mipmap max level clamp
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetMipmapLevelClamp(CUtexref_st hTexRef, float minMipmapLevelClamp, float maxMipmapLevelClamp);

/**
 * \brief Sets the maximum anisotropy for a texture reference
 *
 * Specifies the maximum anisotropy \p maxAniso to be used when reading memory through
 * the texture reference \p hTexRef. 
 *
 * Note that this call has no effect if \p hTexRef is bound to linear memory.
 *
 * @param hTexRef  - Texture reference
 * @param maxAniso - Maximum anisotropy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetMaxAnisotropy(CUtexref_st hTexRef, @Cast("unsigned int") int maxAniso);

/**
 * \brief Sets the flags for a texture reference
 *
 * Specifies optional flags via \p Flags to specify the behavior of data
 * returned through the texture reference \p hTexRef. The valid flags are:
 *
 * - ::CU_TRSF_READ_AS_INTEGER, which suppresses the default behavior of
 *   having the texture promote integer data to floating point data in the
 *   range [0, 1]. Note that texture with 32-bit integer format
 *   would not be promoted, regardless of whether or not this
 *   flag is specified;
 * - ::CU_TRSF_NORMALIZED_COORDINATES, which suppresses the 
 *   default behavior of having the texture coordinates range
 *   from [0, Dim) where Dim is the width or height of the CUDA
 *   array. Instead, the texture coordinates [0, 1.0) reference
 *   the entire breadth of the array dimension;
 *
 * @param hTexRef - Texture reference
 * @param Flags   - Optional flags to set
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefSetFlags(CUtexref_st hTexRef, @Cast("unsigned int") int Flags);

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Gets the address associated with a texture reference
 *
 * Returns in \p *pdptr the base address bound to the texture reference
 * \p hTexRef, or returns ::CUDA_ERROR_INVALID_VALUE if the texture reference
 * is not bound to any device memory range.
 *
 * @param pdptr   - Returned device address
 * @param hTexRef - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetAddress(@Cast("CUdeviceptr*") LongPointer pdptr, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetAddress(@Cast("CUdeviceptr*") LongBuffer pdptr, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetAddress(@Cast("CUdeviceptr*") long[] pdptr, CUtexref_st hTexRef);
// #endif /* __CUDA_API_VERSION >= 3020 */

/**
 * \brief Gets the array bound to a texture reference
 *
 * Returns in \p *phArray the CUDA array bound to the texture reference
 * \p hTexRef, or returns ::CUDA_ERROR_INVALID_VALUE if the texture reference
 * is not bound to any CUDA array.
 *
 * @param phArray - Returned array
 * @param hTexRef - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetArray(@ByPtrPtr CUarray_st phArray, CUtexref_st hTexRef);

/**
 * \brief Gets the mipmapped array bound to a texture reference
 *
 * Returns in \p *phMipmappedArray the CUDA mipmapped array bound to the texture 
 * reference \p hTexRef, or returns ::CUDA_ERROR_INVALID_VALUE if the texture reference
 * is not bound to any CUDA mipmapped array.
 *
 * @param phMipmappedArray - Returned mipmapped array
 * @param hTexRef          - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetMipmappedArray(@ByPtrPtr CUmipmappedArray_st phMipmappedArray, CUtexref_st hTexRef);

/**
 * \brief Gets the addressing mode used by a texture reference
 *
 * Returns in \p *pam the addressing mode corresponding to the
 * dimension \p dim of the texture reference \p hTexRef. Currently, the only
 * valid value for \p dim are 0 and 1.
 *
 * @param pam     - Returned addressing mode
 * @param hTexRef - Texture reference
 * @param dim     - Dimension
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetAddressMode(@Cast("CUaddress_mode*") IntPointer pam, CUtexref_st hTexRef, int dim);
public static native @Cast("CUresult") int cuTexRefGetAddressMode(@Cast("CUaddress_mode*") IntBuffer pam, CUtexref_st hTexRef, int dim);
public static native @Cast("CUresult") int cuTexRefGetAddressMode(@Cast("CUaddress_mode*") int[] pam, CUtexref_st hTexRef, int dim);

/**
 * \brief Gets the filter-mode used by a texture reference
 *
 * Returns in \p *pfm the filtering mode of the texture reference
 * \p hTexRef.
 *
 * @param pfm     - Returned filtering mode
 * @param hTexRef - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetFilterMode(@Cast("CUfilter_mode*") IntPointer pfm, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetFilterMode(@Cast("CUfilter_mode*") IntBuffer pfm, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetFilterMode(@Cast("CUfilter_mode*") int[] pfm, CUtexref_st hTexRef);

/**
 * \brief Gets the format used by a texture reference
 *
 * Returns in \p *pFormat and \p *pNumChannels the format and number
 * of components of the CUDA array bound to the texture reference \p hTexRef.
 * If \p pFormat or \p pNumChannels is NULL, it will be ignored.
 *
 * @param pFormat      - Returned format
 * @param pNumChannels - Returned number of components
 * @param hTexRef      - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags
 */
public static native @Cast("CUresult") int cuTexRefGetFormat(@Cast("CUarray_format*") IntPointer pFormat, IntPointer pNumChannels, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetFormat(@Cast("CUarray_format*") IntBuffer pFormat, IntBuffer pNumChannels, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetFormat(@Cast("CUarray_format*") int[] pFormat, int[] pNumChannels, CUtexref_st hTexRef);

/**
 * \brief Gets the mipmap filtering mode for a texture reference
 *
 * Returns the mipmap filtering mode in \p pfm that's used when reading memory through
 * the texture reference \p hTexRef.
 *
 * @param pfm     - Returned mipmap filtering mode
 * @param hTexRef - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetMipmapFilterMode(@Cast("CUfilter_mode*") IntPointer pfm, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMipmapFilterMode(@Cast("CUfilter_mode*") IntBuffer pfm, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMipmapFilterMode(@Cast("CUfilter_mode*") int[] pfm, CUtexref_st hTexRef);

/**
 * \brief Gets the mipmap level bias for a texture reference
 *
 * Returns the mipmap level bias in \p pBias that's added to the specified mipmap
 * level when reading memory through the texture reference \p hTexRef.
 *
 * @param pbias   - Returned mipmap level bias
 * @param hTexRef - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetMipmapLevelBias(FloatPointer pbias, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMipmapLevelBias(FloatBuffer pbias, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMipmapLevelBias(float[] pbias, CUtexref_st hTexRef);

/**
 * \brief Gets the min/max mipmap level clamps for a texture reference
 *
 * Returns the min/max mipmap level clamps in \p pminMipmapLevelClamp and \p pmaxMipmapLevelClamp
 * that's used when reading memory through the texture reference \p hTexRef. 
 *
 * @param pminMipmapLevelClamp - Returned mipmap min level clamp
 * @param pmaxMipmapLevelClamp - Returned mipmap max level clamp
 * @param hTexRef              - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetMipmapLevelClamp(FloatPointer pminMipmapLevelClamp, FloatPointer pmaxMipmapLevelClamp, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMipmapLevelClamp(FloatBuffer pminMipmapLevelClamp, FloatBuffer pmaxMipmapLevelClamp, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMipmapLevelClamp(float[] pminMipmapLevelClamp, float[] pmaxMipmapLevelClamp, CUtexref_st hTexRef);

/**
 * \brief Gets the maximum anisotropy for a texture reference
 *
 * Returns the maximum anisotropy in \p pmaxAniso that's used when reading memory through
 * the texture reference \p hTexRef. 
 *
 * @param pmaxAniso - Returned maximum anisotropy
 * @param hTexRef   - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFlags, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetMaxAnisotropy(IntPointer pmaxAniso, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMaxAnisotropy(IntBuffer pmaxAniso, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetMaxAnisotropy(int[] pmaxAniso, CUtexref_st hTexRef);

/**
 * \brief Gets the flags used by a texture reference
 *
 * Returns in \p *pFlags the flags of the texture reference \p hTexRef.
 *
 * @param pFlags  - Returned flags
 * @param hTexRef - Texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefSetAddress,
 * ::cuTexRefSetAddress2D, ::cuTexRefSetAddressMode, ::cuTexRefSetArray,
 * ::cuTexRefSetFilterMode, ::cuTexRefSetFlags, ::cuTexRefSetFormat,
 * ::cuTexRefGetAddress, ::cuTexRefGetAddressMode, ::cuTexRefGetArray,
 * ::cuTexRefGetFilterMode, ::cuTexRefGetFormat
 */
public static native @Cast("CUresult") int cuTexRefGetFlags(@Cast("unsigned int*") IntPointer pFlags, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetFlags(@Cast("unsigned int*") IntBuffer pFlags, CUtexref_st hTexRef);
public static native @Cast("CUresult") int cuTexRefGetFlags(@Cast("unsigned int*") int[] pFlags, CUtexref_st hTexRef);

/** \} */ /* END CUDA_TEXREF */

/**
 * \defgroup CUDA_TEXREF_DEPRECATED Texture Reference Management [DEPRECATED]
 *
 * ___MANBRIEF___ deprecated texture reference management functions of the
 * low-level CUDA driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the deprecated texture reference management
 * functions of the low-level CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Creates a texture reference
 *
 * @deprecated
 *
 * Creates a texture reference and returns its handle in \p *pTexRef. Once
 * created, the application must call ::cuTexRefSetArray() or
 * ::cuTexRefSetAddress() to associate the reference with allocated memory.
 * Other texture reference functions are used to specify the format and
 * interpretation (addressing, filtering, etc.) to be used when the memory is
 * read through this texture reference.
 *
 * @param pTexRef - Returned texture reference
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefDestroy
 */
public static native @Cast("CUresult") int cuTexRefCreate(@ByPtrPtr CUtexref_st pTexRef);

/**
 * \brief Destroys a texture reference
 *
 * @deprecated
 *
 * Destroys the texture reference specified by \p hTexRef.
 *
 * @param hTexRef - Texture reference to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexRefCreate
 */
public static native @Cast("CUresult") int cuTexRefDestroy(CUtexref_st hTexRef);

/** \} */ /* END CUDA_TEXREF_DEPRECATED */


/**
 * \defgroup CUDA_SURFREF Surface Reference Management
 *
 * ___MANBRIEF___ surface reference management functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the surface reference management functions of the
 * low-level CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Sets the CUDA array for a surface reference.
 *
 * Sets the CUDA array \p hArray to be read and written by the surface reference
 * \p hSurfRef.  Any previous CUDA array state associated with the surface
 * reference is superseded by this function.  \p Flags must be set to 0.
 * The ::CUDA_ARRAY3D_SURFACE_LDST flag must have been set for the CUDA array.
 * Any CUDA array previously bound to \p hSurfRef is unbound.
 <p>
 * @param hSurfRef - Surface reference handle
 * @param hArray - CUDA array handle
 * @param Flags - set to 0
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuModuleGetSurfRef, ::cuSurfRefGetArray
 */
public static native @Cast("CUresult") int cuSurfRefSetArray(CUsurfref_st hSurfRef, CUarray_st hArray, @Cast("unsigned int") int Flags);

/**
 * \brief Passes back the CUDA array bound to a surface reference.
 *
 * Returns in \p *phArray the CUDA array bound to the surface reference
 * \p hSurfRef, or returns ::CUDA_ERROR_INVALID_VALUE if the surface reference
 * is not bound to any CUDA array.
 <p>
 * @param phArray - Surface reference handle
 * @param hSurfRef - Surface reference handle
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuModuleGetSurfRef, ::cuSurfRefSetArray
 */
public static native @Cast("CUresult") int cuSurfRefGetArray(@ByPtrPtr CUarray_st phArray, CUsurfref_st hSurfRef);

/** \} */ /* END CUDA_SURFREF */

// #if __CUDA_API_VERSION >= 5000
/**
 * \defgroup CUDA_TEXOBJECT Texture Object Management
 *
 * ___MANBRIEF___ texture object management functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the texture object management functions of the
 * low-level CUDA driver application programming interface. The texture
 * object API is only supported on devices of compute capability 3.0 or higher.
 *
 * \{
 */

/**
 * \brief Creates a texture object
 *
 * Creates a texture object and returns it in \p pTexObject. \p pResDesc describes
 * the data to texture from. \p pTexDesc describes how the data should be sampled.
 * \p pResViewDesc is an optional argument that specifies an alternate format for
 * the data described by \p pResDesc, and also describes the subresource region
 * to restrict access to when texturing. \p pResViewDesc can only be specified if
 * the type of resource is a CUDA array or a CUDA mipmapped array.
 *
 * Texture objects are only supported on devices of compute capability 3.0 or higher.
 * Additionally, a texture object is an opaque value, and, as such, should only be
 * accessed through CUDA API calls.
 *
 * The ::CUDA_RESOURCE_DESC structure is defined as:
 * <pre>{@code
        typedef struct CUDA_RESOURCE_DESC_st
        {
            CUresourcetype resType;

            union {
                struct {
                    CUarray hArray;
                } array;
                struct {
                    CUmipmappedArray hMipmappedArray;
                } mipmap;
                struct {
                    CUdeviceptr devPtr;
                    CUarray_format format;
                    unsigned int numChannels;
                    size_t sizeInBytes;
                } linear;
                struct {
                    CUdeviceptr devPtr;
                    CUarray_format format;
                    unsigned int numChannels;
                    size_t width;
                    size_t height;
                    size_t pitchInBytes;
                } pitch2D;
            } res;

            unsigned int flags;
        } CUDA_RESOURCE_DESC;

 * }</pre>
 * where:
 * - ::CUDA_RESOURCE_DESC::resType specifies the type of resource to texture from.
 * CUresourceType is defined as:
 * <pre>{@code
        typedef enum CUresourcetype_enum {
            CU_RESOURCE_TYPE_ARRAY           = 0x00,
            CU_RESOURCE_TYPE_MIPMAPPED_ARRAY = 0x01,
            CU_RESOURCE_TYPE_LINEAR          = 0x02,
            CU_RESOURCE_TYPE_PITCH2D         = 0x03
        } CUresourcetype;
 * }</pre>
 *
 * \par
 * If ::CUDA_RESOURCE_DESC::resType is set to ::CU_RESOURCE_TYPE_ARRAY, ::CUDA_RESOURCE_DESC::res::array::hArray
 * must be set to a valid CUDA array handle.
 *
 * \par
 * If ::CUDA_RESOURCE_DESC::resType is set to ::CU_RESOURCE_TYPE_MIPMAPPED_ARRAY, ::CUDA_RESOURCE_DESC::res::mipmap::hMipmappedArray
 * must be set to a valid CUDA mipmapped array handle.
 *
 * \par
 * If ::CUDA_RESOURCE_DESC::resType is set to ::CU_RESOURCE_TYPE_LINEAR, ::CUDA_RESOURCE_DESC::res::linear::devPtr
 * must be set to a valid device pointer, that is aligned to ::CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT.
 * ::CUDA_RESOURCE_DESC::res::linear::format and ::CUDA_RESOURCE_DESC::res::linear::numChannels
 * describe the format of each component and the number of components per array element. ::CUDA_RESOURCE_DESC::res::linear::sizeInBytes
 * specifies the size of the array in bytes. The total number of elements in the linear address range cannot exceed 
 * ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH. The number of elements is computed as (sizeInBytes / (sizeof(format) * numChannels)).
 *
 * \par
 * If ::CUDA_RESOURCE_DESC::resType is set to ::CU_RESOURCE_TYPE_PITCH2D, ::CUDA_RESOURCE_DESC::res::pitch2D::devPtr
 * must be set to a valid device pointer, that is aligned to ::CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT.
 * ::CUDA_RESOURCE_DESC::res::pitch2D::format and ::CUDA_RESOURCE_DESC::res::pitch2D::numChannels
 * describe the format of each component and the number of components per array element. ::CUDA_RESOURCE_DESC::res::pitch2D::width
 * and ::CUDA_RESOURCE_DESC::res::pitch2D::height specify the width and height of the array in elements, and cannot exceed
 * ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH and ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT respectively.
 * ::CUDA_RESOURCE_DESC::res::pitch2D::pitchInBytes specifies the pitch between two rows in bytes and has to be aligned to 
 * ::CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT. Pitch cannot exceed ::CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH.
 *
 * - ::flags must be set to zero.
 *
 *
 * The ::CUDA_TEXTURE_DESC struct is defined as
 * <pre>{@code
        typedef struct CUDA_TEXTURE_DESC_st {
            CUaddress_mode addressMode[3];
            CUfilter_mode filterMode;
            unsigned int flags;
            unsigned int maxAnisotropy;
            CUfilter_mode mipmapFilterMode;
            float mipmapLevelBias;
            float minMipmapLevelClamp;
            float maxMipmapLevelClamp;
        } CUDA_TEXTURE_DESC;
 * }</pre>
 * where
 * - ::CUDA_TEXTURE_DESC::addressMode specifies the addressing mode for each dimension of the texture data. ::CUaddress_mode is defined as:
 *   <pre>{@code
        typedef enum CUaddress_mode_enum {
            CU_TR_ADDRESS_MODE_WRAP = 0,
            CU_TR_ADDRESS_MODE_CLAMP = 1,
            CU_TR_ADDRESS_MODE_MIRROR = 2,
            CU_TR_ADDRESS_MODE_BORDER = 3
        } CUaddress_mode;
 *   }</pre>
 *   This is ignored if ::CUDA_RESOURCE_DESC::resType is ::CU_RESOURCE_TYPE_LINEAR. Also, if the flag, ::CU_TRSF_NORMALIZED_COORDINATES 
 *   is not set, the only supported address mode is ::CU_TR_ADDRESS_MODE_CLAMP.
 *
 * - ::CUDA_TEXTURE_DESC::filterMode specifies the filtering mode to be used when fetching from the texture. CUfilter_mode is defined as:
 *   <pre>{@code
        typedef enum CUfilter_mode_enum {
            CU_TR_FILTER_MODE_POINT = 0,
            CU_TR_FILTER_MODE_LINEAR = 1
        } CUfilter_mode;
 *   }</pre>
 *   This is ignored if ::CUDA_RESOURCE_DESC::resType is ::CU_RESOURCE_TYPE_LINEAR.
 *
 * - ::CUDA_TEXTURE_DESC::flags can be any combination of the following:
 *   - ::CU_TRSF_READ_AS_INTEGER, which suppresses the default behavior of having the texture promote integer data to floating point data in the
 *     range [0, 1]. Note that texture with 32-bit integer format would not be promoted, regardless of whether or not this flag is specified.
 *   - ::CU_TRSF_NORMALIZED_COORDINATES, which suppresses the default behavior of having the texture coordinates range from [0, Dim) where Dim is
 *     the width or height of the CUDA array. Instead, the texture coordinates [0, 1.0) reference the entire breadth of the array dimension; Note
 *     that for CUDA mipmapped arrays, this flag has to be set.
 *
 * - ::CUDA_TEXTURE_DESC::maxAnisotropy specifies the maximum anisotropy ratio to be used when doing anisotropic filtering. This value will be
 *   clamped to the range [1,16].
 *
 * - ::CUDA_TEXTURE_DESC::mipmapFilterMode specifies the filter mode when the calculated mipmap level lies between two defined mipmap levels.
 *
 * - ::CUDA_TEXTURE_DESC::mipmapLevelBias specifies the offset to be applied to the calculated mipmap level.
 *
 * - ::CUDA_TEXTURE_DESC::minMipmapLevelClamp specifies the lower end of the mipmap level range to clamp access to.
 *
 * - ::CUDA_TEXTURE_DESC::maxMipmapLevelClamp specifies the upper end of the mipmap level range to clamp access to.
 *
 *
 * The ::CUDA_RESOURCE_VIEW_DESC struct is defined as
 * <pre>{@code
        typedef struct CUDA_RESOURCE_VIEW_DESC_st
        {
            CUresourceViewFormat format;
            size_t width;
            size_t height;
            size_t depth;
            unsigned int firstMipmapLevel;
            unsigned int lastMipmapLevel;
            unsigned int firstLayer;
            unsigned int lastLayer;
        } CUDA_RESOURCE_VIEW_DESC;
 * }</pre>
 * where:
 * - ::CUDA_RESOURCE_VIEW_DESC::format specifies how the data contained in the CUDA array or CUDA mipmapped array should
 *   be interpreted. Note that this can incur a change in size of the texture data. If the resource view format is a block
 *   compressed format, then the underlying CUDA array or CUDA mipmapped array has to have a base of format ::CU_AD_FORMAT_UNSIGNED_INT32.
 *   with 2 or 4 channels, depending on the block compressed format. For ex., BC1 and BC4 require the underlying CUDA array to have
 *   a format of ::CU_AD_FORMAT_UNSIGNED_INT32 with 2 channels. The other BC formats require the underlying resource to have the same base
 *   format but with 4 channels.
 *
 * - ::CUDA_RESOURCE_VIEW_DESC::width specifies the new width of the texture data. If the resource view format is a block
 *   compressed format, this value has to be 4 times the original width of the resource. For non block compressed formats,
 *   this value has to be equal to that of the original resource.
 *
 * - ::CUDA_RESOURCE_VIEW_DESC::height specifies the new height of the texture data. If the resource view format is a block
 *   compressed format, this value has to be 4 times the original height of the resource. For non block compressed formats,
 *   this value has to be equal to that of the original resource.
 *
 * - ::CUDA_RESOURCE_VIEW_DESC::depth specifies the new depth of the texture data. This value has to be equal to that of the
 *   original resource.
 *
 * - ::CUDA_RESOURCE_VIEW_DESC::firstMipmapLevel specifies the most detailed mipmap level. This will be the new mipmap level zero.
 *   For non-mipmapped resources, this value has to be zero.::CUDA_TEXTURE_DESC::minMipmapLevelClamp and ::CUDA_TEXTURE_DESC::maxMipmapLevelClamp
 *   will be relative to this value. For ex., if the firstMipmapLevel is set to 2, and a minMipmapLevelClamp of 1.2 is specified,
 *   then the actual minimum mipmap level clamp will be 3.2.
 *
 * - ::CUDA_RESOURCE_VIEW_DESC::lastMipmapLevel specifies the least detailed mipmap level. For non-mipmapped resources, this value
 *   has to be zero.
 *
 * - ::CUDA_RESOURCE_VIEW_DESC::firstLayer specifies the first layer index for layered textures. This will be the new layer zero.
 *   For non-layered resources, this value has to be zero.
 *
 * - ::CUDA_RESOURCE_VIEW_DESC::lastLayer specifies the last layer index for layered textures. For non-layered resources, 
 *   this value has to be zero.
 *
 *
 * @param pTexObject   - Texture object to create
 * @param pResDesc     - Resource descriptor
 * @param pTexDesc     - Texture descriptor
 * @param pResViewDesc - Resource view descriptor 
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexObjectDestroy
 */
public static native @Cast("CUresult") int cuTexObjectCreate(@Cast("CUtexObject*") LongPointer pTexObject, @Const CUDA_RESOURCE_DESC pResDesc, @Const CUDA_TEXTURE_DESC pTexDesc, @Const CUDA_RESOURCE_VIEW_DESC pResViewDesc);
public static native @Cast("CUresult") int cuTexObjectCreate(@Cast("CUtexObject*") LongBuffer pTexObject, @Const CUDA_RESOURCE_DESC pResDesc, @Const CUDA_TEXTURE_DESC pTexDesc, @Const CUDA_RESOURCE_VIEW_DESC pResViewDesc);
public static native @Cast("CUresult") int cuTexObjectCreate(@Cast("CUtexObject*") long[] pTexObject, @Const CUDA_RESOURCE_DESC pResDesc, @Const CUDA_TEXTURE_DESC pTexDesc, @Const CUDA_RESOURCE_VIEW_DESC pResViewDesc);

/**
 * \brief Destroys a texture object
 *
 * Destroys the texture object specified by \p texObject.
 *
 * @param texObject - Texture object to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexObjectCreate
 */
public static native @Cast("CUresult") int cuTexObjectDestroy(@Cast("CUtexObject") long texObject);

/**
 * \brief Returns a texture object's resource descriptor
 *
 * Returns the resource descriptor for the texture object specified by \p texObject.
 *
 * @param pResDesc  - Resource descriptor
 * @param texObject - Texture object
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexObjectCreate
 */
public static native @Cast("CUresult") int cuTexObjectGetResourceDesc(CUDA_RESOURCE_DESC pResDesc, @Cast("CUtexObject") long texObject);

/**
 * \brief Returns a texture object's texture descriptor
 *
 * Returns the texture descriptor for the texture object specified by \p texObject.
 *
 * @param pTexDesc  - Texture descriptor
 * @param texObject - Texture object
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexObjectCreate
 */
public static native @Cast("CUresult") int cuTexObjectGetTextureDesc(CUDA_TEXTURE_DESC pTexDesc, @Cast("CUtexObject") long texObject);

/**
 * \brief Returns a texture object's resource view descriptor
 *
 * Returns the resource view descriptor for the texture object specified by \p texObject.
 * If no resource view was set for \p texObject, the ::CUDA_ERROR_INVALID_VALUE is returned.
 *
 * @param pResViewDesc - Resource view descriptor
 * @param texObject    - Texture object
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuTexObjectCreate
 */
public static native @Cast("CUresult") int cuTexObjectGetResourceViewDesc(CUDA_RESOURCE_VIEW_DESC pResViewDesc, @Cast("CUtexObject") long texObject);

/** \} */ /* END CUDA_TEXOBJECT */

/**
 * \defgroup CUDA_SURFOBJECT Surface Object Management
 *
 * ___MANBRIEF___ surface object management functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the surface object management functions of the
 * low-level CUDA driver application programming interface. The surface
 * object API is only supported on devices of compute capability 3.0 or higher.
 *
 * \{
 */

/**
 * \brief Creates a surface object
 *
 * Creates a surface object and returns it in \p pSurfObject. \p pResDesc describes
 * the data to perform surface load/stores on. ::CUDA_RESOURCE_DESC::resType must be 
 * ::CU_RESOURCE_TYPE_ARRAY and  ::CUDA_RESOURCE_DESC::res::array::hArray
 * must be set to a valid CUDA array handle. ::CUDA_RESOURCE_DESC::flags must be set to zero.
 *
 * Surface objects are only supported on devices of compute capability 3.0 or higher.
 * Additionally, a surface object is an opaque value, and, as such, should only be
 * accessed through CUDA API calls.
 *
 * @param pSurfObject - Surface object to create
 * @param pResDesc    - Resource descriptor
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuSurfObjectDestroy
 */
public static native @Cast("CUresult") int cuSurfObjectCreate(@Cast("CUsurfObject*") LongPointer pSurfObject, @Const CUDA_RESOURCE_DESC pResDesc);
public static native @Cast("CUresult") int cuSurfObjectCreate(@Cast("CUsurfObject*") LongBuffer pSurfObject, @Const CUDA_RESOURCE_DESC pResDesc);
public static native @Cast("CUresult") int cuSurfObjectCreate(@Cast("CUsurfObject*") long[] pSurfObject, @Const CUDA_RESOURCE_DESC pResDesc);

/**
 * \brief Destroys a surface object
 *
 * Destroys the surface object specified by \p surfObject.
 *
 * @param surfObject - Surface object to destroy
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuSurfObjectCreate
 */
public static native @Cast("CUresult") int cuSurfObjectDestroy(@Cast("CUsurfObject") long surfObject);

/**
 * \brief Returns a surface object's resource descriptor
 *
 * Returns the resource descriptor for the surface object specified by \p surfObject.
 *
 * @param pResDesc   - Resource descriptor
 * @param surfObject - Surface object
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE
 *
 * \sa ::cuSurfObjectCreate
 */
public static native @Cast("CUresult") int cuSurfObjectGetResourceDesc(CUDA_RESOURCE_DESC pResDesc, @Cast("CUsurfObject") long surfObject);

/** \} */ /* END CUDA_SURFOBJECT */
// #endif /* __CUDA_API_VERSION >= 5000 */

// #if __CUDA_API_VERSION >= 4000
/**
 * \defgroup CUDA_PEER_ACCESS Peer Context Memory Access
 *
 * ___MANBRIEF___ direct peer context memory access functions of the low-level
 * CUDA driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the direct peer context memory access functions 
 * of the low-level CUDA driver application programming interface.
 *
 * \{
 */
    
/**
 * \brief Queries if a device may directly access a peer device's memory.
 *
 * Returns in \p *canAccessPeer a value of 1 if contexts on \p dev are capable of
 * directly accessing memory from contexts on \p peerDev and 0 otherwise.
 * If direct access of \p peerDev from \p dev is possible, then access may be
 * enabled on two specific contexts by calling ::cuCtxEnablePeerAccess().
 *
 * @param canAccessPeer - Returned access capability
 * @param dev           - Device from which allocations on \p peerDev are to
 *                        be directly accessed.
 * @param peerDev       - Device on which the allocations to be directly accessed 
 *                        by \p dev reside.
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_DEVICE
 * \notefnerr
 *
 * \sa ::cuCtxEnablePeerAccess,
 * ::cuCtxDisablePeerAccess
 */
public static native @Cast("CUresult") int cuDeviceCanAccessPeer(IntPointer canAccessPeer, @Cast("CUdevice") int dev, @Cast("CUdevice") int peerDev);
public static native @Cast("CUresult") int cuDeviceCanAccessPeer(IntBuffer canAccessPeer, @Cast("CUdevice") int dev, @Cast("CUdevice") int peerDev);
public static native @Cast("CUresult") int cuDeviceCanAccessPeer(int[] canAccessPeer, @Cast("CUdevice") int dev, @Cast("CUdevice") int peerDev);

/**
 * \brief Enables direct access to memory allocations in a peer context.
 *
 * If both the current context and \p peerContext are on devices which support unified
 * addressing (as may be queried using ::CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING) and same
 * major compute capability, then on success all allocations from \p peerContext will
 * immediately be accessible by the current context.  See \ref CUDA_UNIFIED for additional
 * details.
 *
 * Note that access granted by this call is unidirectional and that in order to access
 * memory from the current context in \p peerContext, a separate symmetric call 
 * to ::cuCtxEnablePeerAccess() is required.
 *
 * There is a system-wide maximum of eight peer connections per device.
 *
 * Returns ::CUDA_ERROR_PEER_ACCESS_UNSUPPORTED if ::cuDeviceCanAccessPeer() indicates
 * that the ::CUdevice of the current context cannot directly access memory
 * from the ::CUdevice of \p peerContext.
 *
 * Returns ::CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED if direct access of
 * \p peerContext from the current context has already been enabled.
 *
 * Returns ::CUDA_ERROR_TOO_MANY_PEERS if direct peer access is not possible 
 * because hardware resources required for peer access have been exhausted.
 *
 * Returns ::CUDA_ERROR_INVALID_CONTEXT if there is no current context, \p peerContext
 * is not a valid context, or if the current context is \p peerContext.
 *
 * Returns ::CUDA_ERROR_INVALID_VALUE if \p Flags is not 0.
 *
 * @param peerContext - Peer context to enable direct access to from the current context
 * @param Flags       - Reserved for future use and must be set to 0
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED,
 * ::CUDA_ERROR_TOO_MANY_PEERS,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_PEER_ACCESS_UNSUPPORTED,
 * ::CUDA_ERROR_INVALID_VALUE
 * \notefnerr
 *
 * \sa ::cuDeviceCanAccessPeer,
 * ::cuCtxDisablePeerAccess
 */
public static native @Cast("CUresult") int cuCtxEnablePeerAccess(CUctx_st peerContext, @Cast("unsigned int") int Flags);

/**
 * \brief Disables direct access to memory allocations in a peer context and 
 * unregisters any registered allocations.
 *
  Returns ::CUDA_ERROR_PEER_ACCESS_NOT_ENABLED if direct peer access has 
 * not yet been enabled from \p peerContext to the current context.
 *
 * Returns ::CUDA_ERROR_INVALID_CONTEXT if there is no current context, or if
 * \p peerContext is not a valid context.
 *
 * @param peerContext - Peer context to disable direct access to
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_PEER_ACCESS_NOT_ENABLED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * \notefnerr
 *
 * \sa ::cuDeviceCanAccessPeer,
 * ::cuCtxEnablePeerAccess
 */
public static native @Cast("CUresult") int cuCtxDisablePeerAccess(CUctx_st peerContext);

/** \} */ /* END CUDA_PEER_ACCESS */
// #endif /* __CUDA_API_VERSION >= 4000 */

/**
 * \defgroup CUDA_GRAPHICS Graphics Interoperability
 *
 * ___MANBRIEF___ graphics interoperability functions of the low-level CUDA
 * driver API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the graphics interoperability functions of the
 * low-level CUDA driver application programming interface.
 *
 * \{
 */

/**
 * \brief Unregisters a graphics resource for access by CUDA
 *
 * Unregisters the graphics resource \p resource so it is not accessible by
 * CUDA unless registered again.
 *
 * If \p resource is invalid then ::CUDA_ERROR_INVALID_HANDLE is
 * returned.
 *
 * @param resource - Resource to unregister
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_UNKNOWN
 * \notefnerr
 *
 * \sa
 * ::cuGraphicsD3D9RegisterResource,
 * ::cuGraphicsD3D10RegisterResource,
 * ::cuGraphicsD3D11RegisterResource,
 * ::cuGraphicsGLRegisterBuffer,
 * ::cuGraphicsGLRegisterImage
 */
public static native @Cast("CUresult") int cuGraphicsUnregisterResource(CUgraphicsResource_st resource);

/**
 * \brief Get an array through which to access a subresource of a mapped graphics resource.
 *
 * Returns in \p *pArray an array through which the subresource of the mapped
 * graphics resource \p resource which corresponds to array index \p arrayIndex
 * and mipmap level \p mipLevel may be accessed.  The value set in \p *pArray may
 * change every time that \p resource is mapped.
 *
 * If \p resource is not a texture then it cannot be accessed via an array and
 * ::CUDA_ERROR_NOT_MAPPED_AS_ARRAY is returned.
 * If \p arrayIndex is not a valid array index for \p resource then
 * ::CUDA_ERROR_INVALID_VALUE is returned.
 * If \p mipLevel is not a valid mipmap level for \p resource then
 * ::CUDA_ERROR_INVALID_VALUE is returned.
 * If \p resource is not mapped then ::CUDA_ERROR_NOT_MAPPED is returned.
 *
 * @param pArray      - Returned array through which a subresource of \p resource may be accessed
 * @param resource    - Mapped resource to access
 * @param arrayIndex  - Array index for array textures or cubemap face
 *                      index as defined by ::CUarray_cubemap_face for
 *                      cubemap textures for the subresource to access
 * @param mipLevel    - Mipmap level for the subresource to access
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_MAPPED,
 * ::CUDA_ERROR_NOT_MAPPED_AS_ARRAY
 * \notefnerr
 *
 * \sa ::cuGraphicsResourceGetMappedPointer
 */
public static native @Cast("CUresult") int cuGraphicsSubResourceGetMappedArray(@ByPtrPtr CUarray_st pArray, CUgraphicsResource_st resource, @Cast("unsigned int") int arrayIndex, @Cast("unsigned int") int mipLevel);

// #if __CUDA_API_VERSION >= 5000

/**
 * \brief Get a mipmapped array through which to access a mapped graphics resource.
 *
 * Returns in \p *pMipmappedArray a mipmapped array through which the mapped graphics 
 * resource \p resource. The value set in \p *pMipmappedArray may change every time 
 * that \p resource is mapped.
 *
 * If \p resource is not a texture then it cannot be accessed via a mipmapped array and
 * ::CUDA_ERROR_NOT_MAPPED_AS_ARRAY is returned.
 * If \p resource is not mapped then ::CUDA_ERROR_NOT_MAPPED is returned.
 *
 * @param pMipmappedArray - Returned mipmapped array through which \p resource may be accessed
 * @param resource        - Mapped resource to access
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_MAPPED,
 * ::CUDA_ERROR_NOT_MAPPED_AS_ARRAY
 * \notefnerr
 *
 * \sa ::cuGraphicsResourceGetMappedPointer
 */
public static native @Cast("CUresult") int cuGraphicsResourceGetMappedMipmappedArray(@ByPtrPtr CUmipmappedArray_st pMipmappedArray, CUgraphicsResource_st resource);

// #endif /* __CUDA_API_VERSION >= 5000 */

// #if __CUDA_API_VERSION >= 3020
/**
 * \brief Get a device pointer through which to access a mapped graphics resource.
 *
 * Returns in \p *pDevPtr a pointer through which the mapped graphics resource
 * \p resource may be accessed.
 * Returns in \p pSize the size of the memory in bytes which may be accessed from that pointer.
 * The value set in \p pPointer may change every time that \p resource is mapped.
 *
 * If \p resource is not a buffer then it cannot be accessed via a pointer and
 * ::CUDA_ERROR_NOT_MAPPED_AS_POINTER is returned.
 * If \p resource is not mapped then ::CUDA_ERROR_NOT_MAPPED is returned.
 * *
 * @param pDevPtr    - Returned pointer through which \p resource may be accessed
 * @param pSize      - Returned size of the buffer accessible starting at \p *pPointer
 * @param resource   - Mapped resource to access
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_MAPPED,
 * ::CUDA_ERROR_NOT_MAPPED_AS_POINTER
 * \notefnerr
 *
 * \sa
 * ::cuGraphicsMapResources,
 * ::cuGraphicsSubResourceGetMappedArray
 */
public static native @Cast("CUresult") int cuGraphicsResourceGetMappedPointer(@Cast("CUdeviceptr*") LongPointer pDevPtr, @Cast("size_t*") SizeTPointer pSize, CUgraphicsResource_st resource);
public static native @Cast("CUresult") int cuGraphicsResourceGetMappedPointer(@Cast("CUdeviceptr*") LongBuffer pDevPtr, @Cast("size_t*") SizeTPointer pSize, CUgraphicsResource_st resource);
public static native @Cast("CUresult") int cuGraphicsResourceGetMappedPointer(@Cast("CUdeviceptr*") long[] pDevPtr, @Cast("size_t*") SizeTPointer pSize, CUgraphicsResource_st resource);
// #endif /* __CUDA_API_VERSION >= 3020 */

/**
 * \brief Set usage flags for mapping a graphics resource
 *
 * Set \p flags for mapping the graphics resource \p resource.
 *
 * Changes to \p flags will take effect the next time \p resource is mapped.
 * The \p flags argument may be any of the following:
 <p>
 * - ::CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE: Specifies no hints about how this
 *   resource will be used. It is therefore assumed that this resource will be
 *   read from and written to by CUDA kernels.  This is the default value.
 * - ::CU_GRAPHICS_MAP_RESOURCE_FLAGS_READONLY: Specifies that CUDA kernels which
 *   access this resource will not write to this resource.
 * - ::CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITEDISCARD: Specifies that CUDA kernels
 *   which access this resource will not read from this resource and will
 *   write over the entire contents of the resource, so none of the data
 *   previously stored in the resource will be preserved.
 *
 * If \p resource is presently mapped for access by CUDA then
 * ::CUDA_ERROR_ALREADY_MAPPED is returned.
 * If \p flags is not one of the above values then ::CUDA_ERROR_INVALID_VALUE is returned.
 *
 * @param resource - Registered resource to set flags for
 * @param flags    - Parameters for resource mapping
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_VALUE,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_ALREADY_MAPPED
 * \notefnerr
 *
 * \sa
 * ::cuGraphicsMapResources
 */
public static native @Cast("CUresult") int cuGraphicsResourceSetMapFlags(CUgraphicsResource_st resource, @Cast("unsigned int") int flags);

/**
 * \brief Map graphics resources for access by CUDA
 *
 * Maps the \p count graphics resources in \p resources for access by CUDA.
 *
 * The resources in \p resources may be accessed by CUDA until they
 * are unmapped. The graphics API from which \p resources were registered
 * should not access any resources while they are mapped by CUDA. If an
 * application does so, the results are undefined.
 *
 * This function provides the synchronization guarantee that any graphics calls
 * issued before ::cuGraphicsMapResources() will complete before any subsequent CUDA
 * work issued in \p stream begins.
 *
 * If \p resources includes any duplicate entries then ::CUDA_ERROR_INVALID_HANDLE is returned.
 * If any of \p resources are presently mapped for access by CUDA then ::CUDA_ERROR_ALREADY_MAPPED is returned.
 *
 * @param count      - Number of resources to map
 * @param resources  - Resources to map for CUDA usage
 * @param hStream    - Stream with which to synchronize
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_ALREADY_MAPPED,
 * ::CUDA_ERROR_UNKNOWN
 * \note_null_stream
 * \notefnerr
 *
 * \sa
 * ::cuGraphicsResourceGetMappedPointer,
 * ::cuGraphicsSubResourceGetMappedArray,
 * ::cuGraphicsUnmapResources
 */
public static native @Cast("CUresult") int cuGraphicsMapResources(@Cast("unsigned int") int count, @ByPtrPtr CUgraphicsResource_st resources, CUstream_st hStream);

/**
 * \brief Unmap graphics resources.
 *
 * Unmaps the \p count graphics resources in \p resources.
 *
 * Once unmapped, the resources in \p resources may not be accessed by CUDA
 * until they are mapped again.
 *
 * This function provides the synchronization guarantee that any CUDA work issued
 * in \p stream before ::cuGraphicsUnmapResources() will complete before any
 * subsequently issued graphics work begins.
 *
 *
 * If \p resources includes any duplicate entries then ::CUDA_ERROR_INVALID_HANDLE is returned.
 * If any of \p resources are not presently mapped for access by CUDA then ::CUDA_ERROR_NOT_MAPPED is returned.
 *
 * @param count      - Number of resources to unmap
 * @param resources  - Resources to unmap
 * @param hStream    - Stream with which to synchronize
 *
 * @return
 * ::CUDA_SUCCESS,
 * ::CUDA_ERROR_DEINITIALIZED,
 * ::CUDA_ERROR_NOT_INITIALIZED,
 * ::CUDA_ERROR_INVALID_CONTEXT,
 * ::CUDA_ERROR_INVALID_HANDLE,
 * ::CUDA_ERROR_NOT_MAPPED,
 * ::CUDA_ERROR_UNKNOWN
 * \note_null_stream
 * \notefnerr
 *
 * \sa
 * ::cuGraphicsMapResources
 */
public static native @Cast("CUresult") int cuGraphicsUnmapResources(@Cast("unsigned int") int count, @ByPtrPtr CUgraphicsResource_st resources, CUstream_st hStream);

/** \} */ /* END CUDA_GRAPHICS */

public static native @Cast("CUresult") int cuGetExportTable(@Cast("const void**") PointerPointer ppExportTable, @Const CUuuid pExportTableId);
public static native @Cast("CUresult") int cuGetExportTable(@Cast("const void**") @ByPtrPtr Pointer ppExportTable, @Const CUuuid pExportTableId);


/**
 * CUDA API versioning support
 */
// #if defined(__CUDA_API_VERSION_INTERNAL)
// #endif /* __CUDA_API_VERSION_INTERNAL */

// #if defined(__CUDA_API_VERSION_INTERNAL) || (__CUDA_API_VERSION >= 4000 && __CUDA_API_VERSION < 6050)
// #endif /* defined(__CUDA_API_VERSION_INTERNAL) || (__CUDA_API_VERSION >= 4000 && __CUDA_API_VERSION < 6050) */

// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION < 6050
// #endif /* defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION < 6050 */

// #if defined(__CUDA_API_VERSION_INTERNAL) || (__CUDA_API_VERSION >= 5050 && __CUDA_API_VERSION < 6050)
// #endif /* __CUDA_API_VERSION_INTERNAL || (__CUDA_API_VERSION >= 5050 && __CUDA_API_VERSION < 6050) */

// #if defined(__CUDA_API_VERSION_INTERNAL) || (__CUDA_API_VERSION >= 3020 && __CUDA_API_VERSION < 4010)
// #endif /* __CUDA_API_VERSION_INTERNAL || (__CUDA_API_VERSION >= 3020 && __CUDA_API_VERSION < 4010) */

/**
 * CUDA API made obselete at API version 3020
 */
// #if defined(__CUDA_API_VERSION_INTERNAL)
// #endif /* CUDA_FORCE_LEGACY32_INTERNAL */

// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION < 3020
// #endif /* __CUDA_API_VERSION_INTERNAL || __CUDA_API_VERSION < 3020 */
// #if defined(__CUDA_API_VERSION_INTERNAL) || __CUDA_API_VERSION < 4000
// #endif /* __CUDA_API_VERSION_INTERNAL || __CUDA_API_VERSION < 4000 */
// #if defined(__CUDA_API_VERSION_INTERNAL)
// #endif /* __CUDA_API_VERSION_INTERNAL */

// #if defined(__CUDA_API_VERSION_INTERNAL)
// #endif

// #ifdef __cplusplus
// #endif

// #undef __CUDA_API_VERSION

// #endif /* __cuda_cuda_h__ */



// Parsed from <host_defines.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__HOST_DEFINES_H__)
// #define __HOST_DEFINES_H__

/* CUDA JIT mode (__CUDACC_RTC__) also uses GNU style attributes */
// #if defined(__GNUC__) || defined(__CUDA_LIBDEVICE__) || defined(__CUDACC_RTC__)

// #if defined(__CUDACC_RTC__)
// #define __volatile__ volatile
// #endif /* __CUDACC_RTC__ */

// #define __no_return__
//         __attribute__((noreturn))
        
// #if defined(__CUDACC__) || defined(__CUDA_ARCH__)
/* gcc allows users to define attributes with underscores, 
   e.g., __attribute__((__noinline__)).
   Consider a non-CUDA source file (e.g. .cpp) that has the 
   above attribute specification, and includes this header file. In that case,
   defining __noinline__ as below  would cause a gcc compilation error.
   Hence, only define __noinline__ when the code is being processed
   by a  CUDA compiler component.
*/   
// #define __noinline__
//         __attribute__((noinline))
// #endif /* __CUDACC__  || __CUDA_ARCH__ */       
        
// #define __forceinline__
//         __inline__ __attribute__((always_inline))
// #define __align__(n)
//         __attribute__((aligned(n)))
// #define __thread__
//         __thread
// #define __import__
// #define __export__
// #define __cdecl
// #define __annotate__(a)
//         __attribute__((a))
// #define __location__(a)
//         __annotate__(a)
// #define CUDARTAPI

// #elif defined(_MSC_VER)

// #if _MSC_VER >= 1400

// #define __restrict__
//         __restrict

// #else /* _MSC_VER >= 1400 */

// #define __restrict__

// #endif /* _MSC_VER >= 1400 */

// #define __inline__
//         __inline
// #define __no_return__
//         __declspec(noreturn)
// #define __noinline__
//         __declspec(noinline)
// #define __forceinline__
//         __forceinline
// #define __align__(n)
//         __declspec(align(n))
// #define __thread__
//         __declspec(thread)
// #define __import__
//         __declspec(dllimport)
// #define __export__
//         __declspec(dllexport)
// #define __annotate__(a)
//         __declspec(a)
// #define __location__(a)
//         __annotate__(__##a##__)
// #define CUDARTAPI
//         __stdcall

// #else /* __GNUC__ || __CUDA_LIBDEVICE__ || __CUDACC_RTC__ */

// #define __inline__

// #if !defined(__align__)

// #error --- !!! UNKNOWN COMPILER: please provide a CUDA compatible definition for '__align__' !!! ---

// #endif /* !__align__ */

// #if !defined(CUDARTAPI)

// #error --- !!! UNKNOWN COMPILER: please provide a CUDA compatible definition for 'CUDARTAPI' !!! ---

// #endif /* !CUDARTAPI */

// #endif /* __GNUC__ || __CUDA_LIBDEVICE__ || __CUDACC_RTC__ */

// #if (defined(__GNUC__) && (__GNUC__ < 4 || (__GNUC__ == 4 && __GNUC_MINOR__ < 3 && !defined(__clang__)))) ||
//     (defined(_MSC_VER) && _MSC_VER < 1900) ||
//     (!defined(__GNUC__) && !defined(_MSC_VER))

// #define __specialization_static
//         static

// #else /* (__GNUC__ && (__GNUC__ < 4 || (__GNUC__ == 4 && __GNUC_MINOR__ < 3 && !__clang__))) ||
//          (_MSC_VER && _MSC_VER < 1900) ||
//          (!__GNUC__ && !_MSC_VER) */

// #define __specialization_static

// #endif /* (__GNUC__ && (__GNUC__ < 4 || (__GNUC__ == 4 && __GNUC_MINOR__ < 3 && !__clang__))) ||
//          (_MSC_VER && _MSC_VER < 1900) ||
//          (!__GNUC__ && !_MSC_VER) */

// #if !defined(__CUDACC__) && !defined(__CUDABE__)

// #undef __annotate__
// #define __annotate__(a)

// #else /* !__CUDACC__ && !__CUDABE__ */

// #define __launch_bounds__(...)
//         __annotate__(launch_bounds(__VA_ARGS__))

// #endif /* !__CUDACC__ && !__CUDABE__ */

// #if defined(__CUDACC__) || defined(__CUDABE__) ||
//     defined(__GNUC__) || defined(_WIN64)

// #define __builtin_align__(a)
//         __align__(a)

// #else /* __CUDACC__ || __CUDABE__ || __GNUC__ || _WIN64 */

// #define __builtin_align__(a)

// #endif /* __CUDACC__ || __CUDABE__ || __GNUC__  || _WIN64 */

// #define __host__
//         __location__(host)
// #define __device__
//         __location__(device)
// #define __global__
//         __location__(global)
// #define __shared__
//         __location__(shared)
// #define __constant__
//         __location__(constant)
// #define __managed__
//         __location__(managed)
        
// #if (defined(__CUDABE__) && !defined(__CUDACC_INTEGRATED__)) || !defined(__CUDACC__)
// #define __device_builtin__
// #define __device_builtin_texture_type__
// #define __device_builtin_surface_type__
// #define __cudart_builtin__
// #else /* (defined(__CUDABE__) && !defined(__CUDACC_INTEGRATED__))  || !__CUDACC__ */
// #define __device_builtin__
//         __location__(device_builtin)
// #define __device_builtin_texture_type__
//         __location__(device_builtin_texture_type)
// #define __device_builtin_surface_type__
//         __location__(device_builtin_surface_type)
// #define __cudart_builtin__
//         __location__(cudart_builtin)
// #endif /* (defined(__CUDABE__) && !defined(__CUDACC_INTEGRATED__))  || !__CUDACC__ */

// #if defined(__CUDACC__) && defined(__clang__)

// #if !defined(__has_feature)
// #error --- !!! The Clang version does not support __has_feature !!! ---
// #endif /* !__has_feature */

// #if defined(__cplusplus) && defined(__CUDACC__)
// #if (__has_feature(cxx_noexcept))
// #define NV_CLANG_ATOMIC_NOEXCEPT noexcept
// #define NV_CLANG_ATOMIC_NOEXCEPT_(x) noexcept(x)
// #else /* !__has_feature(cxx_noexcept) */
// #define NV_CLANG_ATOMIC_NOEXCEPT throw()
// #define NV_CLANG_ATOMIC_NOEXCEPT_(x)
// #endif /* __has_feature(cxx_noexcept) */
// #define _Atomic(X) __nv_clang_atomic_t<X>
// #endif /* defined(__cplusplus) && defined(__CUDACC__) */

// #endif /* __CUDACC__ && __clang__ */


// #endif /* !__HOST_DEFINES_H__ */


// Parsed from <device_types.h>

/*
 * Copyright 1993-2012 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__DEVICE_TYPES_H__)
// #define __DEVICE_TYPES_H__

// #include "host_defines.h"

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

/** enum cudaRoundMode */
public static final int
    cudaRoundNearest = 0,
    cudaRoundZero = 1,
    cudaRoundPosInf = 2,
    cudaRoundMinInf = 3;

// #endif /* !__DEVICE_TYPES_H__ */


// Parsed from <driver_types.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__DRIVER_TYPES_H__)
// #define __DRIVER_TYPES_H__

// #include "host_defines.h"

/**
 * \defgroup CUDART_TYPES Data types used by CUDA Runtime
 * \ingroup CUDART
 *
 * \{
 */

/*******************************************************************************
*                                                                              *
*  TYPE DEFINITIONS USED BY RUNTIME API                                        *
*                                                                              *
*******************************************************************************/

// #if !defined(__CUDA_INTERNAL_COMPILATION__) && !defined(__CUDACC_RTC__)

// #include <limits.h>
// #include <stddef.h>

/** Default page-locked allocation flag */
public static final int cudaHostAllocDefault =                0x00;
/** Pinned memory accessible by all CUDA contexts */
public static final int cudaHostAllocPortable =               0x01;
/** Map allocation into device space */
public static final int cudaHostAllocMapped =                 0x02;
/** Write-combined memory */
public static final int cudaHostAllocWriteCombined =          0x04;

/** Default host memory registration flag */
public static final int cudaHostRegisterDefault =             0x00;
/** Pinned memory accessible by all CUDA contexts */
public static final int cudaHostRegisterPortable =            0x01;
/** Map registered memory into device space */
public static final int cudaHostRegisterMapped =              0x02;
/** Memory-mapped I/O space */
public static final int cudaHostRegisterIoMemory =            0x04;

/** Default peer addressing enable flag */
public static final int cudaPeerAccessDefault =               0x00;

/** Default stream flag */
public static final int cudaStreamDefault =                   0x00;
/** Stream does not synchronize with stream 0 (the NULL stream) */
public static final int cudaStreamNonBlocking =               0x01;

 /**
 * Legacy stream handle
 *
 * Stream handle that can be passed as a cudaStream_t to use an implicit stream
 * with legacy synchronization behavior.
 *
 * See details of the \link_sync_behavior
 */
public static native @MemberGetter CUstream_st cudaStreamLegacy();
public static final CUstream_st cudaStreamLegacy = cudaStreamLegacy();

/**
 * Per-thread stream handle
 *
 * Stream handle that can be passed as a cudaStream_t to use an implicit stream
 * with per-thread synchronization behavior.
 *
 * See details of the \link_sync_behavior
 */
public static native @MemberGetter CUstream_st cudaStreamPerThread();
public static final CUstream_st cudaStreamPerThread = cudaStreamPerThread();

/** Default event flag */
public static final int cudaEventDefault =                    0x00;
/** Event uses blocking synchronization */
public static final int cudaEventBlockingSync =               0x01;
/** Event will not record timing data */
public static final int cudaEventDisableTiming =              0x02;
/** Event is suitable for interprocess use. cudaEventDisableTiming must be set */
public static final int cudaEventInterprocess =               0x04;

/** Device flag - Automatic scheduling */
public static final int cudaDeviceScheduleAuto =              0x00;
/** Device flag - Spin default scheduling */
public static final int cudaDeviceScheduleSpin =              0x01;
/** Device flag - Yield default scheduling */
public static final int cudaDeviceScheduleYield =             0x02;
/** Device flag - Use blocking synchronization */
public static final int cudaDeviceScheduleBlockingSync =      0x04;
/** Device flag - Use blocking synchronization 
                                                    *  @deprecated This flag was deprecated as of CUDA 4.0 and
                                                    *  replaced with ::cudaDeviceScheduleBlockingSync. */
public static final int cudaDeviceBlockingSync =              0x04;
/** Device schedule flags mask */
public static final int cudaDeviceScheduleMask =              0x07;
/** Device flag - Support mapped pinned allocations */
public static final int cudaDeviceMapHost =                   0x08;
/** Device flag - Keep local memory allocation after launch */
public static final int cudaDeviceLmemResizeToMax =           0x10;
/** Device flags mask */
public static final int cudaDeviceMask =                      0x1f;

/** Default CUDA array allocation flag */
public static final int cudaArrayDefault =                    0x00;
/** Must be set in cudaMalloc3DArray to create a layered CUDA array */
public static final int cudaArrayLayered =                    0x01;
/** Must be set in cudaMallocArray or cudaMalloc3DArray in order to bind surfaces to the CUDA array */
public static final int cudaArraySurfaceLoadStore =           0x02;
/** Must be set in cudaMalloc3DArray to create a cubemap CUDA array */
public static final int cudaArrayCubemap =                    0x04;
/** Must be set in cudaMallocArray or cudaMalloc3DArray in order to perform texture gather operations on the CUDA array */
public static final int cudaArrayTextureGather =              0x08;

/** Automatically enable peer access between remote devices as needed */
public static final int cudaIpcMemLazyEnablePeerAccess =      0x01;

/** Memory can be accessed by any stream on any device*/
public static final int cudaMemAttachGlobal =                 0x01;
/** Memory cannot be accessed by any stream on any device */
public static final int cudaMemAttachHost =                   0x02;
/** Memory can only be accessed by a single stream on the associated device */
public static final int cudaMemAttachSingle =                 0x04;

/** Default behavior */
public static final int cudaOccupancyDefault =                0x00;
/** Assume global caching is enabled and cannot be automatically turned off */
public static final int cudaOccupancyDisableCachingOverride = 0x01;

// #endif /* !__CUDA_INTERNAL_COMPILATION__ && !__CUDACC_RTC__ */

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

/**
 * CUDA error types
 */
/** enum cudaError */
public static final int
    /**
     * The API call returned with no errors. In the case of query calls, this
     * can also mean that the operation being queried is complete (see
     * ::cudaEventQuery() and ::cudaStreamQuery()).
     */
    cudaSuccess                           = 0,
  
    /**
     * The device function being invoked (usually via ::cudaLaunchKernel()) was not
     * previously configured via the ::cudaConfigureCall() function.
     */
    cudaErrorMissingConfiguration         = 1,
  
    /**
     * The API call failed because it was unable to allocate enough memory to
     * perform the requested operation.
     */
    cudaErrorMemoryAllocation             = 2,
  
    /**
     * The API call failed because the CUDA driver and runtime could not be
     * initialized.
     */
    cudaErrorInitializationError          = 3,
  
    /**
     * An exception occurred on the device while executing a kernel. Common
     * causes include dereferencing an invalid device pointer and accessing
     * out of bounds shared memory. The device cannot be used until
     * ::cudaThreadExit() is called. All existing device memory allocations
     * are invalid and must be reconstructed if the program is to continue
     * using CUDA.
     */
    cudaErrorLaunchFailure                = 4,
  
    /**
     * This indicated that a previous kernel launch failed. This was previously
     * used for device emulation of kernel launches.
     * @deprecated
     * This error return is deprecated as of CUDA 3.1. Device emulation mode was
     * removed with the CUDA 3.1 release.
     */
    cudaErrorPriorLaunchFailure           = 5,
  
    /**
     * This indicates that the device kernel took too long to execute. This can
     * only occur if timeouts are enabled - see the device property
     * \ref ::cudaDeviceProp::kernelExecTimeoutEnabled "kernelExecTimeoutEnabled"
     * for more information. The device cannot be used until ::cudaThreadExit()
     * is called. All existing device memory allocations are invalid and must be
     * reconstructed if the program is to continue using CUDA.
     */
    cudaErrorLaunchTimeout                = 6,
  
    /**
     * This indicates that a launch did not occur because it did not have
     * appropriate resources. Although this error is similar to
     * ::cudaErrorInvalidConfiguration, this error usually indicates that the
     * user has attempted to pass too many arguments to the device kernel, or the
     * kernel launch specifies too many threads for the kernel's register count.
     */
    cudaErrorLaunchOutOfResources         = 7,
  
    /**
     * The requested device function does not exist or is not compiled for the
     * proper device architecture.
     */
    cudaErrorInvalidDeviceFunction        = 8,
  
    /**
     * This indicates that a kernel launch is requesting resources that can
     * never be satisfied by the current device. Requesting more shared memory
     * per block than the device supports will trigger this error, as will
     * requesting too many threads or blocks. See ::cudaDeviceProp for more
     * device limitations.
     */
    cudaErrorInvalidConfiguration         = 9,
  
    /**
     * This indicates that the device ordinal supplied by the user does not
     * correspond to a valid CUDA device.
     */
    cudaErrorInvalidDevice                = 10,
  
    /**
     * This indicates that one or more of the parameters passed to the API call
     * is not within an acceptable range of values.
     */
    cudaErrorInvalidValue                 = 11,
  
    /**
     * This indicates that one or more of the pitch-related parameters passed
     * to the API call is not within the acceptable range for pitch.
     */
    cudaErrorInvalidPitchValue            = 12,
  
    /**
     * This indicates that the symbol name/identifier passed to the API call
     * is not a valid name or identifier.
     */
    cudaErrorInvalidSymbol                = 13,
  
    /**
     * This indicates that the buffer object could not be mapped.
     */
    cudaErrorMapBufferObjectFailed        = 14,
  
    /**
     * This indicates that the buffer object could not be unmapped.
     */
    cudaErrorUnmapBufferObjectFailed      = 15,
  
    /**
     * This indicates that at least one host pointer passed to the API call is
     * not a valid host pointer.
     */
    cudaErrorInvalidHostPointer           = 16,
  
    /**
     * This indicates that at least one device pointer passed to the API call is
     * not a valid device pointer.
     */
    cudaErrorInvalidDevicePointer         = 17,
  
    /**
     * This indicates that the texture passed to the API call is not a valid
     * texture.
     */
    cudaErrorInvalidTexture               = 18,
  
    /**
     * This indicates that the texture binding is not valid. This occurs if you
     * call ::cudaGetTextureAlignmentOffset() with an unbound texture.
     */
    cudaErrorInvalidTextureBinding        = 19,
  
    /**
     * This indicates that the channel descriptor passed to the API call is not
     * valid. This occurs if the format is not one of the formats specified by
     * ::cudaChannelFormatKind, or if one of the dimensions is invalid.
     */
    cudaErrorInvalidChannelDescriptor     = 20,
  
    /**
     * This indicates that the direction of the memcpy passed to the API call is
     * not one of the types specified by ::cudaMemcpyKind.
     */
    cudaErrorInvalidMemcpyDirection       = 21,
  
    /**
     * This indicated that the user has taken the address of a constant variable,
     * which was forbidden up until the CUDA 3.1 release.
     * @deprecated
     * This error return is deprecated as of CUDA 3.1. Variables in constant
     * memory may now have their address taken by the runtime via
     * ::cudaGetSymbolAddress().
     */
    cudaErrorAddressOfConstant            = 22,
  
    /**
     * This indicated that a texture fetch was not able to be performed.
     * This was previously used for device emulation of texture operations.
     * @deprecated
     * This error return is deprecated as of CUDA 3.1. Device emulation mode was
     * removed with the CUDA 3.1 release.
     */
    cudaErrorTextureFetchFailed           = 23,
  
    /**
     * This indicated that a texture was not bound for access.
     * This was previously used for device emulation of texture operations.
     * @deprecated
     * This error return is deprecated as of CUDA 3.1. Device emulation mode was
     * removed with the CUDA 3.1 release.
     */
    cudaErrorTextureNotBound              = 24,
  
    /**
     * This indicated that a synchronization operation had failed.
     * This was previously used for some device emulation functions.
     * @deprecated
     * This error return is deprecated as of CUDA 3.1. Device emulation mode was
     * removed with the CUDA 3.1 release.
     */
    cudaErrorSynchronizationError         = 25,
  
    /**
     * This indicates that a non-float texture was being accessed with linear
     * filtering. This is not supported by CUDA.
     */
    cudaErrorInvalidFilterSetting         = 26,
  
    /**
     * This indicates that an attempt was made to read a non-float texture as a
     * normalized float. This is not supported by CUDA.
     */
    cudaErrorInvalidNormSetting           = 27,
  
    /**
     * Mixing of device and device emulation code was not allowed.
     * @deprecated
     * This error return is deprecated as of CUDA 3.1. Device emulation mode was
     * removed with the CUDA 3.1 release.
     */
    cudaErrorMixedDeviceExecution         = 28,
  
    /**
     * This indicates that a CUDA Runtime API call cannot be executed because
     * it is being called during process shut down, at a point in time after
     * CUDA driver has been unloaded.
     */
    cudaErrorCudartUnloading              = 29,
  
    /**
     * This indicates that an unknown internal error has occurred.
     */
    cudaErrorUnknown                      = 30,

    /**
     * This indicates that the API call is not yet implemented. Production
     * releases of CUDA will never return this error.
     * @deprecated
     * This error return is deprecated as of CUDA 4.1.
     */
    cudaErrorNotYetImplemented            = 31,
  
    /**
     * This indicated that an emulated device pointer exceeded the 32-bit address
     * range.
     * @deprecated
     * This error return is deprecated as of CUDA 3.1. Device emulation mode was
     * removed with the CUDA 3.1 release.
     */
    cudaErrorMemoryValueTooLarge          = 32,
  
    /**
     * This indicates that a resource handle passed to the API call was not
     * valid. Resource handles are opaque types like ::cudaStream_t and
     * ::cudaEvent_t.
     */
    cudaErrorInvalidResourceHandle        = 33,
  
    /**
     * This indicates that asynchronous operations issued previously have not
     * completed yet. This result is not actually an error, but must be indicated
     * differently than ::cudaSuccess (which indicates completion). Calls that
     * may return this value include ::cudaEventQuery() and ::cudaStreamQuery().
     */
    cudaErrorNotReady                     = 34,
  
    /**
     * This indicates that the installed NVIDIA CUDA driver is older than the
     * CUDA runtime library. This is not a supported configuration. Users should
     * install an updated NVIDIA display driver to allow the application to run.
     */
    cudaErrorInsufficientDriver           = 35,
  
    /**
     * This indicates that the user has called ::cudaSetValidDevices(),
     * ::cudaSetDeviceFlags(), ::cudaD3D9SetDirect3DDevice(),
     * ::cudaD3D10SetDirect3DDevice, ::cudaD3D11SetDirect3DDevice(), or
     * ::cudaVDPAUSetVDPAUDevice() after initializing the CUDA runtime by
     * calling non-device management operations (allocating memory and
     * launching kernels are examples of non-device management operations).
     * This error can also be returned if using runtime/driver
     * interoperability and there is an existing ::CUcontext active on the
     * host thread.
     */
    cudaErrorSetOnActiveProcess           = 36,
  
    /**
     * This indicates that the surface passed to the API call is not a valid
     * surface.
     */
    cudaErrorInvalidSurface               = 37,
  
    /**
     * This indicates that no CUDA-capable devices were detected by the installed
     * CUDA driver.
     */
    cudaErrorNoDevice                     = 38,
  
    /**
     * This indicates that an uncorrectable ECC error was detected during
     * execution.
     */
    cudaErrorECCUncorrectable             = 39,
  
    /**
     * This indicates that a link to a shared object failed to resolve.
     */
    cudaErrorSharedObjectSymbolNotFound   = 40,
  
    /**
     * This indicates that initialization of a shared object failed.
     */
    cudaErrorSharedObjectInitFailed       = 41,
  
    /**
     * This indicates that the ::cudaLimit passed to the API call is not
     * supported by the active device.
     */
    cudaErrorUnsupportedLimit             = 42,
  
    /**
     * This indicates that multiple global or constant variables (across separate
     * CUDA source files in the application) share the same string name.
     */
    cudaErrorDuplicateVariableName        = 43,
  
    /**
     * This indicates that multiple textures (across separate CUDA source
     * files in the application) share the same string name.
     */
    cudaErrorDuplicateTextureName         = 44,
  
    /**
     * This indicates that multiple surfaces (across separate CUDA source
     * files in the application) share the same string name.
     */
    cudaErrorDuplicateSurfaceName         = 45,
  
    /**
     * This indicates that all CUDA devices are busy or unavailable at the current
     * time. Devices are often busy/unavailable due to use of
     * ::cudaComputeModeExclusive, ::cudaComputeModeProhibited or when long
     * running CUDA kernels have filled up the GPU and are blocking new work
     * from starting. They can also be unavailable due to memory constraints
     * on a device that already has active CUDA work being performed.
     */
    cudaErrorDevicesUnavailable           = 46,
  
    /**
     * This indicates that the device kernel image is invalid.
     */
    cudaErrorInvalidKernelImage           = 47,
  
    /**
     * This indicates that there is no kernel image available that is suitable
     * for the device. This can occur when a user specifies code generation
     * options for a particular CUDA source file that do not include the
     * corresponding device configuration.
     */
    cudaErrorNoKernelImageForDevice       = 48,
  
    /**
     * This indicates that the current context is not compatible with this
     * the CUDA Runtime. This can only occur if you are using CUDA
     * Runtime/Driver interoperability and have created an existing Driver
     * context using the driver API. The Driver context may be incompatible
     * either because the Driver context was created using an older version 
     * of the API, because the Runtime API call expects a primary driver 
     * context and the Driver context is not primary, or because the Driver 
     * context has been destroyed. Please see \ref CUDART_DRIVER "Interactions 
     * with the CUDA Driver API" for more information.
     */
    cudaErrorIncompatibleDriverContext    = 49,
      
    /**
     * This error indicates that a call to ::cudaDeviceEnablePeerAccess() is
     * trying to re-enable peer addressing on from a context which has already
     * had peer addressing enabled.
     */
    cudaErrorPeerAccessAlreadyEnabled     = 50,
    
    /**
     * This error indicates that ::cudaDeviceDisablePeerAccess() is trying to 
     * disable peer addressing which has not been enabled yet via 
     * ::cudaDeviceEnablePeerAccess().
     */
    cudaErrorPeerAccessNotEnabled         = 51,
    
    /**
     * This indicates that a call tried to access an exclusive-thread device that 
     * is already in use by a different thread.
     */
    cudaErrorDeviceAlreadyInUse           = 54,

    /**
     * This indicates profiler is not initialized for this run. This can
     * happen when the application is running with external profiling tools
     * like visual profiler.
     */
    cudaErrorProfilerDisabled             = 55,

    /**
     * @deprecated
     * This error return is deprecated as of CUDA 5.0. It is no longer an error
     * to attempt to enable/disable the profiling via ::cudaProfilerStart or
     * ::cudaProfilerStop without initialization.
     */
    cudaErrorProfilerNotInitialized       = 56,

    /**
     * @deprecated
     * This error return is deprecated as of CUDA 5.0. It is no longer an error
     * to call cudaProfilerStart() when profiling is already enabled.
     */
    cudaErrorProfilerAlreadyStarted       = 57,

    /**
     * @deprecated
     * This error return is deprecated as of CUDA 5.0. It is no longer an error
     * to call cudaProfilerStop() when profiling is already disabled.
     */
     cudaErrorProfilerAlreadyStopped       = 58,

    /**
     * An assert triggered in device code during kernel execution. The device
     * cannot be used again until ::cudaThreadExit() is called. All existing 
     * allocations are invalid and must be reconstructed if the program is to
     * continue using CUDA. 
     */
    cudaErrorAssert                        = 59,
  
    /**
     * This error indicates that the hardware resources required to enable
     * peer access have been exhausted for one or more of the devices 
     * passed to ::cudaEnablePeerAccess().
     */
    cudaErrorTooManyPeers                 = 60,
  
    /**
     * This error indicates that the memory range passed to ::cudaHostRegister()
     * has already been registered.
     */
    cudaErrorHostMemoryAlreadyRegistered  = 61,
        
    /**
     * This error indicates that the pointer passed to ::cudaHostUnregister()
     * does not correspond to any currently registered memory region.
     */
    cudaErrorHostMemoryNotRegistered      = 62,

    /**
     * This error indicates that an OS call failed.
     */
    cudaErrorOperatingSystem              = 63,

    /**
     * This error indicates that P2P access is not supported across the given
     * devices.
     */
    cudaErrorPeerAccessUnsupported        = 64,

    /**
     * This error indicates that a device runtime grid launch did not occur 
     * because the depth of the child grid would exceed the maximum supported
     * number of nested grid launches. 
     */
    cudaErrorLaunchMaxDepthExceeded       = 65,

    /**
     * This error indicates that a grid launch did not occur because the kernel 
     * uses file-scoped textures which are unsupported by the device runtime. 
     * Kernels launched via the device runtime only support textures created with 
     * the Texture Object API's.
     */
    cudaErrorLaunchFileScopedTex          = 66,

    /**
     * This error indicates that a grid launch did not occur because the kernel 
     * uses file-scoped surfaces which are unsupported by the device runtime.
     * Kernels launched via the device runtime only support surfaces created with
     * the Surface Object API's.
     */
    cudaErrorLaunchFileScopedSurf         = 67,

    /**
     * This error indicates that a call to ::cudaDeviceSynchronize made from
     * the device runtime failed because the call was made at grid depth greater
     * than than either the default (2 levels of grids) or user specified device 
     * limit ::cudaLimitDevRuntimeSyncDepth. To be able to synchronize on 
     * launched grids at a greater depth successfully, the maximum nested 
     * depth at which ::cudaDeviceSynchronize will be called must be specified 
     * with the ::cudaLimitDevRuntimeSyncDepth limit to the ::cudaDeviceSetLimit
     * api before the host-side launch of a kernel using the device runtime. 
     * Keep in mind that additional levels of sync depth require the runtime 
     * to reserve large amounts of device memory that cannot be used for 
     * user allocations.
     */
    cudaErrorSyncDepthExceeded            = 68,

    /**
     * This error indicates that a device runtime grid launch failed because
     * the launch would exceed the limit ::cudaLimitDevRuntimePendingLaunchCount.
     * For this launch to proceed successfully, ::cudaDeviceSetLimit must be
     * called to set the ::cudaLimitDevRuntimePendingLaunchCount to be higher 
     * than the upper bound of outstanding launches that can be issued to the
     * device runtime. Keep in mind that raising the limit of pending device
     * runtime launches will require the runtime to reserve device memory that
     * cannot be used for user allocations.
     */
    cudaErrorLaunchPendingCountExceeded   = 69,
    
    /**
     * This error indicates the attempted operation is not permitted.
     */
    cudaErrorNotPermitted                 = 70,

    /**
     * This error indicates the attempted operation is not supported
     * on the current system or device.
     */
    cudaErrorNotSupported                 = 71,

    /**
     * Device encountered an error in the call stack during kernel execution,
     * possibly due to stack corruption or exceeding the stack size limit.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    cudaErrorHardwareStackError           = 72,

    /**
     * The device encountered an illegal instruction during kernel execution
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    cudaErrorIllegalInstruction           = 73,

    /**
     * The device encountered a load or store instruction
     * on a memory address which is not aligned.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    cudaErrorMisalignedAddress            = 74,

    /**
     * While executing a kernel, the device encountered an instruction
     * which can only operate on memory locations in certain address spaces
     * (global, shared, or local), but was supplied a memory address not
     * belonging to an allowed address space.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    cudaErrorInvalidAddressSpace          = 75,

    /**
     * The device encountered an invalid program counter.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    cudaErrorInvalidPc                    = 76,

    /**
     * The device encountered a load or store instruction on an invalid memory address.
     * The context cannot be used, so it must be destroyed (and a new one should be created).
     * All existing device memory allocations from this context are invalid
     * and must be reconstructed if the program is to continue using CUDA.
     */
    cudaErrorIllegalAddress               = 77,

    /**
     * A PTX compilation failed. The runtime may fall back to compiling PTX if
     * an application does not contain a suitable binary for the current device.
     */
    cudaErrorInvalidPtx                   = 78,

    /**
     * This indicates an error with the OpenGL or DirectX context.
     */
    cudaErrorInvalidGraphicsContext       = 79,


    /**
     * This indicates an internal startup failure in the CUDA runtime.
     */
    cudaErrorStartupFailure               =    0x7f,

    /**
     * Any unhandled CUDA driver error is added to this value and returned via
     * the runtime. Production releases of CUDA should not return such errors.
     * @deprecated
     * This error return is deprecated as of CUDA 4.1.
     */
    cudaErrorApiFailureBase               = 10000;

/**
 * Channel format kind
 */
/** enum cudaChannelFormatKind */
public static final int
    /** Signed channel format */
    cudaChannelFormatKindSigned           = 0,
    /** Unsigned channel format */
    cudaChannelFormatKindUnsigned         = 1,
    /** Float channel format */
    cudaChannelFormatKindFloat            = 2,
    /** No channel format */
    cudaChannelFormatKindNone             = 3;

/**
 * CUDA Channel format descriptor
 */
public static class cudaChannelFormatDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaChannelFormatDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaChannelFormatDesc(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaChannelFormatDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaChannelFormatDesc position(int position) {
        return (cudaChannelFormatDesc)super.position(position);
    }

    /** x */
    public native int x(); public native cudaChannelFormatDesc x(int x);
    /** y */
    public native int y(); public native cudaChannelFormatDesc y(int y);
    /** z */
    public native int z(); public native cudaChannelFormatDesc z(int z);
    /** w */
    public native int w(); public native cudaChannelFormatDesc w(int w);
    /** Channel format kind */
    public native @Cast("cudaChannelFormatKind") int f(); public native cudaChannelFormatDesc f(int f);
}

/**
 * CUDA array
 */
@Opaque public static class cudaArray extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudaArray() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaArray(Pointer p) { super(p); }
}

/**
 * CUDA array (as source copy argument)
 */

/**
 * CUDA mipmapped array
 */
@Opaque public static class cudaMipmappedArray extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudaMipmappedArray() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMipmappedArray(Pointer p) { super(p); }
}

/**
 * CUDA mipmapped array (as source argument)
 */

/**
 * CUDA memory types
 */
/** enum cudaMemoryType */
public static final int
    /** Host memory */
    cudaMemoryTypeHost   = 1,
    /** Device memory */
    cudaMemoryTypeDevice = 2;

/**
 * CUDA memory copy types
 */
/** enum cudaMemcpyKind */
public static final int
    /** Host   -> Host */
    cudaMemcpyHostToHost          = 0,
    /** Host   -> Device */
    cudaMemcpyHostToDevice        = 1,
    /** Device -> Host */
    cudaMemcpyDeviceToHost        = 2,
    /** Device -> Device */
    cudaMemcpyDeviceToDevice      = 3,
    /** Default based unified virtual address space */
    cudaMemcpyDefault             = 4;

/**
 * CUDA Pitched memory pointer
 *
 * \sa ::make_cudaPitchedPtr
 */
public static class cudaPitchedPtr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaPitchedPtr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaPitchedPtr(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaPitchedPtr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaPitchedPtr position(int position) {
        return (cudaPitchedPtr)super.position(position);
    }

    /** Pointer to allocated memory */
    public native Pointer ptr(); public native cudaPitchedPtr ptr(Pointer ptr);
    /** Pitch of allocated memory in bytes */
    public native @Cast("size_t") long pitch(); public native cudaPitchedPtr pitch(long pitch);
    /** Logical width of allocation in elements */
    public native @Cast("size_t") long xsize(); public native cudaPitchedPtr xsize(long xsize);
    /** Logical height of allocation in elements */
    public native @Cast("size_t") long ysize(); public native cudaPitchedPtr ysize(long ysize);
}

/**
 * CUDA extent
 *
 * \sa ::make_cudaExtent
 */
public static class cudaExtent extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExtent() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaExtent(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExtent(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaExtent position(int position) {
        return (cudaExtent)super.position(position);
    }

    /** Width in elements when referring to array memory, in bytes when referring to linear memory */
    public native @Cast("size_t") long width(); public native cudaExtent width(long width);
    /** Height in elements */
    public native @Cast("size_t") long height(); public native cudaExtent height(long height);
    /** Depth in elements */
    public native @Cast("size_t") long depth(); public native cudaExtent depth(long depth);
}

/**
 * CUDA 3D position
 *
 * \sa ::make_cudaPos
 */
public static class cudaPos extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaPos() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaPos(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaPos(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaPos position(int position) {
        return (cudaPos)super.position(position);
    }

    /** x */
    public native @Cast("size_t") long x(); public native cudaPos x(long x);
    /** y */
    public native @Cast("size_t") long y(); public native cudaPos y(long y);
    /** z */
    public native @Cast("size_t") long z(); public native cudaPos z(long z);
}

/**
 * CUDA 3D memory copying parameters
 */
public static class cudaMemcpy3DParms extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemcpy3DParms() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaMemcpy3DParms(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemcpy3DParms(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaMemcpy3DParms position(int position) {
        return (cudaMemcpy3DParms)super.position(position);
    }

    /** Source memory address */
    public native cudaArray srcArray(); public native cudaMemcpy3DParms srcArray(cudaArray srcArray);
    /** Source position offset */
    public native @ByRef cudaPos srcPos(); public native cudaMemcpy3DParms srcPos(cudaPos srcPos);
    /** Pitched source memory address */
    public native @ByRef cudaPitchedPtr srcPtr(); public native cudaMemcpy3DParms srcPtr(cudaPitchedPtr srcPtr);
  
    /** Destination memory address */
    public native cudaArray dstArray(); public native cudaMemcpy3DParms dstArray(cudaArray dstArray);
    /** Destination position offset */
    public native @ByRef cudaPos dstPos(); public native cudaMemcpy3DParms dstPos(cudaPos dstPos);
    /** Pitched destination memory address */
    public native @ByRef cudaPitchedPtr dstPtr(); public native cudaMemcpy3DParms dstPtr(cudaPitchedPtr dstPtr);
  
    /** Requested memory copy size */
    public native @ByRef cudaExtent extent(); public native cudaMemcpy3DParms extent(cudaExtent extent);
    /** Type of transfer */
    public native @Cast("cudaMemcpyKind") int kind(); public native cudaMemcpy3DParms kind(int kind);
}

/**
 * CUDA 3D cross-device memory copying parameters
 */
public static class cudaMemcpy3DPeerParms extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemcpy3DPeerParms() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaMemcpy3DPeerParms(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemcpy3DPeerParms(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaMemcpy3DPeerParms position(int position) {
        return (cudaMemcpy3DPeerParms)super.position(position);
    }

    /** Source memory address */
    public native cudaArray srcArray(); public native cudaMemcpy3DPeerParms srcArray(cudaArray srcArray);
    /** Source position offset */
    public native @ByRef cudaPos srcPos(); public native cudaMemcpy3DPeerParms srcPos(cudaPos srcPos);
    /** Pitched source memory address */
    public native @ByRef cudaPitchedPtr srcPtr(); public native cudaMemcpy3DPeerParms srcPtr(cudaPitchedPtr srcPtr);
    /** Source device */
    public native int srcDevice(); public native cudaMemcpy3DPeerParms srcDevice(int srcDevice);
  
    /** Destination memory address */
    public native cudaArray dstArray(); public native cudaMemcpy3DPeerParms dstArray(cudaArray dstArray);
    /** Destination position offset */
    public native @ByRef cudaPos dstPos(); public native cudaMemcpy3DPeerParms dstPos(cudaPos dstPos);
    /** Pitched destination memory address */
    public native @ByRef cudaPitchedPtr dstPtr(); public native cudaMemcpy3DPeerParms dstPtr(cudaPitchedPtr dstPtr);
    /** Destination device */
    public native int dstDevice(); public native cudaMemcpy3DPeerParms dstDevice(int dstDevice);
  
    /** Requested memory copy size */
    public native @ByRef cudaExtent extent(); public native cudaMemcpy3DPeerParms extent(cudaExtent extent);
}

/**
 * CUDA graphics interop resource
 */
@Opaque public static class cudaGraphicsResource extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudaGraphicsResource() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaGraphicsResource(Pointer p) { super(p); }
}

/**
 * CUDA graphics interop register flags
 */
/** enum cudaGraphicsRegisterFlags */
public static final int
    /** Default */
    cudaGraphicsRegisterFlagsNone             = 0,
    /** CUDA will not write to this resource */
    cudaGraphicsRegisterFlagsReadOnly         = 1, 
    /** CUDA will only write to and will not read from this resource */
    cudaGraphicsRegisterFlagsWriteDiscard     = 2,
    /** CUDA will bind this resource to a surface reference */
    cudaGraphicsRegisterFlagsSurfaceLoadStore = 4,
    /** CUDA will perform texture gather operations on this resource */
    cudaGraphicsRegisterFlagsTextureGather    = 8;

/**
 * CUDA graphics interop map flags
 */
/** enum cudaGraphicsMapFlags */
public static final int
    /** Default; Assume resource can be read/written */
    cudaGraphicsMapFlagsNone         = 0,
    /** CUDA will not write to this resource */
    cudaGraphicsMapFlagsReadOnly     = 1,
    /** CUDA will only write to and will not read from this resource */
    cudaGraphicsMapFlagsWriteDiscard = 2;

/**
 * CUDA graphics interop array indices for cube maps
 */
/** enum cudaGraphicsCubeFace */
public static final int
    /** Positive X face of cubemap */
    cudaGraphicsCubeFacePositiveX =  0x00,
    /** Negative X face of cubemap */
    cudaGraphicsCubeFaceNegativeX =  0x01,
    /** Positive Y face of cubemap */
    cudaGraphicsCubeFacePositiveY =  0x02,
    /** Negative Y face of cubemap */
    cudaGraphicsCubeFaceNegativeY =  0x03,
    /** Positive Z face of cubemap */
    cudaGraphicsCubeFacePositiveZ =  0x04,
    /** Negative Z face of cubemap */
    cudaGraphicsCubeFaceNegativeZ =  0x05;

/**
 * CUDA resource types
 */
/** enum cudaResourceType */
public static final int
    /** Array resource */
    cudaResourceTypeArray          =  0x00,
    /** Mipmapped array resource */
    cudaResourceTypeMipmappedArray =  0x01,
    /** Linear resource */
    cudaResourceTypeLinear         =  0x02,
    /** Pitch 2D resource */
    cudaResourceTypePitch2D        =  0x03;

/**
 * CUDA texture resource view formats
 */
/** enum cudaResourceViewFormat */
public static final int
    /** No resource view format (use underlying resource format) */
    cudaResViewFormatNone                      =  0x00,
    /** 1 channel unsigned 8-bit integers */
    cudaResViewFormatUnsignedChar1             =  0x01,
    /** 2 channel unsigned 8-bit integers */
    cudaResViewFormatUnsignedChar2             =  0x02,
    /** 4 channel unsigned 8-bit integers */
    cudaResViewFormatUnsignedChar4             =  0x03,
    /** 1 channel signed 8-bit integers */
    cudaResViewFormatSignedChar1               =  0x04,
    /** 2 channel signed 8-bit integers */
    cudaResViewFormatSignedChar2               =  0x05,
    /** 4 channel signed 8-bit integers */
    cudaResViewFormatSignedChar4               =  0x06,
    /** 1 channel unsigned 16-bit integers */
    cudaResViewFormatUnsignedShort1            =  0x07,
    /** 2 channel unsigned 16-bit integers */
    cudaResViewFormatUnsignedShort2            =  0x08,
    /** 4 channel unsigned 16-bit integers */
    cudaResViewFormatUnsignedShort4            =  0x09,
    /** 1 channel signed 16-bit integers */
    cudaResViewFormatSignedShort1              =  0x0a,
    /** 2 channel signed 16-bit integers */
    cudaResViewFormatSignedShort2              =  0x0b,
    /** 4 channel signed 16-bit integers */
    cudaResViewFormatSignedShort4              =  0x0c,
    /** 1 channel unsigned 32-bit integers */
    cudaResViewFormatUnsignedInt1              =  0x0d,
    /** 2 channel unsigned 32-bit integers */
    cudaResViewFormatUnsignedInt2              =  0x0e,
    /** 4 channel unsigned 32-bit integers */
    cudaResViewFormatUnsignedInt4              =  0x0f,
    /** 1 channel signed 32-bit integers */
    cudaResViewFormatSignedInt1                =  0x10,
    /** 2 channel signed 32-bit integers */
    cudaResViewFormatSignedInt2                =  0x11,
    /** 4 channel signed 32-bit integers */
    cudaResViewFormatSignedInt4                =  0x12,
    /** 1 channel 16-bit floating point */
    cudaResViewFormatHalf1                     =  0x13,
    /** 2 channel 16-bit floating point */
    cudaResViewFormatHalf2                     =  0x14,
    /** 4 channel 16-bit floating point */
    cudaResViewFormatHalf4                     =  0x15,
    /** 1 channel 32-bit floating point */
    cudaResViewFormatFloat1                    =  0x16,
    /** 2 channel 32-bit floating point */
    cudaResViewFormatFloat2                    =  0x17,
    /** 4 channel 32-bit floating point */
    cudaResViewFormatFloat4                    =  0x18,
    /** Block compressed 1 */
    cudaResViewFormatUnsignedBlockCompressed1  =  0x19,
    /** Block compressed 2 */
    cudaResViewFormatUnsignedBlockCompressed2  =  0x1a,
    /** Block compressed 3 */
    cudaResViewFormatUnsignedBlockCompressed3  =  0x1b,
    /** Block compressed 4 unsigned */
    cudaResViewFormatUnsignedBlockCompressed4  =  0x1c,
    /** Block compressed 4 signed */
    cudaResViewFormatSignedBlockCompressed4    =  0x1d,
    /** Block compressed 5 unsigned */
    cudaResViewFormatUnsignedBlockCompressed5  =  0x1e,
    /** Block compressed 5 signed */
    cudaResViewFormatSignedBlockCompressed5    =  0x1f,
    /** Block compressed 6 unsigned half-float */
    cudaResViewFormatUnsignedBlockCompressed6H =  0x20,
    /** Block compressed 6 signed half-float */
    cudaResViewFormatSignedBlockCompressed6H   =  0x21,
    /** Block compressed 7 */
    cudaResViewFormatUnsignedBlockCompressed7  =  0x22;

/**
 * CUDA resource descriptor
 */
public static class cudaResourceDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaResourceDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaResourceDesc(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaResourceDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaResourceDesc position(int position) {
        return (cudaResourceDesc)super.position(position);
    }

	/** Resource type */
	public native @Cast("cudaResourceType") int resType(); public native cudaResourceDesc resType(int resType);
	
			/** CUDA array */
			@Name("res.array.array") public native cudaArray res_array_array(); public native cudaResourceDesc res_array_array(cudaArray res_array_array);
            /** CUDA mipmapped array */
            @Name("res.mipmap.mipmap") public native cudaMipmappedArray res_mipmap_mipmap(); public native cudaResourceDesc res_mipmap_mipmap(cudaMipmappedArray res_mipmap_mipmap);
			/** Device pointer */
			@Name("res.linear.devPtr") public native Pointer res_linear_devPtr(); public native cudaResourceDesc res_linear_devPtr(Pointer res_linear_devPtr);
			/** Channel descriptor */
			@Name("res.linear.desc") public native @ByRef cudaChannelFormatDesc res_linear_desc(); public native cudaResourceDesc res_linear_desc(cudaChannelFormatDesc res_linear_desc);
			/** Size in bytes */
			@Name("res.linear.sizeInBytes") public native @Cast("size_t") long res_linear_sizeInBytes(); public native cudaResourceDesc res_linear_sizeInBytes(long res_linear_sizeInBytes);
			/** Device pointer */
			@Name("res.pitch2D.devPtr") public native Pointer res_pitch2D_devPtr(); public native cudaResourceDesc res_pitch2D_devPtr(Pointer res_pitch2D_devPtr);
			/** Channel descriptor */
			@Name("res.pitch2D.desc") public native @ByRef cudaChannelFormatDesc res_pitch2D_desc(); public native cudaResourceDesc res_pitch2D_desc(cudaChannelFormatDesc res_pitch2D_desc);
			/** Width of the array in elements */
			@Name("res.pitch2D.width") public native @Cast("size_t") long res_pitch2D_width(); public native cudaResourceDesc res_pitch2D_width(long res_pitch2D_width);
			/** Height of the array in elements */
			@Name("res.pitch2D.height") public native @Cast("size_t") long res_pitch2D_height(); public native cudaResourceDesc res_pitch2D_height(long res_pitch2D_height);
			/** Pitch between two rows in bytes */
			@Name("res.pitch2D.pitchInBytes") public native @Cast("size_t") long res_pitch2D_pitchInBytes(); public native cudaResourceDesc res_pitch2D_pitchInBytes(long res_pitch2D_pitchInBytes);
}

/**
 * CUDA resource view descriptor
 */
public static class cudaResourceViewDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaResourceViewDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaResourceViewDesc(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaResourceViewDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaResourceViewDesc position(int position) {
        return (cudaResourceViewDesc)super.position(position);
    }

    /** Resource view format */
    public native @Cast("cudaResourceViewFormat") int format(); public native cudaResourceViewDesc format(int format);
    /** Width of the resource view */
    public native @Cast("size_t") long width(); public native cudaResourceViewDesc width(long width);
    /** Height of the resource view */
    public native @Cast("size_t") long height(); public native cudaResourceViewDesc height(long height);
    /** Depth of the resource view */
    public native @Cast("size_t") long depth(); public native cudaResourceViewDesc depth(long depth);
    /** First defined mipmap level */
    public native @Cast("unsigned int") int firstMipmapLevel(); public native cudaResourceViewDesc firstMipmapLevel(int firstMipmapLevel);
    /** Last defined mipmap level */
    public native @Cast("unsigned int") int lastMipmapLevel(); public native cudaResourceViewDesc lastMipmapLevel(int lastMipmapLevel);
    /** First layer index */
    public native @Cast("unsigned int") int firstLayer(); public native cudaResourceViewDesc firstLayer(int firstLayer);
    /** Last layer index */
    public native @Cast("unsigned int") int lastLayer(); public native cudaResourceViewDesc lastLayer(int lastLayer);
}

/**
 * CUDA pointer attributes
 */
public static class cudaPointerAttributes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaPointerAttributes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaPointerAttributes(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaPointerAttributes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaPointerAttributes position(int position) {
        return (cudaPointerAttributes)super.position(position);
    }

    /**
     * The physical location of the memory, ::cudaMemoryTypeHost or 
     * ::cudaMemoryTypeDevice.
     */
    public native @Cast("cudaMemoryType") int memoryType(); public native cudaPointerAttributes memoryType(int memoryType);

    /** 
     * The device against which the memory was allocated or registered.
     * If the memory type is ::cudaMemoryTypeDevice then this identifies 
     * the device on which the memory referred physically resides.  If
     * the memory type is ::cudaMemoryTypeHost then this identifies the 
     * device which was current when the memory was allocated or registered
     * (and if that device is deinitialized then this allocation will vanish
     * with that device's state).
     */
    public native int device(); public native cudaPointerAttributes device(int device);

    /**
     * The address which may be dereferenced on the current device to access 
     * the memory or NULL if no such address exists.
     */
    public native Pointer devicePointer(); public native cudaPointerAttributes devicePointer(Pointer devicePointer);

    /**
     * The address which may be dereferenced on the host to access the
     * memory or NULL if no such address exists.
     */
    public native Pointer hostPointer(); public native cudaPointerAttributes hostPointer(Pointer hostPointer);

    /**
     * Indicates if this pointer points to managed memory
     */
    public native int isManaged(); public native cudaPointerAttributes isManaged(int isManaged);
}

/**
 * CUDA function attributes
 */
public static class cudaFuncAttributes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaFuncAttributes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaFuncAttributes(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaFuncAttributes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaFuncAttributes position(int position) {
        return (cudaFuncAttributes)super.position(position);
    }

   /**
    * The size in bytes of statically-allocated shared memory per block
    * required by this function. This does not include dynamically-allocated
    * shared memory requested by the user at runtime.
    */
   public native @Cast("size_t") long sharedSizeBytes(); public native cudaFuncAttributes sharedSizeBytes(long sharedSizeBytes);

   /**
    * The size in bytes of user-allocated constant memory required by this
    * function.
    */
   public native @Cast("size_t") long constSizeBytes(); public native cudaFuncAttributes constSizeBytes(long constSizeBytes);

   /**
    * The size in bytes of local memory used by each thread of this function.
    */
   public native @Cast("size_t") long localSizeBytes(); public native cudaFuncAttributes localSizeBytes(long localSizeBytes);

   /**
    * The maximum number of threads per block, beyond which a launch of the
    * function would fail. This number depends on both the function and the
    * device on which the function is currently loaded.
    */
   public native int maxThreadsPerBlock(); public native cudaFuncAttributes maxThreadsPerBlock(int maxThreadsPerBlock);

   /**
    * The number of registers used by each thread of this function.
    */
   public native int numRegs(); public native cudaFuncAttributes numRegs(int numRegs);

   /**
    * The PTX virtual architecture version for which the function was
    * compiled. This value is the major PTX version * 10 + the minor PTX
    * version, so a PTX version 1.3 function would return the value 13.
    */
   public native int ptxVersion(); public native cudaFuncAttributes ptxVersion(int ptxVersion);

   /**
    * The binary architecture version for which the function was compiled.
    * This value is the major binary version * 10 + the minor binary version,
    * so a binary version 1.3 function would return the value 13.
    */
   public native int binaryVersion(); public native cudaFuncAttributes binaryVersion(int binaryVersion);

   /**
    * The attribute to indicate whether the function has been compiled with 
    * user specified option "-Xptxas --dlcm=ca" set.
    */
   public native int cacheModeCA(); public native cudaFuncAttributes cacheModeCA(int cacheModeCA);
}

/**
 * CUDA function cache configurations
 */
/** enum cudaFuncCache */
public static final int
    /** Default function cache configuration, no preference */
    cudaFuncCachePreferNone   = 0,
    /** Prefer larger shared memory and smaller L1 cache  */
    cudaFuncCachePreferShared = 1,
    /** Prefer larger L1 cache and smaller shared memory */
    cudaFuncCachePreferL1     = 2,
    /** Prefer equal size L1 cache and shared memory */
    cudaFuncCachePreferEqual  = 3;

/**
 * CUDA shared memory configuration
 */

/** enum cudaSharedMemConfig */
public static final int
    cudaSharedMemBankSizeDefault   = 0,
    cudaSharedMemBankSizeFourByte  = 1,
    cudaSharedMemBankSizeEightByte = 2;

/**
 * CUDA device compute modes
 */
/** enum cudaComputeMode */
public static final int
    /** Default compute mode (Multiple threads can use ::cudaSetDevice() with this device) */
    cudaComputeModeDefault          = 0,
    /** Compute-exclusive-thread mode (Only one thread in one process will be able to use ::cudaSetDevice() with this device) */
    cudaComputeModeExclusive        = 1,
    /** Compute-prohibited mode (No threads can use ::cudaSetDevice() with this device) */
    cudaComputeModeProhibited       = 2,
    /** Compute-exclusive-process mode (Many threads in one process will be able to use ::cudaSetDevice() with this device) */
    cudaComputeModeExclusiveProcess = 3;

/**
 * CUDA Limits
 */
/** enum cudaLimit */
public static final int
    /** GPU thread stack size */
    cudaLimitStackSize                    =  0x00,
    /** GPU printf/fprintf FIFO size */
    cudaLimitPrintfFifoSize               =  0x01,
    /** GPU malloc heap size */
    cudaLimitMallocHeapSize               =  0x02,
    /** GPU device runtime synchronize depth */
    cudaLimitDevRuntimeSyncDepth          =  0x03,
    /** GPU device runtime pending launch count */
    cudaLimitDevRuntimePendingLaunchCount =  0x04;

/**
 * CUDA Profiler Output modes
 */
/** enum cudaOutputMode */
public static final int
    /** Output mode Key-Value pair format. */
    cudaKeyValuePair    =  0x00,
    /** Output mode Comma separated values format. */
    cudaCSV             =  0x01;

/**
 * CUDA device attributes
 */
/** enum cudaDeviceAttr */
public static final int
    /** Maximum number of threads per block */
    cudaDevAttrMaxThreadsPerBlock             = 1,
    /** Maximum block dimension X */
    cudaDevAttrMaxBlockDimX                   = 2,
    /** Maximum block dimension Y */
    cudaDevAttrMaxBlockDimY                   = 3,
    /** Maximum block dimension Z */
    cudaDevAttrMaxBlockDimZ                   = 4,
    /** Maximum grid dimension X */
    cudaDevAttrMaxGridDimX                    = 5,
    /** Maximum grid dimension Y */
    cudaDevAttrMaxGridDimY                    = 6,
    /** Maximum grid dimension Z */
    cudaDevAttrMaxGridDimZ                    = 7,
    /** Maximum shared memory available per block in bytes */
    cudaDevAttrMaxSharedMemoryPerBlock        = 8,
    /** Memory available on device for __constant__ variables in a CUDA C kernel in bytes */
    cudaDevAttrTotalConstantMemory            = 9,
    /** Warp size in threads */
    cudaDevAttrWarpSize                       = 10,
    /** Maximum pitch in bytes allowed by memory copies */
    cudaDevAttrMaxPitch                       = 11,
    /** Maximum number of 32-bit registers available per block */
    cudaDevAttrMaxRegistersPerBlock           = 12,
    /** Peak clock frequency in kilohertz */
    cudaDevAttrClockRate                      = 13,
    /** Alignment requirement for textures */
    cudaDevAttrTextureAlignment               = 14,
    /** Device can possibly copy memory and execute a kernel concurrently */
    cudaDevAttrGpuOverlap                     = 15,
    /** Number of multiprocessors on device */
    cudaDevAttrMultiProcessorCount            = 16,
    /** Specifies whether there is a run time limit on kernels */
    cudaDevAttrKernelExecTimeout              = 17,
    /** Device is integrated with host memory */
    cudaDevAttrIntegrated                     = 18,
    /** Device can map host memory into CUDA address space */
    cudaDevAttrCanMapHostMemory               = 19,
    /** Compute mode (See ::cudaComputeMode for details) */
    cudaDevAttrComputeMode                    = 20,
    /** Maximum 1D texture width */
    cudaDevAttrMaxTexture1DWidth              = 21,
    /** Maximum 2D texture width */
    cudaDevAttrMaxTexture2DWidth              = 22,
    /** Maximum 2D texture height */
    cudaDevAttrMaxTexture2DHeight             = 23,
    /** Maximum 3D texture width */
    cudaDevAttrMaxTexture3DWidth              = 24,
    /** Maximum 3D texture height */
    cudaDevAttrMaxTexture3DHeight             = 25,
    /** Maximum 3D texture depth */
    cudaDevAttrMaxTexture3DDepth              = 26,
    /** Maximum 2D layered texture width */
    cudaDevAttrMaxTexture2DLayeredWidth       = 27,
    /** Maximum 2D layered texture height */
    cudaDevAttrMaxTexture2DLayeredHeight      = 28,
    /** Maximum layers in a 2D layered texture */
    cudaDevAttrMaxTexture2DLayeredLayers      = 29,
    /** Alignment requirement for surfaces */
    cudaDevAttrSurfaceAlignment               = 30,
    /** Device can possibly execute multiple kernels concurrently */
    cudaDevAttrConcurrentKernels              = 31,
    /** Device has ECC support enabled */
    cudaDevAttrEccEnabled                     = 32,
    /** PCI bus ID of the device */
    cudaDevAttrPciBusId                       = 33,
    /** PCI device ID of the device */
    cudaDevAttrPciDeviceId                    = 34,
    /** Device is using TCC driver model */
    cudaDevAttrTccDriver                      = 35,
    /** Peak memory clock frequency in kilohertz */
    cudaDevAttrMemoryClockRate                = 36,
    /** Global memory bus width in bits */
    cudaDevAttrGlobalMemoryBusWidth           = 37,
    /** Size of L2 cache in bytes */
    cudaDevAttrL2CacheSize                    = 38,
    /** Maximum resident threads per multiprocessor */
    cudaDevAttrMaxThreadsPerMultiProcessor    = 39,
    /** Number of asynchronous engines */
    cudaDevAttrAsyncEngineCount               = 40,
    /** Device shares a unified address space with the host */
    cudaDevAttrUnifiedAddressing              = 41,    
    /** Maximum 1D layered texture width */
    cudaDevAttrMaxTexture1DLayeredWidth       = 42,
    /** Maximum layers in a 1D layered texture */
    cudaDevAttrMaxTexture1DLayeredLayers      = 43,
    /** Maximum 2D texture width if cudaArrayTextureGather is set */
    cudaDevAttrMaxTexture2DGatherWidth        = 45,
    /** Maximum 2D texture height if cudaArrayTextureGather is set */
    cudaDevAttrMaxTexture2DGatherHeight       = 46,
    /** Alternate maximum 3D texture width */
    cudaDevAttrMaxTexture3DWidthAlt           = 47,
    /** Alternate maximum 3D texture height */
    cudaDevAttrMaxTexture3DHeightAlt          = 48,
    /** Alternate maximum 3D texture depth */
    cudaDevAttrMaxTexture3DDepthAlt           = 49,
    /** PCI domain ID of the device */
    cudaDevAttrPciDomainId                    = 50,
    /** Pitch alignment requirement for textures */
    cudaDevAttrTexturePitchAlignment          = 51,
    /** Maximum cubemap texture width/height */
    cudaDevAttrMaxTextureCubemapWidth         = 52,
    /** Maximum cubemap layered texture width/height */
    cudaDevAttrMaxTextureCubemapLayeredWidth  = 53,
    /** Maximum layers in a cubemap layered texture */
    cudaDevAttrMaxTextureCubemapLayeredLayers = 54,
    /** Maximum 1D surface width */
    cudaDevAttrMaxSurface1DWidth              = 55,
    /** Maximum 2D surface width */
    cudaDevAttrMaxSurface2DWidth              = 56,
    /** Maximum 2D surface height */
    cudaDevAttrMaxSurface2DHeight             = 57,
    /** Maximum 3D surface width */
    cudaDevAttrMaxSurface3DWidth              = 58,
    /** Maximum 3D surface height */
    cudaDevAttrMaxSurface3DHeight             = 59,
    /** Maximum 3D surface depth */
    cudaDevAttrMaxSurface3DDepth              = 60,
    /** Maximum 1D layered surface width */
    cudaDevAttrMaxSurface1DLayeredWidth       = 61,
    /** Maximum layers in a 1D layered surface */
    cudaDevAttrMaxSurface1DLayeredLayers      = 62,
    /** Maximum 2D layered surface width */
    cudaDevAttrMaxSurface2DLayeredWidth       = 63,
    /** Maximum 2D layered surface height */
    cudaDevAttrMaxSurface2DLayeredHeight      = 64,
    /** Maximum layers in a 2D layered surface */
    cudaDevAttrMaxSurface2DLayeredLayers      = 65,
    /** Maximum cubemap surface width */
    cudaDevAttrMaxSurfaceCubemapWidth         = 66,
    /** Maximum cubemap layered surface width */
    cudaDevAttrMaxSurfaceCubemapLayeredWidth  = 67,
    /** Maximum layers in a cubemap layered surface */
    cudaDevAttrMaxSurfaceCubemapLayeredLayers = 68,
    /** Maximum 1D linear texture width */
    cudaDevAttrMaxTexture1DLinearWidth        = 69,
    /** Maximum 2D linear texture width */
    cudaDevAttrMaxTexture2DLinearWidth        = 70,
    /** Maximum 2D linear texture height */
    cudaDevAttrMaxTexture2DLinearHeight       = 71,
    /** Maximum 2D linear texture pitch in bytes */
    cudaDevAttrMaxTexture2DLinearPitch        = 72,
    /** Maximum mipmapped 2D texture width */
    cudaDevAttrMaxTexture2DMipmappedWidth     = 73,
    /** Maximum mipmapped 2D texture height */
    cudaDevAttrMaxTexture2DMipmappedHeight    = 74,
    /** Major compute capability version number */
    cudaDevAttrComputeCapabilityMajor         = 75, 
    /** Minor compute capability version number */
    cudaDevAttrComputeCapabilityMinor         = 76,
    /** Maximum mipmapped 1D texture width */
    cudaDevAttrMaxTexture1DMipmappedWidth     = 77,
    /** Device supports stream priorities */
    cudaDevAttrStreamPrioritiesSupported      = 78,
    /** Device supports caching globals in L1 */
    cudaDevAttrGlobalL1CacheSupported         = 79,
    /** Device supports caching locals in L1 */
    cudaDevAttrLocalL1CacheSupported          = 80,
    /** Maximum shared memory available per multiprocessor in bytes */
    cudaDevAttrMaxSharedMemoryPerMultiprocessor = 81,
    /** Maximum number of 32-bit registers available per multiprocessor */
    cudaDevAttrMaxRegistersPerMultiprocessor  = 82,
    /** Device can allocate managed memory on this system */
    cudaDevAttrManagedMemory                  = 83,
    /** Device is on a multi-GPU board */
    cudaDevAttrIsMultiGpuBoard                = 84,
    /** Unique identifier for a group of devices on the same multi-GPU board */
    cudaDevAttrMultiGpuBoardGroupID           = 85;

/**
 * CUDA device properties
 */
public static class cudaDeviceProp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaDeviceProp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaDeviceProp(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaDeviceProp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaDeviceProp position(int position) {
        return (cudaDeviceProp)super.position(position);
    }

    /** ASCII string identifying device */
    public native @Cast("char") byte name(int i); public native cudaDeviceProp name(int i, byte name);
    @MemberGetter public native @Cast("char*") BytePointer name();
    /** Global memory available on device in bytes */
    public native @Cast("size_t") long totalGlobalMem(); public native cudaDeviceProp totalGlobalMem(long totalGlobalMem);
    /** Shared memory available per block in bytes */
    public native @Cast("size_t") long sharedMemPerBlock(); public native cudaDeviceProp sharedMemPerBlock(long sharedMemPerBlock);
    /** 32-bit registers available per block */
    public native int regsPerBlock(); public native cudaDeviceProp regsPerBlock(int regsPerBlock);
    /** Warp size in threads */
    public native int warpSize(); public native cudaDeviceProp warpSize(int warpSize);
    /** Maximum pitch in bytes allowed by memory copies */
    public native @Cast("size_t") long memPitch(); public native cudaDeviceProp memPitch(long memPitch);
    /** Maximum number of threads per block */
    public native int maxThreadsPerBlock(); public native cudaDeviceProp maxThreadsPerBlock(int maxThreadsPerBlock);
    /** Maximum size of each dimension of a block */
    public native int maxThreadsDim(int i); public native cudaDeviceProp maxThreadsDim(int i, int maxThreadsDim);
    @MemberGetter public native IntPointer maxThreadsDim();
    /** Maximum size of each dimension of a grid */
    public native int maxGridSize(int i); public native cudaDeviceProp maxGridSize(int i, int maxGridSize);
    @MemberGetter public native IntPointer maxGridSize();
    /** Clock frequency in kilohertz */
    public native int clockRate(); public native cudaDeviceProp clockRate(int clockRate);
    /** Constant memory available on device in bytes */
    public native @Cast("size_t") long totalConstMem(); public native cudaDeviceProp totalConstMem(long totalConstMem);
    /** Major compute capability */
    public native int major(); public native cudaDeviceProp major(int major);
    /** Minor compute capability */
    public native int minor(); public native cudaDeviceProp minor(int minor);
    /** Alignment requirement for textures */
    public native @Cast("size_t") long textureAlignment(); public native cudaDeviceProp textureAlignment(long textureAlignment);
    /** Pitch alignment requirement for texture references bound to pitched memory */
    public native @Cast("size_t") long texturePitchAlignment(); public native cudaDeviceProp texturePitchAlignment(long texturePitchAlignment);
    /** Device can concurrently copy memory and execute a kernel. Deprecated. Use instead asyncEngineCount. */
    public native int deviceOverlap(); public native cudaDeviceProp deviceOverlap(int deviceOverlap);
    /** Number of multiprocessors on device */
    public native int multiProcessorCount(); public native cudaDeviceProp multiProcessorCount(int multiProcessorCount);
    /** Specified whether there is a run time limit on kernels */
    public native int kernelExecTimeoutEnabled(); public native cudaDeviceProp kernelExecTimeoutEnabled(int kernelExecTimeoutEnabled);
    /** Device is integrated as opposed to discrete */
    public native int integrated(); public native cudaDeviceProp integrated(int integrated);
    /** Device can map host memory with cudaHostAlloc/cudaHostGetDevicePointer */
    public native int canMapHostMemory(); public native cudaDeviceProp canMapHostMemory(int canMapHostMemory);
    /** Compute mode (See ::cudaComputeMode) */
    public native int computeMode(); public native cudaDeviceProp computeMode(int computeMode);
    /** Maximum 1D texture size */
    public native int maxTexture1D(); public native cudaDeviceProp maxTexture1D(int maxTexture1D);
    /** Maximum 1D mipmapped texture size */
    public native int maxTexture1DMipmap(); public native cudaDeviceProp maxTexture1DMipmap(int maxTexture1DMipmap);
    /** Maximum size for 1D textures bound to linear memory */
    public native int maxTexture1DLinear(); public native cudaDeviceProp maxTexture1DLinear(int maxTexture1DLinear);
    /** Maximum 2D texture dimensions */
    public native int maxTexture2D(int i); public native cudaDeviceProp maxTexture2D(int i, int maxTexture2D);
    @MemberGetter public native IntPointer maxTexture2D();
    /** Maximum 2D mipmapped texture dimensions */
    public native int maxTexture2DMipmap(int i); public native cudaDeviceProp maxTexture2DMipmap(int i, int maxTexture2DMipmap);
    @MemberGetter public native IntPointer maxTexture2DMipmap();
    /** Maximum dimensions (width, height, pitch) for 2D textures bound to pitched memory */
    public native int maxTexture2DLinear(int i); public native cudaDeviceProp maxTexture2DLinear(int i, int maxTexture2DLinear);
    @MemberGetter public native IntPointer maxTexture2DLinear();
    /** Maximum 2D texture dimensions if texture gather operations have to be performed */
    public native int maxTexture2DGather(int i); public native cudaDeviceProp maxTexture2DGather(int i, int maxTexture2DGather);
    @MemberGetter public native IntPointer maxTexture2DGather();
    /** Maximum 3D texture dimensions */
    public native int maxTexture3D(int i); public native cudaDeviceProp maxTexture3D(int i, int maxTexture3D);
    @MemberGetter public native IntPointer maxTexture3D();
    /** Maximum alternate 3D texture dimensions */
    public native int maxTexture3DAlt(int i); public native cudaDeviceProp maxTexture3DAlt(int i, int maxTexture3DAlt);
    @MemberGetter public native IntPointer maxTexture3DAlt();
    /** Maximum Cubemap texture dimensions */
    public native int maxTextureCubemap(); public native cudaDeviceProp maxTextureCubemap(int maxTextureCubemap);
    /** Maximum 1D layered texture dimensions */
    public native int maxTexture1DLayered(int i); public native cudaDeviceProp maxTexture1DLayered(int i, int maxTexture1DLayered);
    @MemberGetter public native IntPointer maxTexture1DLayered();
    /** Maximum 2D layered texture dimensions */
    public native int maxTexture2DLayered(int i); public native cudaDeviceProp maxTexture2DLayered(int i, int maxTexture2DLayered);
    @MemberGetter public native IntPointer maxTexture2DLayered();
    /** Maximum Cubemap layered texture dimensions */
    public native int maxTextureCubemapLayered(int i); public native cudaDeviceProp maxTextureCubemapLayered(int i, int maxTextureCubemapLayered);
    @MemberGetter public native IntPointer maxTextureCubemapLayered();
    /** Maximum 1D surface size */
    public native int maxSurface1D(); public native cudaDeviceProp maxSurface1D(int maxSurface1D);
    /** Maximum 2D surface dimensions */
    public native int maxSurface2D(int i); public native cudaDeviceProp maxSurface2D(int i, int maxSurface2D);
    @MemberGetter public native IntPointer maxSurface2D();
    /** Maximum 3D surface dimensions */
    public native int maxSurface3D(int i); public native cudaDeviceProp maxSurface3D(int i, int maxSurface3D);
    @MemberGetter public native IntPointer maxSurface3D();
    /** Maximum 1D layered surface dimensions */
    public native int maxSurface1DLayered(int i); public native cudaDeviceProp maxSurface1DLayered(int i, int maxSurface1DLayered);
    @MemberGetter public native IntPointer maxSurface1DLayered();
    /** Maximum 2D layered surface dimensions */
    public native int maxSurface2DLayered(int i); public native cudaDeviceProp maxSurface2DLayered(int i, int maxSurface2DLayered);
    @MemberGetter public native IntPointer maxSurface2DLayered();
    /** Maximum Cubemap surface dimensions */
    public native int maxSurfaceCubemap(); public native cudaDeviceProp maxSurfaceCubemap(int maxSurfaceCubemap);
    /** Maximum Cubemap layered surface dimensions */
    public native int maxSurfaceCubemapLayered(int i); public native cudaDeviceProp maxSurfaceCubemapLayered(int i, int maxSurfaceCubemapLayered);
    @MemberGetter public native IntPointer maxSurfaceCubemapLayered();
    /** Alignment requirements for surfaces */
    public native @Cast("size_t") long surfaceAlignment(); public native cudaDeviceProp surfaceAlignment(long surfaceAlignment);
    /** Device can possibly execute multiple kernels concurrently */
    public native int concurrentKernels(); public native cudaDeviceProp concurrentKernels(int concurrentKernels);
    /** Device has ECC support enabled */
    public native int ECCEnabled(); public native cudaDeviceProp ECCEnabled(int ECCEnabled);
    /** PCI bus ID of the device */
    public native int pciBusID(); public native cudaDeviceProp pciBusID(int pciBusID);
    /** PCI device ID of the device */
    public native int pciDeviceID(); public native cudaDeviceProp pciDeviceID(int pciDeviceID);
    /** PCI domain ID of the device */
    public native int pciDomainID(); public native cudaDeviceProp pciDomainID(int pciDomainID);
    /** 1 if device is a Tesla device using TCC driver, 0 otherwise */
    public native int tccDriver(); public native cudaDeviceProp tccDriver(int tccDriver);
    /** Number of asynchronous engines */
    public native int asyncEngineCount(); public native cudaDeviceProp asyncEngineCount(int asyncEngineCount);
    /** Device shares a unified address space with the host */
    public native int unifiedAddressing(); public native cudaDeviceProp unifiedAddressing(int unifiedAddressing);
    /** Peak memory clock frequency in kilohertz */
    public native int memoryClockRate(); public native cudaDeviceProp memoryClockRate(int memoryClockRate);
    /** Global memory bus width in bits */
    public native int memoryBusWidth(); public native cudaDeviceProp memoryBusWidth(int memoryBusWidth);
    /** Size of L2 cache in bytes */
    public native int l2CacheSize(); public native cudaDeviceProp l2CacheSize(int l2CacheSize);
    /** Maximum resident threads per multiprocessor */
    public native int maxThreadsPerMultiProcessor(); public native cudaDeviceProp maxThreadsPerMultiProcessor(int maxThreadsPerMultiProcessor);
    /** Device supports stream priorities */
    public native int streamPrioritiesSupported(); public native cudaDeviceProp streamPrioritiesSupported(int streamPrioritiesSupported);
    /** Device supports caching globals in L1 */
    public native int globalL1CacheSupported(); public native cudaDeviceProp globalL1CacheSupported(int globalL1CacheSupported);
    /** Device supports caching locals in L1 */
    public native int localL1CacheSupported(); public native cudaDeviceProp localL1CacheSupported(int localL1CacheSupported);
    /** Shared memory available per multiprocessor in bytes */
    public native @Cast("size_t") long sharedMemPerMultiprocessor(); public native cudaDeviceProp sharedMemPerMultiprocessor(long sharedMemPerMultiprocessor);
    /** 32-bit registers available per multiprocessor */
    public native int regsPerMultiprocessor(); public native cudaDeviceProp regsPerMultiprocessor(int regsPerMultiprocessor);
    /** Device supports allocating managed memory on this system */
    public native int managedMemory(); public native cudaDeviceProp managedMemory(int managedMemory);
    /** Device is on a multi-GPU board */
    public native int isMultiGpuBoard(); public native cudaDeviceProp isMultiGpuBoard(int isMultiGpuBoard);
    /** Unique identifier for a group of devices on the same multi-GPU board */
    public native int multiGpuBoardGroupID(); public native cudaDeviceProp multiGpuBoardGroupID(int multiGpuBoardGroupID);
}

/** Empty device properties */
// #define cudaDevicePropDontCare
//         {
//           {'\0'},    /* char   name[256];               */
//           0,         /* size_t totalGlobalMem;          */
//           0,         /* size_t sharedMemPerBlock;       */
//           0,         /* int    regsPerBlock;            */
//           0,         /* int    warpSize;                */
//           0,         /* size_t memPitch;                */
//           0,         /* int    maxThreadsPerBlock;      */
//           {0, 0, 0}, /* int    maxThreadsDim[3];        */
//           {0, 0, 0}, /* int    maxGridSize[3];          */
//           0,         /* int    clockRate;               */
//           0,         /* size_t totalConstMem;           */
//           -1,        /* int    major;                   */
//           -1,        /* int    minor;                   */
//           0,         /* size_t textureAlignment;        */
//           0,         /* size_t texturePitchAlignment    */
//           -1,        /* int    deviceOverlap;           */
//           0,         /* int    multiProcessorCount;     */
//           0,         /* int    kernelExecTimeoutEnabled */
//           0,         /* int    integrated               */
//           0,         /* int    canMapHostMemory         */
//           0,         /* int    computeMode              */
//           0,         /* int    maxTexture1D             */
//           0,         /* int    maxTexture1DMipmap       */
//           0,         /* int    maxTexture1DLinear       */
//           {0, 0},    /* int    maxTexture2D[2]          */
//           {0, 0},    /* int    maxTexture2DMipmap[2]    */
//           {0, 0, 0}, /* int    maxTexture2DLinear[3]    */
//           {0, 0},    /* int    maxTexture2DGather[2]    */
//           {0, 0, 0}, /* int    maxTexture3D[3]          */
//           {0, 0, 0}, /* int    maxTexture3DAlt[3]       */
//           0,         /* int    maxTextureCubemap        */
//           {0, 0},    /* int    maxTexture1DLayered[2]   */
//           {0, 0, 0}, /* int    maxTexture2DLayered[3]   */
//           {0, 0},    /* int    maxTextureCubemapLayered[2] */
//           0,         /* int    maxSurface1D             */
//           {0, 0},    /* int    maxSurface2D[2]          */
//           {0, 0, 0}, /* int    maxSurface3D[3]          */
//           {0, 0},    /* int    maxSurface1DLayered[2]   */
//           {0, 0, 0}, /* int    maxSurface2DLayered[3]   */
//           0,         /* int    maxSurfaceCubemap        */
//           {0, 0},    /* int    maxSurfaceCubemapLayered[2] */
//           0,         /* size_t surfaceAlignment         */
//           0,         /* int    concurrentKernels        */
//           0,         /* int    ECCEnabled               */
//           0,         /* int    pciBusID                 */
//           0,         /* int    pciDeviceID              */
//           0,         /* int    pciDomainID              */
//           0,         /* int    tccDriver                */
//           0,         /* int    asyncEngineCount         */
//           0,         /* int    unifiedAddressing        */
//           0,         /* int    memoryClockRate          */
//           0,         /* int    memoryBusWidth           */
//           0,         /* int    l2CacheSize              */
//           0,         /* int    maxThreadsPerMultiProcessor */
//           0,         /* int    streamPrioritiesSupported */
//           0,         /* int    globalL1CacheSupported   */
//           0,         /* int    localL1CacheSupported    */
//           0,         /* size_t sharedMemPerMultiprocessor; */
//           0,         /* int    regsPerMultiprocessor;   */
//           0,         /* int    managedMemory            */
//           0,         /* int    isMultiGpuBoard          */
//           0,         /* int    multiGpuBoardGroupID     */
//         }

/**
 * CUDA IPC Handle Size
 */
public static final int CUDA_IPC_HANDLE_SIZE = 64;

/**
 * CUDA IPC event handle
 */
public static class cudaIpcEventHandle_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaIpcEventHandle_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaIpcEventHandle_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaIpcEventHandle_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaIpcEventHandle_t position(int position) {
        return (cudaIpcEventHandle_t)super.position(position);
    }

    public native @Cast("char") byte reserved(int i); public native cudaIpcEventHandle_t reserved(int i, byte reserved);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}

/**
 * CUDA IPC memory handle
 */
public static class cudaIpcMemHandle_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaIpcMemHandle_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaIpcMemHandle_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaIpcMemHandle_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaIpcMemHandle_t position(int position) {
        return (cudaIpcMemHandle_t)super.position(position);
    }

    public native @Cast("char") byte reserved(int i); public native cudaIpcMemHandle_t reserved(int i, byte reserved);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}

/*******************************************************************************
*                                                                              *
*  SHORTHAND TYPE DEFINITION USED BY RUNTIME API                               *
*                                                                              *
*******************************************************************************/

/**
 * CUDA Error types
 */

/**
 * CUDA stream
 */

/**
 * CUDA event types
 */

/**
 * CUDA graphics resource types
 */

/**
 * CUDA UUID types
 */
@Opaque public static class cudaUUID_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudaUUID_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaUUID_t(Pointer p) { super(p); }
}

/**
 * CUDA output file modes
 */

/** \} */
/** \} */ /* END CUDART_TYPES */

// #endif /* !__DRIVER_TYPES_H__ */


// Parsed from <surface_types.h>

/*
 * Copyright 1993-2012 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__SURFACE_TYPES_H__)
// #define __SURFACE_TYPES_H__

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

// #include "driver_types.h"

/**
 * \addtogroup CUDART_TYPES
 *
 * \{
 */

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

public static final int cudaSurfaceType1D =              0x01;
public static final int cudaSurfaceType2D =              0x02;
public static final int cudaSurfaceType3D =              0x03;
public static final int cudaSurfaceTypeCubemap =         0x0C;
public static final int cudaSurfaceType1DLayered =       0xF1;
public static final int cudaSurfaceType2DLayered =       0xF2;
public static final int cudaSurfaceTypeCubemapLayered =  0xFC;

/**
 * CUDA Surface boundary modes
 */
/** enum cudaSurfaceBoundaryMode */
public static final int
    /** Zero boundary mode */
    cudaBoundaryModeZero  = 0,
    /** Clamp boundary mode */
    cudaBoundaryModeClamp = 1,
    /** Trap boundary mode */
    cudaBoundaryModeTrap  = 2;

/**
 * CUDA Surface format modes
 */
/** enum cudaSurfaceFormatMode */
public static final int
    /** Forced format mode */
    cudaFormatModeForced = 0,
    /** Auto format mode */
    cudaFormatModeAuto = 1;

/**
 * CUDA Surface reference
 */
public static class surfaceReference extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public surfaceReference() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public surfaceReference(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public surfaceReference(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public surfaceReference position(int position) {
        return (surfaceReference)super.position(position);
    }

    /**
     * Channel descriptor for surface reference
     */
    public native @ByRef cudaChannelFormatDesc channelDesc(); public native surfaceReference channelDesc(cudaChannelFormatDesc channelDesc);
}

/**
 * An opaque value that represents a CUDA Surface object
 */

/** \} */
/** \} */ /* END CUDART_TYPES */

// #endif /* !__SURFACE_TYPES_H__ */


// Parsed from <texture_types.h>

/*
 * Copyright 1993-2012 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__TEXTURE_TYPES_H__)
// #define __TEXTURE_TYPES_H__

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

// #include "driver_types.h"

/**
 * \addtogroup CUDART_TYPES
 *
 * \{
 */

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

public static final int cudaTextureType1D =              0x01;
public static final int cudaTextureType2D =              0x02;
public static final int cudaTextureType3D =              0x03;
public static final int cudaTextureTypeCubemap =         0x0C;
public static final int cudaTextureType1DLayered =       0xF1;
public static final int cudaTextureType2DLayered =       0xF2;
public static final int cudaTextureTypeCubemapLayered =  0xFC;

/**
 * CUDA texture address modes
 */
/** enum cudaTextureAddressMode */
public static final int
    /** Wrapping address mode */
    cudaAddressModeWrap   = 0,
    /** Clamp to edge address mode */
    cudaAddressModeClamp  = 1,
    /** Mirror address mode */
    cudaAddressModeMirror = 2,
    /** Border address mode */
    cudaAddressModeBorder = 3;

/**
 * CUDA texture filter modes
 */
/** enum cudaTextureFilterMode */
public static final int
    /** Point filter mode */
    cudaFilterModePoint  = 0,
    /** Linear filter mode */
    cudaFilterModeLinear = 1;

/**
 * CUDA texture read modes
 */
/** enum cudaTextureReadMode */
public static final int
    /** Read texture as specified element type */
    cudaReadModeElementType     = 0,
    /** Read texture as normalized float */
    cudaReadModeNormalizedFloat = 1;

/**
 * CUDA texture reference
 */
public static class textureReference extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public textureReference() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public textureReference(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public textureReference(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public textureReference position(int position) {
        return (textureReference)super.position(position);
    }

    /**
     * Indicates whether texture reads are normalized or not
     */
    public native int normalized(); public native textureReference normalized(int normalized);
    /**
     * Texture filter mode
     */
    public native @Cast("cudaTextureFilterMode") int filterMode(); public native textureReference filterMode(int filterMode);
    /**
     * Texture address mode for up to 3 dimensions
     */
    public native @Cast("cudaTextureAddressMode") int addressMode(int i); public native textureReference addressMode(int i, int addressMode);
    @MemberGetter public native @Cast("cudaTextureAddressMode*") IntPointer addressMode();
    /**
     * Channel descriptor for the texture reference
     */
    public native @ByRef cudaChannelFormatDesc channelDesc(); public native textureReference channelDesc(cudaChannelFormatDesc channelDesc);
    /**
     * Perform sRGB->linear conversion during texture read
     */
    public native int sRGB(); public native textureReference sRGB(int sRGB);
    /**
     * Limit to the anisotropy ratio
     */
    public native @Cast("unsigned int") int maxAnisotropy(); public native textureReference maxAnisotropy(int maxAnisotropy);
    /**
     * Mipmap filter mode
     */
    public native @Cast("cudaTextureFilterMode") int mipmapFilterMode(); public native textureReference mipmapFilterMode(int mipmapFilterMode);
    /**
     * Offset applied to the supplied mipmap level
     */
    public native float mipmapLevelBias(); public native textureReference mipmapLevelBias(float mipmapLevelBias);
    /**
     * Lower end of the mipmap level range to clamp access to
     */
    public native float minMipmapLevelClamp(); public native textureReference minMipmapLevelClamp(float minMipmapLevelClamp);
    /**
     * Upper end of the mipmap level range to clamp access to
     */
    public native float maxMipmapLevelClamp(); public native textureReference maxMipmapLevelClamp(float maxMipmapLevelClamp);
    public native int __cudaReserved(int i); public native textureReference __cudaReserved(int i, int __cudaReserved);
    @MemberGetter public native IntPointer __cudaReserved();
}

/**
 * CUDA texture descriptor
 */
public static class cudaTextureDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaTextureDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public cudaTextureDesc(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaTextureDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public cudaTextureDesc position(int position) {
        return (cudaTextureDesc)super.position(position);
    }

    /**
     * Texture address mode for up to 3 dimensions
     */
    public native @Cast("cudaTextureAddressMode") int addressMode(int i); public native cudaTextureDesc addressMode(int i, int addressMode);
    @MemberGetter public native @Cast("cudaTextureAddressMode*") IntPointer addressMode();
    /**
     * Texture filter mode
     */
    public native @Cast("cudaTextureFilterMode") int filterMode(); public native cudaTextureDesc filterMode(int filterMode);
    /**
     * Texture read mode
     */
    public native @Cast("cudaTextureReadMode") int readMode(); public native cudaTextureDesc readMode(int readMode);
    /**
     * Perform sRGB->linear conversion during texture read
     */
    public native int sRGB(); public native cudaTextureDesc sRGB(int sRGB);
    /**
     * Indicates whether texture reads are normalized or not
     */
    public native int normalizedCoords(); public native cudaTextureDesc normalizedCoords(int normalizedCoords);
    /**
     * Limit to the anisotropy ratio
     */
    public native @Cast("unsigned int") int maxAnisotropy(); public native cudaTextureDesc maxAnisotropy(int maxAnisotropy);
    /**
     * Mipmap filter mode
     */
    public native @Cast("cudaTextureFilterMode") int mipmapFilterMode(); public native cudaTextureDesc mipmapFilterMode(int mipmapFilterMode);
    /**
     * Offset applied to the supplied mipmap level
     */
    public native float mipmapLevelBias(); public native cudaTextureDesc mipmapLevelBias(float mipmapLevelBias);
    /**
     * Lower end of the mipmap level range to clamp access to
     */
    public native float minMipmapLevelClamp(); public native cudaTextureDesc minMipmapLevelClamp(float minMipmapLevelClamp);
    /**
     * Upper end of the mipmap level range to clamp access to
     */
    public native float maxMipmapLevelClamp(); public native cudaTextureDesc maxMipmapLevelClamp(float maxMipmapLevelClamp);
}

/**
 * An opaque value that represents a CUDA texture object
 */

/** \} */
/** \} */ /* END CUDART_TYPES */

// #endif /* !__TEXTURE_TYPES_H__ */


// Parsed from <vector_types.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__VECTOR_TYPES_H__)
// #define __VECTOR_TYPES_H__

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

// #if !defined(__CUDA_LIBDEVICE__) && !defined(__CUDACC_RTC__)
// #define EXCLUDE_FROM_RTC
// #include "builtin_types.h"
// #undef EXCLUDE_FROM_RTC
// #endif /* !__CUDA_LIBDEVICE__ && !__CUDACC_RTC__ */
// #include "host_defines.h"

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

// #if !defined(__CUDACC__) && !defined(__CUDACC_RTC__) && !defined(__CUDABE__) &&
//     defined(_WIN32) && !defined(_WIN64)

// #else /* !__CUDACC__ && !__CUDACC_RTC__ && !__CUDABE__ && _WIN32 && !_WIN64 */

// #define __cuda_builtin_vector_align8(tag, members)
// struct __device_builtin__ __align__(8) tag
// {
//     members
// }

// #endif /* !__CUDACC__ && !__CUDACC_RTC__ && !__CUDABE__ && _WIN32 && !_WIN64 */

public static class char1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public char1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public char1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public char1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public char1 position(int position) {
        return (char1)super.position(position);
    }

    public native byte x(); public native char1 x(byte x);
}

public static class uchar1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uchar1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uchar1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uchar1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uchar1 position(int position) {
        return (uchar1)super.position(position);
    }

    public native @Cast("unsigned char") byte x(); public native uchar1 x(byte x);
}


public static class char2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public char2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public char2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public char2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public char2 position(int position) {
        return (char2)super.position(position);
    }

    public native byte x(); public native char2 x(byte x);
    public native byte y(); public native char2 y(byte y);
}

public static class uchar2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uchar2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uchar2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uchar2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uchar2 position(int position) {
        return (uchar2)super.position(position);
    }

    public native @Cast("unsigned char") byte x(); public native uchar2 x(byte x);
    public native @Cast("unsigned char") byte y(); public native uchar2 y(byte y);
}

public static class char3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public char3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public char3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public char3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public char3 position(int position) {
        return (char3)super.position(position);
    }

    public native byte x(); public native char3 x(byte x);
    public native byte y(); public native char3 y(byte y);
    public native byte z(); public native char3 z(byte z);
}

public static class uchar3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uchar3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uchar3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uchar3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uchar3 position(int position) {
        return (uchar3)super.position(position);
    }

    public native @Cast("unsigned char") byte x(); public native uchar3 x(byte x);
    public native @Cast("unsigned char") byte y(); public native uchar3 y(byte y);
    public native @Cast("unsigned char") byte z(); public native uchar3 z(byte z);
}

public static class char4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public char4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public char4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public char4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public char4 position(int position) {
        return (char4)super.position(position);
    }

    public native byte x(); public native char4 x(byte x);
    public native byte y(); public native char4 y(byte y);
    public native byte z(); public native char4 z(byte z);
    public native byte w(); public native char4 w(byte w);
}

public static class uchar4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uchar4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uchar4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uchar4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uchar4 position(int position) {
        return (uchar4)super.position(position);
    }

    public native @Cast("unsigned char") byte x(); public native uchar4 x(byte x);
    public native @Cast("unsigned char") byte y(); public native uchar4 y(byte y);
    public native @Cast("unsigned char") byte z(); public native uchar4 z(byte z);
    public native @Cast("unsigned char") byte w(); public native uchar4 w(byte w);
}

public static class short1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public short1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public short1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public short1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public short1 position(int position) {
        return (short1)super.position(position);
    }

    public native short x(); public native short1 x(short x);
}

public static class ushort1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ushort1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ushort1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ushort1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ushort1 position(int position) {
        return (ushort1)super.position(position);
    }

    public native @Cast("unsigned short") short x(); public native ushort1 x(short x);
}

public static class short2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public short2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public short2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public short2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public short2 position(int position) {
        return (short2)super.position(position);
    }

    public native short x(); public native short2 x(short x);
    public native short y(); public native short2 y(short y);
}

public static class ushort2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ushort2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ushort2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ushort2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ushort2 position(int position) {
        return (ushort2)super.position(position);
    }

    public native @Cast("unsigned short") short x(); public native ushort2 x(short x);
    public native @Cast("unsigned short") short y(); public native ushort2 y(short y);
}

public static class short3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public short3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public short3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public short3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public short3 position(int position) {
        return (short3)super.position(position);
    }

    public native short x(); public native short3 x(short x);
    public native short y(); public native short3 y(short y);
    public native short z(); public native short3 z(short z);
}

public static class ushort3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ushort3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ushort3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ushort3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ushort3 position(int position) {
        return (ushort3)super.position(position);
    }

    public native @Cast("unsigned short") short x(); public native ushort3 x(short x);
    public native @Cast("unsigned short") short y(); public native ushort3 y(short y);
    public native @Cast("unsigned short") short z(); public native ushort3 z(short z);
}

public static class short4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public short4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public short4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public short4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public short4 position(int position) {
        return (short4)super.position(position);
    }
 public native short x(); public native short4 x(short x); public native short y(); public native short4 y(short y); public native short z(); public native short4 z(short z); public native short w(); public native short4 w(short w);
}
public static class ushort4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ushort4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ushort4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ushort4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ushort4 position(int position) {
        return (ushort4)super.position(position);
    }
 public native @Cast("unsigned short") short x(); public native ushort4 x(short x); public native @Cast("unsigned short") short y(); public native ushort4 y(short y); public native @Cast("unsigned short") short z(); public native ushort4 z(short z); public native @Cast("unsigned short") short w(); public native ushort4 w(short w);
}

public static class int1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public int1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public int1 position(int position) {
        return (int1)super.position(position);
    }

    public native int x(); public native int1 x(int x);
}

public static class uint1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uint1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uint1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uint1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uint1 position(int position) {
        return (uint1)super.position(position);
    }

    public native @Cast("unsigned int") int x(); public native uint1 x(int x);
}

public static class int2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public int2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public int2 position(int position) {
        return (int2)super.position(position);
    }
 public native int x(); public native int2 x(int x); public native int y(); public native int2 y(int y);
}
public static class uint2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uint2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uint2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uint2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uint2 position(int position) {
        return (uint2)super.position(position);
    }
 public native @Cast("unsigned int") int x(); public native uint2 x(int x); public native @Cast("unsigned int") int y(); public native uint2 y(int y);
}

public static class int3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public int3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public int3 position(int position) {
        return (int3)super.position(position);
    }

    public native int x(); public native int3 x(int x);
    public native int y(); public native int3 y(int y);
    public native int z(); public native int3 z(int z);
}

public static class uint3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uint3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uint3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uint3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uint3 position(int position) {
        return (uint3)super.position(position);
    }

    public native @Cast("unsigned int") int x(); public native uint3 x(int x);
    public native @Cast("unsigned int") int y(); public native uint3 y(int y);
    public native @Cast("unsigned int") int z(); public native uint3 z(int z);
}

public static class int4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public int4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public int4 position(int position) {
        return (int4)super.position(position);
    }

    public native int x(); public native int4 x(int x);
    public native int y(); public native int4 y(int y);
    public native int z(); public native int4 z(int z);
    public native int w(); public native int4 w(int w);
}

public static class uint4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uint4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public uint4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uint4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public uint4 position(int position) {
        return (uint4)super.position(position);
    }

    public native @Cast("unsigned int") int x(); public native uint4 x(int x);
    public native @Cast("unsigned int") int y(); public native uint4 y(int y);
    public native @Cast("unsigned int") int z(); public native uint4 z(int z);
    public native @Cast("unsigned int") int w(); public native uint4 w(int w);
}

public static class long1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public long1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public long1 position(int position) {
        return (long1)super.position(position);
    }

    public native long x(); public native long1 x(long x);
}

public static class ulong1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulong1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulong1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulong1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulong1 position(int position) {
        return (ulong1)super.position(position);
    }

    public native @Cast("unsigned long") long x(); public native ulong1 x(long x);
}

// #if defined(__CUDACC_RTC__) || defined(_WIN32)
public static class long2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public long2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public long2 position(int position) {
        return (long2)super.position(position);
    }
 public native long x(); public native long2 x(long x); public native long y(); public native long2 y(long y);
}
public static class ulong2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulong2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulong2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulong2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulong2 position(int position) {
        return (ulong2)super.position(position);
    }
 public native @Cast("unsigned long int") long x(); public native ulong2 x(long x); public native @Cast("unsigned long int") long y(); public native ulong2 y(long y);
}
// #else /* __CUDACC_RTC__ || _WIN32 */

// #endif /* __CUDACC_RTC__ || _WIN32 */

public static class long3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public long3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public long3 position(int position) {
        return (long3)super.position(position);
    }

    public native long x(); public native long3 x(long x);
    public native long y(); public native long3 y(long y);
    public native long z(); public native long3 z(long z);
}

public static class ulong3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulong3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulong3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulong3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulong3 position(int position) {
        return (ulong3)super.position(position);
    }

    public native @Cast("unsigned long int") long x(); public native ulong3 x(long x);
    public native @Cast("unsigned long int") long y(); public native ulong3 y(long y);
    public native @Cast("unsigned long int") long z(); public native ulong3 z(long z);
}

public static class long4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public long4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public long4 position(int position) {
        return (long4)super.position(position);
    }

    public native long x(); public native long4 x(long x);
    public native long y(); public native long4 y(long y);
    public native long z(); public native long4 z(long z);
    public native long w(); public native long4 w(long w);
}

public static class ulong4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulong4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulong4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulong4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulong4 position(int position) {
        return (ulong4)super.position(position);
    }

    public native @Cast("unsigned long int") long x(); public native ulong4 x(long x);
    public native @Cast("unsigned long int") long y(); public native ulong4 y(long y);
    public native @Cast("unsigned long int") long z(); public native ulong4 z(long z);
    public native @Cast("unsigned long int") long w(); public native ulong4 w(long w);
}

public static class float1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public float1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public float1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public float1 position(int position) {
        return (float1)super.position(position);
    }

    public native float x(); public native float1 x(float x);
}

// #if !defined(__CUDACC__) && !defined(__CUDABE__) && defined(__arm__) &&
//     defined(__ARM_PCS_VFP) && __GNUC__ == 4 && __GNUC_MINOR__ == 6

// #else /* !__CUDACC__ && !__CUDABE__ && __arm__ && __ARM_PCS_VFP &&
//          __GNUC__ == 4&& __GNUC_MINOR__ == 6 */

public static class float2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public float2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public float2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public float2 position(int position) {
        return (float2)super.position(position);
    }
 public native float x(); public native float2 x(float x); public native float y(); public native float2 y(float y);
}

// #endif /* !__CUDACC__ && !__CUDABE__ && __arm__ && __ARM_PCS_VFP &&
//           __GNUC__ == 4&& __GNUC_MINOR__ == 6 */

public static class float3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public float3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public float3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public float3 position(int position) {
        return (float3)super.position(position);
    }

    public native float x(); public native float3 x(float x);
    public native float y(); public native float3 y(float y);
    public native float z(); public native float3 z(float z);
}

public static class float4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public float4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public float4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public float4 position(int position) {
        return (float4)super.position(position);
    }

    public native float x(); public native float4 x(float x);
    public native float y(); public native float4 y(float y);
    public native float z(); public native float4 z(float z);
    public native float w(); public native float4 w(float w);
}

public static class longlong1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public longlong1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public longlong1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public longlong1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public longlong1 position(int position) {
        return (longlong1)super.position(position);
    }

    public native long x(); public native longlong1 x(long x);
}

public static class ulonglong1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulonglong1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulonglong1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulonglong1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulonglong1 position(int position) {
        return (ulonglong1)super.position(position);
    }

    public native @Cast("unsigned long long int") long x(); public native ulonglong1 x(long x);
}

public static class longlong2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public longlong2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public longlong2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public longlong2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public longlong2 position(int position) {
        return (longlong2)super.position(position);
    }

    public native long x(); public native longlong2 x(long x);
    public native long y(); public native longlong2 y(long y);
}

public static class ulonglong2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulonglong2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulonglong2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulonglong2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulonglong2 position(int position) {
        return (ulonglong2)super.position(position);
    }

    public native @Cast("unsigned long long int") long x(); public native ulonglong2 x(long x);
    public native @Cast("unsigned long long int") long y(); public native ulonglong2 y(long y);
}

public static class longlong3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public longlong3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public longlong3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public longlong3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public longlong3 position(int position) {
        return (longlong3)super.position(position);
    }

    public native long x(); public native longlong3 x(long x);
    public native long y(); public native longlong3 y(long y);
    public native long z(); public native longlong3 z(long z);
}

public static class ulonglong3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulonglong3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulonglong3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulonglong3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulonglong3 position(int position) {
        return (ulonglong3)super.position(position);
    }

    public native @Cast("unsigned long long int") long x(); public native ulonglong3 x(long x);
    public native @Cast("unsigned long long int") long y(); public native ulonglong3 y(long y);
    public native @Cast("unsigned long long int") long z(); public native ulonglong3 z(long z);
}

public static class longlong4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public longlong4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public longlong4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public longlong4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public longlong4 position(int position) {
        return (longlong4)super.position(position);
    }

    public native long x(); public native longlong4 x(long x);
    public native long y(); public native longlong4 y(long y);
    public native long z(); public native longlong4 z(long z);
    public native long w(); public native longlong4 w(long w);
}

public static class ulonglong4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulonglong4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ulonglong4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulonglong4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ulonglong4 position(int position) {
        return (ulonglong4)super.position(position);
    }

    public native @Cast("unsigned long long int") long x(); public native ulonglong4 x(long x);
    public native @Cast("unsigned long long int") long y(); public native ulonglong4 y(long y);
    public native @Cast("unsigned long long int") long z(); public native ulonglong4 z(long z);
    public native @Cast("unsigned long long int") long w(); public native ulonglong4 w(long w);
}

public static class double1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public double1(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public double1 position(int position) {
        return (double1)super.position(position);
    }

    public native double x(); public native double1 x(double x);
}

public static class double2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public double2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public double2 position(int position) {
        return (double2)super.position(position);
    }

    public native double x(); public native double2 x(double x);
    public native double y(); public native double2 y(double y);
}

public static class double3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public double3(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public double3 position(int position) {
        return (double3)super.position(position);
    }

    public native double x(); public native double3 x(double x);
    public native double y(); public native double3 y(double y);
    public native double z(); public native double3 z(double z);
}

public static class double4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public double4(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public double4 position(int position) {
        return (double4)super.position(position);
    }

    public native double x(); public native double4 x(double x);
    public native double y(); public native double4 y(double y);
    public native double z(); public native double4 z(double z);
    public native double w(); public native double4 w(double w);
}

// #if !defined(__CUDACC__) && !defined(__CUDABE__) &&
//     defined(_WIN32) && !defined(_WIN64)

// #endif /* !__CUDACC__ && !__CUDABE__ && _WIN32 && !_WIN64 */

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

@NoOffset public static class dim3 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dim3(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dim3(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public dim3 position(int position) {
        return (dim3)super.position(position);
    }

    public native @Cast("unsigned int") int x(); public native dim3 x(int x);
    public native @Cast("unsigned int") int y(); public native dim3 y(int y);
    public native @Cast("unsigned int") int z(); public native dim3 z(int z);
// #if defined(__cplusplus)
    public dim3(@Cast("unsigned int") int vx/*=1*/, @Cast("unsigned int") int vy/*=1*/, @Cast("unsigned int") int vz/*=1*/) { super((Pointer)null); allocate(vx, vy, vz); }
    private native void allocate(@Cast("unsigned int") int vx/*=1*/, @Cast("unsigned int") int vy/*=1*/, @Cast("unsigned int") int vz/*=1*/);
    public dim3() { super((Pointer)null); allocate(); }
    private native void allocate();
    public dim3(@ByVal uint3 v) { super((Pointer)null); allocate(v); }
    private native void allocate(@ByVal uint3 v);
    public native @ByVal @Name("operator uint3") uint3 asUint3();
// #endif /* __cplusplus */
}

// #undef  __cuda_builtin_vector_align8

// #endif /* !__VECTOR_TYPES_H__ */


// Parsed from <builtin_types.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

// #include "device_types.h"
// #if !defined(__CUDACC_RTC__)
// #define EXCLUDE_FROM_RTC
// #include "driver_types.h"
// #undef EXCLUDE_FROM_RTC
// #endif /* !__CUDACC_RTC__ */
// #include "surface_types.h"
// #include "texture_types.h"
// #include "vector_types.h"


// Parsed from <cuda_runtime_api.h>

/*
 * Copyright 1993-2012 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__CUDA_RUNTIME_API_H__)
// #define __CUDA_RUNTIME_API_H__

/**
 * \latexonly
 * \page sync_async API synchronization behavior
 *
 * \section memcpy_sync_async_behavior Memcpy
 * The API provides memcpy/memset functions in both synchronous and asynchronous forms,
 * the latter having an \e "Async" suffix. This is a misnomer as each function
 * may exhibit synchronous or asynchronous behavior depending on the arguments
 * passed to the function. In the reference documentation, each memcpy function is
 * categorized as \e synchronous or \e asynchronous, corresponding to the definitions
 * below.
 * 
 * \subsection MemcpySynchronousBehavior Synchronous
 * 
 * <ol>
 * <li> For transfers from pageable host memory to device memory, a stream sync is performed
 * before the copy is initiated. The function will return once the pageable
 * buffer has been copied to the staging memory for DMA transfer to device memory,
 * but the DMA to final destination may not have completed.
 * 
 * <li> For transfers from pinned host memory to device memory, the function is synchronous
 * with respect to the host.
 *
 * <li> For transfers from device to either pageable or pinned host memory, the function returns
 * only once the copy has completed.
 * 
 * <li> For transfers from device memory to device memory, no host-side synchronization is
 * performed.
 *
 * <li> For transfers from any host memory to any host memory, the function is fully
 * synchronous with respect to the host.
 * </ol>
 * 
 * \subsection MemcpyAsynchronousBehavior Asynchronous
 *
 * <ol>
 * <li> For transfers from device memory to pageable host memory, the function
 * will return only once the copy has completed.
 *
 * <li> For transfers from any host memory to any host memory, the function is fully
 * synchronous with respect to the host.
 * 
 * <li> For all other transfers, the function is fully asynchronous. If pageable
 * memory must first be staged to pinned memory, this will be handled
 * asynchronously with a worker thread.
 * </ol>
 *
 * \section memset_sync_async_behavior Memset
 * The cudaMemset functions are asynchronous with respect to the host
 * except when the target memory is pinned host memory. The \e Async
 * versions are always asynchronous with respect to the host.
 *
 * \section kernel_launch_details Kernel Launches
 * Kernel launches are asynchronous with respect to the host. Details of
 * concurrent kernel execution and data transfers can be found in the CUDA
 * Programmers Guide.
 *
 * \endlatexonly
 */

/**
 * There are two levels for the runtime API.
 *
 * The C API (<i>cuda_runtime_api.h</i>) is
 * a C-style interface that does not require compiling with \p nvcc.
 *
 * The \ref CUDART_HIGHLEVEL "C++ API" (<i>cuda_runtime.h</i>) is a
 * C++-style interface built on top of the C API. It wraps some of the
 * C API routines, using overloading, references and default arguments.
 * These wrappers can be used from C++ code and can be compiled with any C++
 * compiler. The C++ API also has some CUDA-specific wrappers that wrap
 * C API routines that deal with symbols, textures, and device functions.
 * These wrappers require the use of \p nvcc because they depend on code being
 * generated by the compiler. For example, the execution configuration syntax
 * to invoke kernels is only available in source code compiled with \p nvcc.
 */

/** CUDA Runtime API Version */
public static final int CUDART_VERSION =  7050;

// #include "host_defines.h"
// #include "builtin_types.h"

// #if !defined(__CUDACC_INTEGRATED__)
// #include "cuda_device_runtime_api.h"
// #endif /* !defined(__CUDACC_INTEGRATED__) */

// #if defined(CUDA_API_PER_THREAD_DEFAULT_STREAM) || defined(__CUDA_API_VERSION_INTERNAL)
//     #define __CUDART_API_PER_THREAD_DEFAULT_STREAM
//     #define __CUDART_API_PTDS(api) api ## _ptds
//     #define __CUDART_API_PTSZ(api) api ## _ptsz
// #else
//     #define __CUDART_API_PTDS(api) api
//     #define __CUDART_API_PTSZ(api) api
// #endif

// #if defined(__CUDART_API_PER_THREAD_DEFAULT_STREAM)
// #endif

/** \cond impl_private */
// #if !defined(__dv)

// #if defined(__cplusplus)

// #define __dv(v)
//         = v

// #else /* __cplusplus */

// #define __dv(v)

// #endif /* __cplusplus */

// #endif /* !__dv */
/** \endcond impl_private */

// #if !defined(__CUDACC_INTEGRATED__) && (!defined(__CUDA_ARCH__) || (__CUDA_ARCH__ >= 350))   /** Visible to SM>=3.5 and "__host__ __device__" only **/

// #define CUDART_DEVICE __device__ 

// #else

// #define CUDART_DEVICE

// #endif /** CUDART_DEVICE */

// #if defined(__cplusplus)
// #endif /* __cplusplus */

/**
 * \defgroup CUDART_DEVICE Device Management
 *
 * ___MANBRIEF___ device management functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the device management functions of the CUDA runtime
 * application programming interface.
 *
 * \{
 */

/**
 * \brief Destroy all allocations and reset all state on the current device
 * in the current process.
 *
 * Explicitly destroys and cleans up all resources associated with the current
 * device in the current process.  Any subsequent API call to this device will 
 * reinitialize the device.
 *
 * Note that this function will reset the device immediately.  It is the caller's
 * responsibility to ensure that the device is not being accessed by any 
 * other host threads from the process when this function is called.
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \sa ::cudaDeviceSynchronize
 */
public static native @Cast("cudaError_t") int cudaDeviceReset();

/**
 * \brief Wait for compute device to finish
 *
 * Blocks until the device has completed all preceding requested tasks.
 * ::cudaDeviceSynchronize() returns an error if one of the preceding tasks
 * has failed. If the ::cudaDeviceScheduleBlockingSync flag was set for 
 * this device, the host thread will block until the device has finished 
 * its work.
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \sa ::cudaDeviceReset
 */
public static native @Cast("cudaError_t") int cudaDeviceSynchronize();

/**
 * \brief Set resource limits
 *
 * Setting \p limit to \p value is a request by the application to update
 * the current limit maintained by the device.  The driver is free to
 * modify the requested value to meet h/w requirements (this could be
 * clamping to minimum or maximum values, rounding up to nearest element
 * size, etc).  The application can use ::cudaDeviceGetLimit() to find out
 * exactly what the limit has been set to.
 *
 * Setting each ::cudaLimit has its own specific restrictions, so each is
 * discussed here.
 *
 * - ::cudaLimitStackSize controls the stack size in bytes of each GPU thread.
 *
 * - ::cudaLimitPrintfFifoSize controls the size in bytes of the shared FIFO
 *   used by the ::printf() and ::fprintf() device system calls. Setting
 *   ::cudaLimitPrintfFifoSize must not be performed after launching any kernel
 *   that uses the ::printf() or ::fprintf() device system calls - in such case
 *   ::cudaErrorInvalidValue will be returned.
 *
 * - ::cudaLimitMallocHeapSize controls the size in bytes of the heap used by
 *   the ::malloc() and ::free() device system calls. Setting
 *   ::cudaLimitMallocHeapSize must not be performed after launching any kernel
 *   that uses the ::malloc() or ::free() device system calls - in such case
 *   ::cudaErrorInvalidValue will be returned.
 *
 * - ::cudaLimitDevRuntimeSyncDepth controls the maximum nesting depth of a
 *   grid at which a thread can safely call ::cudaDeviceSynchronize(). Setting
 *   this limit must be performed before any launch of a kernel that uses the
 *   device runtime and calls ::cudaDeviceSynchronize() above the default sync
 *   depth, two levels of grids. Calls to ::cudaDeviceSynchronize() will fail
 *   with error code ::cudaErrorSyncDepthExceeded if the limitation is
 *   violated. This limit can be set smaller than the default or up the maximum
 *   launch depth of 24. When setting this limit, keep in mind that additional
 *   levels of sync depth require the runtime to reserve large amounts of
 *   device memory which can no longer be used for user allocations. If these
 *   reservations of device memory fail, ::cudaDeviceSetLimit will return
 *   ::cudaErrorMemoryAllocation, and the limit can be reset to a lower value.
 *   This limit is only applicable to devices of compute capability 3.5 and
 *   higher. Attempting to set this limit on devices of compute capability less
 *   than 3.5 will result in the error ::cudaErrorUnsupportedLimit being
 *   returned.
 *
 * - ::cudaLimitDevRuntimePendingLaunchCount controls the maximum number of
 *   outstanding device runtime launches that can be made from the current
 *   device. A grid is outstanding from the point of launch up until the grid
 *   is known to have been completed. Device runtime launches which violate 
 *   this limitation fail and return ::cudaErrorLaunchPendingCountExceeded when
 *   ::cudaGetLastError() is called after launch. If more pending launches than
 *   the default (2048 launches) are needed for a module using the device
 *   runtime, this limit can be increased. Keep in mind that being able to
 *   sustain additional pending launches will require the runtime to reserve
 *   larger amounts of device memory upfront which can no longer be used for
 *   allocations. If these reservations fail, ::cudaDeviceSetLimit will return
 *   ::cudaErrorMemoryAllocation, and the limit can be reset to a lower value.
 *   This limit is only applicable to devices of compute capability 3.5 and
 *   higher. Attempting to set this limit on devices of compute capability less
 *   than 3.5 will result in the error ::cudaErrorUnsupportedLimit being
 *   returned. 
 *
 * @param limit - Limit to set
 * @param value - Size of limit
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorUnsupportedLimit,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaDeviceGetLimit
 */
public static native @Cast("cudaError_t") int cudaDeviceSetLimit(@Cast("cudaLimit") int limit, @Cast("size_t") long value);

/**
 * \brief Returns resource limits
 *
 * Returns in \p *pValue the current size of \p limit.  The supported
 * ::cudaLimit values are:
 * - ::cudaLimitStackSize: stack size in bytes of each GPU thread;
 * - ::cudaLimitPrintfFifoSize: size in bytes of the shared FIFO used by the
 *   ::printf() and ::fprintf() device system calls.
 * - ::cudaLimitMallocHeapSize: size in bytes of the heap used by the
 *   ::malloc() and ::free() device system calls;
 * - ::cudaLimitDevRuntimeSyncDepth: maximum grid depth at which a
 *   thread can isssue the device runtime call ::cudaDeviceSynchronize()
 *   to wait on child grid launches to complete.
 * - ::cudaLimitDevRuntimePendingLaunchCount: maximum number of outstanding
 *   device runtime launches.
 *
 * @param limit  - Limit to query
 * @param pValue - Returned size of the limit
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorUnsupportedLimit,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaDeviceSetLimit
 */
public static native @Cast("cudaError_t") int cudaDeviceGetLimit(@Cast("size_t*") SizeTPointer pValue, @Cast("cudaLimit") int limit);

/**
 * \brief Returns the preferred cache configuration for the current device.
 *
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this returns through \p pCacheConfig the preferred cache
 * configuration for the current device. This is only a preference. The
 * runtime will use the requested configuration if possible, but it is free to
 * choose a different configuration if required to execute functions.
 *
 * This will return a \p pCacheConfig of ::cudaFuncCachePreferNone on devices
 * where the size of the L1 cache and shared memory are fixed.
 *
 * The supported cache configurations are:
 * - ::cudaFuncCachePreferNone: no preference for shared memory or L1 (default)
 * - ::cudaFuncCachePreferShared: prefer larger shared memory and smaller L1 cache
 * - ::cudaFuncCachePreferL1: prefer larger L1 cache and smaller shared memory
 * - ::cudaFuncCachePreferEqual: prefer equal size L1 cache and shared memory
 *
 * @param pCacheConfig - Returned cache configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa cudaDeviceSetCacheConfig,
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncSetCacheConfig(T*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C++ API)"
 */
public static native @Cast("cudaError_t") int cudaDeviceGetCacheConfig(@Cast("cudaFuncCache*") IntPointer pCacheConfig);
public static native @Cast("cudaError_t") int cudaDeviceGetCacheConfig(@Cast("cudaFuncCache*") IntBuffer pCacheConfig);
public static native @Cast("cudaError_t") int cudaDeviceGetCacheConfig(@Cast("cudaFuncCache*") int[] pCacheConfig);

/**
 * \brief Returns numerical values that correspond to the least and
 * greatest stream priorities.
 *
 * Returns in \p *leastPriority and \p *greatestPriority the numerical values that correspond
 * to the least and greatest stream priorities respectively. Stream priorities
 * follow a convention where lower numbers imply greater priorities. The range of
 * meaningful stream priorities is given by [\p *greatestPriority, \p *leastPriority].
 * If the user attempts to create a stream with a priority value that is
 * outside the the meaningful range as specified by this API, the priority is
 * automatically clamped down or up to either \p *leastPriority or \p *greatestPriority
 * respectively. See ::cudaStreamCreateWithPriority for details on creating a
 * priority stream.
 * A NULL may be passed in for \p *leastPriority or \p *greatestPriority if the value
 * is not desired.
 *
 * This function will return '0' in both \p *leastPriority and \p *greatestPriority if
 * the current context's device does not support stream priorities
 * (see ::cudaDeviceGetAttribute).
 *
 * @param leastPriority    - Pointer to an int in which the numerical value for least
 *                           stream priority is returned
 * @param greatestPriority - Pointer to an int in which the numerical value for greatest
 *                           stream priority is returned
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaStreamCreateWithPriority,
 * ::cudaStreamGetPriority
 */
public static native @Cast("cudaError_t") int cudaDeviceGetStreamPriorityRange(IntPointer leastPriority, IntPointer greatestPriority);
public static native @Cast("cudaError_t") int cudaDeviceGetStreamPriorityRange(IntBuffer leastPriority, IntBuffer greatestPriority);
public static native @Cast("cudaError_t") int cudaDeviceGetStreamPriorityRange(int[] leastPriority, int[] greatestPriority);

/**
 * \brief Sets the preferred cache configuration for the current device.
 *
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this sets through \p cacheConfig the preferred cache
 * configuration for the current device. This is only a preference. The
 * runtime will use the requested configuration if possible, but it is free to
 * choose a different configuration if required to execute the function. Any
 * function preference set via
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)"
 * or
 * \ref ::cudaFuncSetCacheConfig(T*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C++ API)"
 * will be preferred over this device-wide setting. Setting the device-wide
 * cache configuration to ::cudaFuncCachePreferNone will cause subsequent
 * kernel launches to prefer to not change the cache configuration unless
 * required to launch the kernel.
 *
 * This setting does nothing on devices where the size of the L1 cache and
 * shared memory are fixed.
 *
 * Launching a kernel with a different preference than the most recent
 * preference setting may insert a device-side synchronization point.
 *
 * The supported cache configurations are:
 * - ::cudaFuncCachePreferNone: no preference for shared memory or L1 (default)
 * - ::cudaFuncCachePreferShared: prefer larger shared memory and smaller L1 cache
 * - ::cudaFuncCachePreferL1: prefer larger L1 cache and smaller shared memory
 * - ::cudaFuncCachePreferEqual: prefer equal size L1 cache and shared memory
 *
 * @param cacheConfig - Requested cache configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaDeviceGetCacheConfig,
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncSetCacheConfig(T*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C++ API)"
 */
public static native @Cast("cudaError_t") int cudaDeviceSetCacheConfig(@Cast("cudaFuncCache") int cacheConfig);

/**
 * \brief Returns the shared memory configuration for the current device.
 *
 * This function will return in \p pConfig the current size of shared memory banks
 * on the current device. On devices with configurable shared memory banks, 
 * ::cudaDeviceSetSharedMemConfig can be used to change this setting, so that all 
 * subsequent kernel launches will by default use the new bank size. When 
 * ::cudaDeviceGetSharedMemConfig is called on devices without configurable shared 
 * memory, it will return the fixed bank size of the hardware.
 *
 * The returned bank configurations can be either:
 * - ::cudaSharedMemBankSizeFourByte - shared memory bank width is four bytes.
 * - ::cudaSharedMemBankSizeEightByte - shared memory bank width is eight bytes.
 *
 * @param pConfig - Returned cache configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaDeviceSetCacheConfig,
 * ::cudaDeviceGetCacheConfig,
 * ::cudaDeviceSetSharedMemConfig,
 * ::cudaFuncSetCacheConfig
 */
public static native @Cast("cudaError_t") int cudaDeviceGetSharedMemConfig(@Cast("cudaSharedMemConfig*") IntPointer pConfig);
public static native @Cast("cudaError_t") int cudaDeviceGetSharedMemConfig(@Cast("cudaSharedMemConfig*") IntBuffer pConfig);
public static native @Cast("cudaError_t") int cudaDeviceGetSharedMemConfig(@Cast("cudaSharedMemConfig*") int[] pConfig);

/**
 * \brief Sets the shared memory configuration for the current device.
 *
 * On devices with configurable shared memory banks, this function will set
 * the shared memory bank size which is used for all subsequent kernel launches.
 * Any per-function setting of shared memory set via ::cudaFuncSetSharedMemConfig
 * will override the device wide setting.
 *
 * Changing the shared memory configuration between launches may introduce
 * a device side synchronization point.
 *
 * Changing the shared memory bank size will not increase shared memory usage
 * or affect occupancy of kernels, but may have major effects on performance. 
 * Larger bank sizes will allow for greater potential bandwidth to shared memory,
 * but will change what kinds of accesses to shared memory will result in bank 
 * conflicts.
 *
 * This function will do nothing on devices with fixed shared memory bank size.
 *
 * The supported bank configurations are:
 * - ::cudaSharedMemBankSizeDefault: set bank width the device default (currently,
 *   four bytes)
 * - ::cudaSharedMemBankSizeFourByte: set shared memory bank width to be four bytes
 *   natively.
 * - ::cudaSharedMemBankSizeEightByte: set shared memory bank width to be eight 
 *   bytes natively.
 *
 * @param config - Requested cache configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaDeviceSetCacheConfig,
 * ::cudaDeviceGetCacheConfig,
 * ::cudaDeviceGetSharedMemConfig,
 * ::cudaFuncSetCacheConfig
 */
public static native @Cast("cudaError_t") int cudaDeviceSetSharedMemConfig(@Cast("cudaSharedMemConfig") int config);

/**
 * \brief Returns a handle to a compute device
 *
 * Returns in \p *device a device ordinal given a PCI bus ID string.
 *
 * @param device   - Returned device ordinal
 *
 * @param pciBusId - String in one of the following forms: 
 * [domain]:[bus]:[device].[function]
 * [domain]:[bus]:[device]
 * [bus]:[device].[function]
 * where \p domain, \p bus, \p device, and \p function are all hexadecimal values
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 *
 * \sa ::cudaDeviceGetPCIBusId
 */
public static native @Cast("cudaError_t") int cudaDeviceGetByPCIBusId(IntPointer device, @Cast("const char*") BytePointer pciBusId);
public static native @Cast("cudaError_t") int cudaDeviceGetByPCIBusId(IntBuffer device, String pciBusId);
public static native @Cast("cudaError_t") int cudaDeviceGetByPCIBusId(int[] device, @Cast("const char*") BytePointer pciBusId);
public static native @Cast("cudaError_t") int cudaDeviceGetByPCIBusId(IntPointer device, String pciBusId);
public static native @Cast("cudaError_t") int cudaDeviceGetByPCIBusId(IntBuffer device, @Cast("const char*") BytePointer pciBusId);
public static native @Cast("cudaError_t") int cudaDeviceGetByPCIBusId(int[] device, String pciBusId);

/**
 * \brief Returns a PCI Bus Id string for the device
 *
 * Returns an ASCII string identifying the device \p dev in the NULL-terminated
 * string pointed to by \p pciBusId. \p len specifies the maximum length of the
 * string that may be returned.
 *
 * @param pciBusId - Returned identifier string for the device in the following format
 * [domain]:[bus]:[device].[function]
 * where \p domain, \p bus, \p device, and \p function are all hexadecimal values.
 * pciBusId should be large enough to store 13 characters including the NULL-terminator.
 *
 * @param len      - Maximum length of string to store in \p name
 *
 * @param device   - Device to get identifier string for
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 *
 * \sa ::cudaDeviceGetByPCIBusId
 <p>
 */
public static native @Cast("cudaError_t") int cudaDeviceGetPCIBusId(@Cast("char*") BytePointer pciBusId, int len, int device);
public static native @Cast("cudaError_t") int cudaDeviceGetPCIBusId(@Cast("char*") ByteBuffer pciBusId, int len, int device);
public static native @Cast("cudaError_t") int cudaDeviceGetPCIBusId(@Cast("char*") byte[] pciBusId, int len, int device);

/**
 * \brief Gets an interprocess handle for a previously allocated event
 *
 * Takes as input a previously allocated event. This event must have been 
 * created with the ::cudaEventInterprocess and ::cudaEventDisableTiming
 * flags set. This opaque handle may be copied into other processes and
 * opened with ::cudaIpcOpenEventHandle to allow efficient hardware
 * synchronization between GPU work in different processes.
 *
 * After the event has been been opened in the importing process, 
 * ::cudaEventRecord, ::cudaEventSynchronize, ::cudaStreamWaitEvent and 
 * ::cudaEventQuery may be used in either process. Performing operations 
 * on the imported event after the exported event has been freed 
 * with ::cudaEventDestroy will result in undefined behavior.
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param handle - Pointer to a user allocated cudaIpcEventHandle
 *                    in which to return the opaque event handle
 * @param event   - Event allocated with ::cudaEventInterprocess and 
 *                    ::cudaEventDisableTiming flags.
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorMemoryAllocation,
 * ::cudaErrorMapBufferObjectFailed
 *
 * \sa
 * ::cudaEventCreate,
 * ::cudaEventDestroy,
 * ::cudaEventSynchronize,
 * ::cudaEventQuery,
 * ::cudaStreamWaitEvent,
 * ::cudaIpcOpenEventHandle,
 * ::cudaIpcGetMemHandle,
 * ::cudaIpcOpenMemHandle,
 * ::cudaIpcCloseMemHandle
 */
public static native @Cast("cudaError_t") int cudaIpcGetEventHandle(cudaIpcEventHandle_t handle, CUevent_st event);

/**
 * \brief Opens an interprocess event handle for use in the current process
 *
 * Opens an interprocess event handle exported from another process with 
 * ::cudaIpcGetEventHandle. This function returns a ::cudaEvent_t that behaves like 
 * a locally created event with the ::cudaEventDisableTiming flag specified. 
 * This event must be freed with ::cudaEventDestroy.
 *
 * Performing operations on the imported event after the exported event has 
 * been freed with ::cudaEventDestroy will result in undefined behavior.
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param event - Returns the imported event
 * @param handle  - Interprocess handle to open
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMapBufferObjectFailed,
 * ::cudaErrorInvalidResourceHandle
 *
  * \sa
 * ::cudaEventCreate,
 * ::cudaEventDestroy,
 * ::cudaEventSynchronize,
 * ::cudaEventQuery,
 * ::cudaStreamWaitEvent,
 * ::cudaIpcGetEventHandle,
 * ::cudaIpcGetMemHandle,
 * ::cudaIpcOpenMemHandle,
 * ::cudaIpcCloseMemHandle
 */
public static native @Cast("cudaError_t") int cudaIpcOpenEventHandle(@ByPtrPtr CUevent_st event, @ByVal cudaIpcEventHandle_t handle);


/**
 * \brief Gets an interprocess memory handle for an existing device memory
 *          allocation
 *
 * Takes a pointer to the base of an existing device memory allocation created 
 * with ::cudaMalloc and exports it for use in another process. This is a 
 * lightweight operation and may be called multiple times on an allocation
 * without adverse effects. 
 *
 * If a region of memory is freed with ::cudaFree and a subsequent call
 * to ::cudaMalloc returns memory with the same device address,
 * ::cudaIpcGetMemHandle will return a unique handle for the
 * new memory. 
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param handle - Pointer to user allocated ::cudaIpcMemHandle to return
 *                    the handle in.
 * @param devPtr - Base pointer to previously allocated device memory 
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorMemoryAllocation,
 * ::cudaErrorMapBufferObjectFailed,
 *
 * \sa
 * ::cudaMalloc,
 * ::cudaFree,
 * ::cudaIpcGetEventHandle,
 * ::cudaIpcOpenEventHandle,
 * ::cudaIpcOpenMemHandle,
 * ::cudaIpcCloseMemHandle
 */
public static native @Cast("cudaError_t") int cudaIpcGetMemHandle(cudaIpcMemHandle_t handle, Pointer devPtr);

/**
 * \brief Opens an interprocess memory handle exported from another process
 *          and returns a device pointer usable in the local process.
 *
 * Maps memory exported from another process with ::cudaIpcGetMemHandle into
 * the current device address space. For contexts on different devices 
 * ::cudaIpcOpenMemHandle can attempt to enable peer access between the
 * devices as if the user called ::cudaDeviceEnablePeerAccess. This behavior is 
 * controlled by the ::cudaIpcMemLazyEnablePeerAccess flag. 
 * ::cudaDeviceCanAccessPeer can determine if a mapping is possible.
 *
 * Contexts that may open ::cudaIpcMemHandles are restricted in the following way.
 * ::cudaIpcMemHandles from each device in a given process may only be opened 
 * by one context per device per other process.
 *
 * Memory returned from ::cudaIpcOpenMemHandle must be freed with
 * ::cudaIpcCloseMemHandle.
 *
 * Calling ::cudaFree on an exported memory region before calling
 * ::cudaIpcCloseMemHandle in the importing context will result in undefined
 * behavior.
 * 
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param devPtr - Returned device pointer
 * @param handle - ::cudaIpcMemHandle to open
 * @param flags  - Flags for this operation. Must be specified as ::cudaIpcMemLazyEnablePeerAccess
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMapBufferObjectFailed,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorTooManyPeers
 *
 * \note No guarantees are made about the address returned in \p *devPtr.  
 * In particular, multiple processes may not receive the same address for the same \p handle.
 *
 * \sa
 * ::cudaMalloc,
 * ::cudaFree,
 * ::cudaIpcGetEventHandle,
 * ::cudaIpcOpenEventHandle,
 * ::cudaIpcGetMemHandle,
 * ::cudaIpcCloseMemHandle,
 * ::cudaDeviceEnablePeerAccess,
 * ::cudaDeviceCanAccessPeer,
 */
public static native @Cast("cudaError_t") int cudaIpcOpenMemHandle(@Cast("void**") PointerPointer devPtr, @ByVal cudaIpcMemHandle_t handle, @Cast("unsigned int") int flags);
public static native @Cast("cudaError_t") int cudaIpcOpenMemHandle(@Cast("void**") @ByPtrPtr Pointer devPtr, @ByVal cudaIpcMemHandle_t handle, @Cast("unsigned int") int flags);

/**
 * \brief Close memory mapped with cudaIpcOpenMemHandle
 * 
 * Unmaps memory returnd by ::cudaIpcOpenMemHandle. The original allocation
 * in the exporting process as well as imported mappings in other processes
 * will be unaffected.
 *
 * Any resources used to enable peer access will be freed if this is the
 * last mapping using them.
 *
 * IPC functionality is restricted to devices with support for unified 
 * addressing on Linux operating systems.
 *
 * @param devPtr - Device pointer returned by ::cudaIpcOpenMemHandle
 * 
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMapBufferObjectFailed,
 * ::cudaErrorInvalidResourceHandle,
 *
 * \sa
 * ::cudaMalloc,
 * ::cudaFree,
 * ::cudaIpcGetEventHandle,
 * ::cudaIpcOpenEventHandle,
 * ::cudaIpcGetMemHandle,
 * ::cudaIpcOpenMemHandle,
 */
public static native @Cast("cudaError_t") int cudaIpcCloseMemHandle(Pointer devPtr);

/** \} */ /* END CUDART_DEVICE */

/**
 * \defgroup CUDART_THREAD_DEPRECATED Thread Management [DEPRECATED]
 *
 * ___MANBRIEF___ deprecated thread management functions of the CUDA runtime
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes deprecated thread management functions of the CUDA runtime
 * application programming interface.
 *
 * \{
 */

/**
 * \brief Exit and clean up from CUDA launches
 *
 * @deprecated
 *
 * Note that this function is deprecated because its name does not 
 * reflect its behavior.  Its functionality is identical to the 
 * non-deprecated function ::cudaDeviceReset(), which should be used
 * instead.
 *
 * Explicitly destroys all cleans up all resources associated with the current
 * device in the current process.  Any subsequent API call to this device will 
 * reinitialize the device.  
 *
 * Note that this function will reset the device immediately.  It is the caller's
 * responsibility to ensure that the device is not being accessed by any 
 * other host threads from the process when this function is called.
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \sa ::cudaDeviceReset
 */
public static native @Cast("cudaError_t") int cudaThreadExit();

/**
 * \brief Wait for compute device to finish
 *
 * @deprecated
 *
 * Note that this function is deprecated because its name does not 
 * reflect its behavior.  Its functionality is similar to the 
 * non-deprecated function ::cudaDeviceSynchronize(), which should be used
 * instead.
 *
 * Blocks until the device has completed all preceding requested tasks.
 * ::cudaThreadSynchronize() returns an error if one of the preceding tasks
 * has failed. If the ::cudaDeviceScheduleBlockingSync flag was set for 
 * this device, the host thread will block until the device has finished 
 * its work.
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \sa ::cudaDeviceSynchronize
 */
public static native @Cast("cudaError_t") int cudaThreadSynchronize();

/**
 * \brief Set resource limits
 *
 * @deprecated
 *
 * Note that this function is deprecated because its name does not 
 * reflect its behavior.  Its functionality is identical to the 
 * non-deprecated function ::cudaDeviceSetLimit(), which should be used
 * instead.
 *
 * Setting \p limit to \p value is a request by the application to update
 * the current limit maintained by the device.  The driver is free to
 * modify the requested value to meet h/w requirements (this could be
 * clamping to minimum or maximum values, rounding up to nearest element
 * size, etc).  The application can use ::cudaThreadGetLimit() to find out
 * exactly what the limit has been set to.
 *
 * Setting each ::cudaLimit has its own specific restrictions, so each is
 * discussed here.
 *
 * - ::cudaLimitStackSize controls the stack size of each GPU thread.
 *
 * - ::cudaLimitPrintfFifoSize controls the size of the shared FIFO
 *   used by the ::printf() and ::fprintf() device system calls.
 *   Setting ::cudaLimitPrintfFifoSize must be performed before
 *   launching any kernel that uses the ::printf() or ::fprintf() device
 *   system calls, otherwise ::cudaErrorInvalidValue will be returned.
 *
 * - ::cudaLimitMallocHeapSize controls the size of the heap used
 *   by the ::malloc() and ::free() device system calls.  Setting
 *   ::cudaLimitMallocHeapSize must be performed before launching
 *   any kernel that uses the ::malloc() or ::free() device system calls,
 *   otherwise ::cudaErrorInvalidValue will be returned.
 *
 * @param limit - Limit to set
 * @param value - Size in bytes of limit
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorUnsupportedLimit,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaDeviceSetLimit
 */
public static native @Cast("cudaError_t") int cudaThreadSetLimit(@Cast("cudaLimit") int limit, @Cast("size_t") long value);

/**
 * \brief Returns resource limits
 *
 * @deprecated
 *
 * Note that this function is deprecated because its name does not 
 * reflect its behavior.  Its functionality is identical to the 
 * non-deprecated function ::cudaDeviceGetLimit(), which should be used
 * instead.
 *
 * Returns in \p *pValue the current size of \p limit.  The supported
 * ::cudaLimit values are:
 * - ::cudaLimitStackSize: stack size of each GPU thread;
 * - ::cudaLimitPrintfFifoSize: size of the shared FIFO used by the
 *   ::printf() and ::fprintf() device system calls.
 * - ::cudaLimitMallocHeapSize: size of the heap used by the
 *   ::malloc() and ::free() device system calls;
 *
 * @param limit  - Limit to query
 * @param pValue - Returned size in bytes of limit
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorUnsupportedLimit,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaDeviceGetLimit
 */
public static native @Cast("cudaError_t") int cudaThreadGetLimit(@Cast("size_t*") SizeTPointer pValue, @Cast("cudaLimit") int limit);

/**
 * \brief Returns the preferred cache configuration for the current device.
 *
 * @deprecated
 *
 * Note that this function is deprecated because its name does not 
 * reflect its behavior.  Its functionality is identical to the 
 * non-deprecated function ::cudaDeviceGetCacheConfig(), which should be 
 * used instead.
 * 
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this returns through \p pCacheConfig the preferred cache
 * configuration for the current device. This is only a preference. The
 * runtime will use the requested configuration if possible, but it is free to
 * choose a different configuration if required to execute functions.
 *
 * This will return a \p pCacheConfig of ::cudaFuncCachePreferNone on devices
 * where the size of the L1 cache and shared memory are fixed.
 *
 * The supported cache configurations are:
 * - ::cudaFuncCachePreferNone: no preference for shared memory or L1 (default)
 * - ::cudaFuncCachePreferShared: prefer larger shared memory and smaller L1 cache
 * - ::cudaFuncCachePreferL1: prefer larger L1 cache and smaller shared memory
 *
 * @param pCacheConfig - Returned cache configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa cudaDeviceGetCacheConfig
 */
public static native @Cast("cudaError_t") int cudaThreadGetCacheConfig(@Cast("cudaFuncCache*") IntPointer pCacheConfig);
public static native @Cast("cudaError_t") int cudaThreadGetCacheConfig(@Cast("cudaFuncCache*") IntBuffer pCacheConfig);
public static native @Cast("cudaError_t") int cudaThreadGetCacheConfig(@Cast("cudaFuncCache*") int[] pCacheConfig);

/**
 * \brief Sets the preferred cache configuration for the current device.
 *
 * @deprecated
 *
 * Note that this function is deprecated because its name does not 
 * reflect its behavior.  Its functionality is identical to the 
 * non-deprecated function ::cudaDeviceSetCacheConfig(), which should be 
 * used instead.
 * 
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this sets through \p cacheConfig the preferred cache
 * configuration for the current device. This is only a preference. The
 * runtime will use the requested configuration if possible, but it is free to
 * choose a different configuration if required to execute the function. Any
 * function preference set via
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)"
 * or
 * \ref ::cudaFuncSetCacheConfig(T*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C++ API)"
 * will be preferred over this device-wide setting. Setting the device-wide
 * cache configuration to ::cudaFuncCachePreferNone will cause subsequent
 * kernel launches to prefer to not change the cache configuration unless
 * required to launch the kernel.
 *
 * This setting does nothing on devices where the size of the L1 cache and
 * shared memory are fixed.
 *
 * Launching a kernel with a different preference than the most recent
 * preference setting may insert a device-side synchronization point.
 *
 * The supported cache configurations are:
 * - ::cudaFuncCachePreferNone: no preference for shared memory or L1 (default)
 * - ::cudaFuncCachePreferShared: prefer larger shared memory and smaller L1 cache
 * - ::cudaFuncCachePreferL1: prefer larger L1 cache and smaller shared memory
 *
 * @param cacheConfig - Requested cache configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaDeviceSetCacheConfig
 */
public static native @Cast("cudaError_t") int cudaThreadSetCacheConfig(@Cast("cudaFuncCache") int cacheConfig);

/** \} */ /* END CUDART_THREAD_DEPRECATED */

/**
 * \defgroup CUDART_ERROR Error Handling
 *
 * ___MANBRIEF___ error handling functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the error handling functions of the CUDA runtime
 * application programming interface.
 *
 * \{
 */

/**
 * \brief Returns the last error from a runtime call
 *
 * Returns the last error that has been produced by any of the runtime calls
 * in the same host thread and resets it to ::cudaSuccess.
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMissingConfiguration,
 * ::cudaErrorMemoryAllocation,
 * ::cudaErrorInitializationError,
 * ::cudaErrorLaunchFailure,
 * ::cudaErrorLaunchTimeout,
 * ::cudaErrorLaunchOutOfResources,
 * ::cudaErrorInvalidDeviceFunction,
 * ::cudaErrorInvalidConfiguration,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidSymbol,
 * ::cudaErrorUnmapBufferObjectFailed,
 * ::cudaErrorInvalidHostPointer,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidTexture,
 * ::cudaErrorInvalidTextureBinding,
 * ::cudaErrorInvalidChannelDescriptor,
 * ::cudaErrorInvalidMemcpyDirection,
 * ::cudaErrorInvalidFilterSetting,
 * ::cudaErrorInvalidNormSetting,
 * ::cudaErrorUnknown,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorInsufficientDriver,
 * ::cudaErrorSetOnActiveProcess,
 * ::cudaErrorStartupFailure,
 * \notefnerr
 *
 * \sa ::cudaPeekAtLastError, ::cudaGetErrorName, ::cudaGetErrorString, ::cudaError
 */
public static native @Cast("cudaError_t") int cudaGetLastError();

/**
 * \brief Returns the last error from a runtime call
 *
 * Returns the last error that has been produced by any of the runtime calls
 * in the same host thread. Note that this call does not reset the error to
 * ::cudaSuccess like ::cudaGetLastError().
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMissingConfiguration,
 * ::cudaErrorMemoryAllocation,
 * ::cudaErrorInitializationError,
 * ::cudaErrorLaunchFailure,
 * ::cudaErrorLaunchTimeout,
 * ::cudaErrorLaunchOutOfResources,
 * ::cudaErrorInvalidDeviceFunction,
 * ::cudaErrorInvalidConfiguration,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidSymbol,
 * ::cudaErrorUnmapBufferObjectFailed,
 * ::cudaErrorInvalidHostPointer,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidTexture,
 * ::cudaErrorInvalidTextureBinding,
 * ::cudaErrorInvalidChannelDescriptor,
 * ::cudaErrorInvalidMemcpyDirection,
 * ::cudaErrorInvalidFilterSetting,
 * ::cudaErrorInvalidNormSetting,
 * ::cudaErrorUnknown,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorInsufficientDriver,
 * ::cudaErrorSetOnActiveProcess,
 * ::cudaErrorStartupFailure,
 * \notefnerr
 *
 * \sa ::cudaGetLastError, ::cudaGetErrorName, ::cudaGetErrorString, ::cudaError
 */
public static native @Cast("cudaError_t") int cudaPeekAtLastError();

/**
 * \brief Returns the string representation of an error code enum name
 *
 * Returns a string containing the name of an error code in the enum.  If the error
 * code is not recognized, "unrecognized error code" is returned.
 *
 * @param error - Error code to convert to string
 *
 * @return
 * \p char* pointer to a NULL-terminated string
 *
 * \sa ::cudaGetErrorString, ::cudaGetLastError, ::cudaPeekAtLastError, ::cudaError
 */
public static native @Cast("const char*") BytePointer cudaGetErrorName(@Cast("cudaError_t") int error);

/**
 * \brief Returns the description string for an error code
 *
 * Returns the description string for an error code.  If the error
 * code is not recognized, "unrecognized error code" is returned.
 *
 * @param error - Error code to convert to string
 *
 * @return
 * \p char* pointer to a NULL-terminated string
 *
 * \sa ::cudaGetErrorName, ::cudaGetLastError, ::cudaPeekAtLastError, ::cudaError
 */
public static native @Cast("const char*") BytePointer cudaGetErrorString(@Cast("cudaError_t") int error);
/** \} */ /* END CUDART_ERROR */

/**
 * \addtogroup CUDART_DEVICE 
 *
 * \{
 */

/**
 * \brief Returns the number of compute-capable devices
 *
 * Returns in \p *count the number of devices with compute capability greater
 * or equal to 2.0 that are available for execution.  If there is no such
 * device then ::cudaGetDeviceCount() will return ::cudaErrorNoDevice.
 * If no driver can be loaded to determine if any such devices exist then
 * ::cudaGetDeviceCount() will return ::cudaErrorInsufficientDriver.
 *
 * @param count - Returns the number of devices with compute capability
 * greater or equal to 2.0
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorNoDevice,
 * ::cudaErrorInsufficientDriver
 * \notefnerr
 *
 * \sa ::cudaGetDevice, ::cudaSetDevice, ::cudaGetDeviceProperties,
 * ::cudaChooseDevice
 */
public static native @Cast("cudaError_t") int cudaGetDeviceCount(IntPointer count);
public static native @Cast("cudaError_t") int cudaGetDeviceCount(IntBuffer count);
public static native @Cast("cudaError_t") int cudaGetDeviceCount(int[] count);

/**
 * \brief Returns information about the compute-device
 *
 * Returns in \p *prop the properties of device \p dev. The ::cudaDeviceProp
 * structure is defined as:
 * <pre>{@code
    struct cudaDeviceProp {
        char name[256];
        size_t totalGlobalMem;
        size_t sharedMemPerBlock;
        int regsPerBlock;
        int warpSize;
        size_t memPitch;
        int maxThreadsPerBlock;
        int maxThreadsDim[3];
        int maxGridSize[3];
        int clockRate;
        size_t totalConstMem;
        int major;
        int minor;
        size_t textureAlignment;
        size_t texturePitchAlignment;
        int deviceOverlap;
        int multiProcessorCount;
        int kernelExecTimeoutEnabled;
        int integrated;
        int canMapHostMemory;
        int computeMode;
        int maxTexture1D;
        int maxTexture1DMipmap;
        int maxTexture1DLinear;
        int maxTexture2D[2];
        int maxTexture2DMipmap[2];
        int maxTexture2DLinear[3];
        int maxTexture2DGather[2];
        int maxTexture3D[3];
        int maxTexture3DAlt[3];
        int maxTextureCubemap;
        int maxTexture1DLayered[2];
        int maxTexture2DLayered[3];
        int maxTextureCubemapLayered[2];
        int maxSurface1D;
        int maxSurface2D[2];
        int maxSurface3D[3];
        int maxSurface1DLayered[2];
        int maxSurface2DLayered[3];
        int maxSurfaceCubemap;
        int maxSurfaceCubemapLayered[2];
        size_t surfaceAlignment;
        int concurrentKernels;
        int ECCEnabled;
        int pciBusID;
        int pciDeviceID;
        int pciDomainID;
        int tccDriver;
        int asyncEngineCount;
        int unifiedAddressing;
        int memoryClockRate;
        int memoryBusWidth;
        int l2CacheSize;
        int maxThreadsPerMultiProcessor;
        int streamPrioritiesSupported;
        int globalL1CacheSupported;
        int localL1CacheSupported;
        size_t sharedMemPerMultiprocessor;
        int regsPerMultiprocessor;
        int managedMemSupported;
        int isMultiGpuBoard;
        int multiGpuBoardGroupID;
    }
 }</pre>
 * where:
 * - \ref ::cudaDeviceProp::name "name[256]" is an ASCII string identifying
 *   the device;
 * - \ref ::cudaDeviceProp::totalGlobalMem "totalGlobalMem" is the total
 *   amount of global memory available on the device in bytes;
 * - \ref ::cudaDeviceProp::sharedMemPerBlock "sharedMemPerBlock" is the
 *   maximum amount of shared memory available to a thread block in bytes;
 * - \ref ::cudaDeviceProp::regsPerBlock "regsPerBlock" is the maximum number
 *   of 32-bit registers available to a thread block;
 * - \ref ::cudaDeviceProp::warpSize "warpSize" is the warp size in threads;
 * - \ref ::cudaDeviceProp::memPitch "memPitch" is the maximum pitch in
 *   bytes allowed by the memory copy functions that involve memory regions
 *   allocated through ::cudaMallocPitch();
 * - \ref ::cudaDeviceProp::maxThreadsPerBlock "maxThreadsPerBlock" is the
 *   maximum number of threads per block;
 * - \ref ::cudaDeviceProp::maxThreadsDim "maxThreadsDim[3]" contains the
 *   maximum size of each dimension of a block;
 * - \ref ::cudaDeviceProp::maxGridSize "maxGridSize[3]" contains the
 *   maximum size of each dimension of a grid;
 * - \ref ::cudaDeviceProp::clockRate "clockRate" is the clock frequency in
 *   kilohertz;
 * - \ref ::cudaDeviceProp::totalConstMem "totalConstMem" is the total amount
 *   of constant memory available on the device in bytes;
 * - \ref ::cudaDeviceProp::major "major",
 *   \ref ::cudaDeviceProp::minor "minor" are the major and minor revision
 *   numbers defining the device's compute capability;
 * - \ref ::cudaDeviceProp::textureAlignment "textureAlignment" is the
 *   alignment requirement; texture base addresses that are aligned to
 *   \ref ::cudaDeviceProp::textureAlignment "textureAlignment" bytes do not
 *   need an offset applied to texture fetches;
 * - \ref ::cudaDeviceProp::texturePitchAlignment "texturePitchAlignment" is the
 *   pitch alignment requirement for 2D texture references that are bound to 
 *   pitched memory;
 * - \ref ::cudaDeviceProp::deviceOverlap "deviceOverlap" is 1 if the device
 *   can concurrently copy memory between host and device while executing a
 *   kernel, or 0 if not.  Deprecated, use instead asyncEngineCount.
 * - \ref ::cudaDeviceProp::multiProcessorCount "multiProcessorCount" is the
 *   number of multiprocessors on the device;
 * - \ref ::cudaDeviceProp::kernelExecTimeoutEnabled "kernelExecTimeoutEnabled"
 *   is 1 if there is a run time limit for kernels executed on the device, or
 *   0 if not.
 * - \ref ::cudaDeviceProp::integrated "integrated" is 1 if the device is an
 *   integrated (motherboard) GPU and 0 if it is a discrete (card) component.
 * - \ref ::cudaDeviceProp::canMapHostMemory "canMapHostMemory" is 1 if the
 *   device can map host memory into the CUDA address space for use with
 *   ::cudaHostAlloc()/::cudaHostGetDevicePointer(), or 0 if not;
 * - \ref ::cudaDeviceProp::computeMode "computeMode" is the compute mode
 *   that the device is currently in. Available modes are as follows:
 *   - cudaComputeModeDefault: Default mode - Device is not restricted and
 *     multiple threads can use ::cudaSetDevice() with this device.
 *   - cudaComputeModeExclusive: Compute-exclusive mode - Only one thread will
 *     be able to use ::cudaSetDevice() with this device.
 *   - cudaComputeModeProhibited: Compute-prohibited mode - No threads can use
 *     ::cudaSetDevice() with this device.
 *   - cudaComputeModeExclusiveProcess: Compute-exclusive-process mode - Many 
 *     threads in one process will be able to use ::cudaSetDevice() with this device.
 *   <br> If ::cudaSetDevice() is called on an already occupied \p device with 
 *   computeMode ::cudaComputeModeExclusive, ::cudaErrorDeviceAlreadyInUse
 *   will be immediately returned indicating the device cannot be used.
 *   When an occupied exclusive mode device is chosen with ::cudaSetDevice,
 *   all subsequent non-device management runtime functions will return
 *   ::cudaErrorDevicesUnavailable.
 * - \ref ::cudaDeviceProp::maxTexture1D "maxTexture1D" is the maximum 1D
 *   texture size.
 * - \ref ::cudaDeviceProp::maxTexture1DMipmap "maxTexture1DMipmap" is the maximum
 *   1D mipmapped texture texture size.
 * - \ref ::cudaDeviceProp::maxTexture1DLinear "maxTexture1DLinear" is the maximum
 *   1D texture size for textures bound to linear memory.
 * - \ref ::cudaDeviceProp::maxTexture2D "maxTexture2D[2]" contains the maximum
 *   2D texture dimensions.
 * - \ref ::cudaDeviceProp::maxTexture2DMipmap "maxTexture2DMipmap[2]" contains the
 *   maximum 2D mipmapped texture dimensions.
 * - \ref ::cudaDeviceProp::maxTexture2DLinear "maxTexture2DLinear[3]" contains the 
 *   maximum 2D texture dimensions for 2D textures bound to pitch linear memory.
 * - \ref ::cudaDeviceProp::maxTexture2DGather "maxTexture2DGather[2]" contains the 
 *   maximum 2D texture dimensions if texture gather operations have to be performed.
 * - \ref ::cudaDeviceProp::maxTexture3D "maxTexture3D[3]" contains the maximum
 *   3D texture dimensions.
 * - \ref ::cudaDeviceProp::maxTexture3DAlt "maxTexture3DAlt[3]"
 *   contains the maximum alternate 3D texture dimensions.
 * - \ref ::cudaDeviceProp::maxTextureCubemap "maxTextureCubemap" is the 
 *   maximum cubemap texture width or height.
 * - \ref ::cudaDeviceProp::maxTexture1DLayered "maxTexture1DLayered[2]" contains
 *   the maximum 1D layered texture dimensions.
 * - \ref ::cudaDeviceProp::maxTexture2DLayered "maxTexture2DLayered[3]" contains
 *   the maximum 2D layered texture dimensions.
 * - \ref ::cudaDeviceProp::maxTextureCubemapLayered "maxTextureCubemapLayered[2]"
 *   contains the maximum cubemap layered texture dimensions.
 * - \ref ::cudaDeviceProp::maxSurface1D "maxSurface1D" is the maximum 1D
 *   surface size.
 * - \ref ::cudaDeviceProp::maxSurface2D "maxSurface2D[2]" contains the maximum
 *   2D surface dimensions.
 * - \ref ::cudaDeviceProp::maxSurface3D "maxSurface3D[3]" contains the maximum
 *   3D surface dimensions.
 * - \ref ::cudaDeviceProp::maxSurface1DLayered "maxSurface1DLayered[2]" contains
 *   the maximum 1D layered surface dimensions.
 * - \ref ::cudaDeviceProp::maxSurface2DLayered "maxSurface2DLayered[3]" contains
 *   the maximum 2D layered surface dimensions.
 * - \ref ::cudaDeviceProp::maxSurfaceCubemap "maxSurfaceCubemap" is the maximum 
 *   cubemap surface width or height.
 * - \ref ::cudaDeviceProp::maxSurfaceCubemapLayered "maxSurfaceCubemapLayered[2]"
 *   contains the maximum cubemap layered surface dimensions.
 * - \ref ::cudaDeviceProp::surfaceAlignment "surfaceAlignment" specifies the
 *   alignment requirements for surfaces.
 * - \ref ::cudaDeviceProp::concurrentKernels "concurrentKernels" is 1 if the
 *   device supports executing multiple kernels within the same context
 *   simultaneously, or 0 if not. It is not guaranteed that multiple kernels
 *   will be resident on the device concurrently so this feature should not be
 *   relied upon for correctness;
 * - \ref ::cudaDeviceProp::ECCEnabled "ECCEnabled" is 1 if the device has ECC
 *   support turned on, or 0 if not.
 * - \ref ::cudaDeviceProp::pciBusID "pciBusID" is the PCI bus identifier of
 *   the device.
 * - \ref ::cudaDeviceProp::pciDeviceID "pciDeviceID" is the PCI device
 *   (sometimes called slot) identifier of the device.
 * - \ref ::cudaDeviceProp::pciDomainID "pciDomainID" is the PCI domain identifier
 *   of the device.
 * - \ref ::cudaDeviceProp::tccDriver "tccDriver" is 1 if the device is using a
 *   TCC driver or 0 if not.
 * - \ref ::cudaDeviceProp::asyncEngineCount "asyncEngineCount" is 1 when the
 *   device can concurrently copy memory between host and device while executing
 *   a kernel. It is 2 when the device can concurrently copy memory between host
 *   and device in both directions and execute a kernel at the same time. It is
 *   0 if neither of these is supported.
 * - \ref ::cudaDeviceProp::unifiedAddressing "unifiedAddressing" is 1 if the device 
 *   shares a unified address space with the host and 0 otherwise.
 * - \ref ::cudaDeviceProp::memoryClockRate "memoryClockRate" is the peak memory 
 *   clock frequency in kilohertz.
 * - \ref ::cudaDeviceProp::memoryBusWidth "memoryBusWidth" is the memory bus width  
 *   in bits.
 * - \ref ::cudaDeviceProp::l2CacheSize "l2CacheSize" is L2 cache size in bytes. 
 * - \ref ::cudaDeviceProp::maxThreadsPerMultiProcessor "maxThreadsPerMultiProcessor"  
 *   is the number of maximum resident threads per multiprocessor.
 * - \ref ::cudaDeviceProp::streamPrioritiesSupported "streamPrioritiesSupported"
 *   is 1 if the device supports stream priorities, or 0 if it is not supported.
 * - \ref ::cudaDeviceProp::globalL1CacheSupported "globalL1CacheSupported"
 *   is 1 if the device supports caching of globals in L1 cache, or 0 if it is not supported.
 * - \ref ::cudaDeviceProp::localL1CacheSupported "localL1CacheSupported"
 *   is 1 if the device supports caching of locals in L1 cache, or 0 if it is not supported.
 * - \ref ::cudaDeviceProp::sharedMemPerMultiprocessor "sharedMemPerMultiprocessor" is the
 *   maximum amount of shared memory available to a multiprocessor in bytes; this amount is
 *   shared by all thread blocks simultaneously resident on a multiprocessor;
 * - \ref ::cudaDeviceProp::regsPerMultiprocessor "regsPerMultiprocessor" is the maximum number
 *   of 32-bit registers available to a multiprocessor; this number is shared
 *   by all thread blocks simultaneously resident on a multiprocessor;
 * - \ref ::cudaDeviceProp::managedMemory "managedMemory"
 *   is 1 if the device supports allocating managed memory on this system, or 0 if it is not supported.
 * - \ref ::cudaDeviceProp::isMultiGpuBoard "isMultiGpuBoard"
 *   is 1 if the device is on a multi-GPU board (e.g. Gemini cards), and 0 if not;
 * - \ref ::cudaDeviceProp::multiGpuBoardGroupID "multiGpuBoardGroupID" is a unique identifier
 *   for a group of devices associated with the same board.
 *   Devices on the same multi-GPU board will share the same identifier;
 *
 * @param prop   - Properties for the specified device
 * @param device - Device number to get properties for
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice
 *
 * \sa ::cudaGetDeviceCount, ::cudaGetDevice, ::cudaSetDevice, ::cudaChooseDevice,
 * ::cudaDeviceGetAttribute
 */
public static native @Cast("cudaError_t") int cudaGetDeviceProperties(cudaDeviceProp prop, int device);

/**
 * \brief Returns information about the device
 *
 * Returns in \p *value the integer value of the attribute \p attr on device
 * \p device. The supported attributes are:
 * - ::cudaDevAttrMaxThreadsPerBlock: Maximum number of threads per block;
 * - ::cudaDevAttrMaxBlockDimX: Maximum x-dimension of a block;
 * - ::cudaDevAttrMaxBlockDimY: Maximum y-dimension of a block;
 * - ::cudaDevAttrMaxBlockDimZ: Maximum z-dimension of a block;
 * - ::cudaDevAttrMaxGridDimX: Maximum x-dimension of a grid;
 * - ::cudaDevAttrMaxGridDimY: Maximum y-dimension of a grid;
 * - ::cudaDevAttrMaxGridDimZ: Maximum z-dimension of a grid;
 * - ::cudaDevAttrMaxSharedMemoryPerBlock: Maximum amount of shared memory
 *   available to a thread block in bytes;
 * - ::cudaDevAttrTotalConstantMemory: Memory available on device for
 *   __constant__ variables in a CUDA C kernel in bytes;
 * - ::cudaDevAttrWarpSize: Warp size in threads;
 * - ::cudaDevAttrMaxPitch: Maximum pitch in bytes allowed by the memory copy
 *   functions that involve memory regions allocated through ::cudaMallocPitch();
 * - ::cudaDevAttrMaxTexture1DWidth: Maximum 1D texture width;
 * - ::cudaDevAttrMaxTexture1DLinearWidth: Maximum width for a 1D texture bound
 *   to linear memory;
 * - ::cudaDevAttrMaxTexture1DMipmappedWidth: Maximum mipmapped 1D texture width;
 * - ::cudaDevAttrMaxTexture2DWidth: Maximum 2D texture width;
 * - ::cudaDevAttrMaxTexture2DHeight: Maximum 2D texture height;
 * - ::cudaDevAttrMaxTexture2DLinearWidth: Maximum width for a 2D texture
 *   bound to linear memory;
 * - ::cudaDevAttrMaxTexture2DLinearHeight: Maximum height for a 2D texture
 *   bound to linear memory;
 * - ::cudaDevAttrMaxTexture2DLinearPitch: Maximum pitch in bytes for a 2D
 *   texture bound to linear memory;
 * - ::cudaDevAttrMaxTexture2DMipmappedWidth: Maximum mipmapped 2D texture
 *   width;
 * - ::cudaDevAttrMaxTexture2DMipmappedHeight: Maximum mipmapped 2D texture
 *   height;
 * - ::cudaDevAttrMaxTexture3DWidth: Maximum 3D texture width;
 * - ::cudaDevAttrMaxTexture3DHeight: Maximum 3D texture height;
 * - ::cudaDevAttrMaxTexture3DDepth: Maximum 3D texture depth;
 * - ::cudaDevAttrMaxTexture3DWidthAlt: Alternate maximum 3D texture width,
 *   0 if no alternate maximum 3D texture size is supported;
 * - ::cudaDevAttrMaxTexture3DHeightAlt: Alternate maximum 3D texture height,
 *   0 if no alternate maximum 3D texture size is supported;
 * - ::cudaDevAttrMaxTexture3DDepthAlt: Alternate maximum 3D texture depth,
 *   0 if no alternate maximum 3D texture size is supported;
 * - ::cudaDevAttrMaxTextureCubemapWidth: Maximum cubemap texture width or
 *   height;
 * - ::cudaDevAttrMaxTexture1DLayeredWidth: Maximum 1D layered texture width;
 * - ::cudaDevAttrMaxTexture1DLayeredLayers: Maximum layers in a 1D layered
 *   texture;
 * - ::cudaDevAttrMaxTexture2DLayeredWidth: Maximum 2D layered texture width;
 * - ::cudaDevAttrMaxTexture2DLayeredHeight: Maximum 2D layered texture height;
 * - ::cudaDevAttrMaxTexture2DLayeredLayers: Maximum layers in a 2D layered
 *   texture;
 * - ::cudaDevAttrMaxTextureCubemapLayeredWidth: Maximum cubemap layered
 *   texture width or height;
 * - ::cudaDevAttrMaxTextureCubemapLayeredLayers: Maximum layers in a cubemap
 *   layered texture;
 * - ::cudaDevAttrMaxSurface1DWidth: Maximum 1D surface width;
 * - ::cudaDevAttrMaxSurface2DWidth: Maximum 2D surface width;
 * - ::cudaDevAttrMaxSurface2DHeight: Maximum 2D surface height;
 * - ::cudaDevAttrMaxSurface3DWidth: Maximum 3D surface width;
 * - ::cudaDevAttrMaxSurface3DHeight: Maximum 3D surface height;
 * - ::cudaDevAttrMaxSurface3DDepth: Maximum 3D surface depth;
 * - ::cudaDevAttrMaxSurface1DLayeredWidth: Maximum 1D layered surface width;
 * - ::cudaDevAttrMaxSurface1DLayeredLayers: Maximum layers in a 1D layered
 *   surface;
 * - ::cudaDevAttrMaxSurface2DLayeredWidth: Maximum 2D layered surface width;
 * - ::cudaDevAttrMaxSurface2DLayeredHeight: Maximum 2D layered surface height;
 * - ::cudaDevAttrMaxSurface2DLayeredLayers: Maximum layers in a 2D layered
 *   surface;
 * - ::cudaDevAttrMaxSurfaceCubemapWidth: Maximum cubemap surface width;
 * - ::cudaDevAttrMaxSurfaceCubemapLayeredWidth: Maximum cubemap layered
 *   surface width;
 * - ::cudaDevAttrMaxSurfaceCubemapLayeredLayers: Maximum layers in a cubemap
 *   layered surface;
 * - ::cudaDevAttrMaxRegistersPerBlock: Maximum number of 32-bit registers 
 *   available to a thread block;
 * - ::cudaDevAttrClockRate: Peak clock frequency in kilohertz;
 * - ::cudaDevAttrTextureAlignment: Alignment requirement; texture base
 *   addresses aligned to ::textureAlign bytes do not need an offset applied
 *   to texture fetches;
 * - ::cudaDevAttrTexturePitchAlignment: Pitch alignment requirement for 2D
 *   texture references bound to pitched memory;
 * - ::cudaDevAttrGpuOverlap: 1 if the device can concurrently copy memory
 *   between host and device while executing a kernel, or 0 if not;
 * - ::cudaDevAttrMultiProcessorCount: Number of multiprocessors on the device;
 * - ::cudaDevAttrKernelExecTimeout: 1 if there is a run time limit for kernels
 *   executed on the device, or 0 if not;
 * - ::cudaDevAttrIntegrated: 1 if the device is integrated with the memory
 *   subsystem, or 0 if not;
 * - ::cudaDevAttrCanMapHostMemory: 1 if the device can map host memory into
 *   the CUDA address space, or 0 if not;
 * - ::cudaDevAttrComputeMode: Compute mode is the compute mode that the device
 *   is currently in. Available modes are as follows:
 *   - ::cudaComputeModeDefault: Default mode - Device is not restricted and
 *     multiple threads can use ::cudaSetDevice() with this device.
 *   - ::cudaComputeModeExclusive: Compute-exclusive mode - Only one thread will
 *     be able to use ::cudaSetDevice() with this device.
 *   - ::cudaComputeModeProhibited: Compute-prohibited mode - No threads can use
 *     ::cudaSetDevice() with this device.
 *   - ::cudaComputeModeExclusiveProcess: Compute-exclusive-process mode - Many 
 *     threads in one process will be able to use ::cudaSetDevice() with this
 *     device.
 * - ::cudaDevAttrConcurrentKernels: 1 if the device supports executing
 *   multiple kernels within the same context simultaneously, or 0 if
 *   not. It is not guaranteed that multiple kernels will be resident on the
 *   device concurrently so this feature should not be relied upon for
 *   correctness;
 * - ::cudaDevAttrEccEnabled: 1 if error correction is enabled on the device,
 *   0 if error correction is disabled or not supported by the device;
 * - ::cudaDevAttrPciBusId: PCI bus identifier of the device;
 * - ::cudaDevAttrPciDeviceId: PCI device (also known as slot) identifier of
 *   the device;
 * - ::cudaDevAttrTccDriver: 1 if the device is using a TCC driver. TCC is only
 *   available on Tesla hardware running Windows Vista or later;
 * - ::cudaDevAttrMemoryClockRate: Peak memory clock frequency in kilohertz;
 * - ::cudaDevAttrGlobalMemoryBusWidth: Global memory bus width in bits;
 * - ::cudaDevAttrL2CacheSize: Size of L2 cache in bytes. 0 if the device
 *   doesn't have L2 cache;
 * - ::cudaDevAttrMaxThreadsPerMultiProcessor: Maximum resident threads per 
 *   multiprocessor;
 * - ::cudaDevAttrUnifiedAddressing: 1 if the device shares a unified address
 *   space with the host, or 0 if not;
 * - ::cudaDevAttrComputeCapabilityMajor: Major compute capability version
 *   number;
 * - ::cudaDevAttrComputeCapabilityMinor: Minor compute capability version
 *   number;
 * - ::cudaDevAttrStreamPrioritiesSupported: 1 if the device supports stream
 *   priorities, or 0 if not;
 * - ::cudaDevAttrGlobalL1CacheSupported: 1 if device supports caching globals 
 *    in L1 cache, 0 if not;
 * - ::cudaDevAttrGlobalL1CacheSupported: 1 if device supports caching locals 
 *    in L1 cache, 0 if not;
 * - ::cudaDevAttrMaxSharedMemoryPerMultiprocessor: Maximum amount of shared memory
 *   available to a multiprocessor in bytes; this amount is shared by all 
 *   thread blocks simultaneously resident on a multiprocessor;
 * - ::cudaDevAttrMaxRegistersPerMultiprocessor: Maximum number of 32-bit registers 
 *   available to a multiprocessor; this number is shared by all thread blocks
 *   simultaneously resident on a multiprocessor;
 * - ::cudaDevAttrManagedMemSupported: 1 if device supports allocating
 *   managed memory, 0 if not;
 * - ::cudaDevAttrIsMultiGpuBoard: 1 if device is on a multi-GPU board, 0 if not;
 * - ::cudaDevAttrMultiGpuBoardGroupID: Unique identifier for a group of devices on the
 *   same multi-GPU board;
 *
 * @param value  - Returned device attribute value
 * @param attr   - Device attribute to query
 * @param device - Device number to query 
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaGetDeviceCount, ::cudaGetDevice, ::cudaSetDevice, ::cudaChooseDevice,
 * ::cudaGetDeviceProperties
 */
public static native @Cast("cudaError_t") int cudaDeviceGetAttribute(IntPointer value, @Cast("cudaDeviceAttr") int attr, int device);
public static native @Cast("cudaError_t") int cudaDeviceGetAttribute(IntBuffer value, @Cast("cudaDeviceAttr") int attr, int device);
public static native @Cast("cudaError_t") int cudaDeviceGetAttribute(int[] value, @Cast("cudaDeviceAttr") int attr, int device);

/**
 * \brief Select compute-device which best matches criteria
 *
 * Returns in \p *device the device which has properties that best match
 * \p *prop.
 *
 * @param device - Device with best match
 * @param prop   - Desired device properties
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaGetDeviceCount, ::cudaGetDevice, ::cudaSetDevice,
 * ::cudaGetDeviceProperties
 */
public static native @Cast("cudaError_t") int cudaChooseDevice(IntPointer device, @Const cudaDeviceProp prop);
public static native @Cast("cudaError_t") int cudaChooseDevice(IntBuffer device, @Const cudaDeviceProp prop);
public static native @Cast("cudaError_t") int cudaChooseDevice(int[] device, @Const cudaDeviceProp prop);

/**
 * \brief Set device to be used for GPU executions
 *
 * Sets \p device as the current device for the calling host thread.
 * Valid device id's are 0 to (::cudaGetDeviceCount() - 1).
 *
 * Any device memory subsequently allocated from this host thread
 * using ::cudaMalloc(), ::cudaMallocPitch() or ::cudaMallocArray()
 * will be physically resident on \p device.  Any host memory allocated
 * from this host thread using ::cudaMallocHost() or ::cudaHostAlloc() 
 * or ::cudaHostRegister() will have its lifetime associated  with
 * \p device.  Any streams or events created from this host thread will 
 * be associated with \p device.  Any kernels launched from this host
 * thread using the <<<>>> operator or ::cudaLaunchKernel() will be executed
 * on \p device.
 *
 * This call may be made from any host thread, to any device, and at 
 * any time.  This function will do no synchronization with the previous 
 * or new device, and should be considered a very low overhead call.
 *
 * @param device - Device on which the active host thread should execute the
 * device code.
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorDeviceAlreadyInUse
 * \notefnerr
 *
 * \sa ::cudaGetDeviceCount, ::cudaGetDevice, ::cudaGetDeviceProperties,
 * ::cudaChooseDevice
 */
public static native @Cast("cudaError_t") int cudaSetDevice(int device);

/**
 * \brief Returns which device is currently being used
 *
 * Returns in \p *device the current device for the calling host thread.
 *
 * @param device - Returns the device on which the active host thread
 * executes the device code.
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \sa ::cudaGetDeviceCount, ::cudaSetDevice, ::cudaGetDeviceProperties,
 * ::cudaChooseDevice
 */
public static native @Cast("cudaError_t") int cudaGetDevice(IntPointer device);
public static native @Cast("cudaError_t") int cudaGetDevice(IntBuffer device);
public static native @Cast("cudaError_t") int cudaGetDevice(int[] device);

/**
 * \brief Set a list of devices that can be used for CUDA
 *
 * Sets a list of devices for CUDA execution in priority order using
 * \p device_arr. The parameter \p len specifies the number of elements in the
 * list.  CUDA will try devices from the list sequentially until it finds one
 * that works.  If this function is not called, or if it is called with a \p len
 * of 0, then CUDA will go back to its default behavior of trying devices
 * sequentially from a default list containing all of the available CUDA
 * devices in the system. If a specified device ID in the list does not exist,
 * this function will return ::cudaErrorInvalidDevice. If \p len is not 0 and
 * \p device_arr is NULL or if \p len exceeds the number of devices in
 * the system, then ::cudaErrorInvalidValue is returned.
 *
 * @param device_arr - List of devices to try
 * @param len        - Number of devices in specified list
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 *
 * \sa ::cudaGetDeviceCount, ::cudaSetDevice, ::cudaGetDeviceProperties,
 * ::cudaSetDeviceFlags,
 * ::cudaChooseDevice
 */
public static native @Cast("cudaError_t") int cudaSetValidDevices(IntPointer device_arr, int len);
public static native @Cast("cudaError_t") int cudaSetValidDevices(IntBuffer device_arr, int len);
public static native @Cast("cudaError_t") int cudaSetValidDevices(int[] device_arr, int len);

/**
 * \brief Sets flags to be used for device executions
 *
 * Records \p flags as the flags to use when initializing the current 
 * device.  If no device has been made current to the calling thread,
 * then \p flags will be applied to the initialization of any device
 * initialized by the calling host thread, unless that device has had
 * its initialization flags set explicitly by this or any host thread.
 * 
 * If the current device has been set and that device has already been 
 * initialized then this call will fail with the error 
 * ::cudaErrorSetOnActiveProcess.  In this case it is necessary 
 * to reset \p device using ::cudaDeviceReset() before the device's
 * initialization flags may be set.
 *
 * The two LSBs of the \p flags parameter can be used to control how the CPU
 * thread interacts with the OS scheduler when waiting for results from the
 * device.
 *
 * - ::cudaDeviceScheduleAuto: The default value if the \p flags parameter is
 * zero, uses a heuristic based on the number of active CUDA contexts in the
 * process \p C and the number of logical processors in the system \p P. If
 * \p C \> \p P, then CUDA will yield to other OS threads when waiting for the
 * device, otherwise CUDA will not yield while waiting for results and
 * actively spin on the processor.
 * - ::cudaDeviceScheduleSpin: Instruct CUDA to actively spin when waiting for
 * results from the device. This can decrease latency when waiting for the
 * device, but may lower the performance of CPU threads if they are performing
 * work in parallel with the CUDA thread.
 * - ::cudaDeviceScheduleYield: Instruct CUDA to yield its thread when waiting
 * for results from the device. This can increase latency when waiting for the
 * device, but can increase the performance of CPU threads performing work in
 * parallel with the device.
 * - ::cudaDeviceScheduleBlockingSync: Instruct CUDA to block the CPU thread 
 * on a synchronization primitive when waiting for the device to finish work.
 * - ::cudaDeviceBlockingSync: Instruct CUDA to block the CPU thread on a 
 * synchronization primitive when waiting for the device to finish work. <br>
 * \ref deprecated "Deprecated:" This flag was deprecated as of CUDA 4.0 and
 * replaced with ::cudaDeviceScheduleBlockingSync.
 * - ::cudaDeviceMapHost: This flag enables allocating pinned
 * host memory that is accessible to the device. It is implicit for the
 * runtime but may be absent if a context is created using the driver API.
 * If this flag is not set, ::cudaHostGetDevicePointer() will always return
 * a failure code.
 * - ::cudaDeviceLmemResizeToMax: Instruct CUDA to not reduce local memory
 * after resizing local memory for a kernel. This can prevent thrashing by
 * local memory allocations when launching many kernels with high local
 * memory usage at the cost of potentially increased memory usage.
 *
 * @param flags - Parameters for device operation
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorSetOnActiveProcess
 *
 * \sa ::cudaGetDeviceFlags, ::cudaGetDeviceCount, ::cudaGetDevice, ::cudaGetDeviceProperties,
 * ::cudaSetDevice, ::cudaSetValidDevices,
 * ::cudaChooseDevice
 */
public static native @Cast("cudaError_t") int cudaSetDeviceFlags( @Cast("unsigned int") int flags );

/**
 * \brief Gets the flags for the current device
 *
 * Returns in \p flags the flags for the current device.  If there is a
 * current device for the calling thread, and the device has been initialized
 * or flags have been set on that device specifically, the flags for the
 * device are returned.  If there is no current device, but flags have been
 * set for the thread with ::cudaSetDeviceFlags, the thread flags are returned.
 * Finally, if there is no current device and no thread flags, the flags for
 * the first device are returned, which may be the default flags.  Compare
 * to the behavior of ::cudaSetDeviceFlags.
 *
 * Typically, the flags returned should match the behavior that will be seen
 * if the calling thread uses a device after this call, without any change to
 * the flags or current device inbetween by this or another thread.  Note that
 * if the device is not initialized, it is possible for another thread to
 * change the flags for the current device before it is initialized.
 * Additionally, when using exclusive mode, if this thread has not requested a
 * specific device, it may use a device other than the first device, contrary
 * to the assumption made by this function.
 *
 * If a context has been created via the driver API and is current to the
 * calling thread, the flags for that context are always returned.
 *
 * Flags returned by this function may specifically include ::cudaDeviceMapHost
 * even though it is not accepted by ::cudaSetDeviceFlags because it is
 * implicit in runtime API flags.  The reason for this is that the current
 * context may have been created via the driver API in which case the flag is
 * not implicit and may be unset.
 *
 * @param flags - Pointer to store the device flags
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice
 *
 * \sa ::cudaGetDevice, ::cudaGetDeviceProperties,
 * ::cudaSetDevice, ::cudaSetDeviceFlags
 */
public static native @Cast("cudaError_t") int cudaGetDeviceFlags( @Cast("unsigned int*") IntPointer flags );
public static native @Cast("cudaError_t") int cudaGetDeviceFlags( @Cast("unsigned int*") IntBuffer flags );
public static native @Cast("cudaError_t") int cudaGetDeviceFlags( @Cast("unsigned int*") int[] flags );
/** \} */ /* END CUDART_DEVICE */

/**
 * \defgroup CUDART_STREAM Stream Management
 *
 * ___MANBRIEF___ stream management functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the stream management functions of the CUDA runtime
 * application programming interface.
 *
 * \{
 */

/**
 * \brief Create an asynchronous stream
 *
 * Creates a new asynchronous stream.
 *
 * @param pStream - Pointer to new stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaStreamCreateWithPriority,
 * ::cudaStreamCreateWithFlags,
 * ::cudaStreamGetPriority,
 * ::cudaStreamGetFlags,
 * ::cudaStreamQuery,
 * ::cudaStreamSynchronize,
 * ::cudaStreamWaitEvent,
 * ::cudaStreamAddCallback,
 * ::cudaStreamDestroy
 */
public static native @Cast("cudaError_t") int cudaStreamCreate(@ByPtrPtr CUstream_st pStream);

/**
 * \brief Create an asynchronous stream
 *
 * Creates a new asynchronous stream.  The \p flags argument determines the 
 * behaviors of the stream.  Valid values for \p flags are
 * - ::cudaStreamDefault: Default stream creation flag.
 * - ::cudaStreamNonBlocking: Specifies that work running in the created 
 *   stream may run concurrently with work in stream 0 (the NULL stream), and that
 *   the created stream should perform no implicit synchronization with stream 0.
 *
 * @param pStream - Pointer to new stream identifier
 * @param flags   - Parameters for stream creation
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaStreamCreate,
 * ::cudaStreamCreateWithPriority,
 * ::cudaStreamGetFlags,
 * ::cudaStreamQuery,
 * ::cudaStreamSynchronize,
 * ::cudaStreamWaitEvent,
 * ::cudaStreamAddCallback,
 * ::cudaStreamDestroy
 */
public static native @Cast("cudaError_t") int cudaStreamCreateWithFlags(@ByPtrPtr CUstream_st pStream, @Cast("unsigned int") int flags);

/**
 * \brief Create an asynchronous stream with the specified priority
 *
 * Creates a stream with the specified priority and returns a handle in \p pStream.
 * This API alters the scheduler priority of work in the stream. Work in a higher
 * priority stream may preempt work already executing in a low priority stream.
 *
 * \p priority follows a convention where lower numbers represent higher priorities.
 * '0' represents default priority. The range of meaningful numerical priorities can
 * be queried using ::cudaDeviceGetStreamPriorityRange. If the specified priority is
 * outside the numerical range returned by ::cudaDeviceGetStreamPriorityRange,
 * it will automatically be clamped to the lowest or the highest number in the range.
 *
 * @param pStream  - Pointer to new stream identifier
 * @param flags    - Flags for stream creation. See ::cudaStreamCreateWithFlags for a list of valid flags that can be passed
 * @param priority - Priority of the stream. Lower numbers represent higher priorities.
 *                   See ::cudaDeviceGetStreamPriorityRange for more information about
 *                   the meaningful stream priorities that can be passed.
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \note Stream priorities are supported only on GPUs
 * with compute capability 3.5 or higher.
 *
 * \note In the current implementation, only compute kernels launched in
 * priority streams are affected by the stream's priority. Stream priorities have
 * no effect on host-to-device and device-to-host memory operations.
 *
 * \sa ::cudaStreamCreate,
 * ::cudaStreamCreateWithFlags,
 * ::cudaDeviceGetStreamPriorityRange,
 * ::cudaStreamGetPriority,
 * ::cudaStreamQuery,
 * ::cudaStreamWaitEvent,
 * ::cudaStreamAddCallback,
 * ::cudaStreamSynchronize,
 * ::cudaStreamDestroy
 */
public static native @Cast("cudaError_t") int cudaStreamCreateWithPriority(@ByPtrPtr CUstream_st pStream, @Cast("unsigned int") int flags, int priority);

/**
 * \brief Query the priority of a stream
 *
 * Query the priority of a stream. The priority is returned in in \p priority.
 * Note that if the stream was created with a priority outside the meaningful
 * numerical range returned by ::cudaDeviceGetStreamPriorityRange,
 * this function returns the clamped priority.
 * See ::cudaStreamCreateWithPriority for details about priority clamping.
 *
 * @param hStream    - Handle to the stream to be queried
 * @param priority   - Pointer to a signed integer in which the stream's priority is returned
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle
 * \notefnerr
 *
 * \sa ::cudaStreamCreateWithPriority,
 * ::cudaDeviceGetStreamPriorityRange,
 * ::cudaStreamGetFlags
 */
public static native @Cast("cudaError_t") int cudaStreamGetPriority(CUstream_st hStream, IntPointer priority);
public static native @Cast("cudaError_t") int cudaStreamGetPriority(CUstream_st hStream, IntBuffer priority);
public static native @Cast("cudaError_t") int cudaStreamGetPriority(CUstream_st hStream, int[] priority);

/**
 * \brief Query the flags of a stream
 *
 * Query the flags of a stream. The flags are returned in \p flags.
 * See ::cudaStreamCreateWithFlags for a list of valid flags.
 *
 * @param hStream - Handle to the stream to be queried
 * @param flags   - Pointer to an unsigned integer in which the stream's flags are returned
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle
 * \notefnerr
 *
 * \sa ::cudaStreamCreateWithPriority,
 * ::cudaStreamCreateWithFlags,
 * ::cudaStreamGetPriority
 */
public static native @Cast("cudaError_t") int cudaStreamGetFlags(CUstream_st hStream, @Cast("unsigned int*") IntPointer flags);
public static native @Cast("cudaError_t") int cudaStreamGetFlags(CUstream_st hStream, @Cast("unsigned int*") IntBuffer flags);
public static native @Cast("cudaError_t") int cudaStreamGetFlags(CUstream_st hStream, @Cast("unsigned int*") int[] flags);

/**
 * \brief Destroys and cleans up an asynchronous stream
 *
 * Destroys and cleans up the asynchronous stream specified by \p stream.
 *
 * In case the device is still doing work in the stream \p stream
 * when ::cudaStreamDestroy() is called, the function will return immediately 
 * and the resources associated with \p stream will be released automatically 
 * once the device has completed all work in \p stream.
 *
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle
 * \notefnerr
 *
 * \sa ::cudaStreamCreate, ::cudaStreamCreateWithFlags, ::cudaStreamQuery, ::cudaStreamWaitEvent, ::cudaStreamSynchronize, ::cudaStreamAddCallback
 */
public static native @Cast("cudaError_t") int cudaStreamDestroy(CUstream_st stream);

/**
 * \brief Make a compute stream wait on an event
 *
 * Makes all future work submitted to \p stream wait until \p event reports
 * completion before beginning execution.  This synchronization will be
 * performed efficiently on the device.  The event \p event may
 * be from a different context than \p stream, in which case this function
 * will perform cross-device synchronization.
 *
 * The stream \p stream will wait only for the completion of the most recent
 * host call to ::cudaEventRecord() on \p event.  Once this call has returned,
 * any functions (including ::cudaEventRecord() and ::cudaEventDestroy()) may be
 * called on \p event again, and the subsequent calls will not have any effect
 * on \p stream.
 *
 * If ::cudaEventRecord() has not been called on \p event, this call acts as if
 * the record has already completed, and so is a functional no-op.
 *
 * @param stream - Stream to wait
 * @param event  - Event to wait on
 * @param flags  - Parameters for the operation (must be 0)
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cudaStreamCreate, ::cudaStreamCreateWithFlags, ::cudaStreamQuery, ::cudaStreamSynchronize, ::cudaStreamAddCallback, ::cudaStreamDestroy
 */
public static native @Cast("cudaError_t") int cudaStreamWaitEvent(CUstream_st stream, CUevent_st event, @Cast("unsigned int") int flags);

// #ifdef _WIN32
// #define CUDART_CB __stdcall
// #else
// #define CUDART_CB
// #endif

/**
 * Type of stream callback functions.
 * @param stream The stream as passed to ::cudaStreamAddCallback, may be NULL.
 * @param status ::cudaSuccess or any persistent error on the stream.
 * @param userData User parameter provided at registration.
 */
@Convention("CUDART_CB") public static class cudaStreamCallback_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cudaStreamCallback_t(Pointer p) { super(p); }
    protected cudaStreamCallback_t() { allocate(); }
    private native void allocate();
    public native void call(CUstream_st stream, @Cast("cudaError_t") int status, Pointer userData);
}

/**
 * \brief Add a callback to a compute stream
 *
 * Adds a callback to be called on the host after all currently enqueued
 * items in the stream have completed.  For each 
 * cudaStreamAddCallback call, a callback will be executed exactly once.
 * The callback will block later work in the stream until it is finished.
 *
 * The callback may be passed ::cudaSuccess or an error code.  In the event
 * of a device error, all subsequently executed callbacks will receive an
 * appropriate ::cudaError_t.
 *
 * Callbacks must not make any CUDA API calls.  Attempting to use CUDA APIs
 * will result in ::cudaErrorNotPermitted.  Callbacks must not perform any
 * synchronization that may depend on outstanding device work or other callbacks
 * that are not mandated to run earlier.  Callbacks without a mandated order
 * (in independent streams) execute in undefined order and may be serialized.
 *
 * For the purposes of Unified Memory, callback execution makes a number of
 * guarantees:
 * <ul>
 *   <li>The callback stream is considered idle for the duration of the
 *   callback.  Thus, for example, a callback may always use memory attached
 *   to the callback stream.</li>
 *   <li>The start of execution of a callback has the same effect as
 *   synchronizing an event recorded in the same stream immediately prior to
 *   the callback.  It thus synchronizes streams which have been "joined"
 *   prior to the callback.</li>
 *   <li>Adding device work to any stream does not have the effect of making
 *   the stream active until all preceding callbacks have executed.  Thus, for
 *   example, a callback might use global attached memory even if work has
 *   been added to another stream, if it has been properly ordered with an
 *   event.</li>
 *   <li>Completion of a callback does not cause a stream to become
 *   active except as described above.  The callback stream will remain idle
 *   if no device work follows the callback, and will remain idle across
 *   consecutive callbacks without device work in between.  Thus, for example,
 *   stream synchronization can be done by signaling from a callback at the
 *   end of the stream.</li>
 * </ul>
 *
 * @param stream   - Stream to add callback to
 * @param callback - The function to call once preceding stream operations are complete
 * @param userData - User specified data to be passed to the callback function
 * @param flags    - Reserved for future use, must be 0
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorNotSupported
 * \note_null_stream
 * \notefnerr
 *
 * \sa ::cudaStreamCreate, ::cudaStreamCreateWithFlags, ::cudaStreamQuery, ::cudaStreamSynchronize, ::cudaStreamWaitEvent, ::cudaStreamDestroy, ::cudaMallocManaged, ::cudaStreamAttachMemAsync
 */
public static native @Cast("cudaError_t") int cudaStreamAddCallback(CUstream_st stream,
        cudaStreamCallback_t callback, Pointer userData, @Cast("unsigned int") int flags);

/**
 * \brief Waits for stream tasks to complete
 *
 * Blocks until \p stream has completed all operations. If the
 * ::cudaDeviceScheduleBlockingSync flag was set for this device, 
 * the host thread will block until the stream is finished with 
 * all of its tasks.
 *
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle
 * \notefnerr
 *
 * \sa ::cudaStreamCreate, ::cudaStreamCreateWithFlags, ::cudaStreamQuery, ::cudaStreamWaitEvent, ::cudaStreamAddCallback, ::cudaStreamDestroy
 */
public static native @Cast("cudaError_t") int cudaStreamSynchronize(CUstream_st stream);

/**
 * \brief Queries an asynchronous stream for completion status
 *
 * Returns ::cudaSuccess if all operations in \p stream have
 * completed, or ::cudaErrorNotReady if not.
 *
 * For the purposes of Unified Memory, a return value of ::cudaSuccess
 * is equivalent to having called ::cudaStreamSynchronize().
 *
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorNotReady,
 * ::cudaErrorInvalidResourceHandle
 * \notefnerr
 *
 * \sa ::cudaStreamCreate, ::cudaStreamCreateWithFlags, ::cudaStreamWaitEvent, ::cudaStreamSynchronize, ::cudaStreamAddCallback, ::cudaStreamDestroy
 */
public static native @Cast("cudaError_t") int cudaStreamQuery(CUstream_st stream);

/**
 * \brief Attach memory to a stream asynchronously
 *
 * Enqueues an operation in \p stream to specify stream association of
 * \p length bytes of memory starting from \p devPtr. This function is a
 * stream-ordered operation, meaning that it is dependent on, and will
 * only take effect when, previous work in stream has completed. Any
 * previous association is automatically replaced.
 *
 * \p devPtr must point to an address within managed memory space declared
 * using the __managed__ keyword or allocated with ::cudaMallocManaged.
 *
 * \p length must be zero, to indicate that the entire allocation's
 * stream association is being changed.  Currently, it's not possible
 * to change stream association for a portion of an allocation.
 *
 * The stream association is specified using \p flags which must be
 * one of ::cudaMemAttachGlobal, ::cudaMemAttachHost or ::cudaMemAttachSingle.
 * If the ::cudaMemAttachGlobal flag is specified, the memory can be accessed
 * by any stream on any device.
 * If the ::cudaMemAttachHost flag is specified, the program makes a guarantee
 * that it won't access the memory on the device from any stream.
 * If the ::cudaMemAttachSingle flag is specified, the program makes a guarantee
 * that it will only access the memory on the device from \p stream. It is illegal
 * to attach singly to the NULL stream, because the NULL stream is a virtual global
 * stream and not a specific stream. An error will be returned in this case.
 *
 * When memory is associated with a single stream, the Unified Memory system will
 * allow CPU access to this memory region so long as all operations in \p stream
 * have completed, regardless of whether other streams are active. In effect,
 * this constrains exclusive ownership of the managed memory region by
 * an active GPU to per-stream activity instead of whole-GPU activity.
 *
 * Accessing memory on the device from streams that are not associated with
 * it will produce undefined results. No error checking is performed by the
 * Unified Memory system to ensure that kernels launched into other streams
 * do not access this region. 
 *
 * It is a program's responsibility to order calls to ::cudaStreamAttachMemAsync
 * via events, synchronization or other means to ensure legal access to memory
 * at all times. Data visibility and coherency will be changed appropriately
 * for all kernels which follow a stream-association change.
 *
 * If \p stream is destroyed while data is associated with it, the association is
 * removed and the association reverts to the default visibility of the allocation
 * as specified at ::cudaMallocManaged. For __managed__ variables, the default
 * association is always ::cudaMemAttachGlobal. Note that destroying a stream is an
 * asynchronous operation, and as a result, the change to default association won't
 * happen until all work in the stream has completed.
 *
 * @param stream  - Stream in which to enqueue the attach operation
 * @param devPtr  - Pointer to memory (must be a pointer to managed memory)
 * @param length  - Length of memory (must be zero)
 * @param flags   - Must be one of ::cudaMemAttachGlobal, ::cudaMemAttachHost or ::cudaMemAttachSingle
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorNotReady,
 * ::cudaErrorInvalidValue
 * ::cudaErrorInvalidResourceHandle
 * \notefnerr
 *
 * \sa ::cudaStreamCreate, ::cudaStreamCreateWithFlags, ::cudaStreamWaitEvent, ::cudaStreamSynchronize, ::cudaStreamAddCallback, ::cudaStreamDestroy, ::cudaMallocManaged
 */
public static native @Cast("cudaError_t") int cudaStreamAttachMemAsync(CUstream_st stream, Pointer devPtr, @Cast("size_t") long length, @Cast("unsigned int") int flags);

/** \} */ /* END CUDART_STREAM */

/**
 * \defgroup CUDART_EVENT Event Management
 *
 * ___MANBRIEF___ event management functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the event management functions of the CUDA runtime
 * application programming interface.
 *
 * \{
 */

/**
 * \brief Creates an event object
 *
 * Creates an event object using ::cudaEventDefault.
 *
 * @param event - Newly created event
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorLaunchFailure,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa \ref ::cudaEventCreate(cudaEvent_t*, unsigned int) "cudaEventCreate (C++ API)",
 * ::cudaEventCreateWithFlags, ::cudaEventRecord, ::cudaEventQuery,
 * ::cudaEventSynchronize, ::cudaEventDestroy, ::cudaEventElapsedTime,
 * ::cudaStreamWaitEvent
 */
public static native @Cast("cudaError_t") int cudaEventCreate(@ByPtrPtr CUevent_st event);

/**
 * \brief Creates an event object with the specified flags
 *
 * Creates an event object with the specified flags. Valid flags include:
 * - ::cudaEventDefault: Default event creation flag.
 * - ::cudaEventBlockingSync: Specifies that event should use blocking
 *   synchronization. A host thread that uses ::cudaEventSynchronize() to wait
 *   on an event created with this flag will block until the event actually
 *   completes.
 * - ::cudaEventDisableTiming: Specifies that the created event does not need
 *   to record timing data.  Events created with this flag specified and
 *   the ::cudaEventBlockingSync flag not specified will provide the best
 *   performance when used with ::cudaStreamWaitEvent() and ::cudaEventQuery().
 * - ::cudaEventInterprocess: Specifies that the created event may be used as an
 *   interprocess event by ::cudaIpcGetEventHandle(). ::cudaEventInterprocess must
 *   be specified along with ::cudaEventDisableTiming.
 *
 * @param event - Newly created event
 * @param flags - Flags for new event
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorLaunchFailure,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa \ref ::cudaEventCreate(cudaEvent_t*) "cudaEventCreate (C API)",
 * ::cudaEventSynchronize, ::cudaEventDestroy, ::cudaEventElapsedTime,
 * ::cudaStreamWaitEvent
 */
public static native @Cast("cudaError_t") int cudaEventCreateWithFlags(@ByPtrPtr CUevent_st event, @Cast("unsigned int") int flags);

/**
 * \brief Records an event
 *
 * Records an event. See note about NULL stream behavior. Since operation
 * is asynchronous, ::cudaEventQuery() or ::cudaEventSynchronize() must
 * be used to determine when the event has actually been recorded.
 *
 * If ::cudaEventRecord() has previously been called on \p event, then this
 * call will overwrite any existing state in \p event.  Any subsequent calls
 * which examine the status of \p event will only examine the completion of
 * this most recent call to ::cudaEventRecord().
 *
 * @param event  - Event to record
 * @param stream - Stream in which to record event
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorLaunchFailure
 * \note_null_stream
 * \notefnerr
 *
 * \sa \ref ::cudaEventCreate(cudaEvent_t*) "cudaEventCreate (C API)",
 * ::cudaEventCreateWithFlags, ::cudaEventQuery,
 * ::cudaEventSynchronize, ::cudaEventDestroy, ::cudaEventElapsedTime,
 * ::cudaStreamWaitEvent
 */
public static native @Cast("cudaError_t") int cudaEventRecord(CUevent_st event, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaEventRecord(CUevent_st event);

/**
 * \brief Queries an event's status
 *
 * Query the status of all device work preceding the most recent call to
 * ::cudaEventRecord() (in the appropriate compute streams, as specified by the
 * arguments to ::cudaEventRecord()).
 *
 * If this work has successfully been completed by the device, or if
 * ::cudaEventRecord() has not been called on \p event, then ::cudaSuccess is
 * returned. If this work has not yet been completed by the device then
 * ::cudaErrorNotReady is returned.
 *
 * For the purposes of Unified Memory, a return value of ::cudaSuccess
 * is equivalent to having called ::cudaEventSynchronize().
 *
 * @param event - Event to query
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorNotReady,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorLaunchFailure
 * \notefnerr
 *
 * \sa \ref ::cudaEventCreate(cudaEvent_t*) "cudaEventCreate (C API)",
 * ::cudaEventCreateWithFlags, ::cudaEventRecord,
 * ::cudaEventSynchronize, ::cudaEventDestroy, ::cudaEventElapsedTime
 */
public static native @Cast("cudaError_t") int cudaEventQuery(CUevent_st event);

/**
 * \brief Waits for an event to complete
 *
 * Wait until the completion of all device work preceding the most recent
 * call to ::cudaEventRecord() (in the appropriate compute streams, as specified
 * by the arguments to ::cudaEventRecord()).
 *
 * If ::cudaEventRecord() has not been called on \p event, ::cudaSuccess is
 * returned immediately.
 *
 * Waiting for an event that was created with the ::cudaEventBlockingSync
 * flag will cause the calling CPU thread to block until the event has
 * been completed by the device.  If the ::cudaEventBlockingSync flag has
 * not been set, then the CPU thread will busy-wait until the event has
 * been completed by the device.
 *
 * @param event - Event to wait for
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorLaunchFailure
 * \notefnerr
 *
 * \sa \ref ::cudaEventCreate(cudaEvent_t*) "cudaEventCreate (C API)",
 * ::cudaEventCreateWithFlags, ::cudaEventRecord,
 * ::cudaEventQuery, ::cudaEventDestroy, ::cudaEventElapsedTime
 */
public static native @Cast("cudaError_t") int cudaEventSynchronize(CUevent_st event);

/**
 * \brief Destroys an event object
 *
 * Destroys the event specified by \p event.
 *
 * In case \p event has been recorded but has not yet been completed
 * when ::cudaEventDestroy() is called, the function will return immediately and 
 * the resources associated with \p event will be released automatically once
 * the device has completed \p event.
 *
 * @param event - Event to destroy
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorLaunchFailure
 * \notefnerr
 *
 * \sa \ref ::cudaEventCreate(cudaEvent_t*) "cudaEventCreate (C API)",
 * ::cudaEventCreateWithFlags, ::cudaEventQuery,
 * ::cudaEventSynchronize, ::cudaEventRecord, ::cudaEventElapsedTime
 */
public static native @Cast("cudaError_t") int cudaEventDestroy(CUevent_st event);

/**
 * \brief Computes the elapsed time between events
 *
 * Computes the elapsed time between two events (in milliseconds with a
 * resolution of around 0.5 microseconds).
 *
 * If either event was last recorded in a non-NULL stream, the resulting time
 * may be greater than expected (even if both used the same stream handle). This
 * happens because the ::cudaEventRecord() operation takes place asynchronously
 * and there is no guarantee that the measured latency is actually just between
 * the two events. Any number of other different stream operations could execute
 * in between the two measured events, thus altering the timing in a significant
 * way.
 *
 * If ::cudaEventRecord() has not been called on either event, then
 * ::cudaErrorInvalidResourceHandle is returned. If ::cudaEventRecord() has been
 * called on both events but one or both of them has not yet been completed
 * (that is, ::cudaEventQuery() would return ::cudaErrorNotReady on at least one
 * of the events), ::cudaErrorNotReady is returned. If either event was created
 * with the ::cudaEventDisableTiming flag, then this function will return
 * ::cudaErrorInvalidResourceHandle.
 *
 * @param ms    - Time between \p start and \p end in ms
 * @param start - Starting event
 * @param end   - Ending event
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorNotReady,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorLaunchFailure
 * \notefnerr
 *
 * \sa \ref ::cudaEventCreate(cudaEvent_t*) "cudaEventCreate (C API)",
 * ::cudaEventCreateWithFlags, ::cudaEventQuery,
 * ::cudaEventSynchronize, ::cudaEventDestroy, ::cudaEventRecord
 */
public static native @Cast("cudaError_t") int cudaEventElapsedTime(FloatPointer ms, CUevent_st start, CUevent_st end);
public static native @Cast("cudaError_t") int cudaEventElapsedTime(FloatBuffer ms, CUevent_st start, CUevent_st end);
public static native @Cast("cudaError_t") int cudaEventElapsedTime(float[] ms, CUevent_st start, CUevent_st end);

/** \} */ /* END CUDART_EVENT */

/**
 * \defgroup CUDART_EXECUTION Execution Control
 *
 * ___MANBRIEF___ execution control functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the execution control functions of the CUDA runtime
 * application programming interface.
 *
 * Some functions have overloaded C++ API template versions documented separately in the
 * \ref CUDART_HIGHLEVEL "C++ API Routines" module.
 *
 * \{
 */

// #if CUDART_VERSION >= 7000
/**
 * \brief Launches a device function
 *
 * The function invokes kernel \p func on \p gridDim (\p gridDim.x × \p gridDim.y
 * × \p gridDim.z) grid of blocks. Each block contains \p blockDim (\p blockDim.x ×
 * \p blockDim.y × \p blockDim.z) threads.
 *
 * If the kernel has N parameters the \p args should point to array of N pointers.
 * Each pointer, from <tt>args[0]</tt> to <tt>args[N - 1]</tt>, point to the region
 * of memory from which the actual parameter will be copied.
 *
 * For templated functions, pass the function symbol as follows:
 * func_name<template_arg_0,...,template_arg_N>
 *
 * \p sharedMem sets the amount of dynamic shared memory that will be available to
 * each thread block.
 *
 * \p stream specifies a stream the invocation is associated to.
 *
 * @param func        - Device function symbol
 * @param gridDim     - Grid dimentions
 * @param blockDim    - Block dimentions
 * @param args        - Arguments
 * @param sharedMem   - Shared memory
 * @param stream      - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDeviceFunction,
 * ::cudaErrorInvalidConfiguration,
 * ::cudaErrorLaunchFailure,
 * ::cudaErrorLaunchTimeout,
 * ::cudaErrorLaunchOutOfResources,
 * ::cudaErrorSharedObjectInitFailed
 * \note_null_stream
 * \notefnerr
 *
 * \ref ::cudaLaunchKernel(const T *func, dim3 gridDim, dim3 blockDim, void **args, size_t sharedMem, cudaStream_t stream) "cudaLaunchKernel (C++ API)"
 */
public static native @Cast("cudaError_t") int cudaLaunchKernel(@Const Pointer func, @ByVal dim3 gridDim, @ByVal dim3 blockDim, @Cast("void**") PointerPointer args, @Cast("size_t") long sharedMem, CUstream_st stream);
public static native @Cast("cudaError_t") int cudaLaunchKernel(@Const Pointer func, @ByVal dim3 gridDim, @ByVal dim3 blockDim, @Cast("void**") @ByPtrPtr Pointer args, @Cast("size_t") long sharedMem, CUstream_st stream);

// #endif /* CUDART_VERSION >= 7000 */

/**
 * \brief Sets the preferred cache configuration for a device function
 *
 * On devices where the L1 cache and shared memory use the same hardware
 * resources, this sets through \p cacheConfig the preferred cache configuration
 * for the function specified via \p func. This is only a preference. The
 * runtime will use the requested configuration if possible, but it is free to
 * choose a different configuration if required to execute \p func.
 *
 * \p func is a device function symbol and must be declared as a
 * \c __global__ function. If the specified function does not exist,
 * then ::cudaErrorInvalidDeviceFunction is returned. For templated functions,
 * pass the function symbol as follows: func_name<template_arg_0,...,template_arg_N>
 *
 * This setting does nothing on devices where the size of the L1 cache and
 * shared memory are fixed.
 *
 * Launching a kernel with a different preference than the most recent
 * preference setting may insert a device-side synchronization point.
 *
 * The supported cache configurations are:
 * - ::cudaFuncCachePreferNone: no preference for shared memory or L1 (default)
 * - ::cudaFuncCachePreferShared: prefer larger shared memory and smaller L1 cache
 * - ::cudaFuncCachePreferL1: prefer larger L1 cache and smaller shared memory
 * - ::cudaFuncCachePreferEqual: prefer equal size L1 cache and shared memory
 *
 * @param func        - Device function symbol
 * @param cacheConfig - Requested cache configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidDeviceFunction
 * \notefnerr
 * \note_string_api_deprecation2
 *
 * \sa ::cudaConfigureCall,
 * \ref ::cudaFuncSetCacheConfig(T*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C++ API)",
 * \ref ::cudaFuncGetAttributes(struct cudaFuncAttributes*, const void*) "cudaFuncGetAttributes (C API)",
 * \ref ::cudaLaunchKernel(const void *func, dim3 gridDim, dim3 blockDim, void **args, size_t sharedMem, cudaStream_t stream) "cudaLaunchKernel (C API)",
 * ::cudaSetDoubleForDevice,
 * ::cudaSetDoubleForHost,
 * \ref ::cudaSetupArgument(const void*, size_t, size_t) "cudaSetupArgument (C API)",
 * ::cudaThreadGetCacheConfig,
 * ::cudaThreadSetCacheConfig
 */
public static native @Cast("cudaError_t") int cudaFuncSetCacheConfig(@Const Pointer func, @Cast("cudaFuncCache") int cacheConfig);

/**
 * \brief Sets the shared memory configuration for a device function
 *
 * On devices with configurable shared memory banks, this function will 
 * force all subsequent launches of the specified device function to have
 * the given shared memory bank size configuration. On any given launch of the
 * function, the shared memory configuration of the device will be temporarily
 * changed if needed to suit the function's preferred configuration. Changes in
 * shared memory configuration between subsequent launches of functions, 
 * may introduce a device side synchronization point.
 *
 * Any per-function setting of shared memory bank size set via 
 * ::cudaFuncSetSharedMemConfig will override the device wide setting set by
 * ::cudaDeviceSetSharedMemConfig.
 *
 * Changing the shared memory bank size will not increase shared memory usage
 * or affect occupancy of kernels, but may have major effects on performance. 
 * Larger bank sizes will allow for greater potential bandwidth to shared memory,
 * but will change what kinds of accesses to shared memory will result in bank 
 * conflicts.
 *
 * This function will do nothing on devices with fixed shared memory bank size.
 *
 * For templated functions, pass the function symbol as follows:
 * func_name<template_arg_0,...,template_arg_N>
 *
 * The supported bank configurations are:
 * - ::cudaSharedMemBankSizeDefault: use the device's shared memory configuration
 *   when launching this function.
 * - ::cudaSharedMemBankSizeFourByte: set shared memory bank width to be 
 *   four bytes natively when launching this function.
 * - ::cudaSharedMemBankSizeEightByte: set shared memory bank width to be eight 
 *   bytes natively when launching this function.
 *
 * @param func   - Device function symbol
 * @param config - Requested shared memory configuration
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidDeviceFunction,
 * ::cudaErrorInvalidValue,
 * \notefnerr
 * \note_string_api_deprecation2
 *
 * \sa ::cudaConfigureCall,
 * ::cudaDeviceSetSharedMemConfig,
 * ::cudaDeviceGetSharedMemConfig,
 * ::cudaDeviceSetCacheConfig,
 * ::cudaDeviceGetCacheConfig,
 * ::cudaFuncSetCacheConfig
 */
public static native @Cast("cudaError_t") int cudaFuncSetSharedMemConfig(@Const Pointer func, @Cast("cudaSharedMemConfig") int config);

/**
 * \brief Find out attributes for a given function
 *
 * This function obtains the attributes of a function specified via \p func.
 * \p func is a device function symbol and must be declared as a
 * \c __global__ function. The fetched attributes are placed in \p attr.
 * If the specified function does not exist, then
 * ::cudaErrorInvalidDeviceFunction is returned. For templated functions, pass
 * the function symbol as follows: func_name<template_arg_0,...,template_arg_N>
 *
 * Note that some function attributes such as
 * \ref ::cudaFuncAttributes::maxThreadsPerBlock "maxThreadsPerBlock"
 * may vary based on the device that is currently being used.
 *
 * @param attr - Return pointer to function's attributes
 * @param func - Device function symbol
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidDeviceFunction
 * \notefnerr
 * \note_string_api_deprecation2
 *
 * \sa ::cudaConfigureCall,
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncGetAttributes(struct cudaFuncAttributes*, T*) "cudaFuncGetAttributes (C++ API)",
 * \ref ::cudaLaunchKernel(const void *func, dim3 gridDim, dim3 blockDim, void **args, size_t sharedMem, cudaStream_t stream) "cudaLaunchKernel (C API)",
 * ::cudaSetDoubleForDevice,
 * ::cudaSetDoubleForHost,
 * \ref ::cudaSetupArgument(const void*, size_t, size_t) "cudaSetupArgument (C API)"
 */
public static native @Cast("cudaError_t") int cudaFuncGetAttributes(cudaFuncAttributes attr, @Const Pointer func);

/**
 * \brief Converts a double argument to be executed on a device
 *
 * @param d - Double to convert
 *
 * @deprecated This function is deprecated as of CUDA 7.5
 *
 * Converts the double value of \p d to an internal float representation if
 * the device does not support double arithmetic. If the device does natively
 * support doubles, then this function does nothing.
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \ref ::cudaLaunch(const void*) "cudaLaunch (C API)",
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncGetAttributes(struct cudaFuncAttributes*, const void*) "cudaFuncGetAttributes (C API)",
 * ::cudaSetDoubleForHost,
 * \ref ::cudaSetupArgument(const void*, size_t, size_t) "cudaSetupArgument (C API)"
 */
public static native @Cast("cudaError_t") int cudaSetDoubleForDevice(DoublePointer d);
public static native @Cast("cudaError_t") int cudaSetDoubleForDevice(DoubleBuffer d);
public static native @Cast("cudaError_t") int cudaSetDoubleForDevice(double[] d);

/**
 * \brief Converts a double argument after execution on a device
 *
 * @deprecated This function is deprecated as of CUDA 7.5
 *
 * Converts the double value of \p d from a potentially internal float
 * representation if the device does not support double arithmetic. If the
 * device does natively support doubles, then this function does nothing.
 *
 * @param d - Double to convert
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \ref ::cudaLaunch(const void*) "cudaLaunch (C API)",
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncGetAttributes(struct cudaFuncAttributes*, const void*) "cudaFuncGetAttributes (C API)",
 * ::cudaSetDoubleForDevice,
 * \ref ::cudaSetupArgument(const void*, size_t, size_t) "cudaSetupArgument (C API)"
 */
public static native @Cast("cudaError_t") int cudaSetDoubleForHost(DoublePointer d);
public static native @Cast("cudaError_t") int cudaSetDoubleForHost(DoubleBuffer d);
public static native @Cast("cudaError_t") int cudaSetDoubleForHost(double[] d);

/** \} */ /* END CUDART_EXECUTION */

// #if CUDART_VERSION >= 6050

/**
 * \defgroup CUDART_OCCUPANCY Occupancy
 *
 * ___MANBRIEF___ occupancy calculation functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the occupancy calculation functions of the CUDA runtime
 * application programming interface.
 *
 * Besides the occupancy calculator functions
 * (\ref ::cudaOccupancyMaxActiveBlocksPerMultiprocessor and \ref ::cudaOccupancyMaxActiveBlocksPerMultiprocessorWithFlags),
 * there are also C++ only occupancy-based launch configuration functions documented in
 * \ref CUDART_HIGHLEVEL "C++ API Routines" module.
 *
 * See
 * \ref ::cudaOccupancyMaxPotentialBlockSize(int*, int*, T, size_t, int) "cudaOccupancyMaxPotentialBlockSize (C++ API)",
 * \ref ::cudaOccupancyMaxPotentialBlockSizeWithFlags(int*, int*, T, size_t, int, unsigned int) "cudaOccupancyMaxPotentialBlockSize (C++ API)",
 * \ref ::cudaOccupancyMaxPotentialBlockSizeVariableSMem(int*, int*, T, UnaryFunction, int) "cudaOccupancyMaxPotentialBlockSizeVariableSMem (C++ API)",
 * \ref ::cudaOccupancyMaxPotentialBlockSizeVariableSMemWithFlags(int*, int*, T, UnaryFunction, int, unsigned int) "cudaOccupancyMaxPotentialBlockSizeVariableSMem (C++ API)",
 *
 * \{
 */

/**
 * \brief Returns occupancy for a device function
 *
 * Returns in \p *numBlocks the maximum number of active blocks per
 * streaming multiprocessor for the device function.
 *
 * @param numBlocks       - Returned occupancy
 * @param func            - Kernel function for which occupancy is calculated
 * @param blockSize       - Block size the kernel is intended to be launched with
 * @param dynamicSMemSize - Per-block dynamic shared memory usage intended, in bytes
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorCudartUnloading,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorInvalidDeviceFunction,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorUnknown,
 * \notefnerr
 *
 * \sa ::cudaOccupancyMaxActiveBlocksPerMultiprocessorWithFlags,
 * \ref ::cudaOccupancyMaxPotentialBlockSize(int*, int*, T, size_t, int) "cudaOccupancyMaxPotentialBlockSize (C++ API)",
 * \ref ::cudaOccupancyMaxPotentialBlockSizeWithFlags(int*, int*, T, size_t, int, unsigned int) "cudaOccupancyMaxPotentialBlockSizeWithFlags (C++ API)",
 * \ref ::cudaOccupancyMaxPotentialBlockSizeVariableSMem(int*, int*, T, UnaryFunction, int) "cudaOccupancyMaxPotentialBlockSizeVariableSMem (C++ API)"
 * \ref ::cudaOccupancyMaxPotentialBlockSizeVariableSMemWithFlags(int*, int*, T, UnaryFunction, int, unsigned int) "cudaOccupancyMaxPotentialBlockSizeVariableSMemWithFlags (C++ API)"
 */
public static native @Cast("cudaError_t") int cudaOccupancyMaxActiveBlocksPerMultiprocessor(IntPointer numBlocks, @Const Pointer func, int blockSize, @Cast("size_t") long dynamicSMemSize);
public static native @Cast("cudaError_t") int cudaOccupancyMaxActiveBlocksPerMultiprocessor(IntBuffer numBlocks, @Const Pointer func, int blockSize, @Cast("size_t") long dynamicSMemSize);
public static native @Cast("cudaError_t") int cudaOccupancyMaxActiveBlocksPerMultiprocessor(int[] numBlocks, @Const Pointer func, int blockSize, @Cast("size_t") long dynamicSMemSize);

// #if CUDART_VERSION >= 7000
/**
 * \brief Returns occupancy for a device function with the specified flags
 *
 * Returns in \p *numBlocks the maximum number of active blocks per
 * streaming multiprocessor for the device function.
 *
 * The \p flags parameter controls how special cases are handled. Valid flags include:
 *
 * - ::cudaOccupancyDefault: keeps the default behavior as
 *   ::cudaOccupancyMaxActiveBlocksPerMultiprocessor
 *
 * - ::cudaOccupancyDisableCachingOverride: This flag suppresses the default behavior
 *   on platform where global caching affects occupancy. On such platforms, if caching
 *   is enabled, but per-block SM resource usage would result in zero occupancy, the
 *   occupancy calculator will calculate the occupancy as if caching is disabled.
 *   Setting this flag makes the occupancy calculator to return 0 in such cases.
 *   More information can be found about this feature in the "Unified L1/Texture Cache"
 *   section of the Maxwell tuning guide.
 *
 * @param numBlocks       - Returned occupancy
 * @param func            - Kernel function for which occupancy is calculated
 * @param blockSize       - Block size the kernel is intended to be launched with
 * @param dynamicSMemSize - Per-block dynamic shared memory usage intended, in bytes
 * @param flags           - Requested behavior for the occupancy calculator
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorCudartUnloading,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorInvalidDeviceFunction,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorUnknown,
 * \notefnerr
 *
 * \sa ::cudaOccupancyMaxActiveBlocksPerMultiprocessor,
 * \ref ::cudaOccupancyMaxPotentialBlockSize(int*, int*, T, size_t, int) "cudaOccupancyMaxPotentialBlockSize (C++ API)",
 * \ref ::cudaOccupancyMaxPotentialBlockSizeWithFlags(int*, int*, T, size_t, int, unsigned int) "cudaOccupancyMaxPotentialBlockSizeWithFlags (C++ API)",
 * \ref ::cudaOccupancyMaxPotentialBlockSizeVariableSMem(int*, int*, T, UnaryFunction, int) "cudaOccupancyMaxPotentialBlockSizeVariableSMem (C++ API)"
 * \ref ::cudaOccupancyMaxPotentialBlockSizeVariableSMemWithFlags(int*, int*, T, UnaryFunction, int, unsigned int) "cudaOccupancyMaxPotentialBlockSizeVariableSMemWithFlags (C++ API)"
 */
public static native @Cast("cudaError_t") int cudaOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(IntPointer numBlocks, @Const Pointer func, int blockSize, @Cast("size_t") long dynamicSMemSize, @Cast("unsigned int") int flags);
public static native @Cast("cudaError_t") int cudaOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(IntBuffer numBlocks, @Const Pointer func, int blockSize, @Cast("size_t") long dynamicSMemSize, @Cast("unsigned int") int flags);
public static native @Cast("cudaError_t") int cudaOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(int[] numBlocks, @Const Pointer func, int blockSize, @Cast("size_t") long dynamicSMemSize, @Cast("unsigned int") int flags);

/** \} */ /* END CUDA_OCCUPANCY */
// #endif /* CUDART_VERSION >= 7000 */
// #endif /* CUDART_VERSION >= 6050 */

/**
 * \defgroup CUDART_EXECUTION_DEPRECATED Execution Control [DEPRECATED]
 *
 * ___MANBRIEF___ deprecated execution control functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the deprecated execution control functions of the CUDA runtime
 * application programming interface.
 *
 * Some functions have overloaded C++ API template versions documented separately in the
 * \ref CUDART_HIGHLEVEL "C++ API Routines" module.
 *
 * \{
 */

/**
 * \brief Configure a device-launch
 *
 * @deprecated This function is deprecated as of CUDA 7.0
 *
 * Specifies the grid and block dimensions for the device call to be executed
 * similar to the execution configuration syntax. ::cudaConfigureCall() is
 * stack based. Each call pushes data on top of an execution stack. This data
 * contains the dimension for the grid and thread blocks, together with any
 * arguments for the call.
 *
 * @param gridDim   - Grid dimensions
 * @param blockDim  - Block dimensions
 * @param sharedMem - Shared memory
 * @param stream    - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidConfiguration
 * \note_null_stream
 * \notefnerr
 *
 * \ref ::cudaLaunchKernel(const void *func, dim3 gridDim, dim3 blockDim, void **args, size_t sharedMem, cudaStream_t stream) "cudaLaunchKernel (C API)",
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncGetAttributes(struct cudaFuncAttributes*, const void*) "cudaFuncGetAttributes (C API)",
 * \ref ::cudaLaunch(const void*) "cudaLaunch (C API)",
 * ::cudaSetDoubleForDevice,
 * ::cudaSetDoubleForHost,
 * \ref ::cudaSetupArgument(const void*, size_t, size_t) "cudaSetupArgument (C API)",
 */
public static native @Cast("cudaError_t") int cudaConfigureCall(@ByVal dim3 gridDim, @ByVal dim3 blockDim, @Cast("size_t") long sharedMem/*=0*/, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaConfigureCall(@ByVal dim3 gridDim, @ByVal dim3 blockDim);

/**
 * \brief Configure a device launch
 *
 * @deprecated This function is deprecated as of CUDA 7.0
 *
 * Pushes \p size bytes of the argument pointed to by \p arg at \p offset
 * bytes from the start of the parameter passing area, which starts at
 * offset 0. The arguments are stored in the top of the execution stack.
 * \ref ::cudaSetupArgument(const void*, size_t, size_t) "cudaSetupArgument()"
 * must be preceded by a call to ::cudaConfigureCall().
 *
 * @param arg    - Argument to push for a kernel launch
 * @param size   - Size of argument
 * @param offset - Offset in argument stack to push new arg
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \ref ::cudaLaunchKernel(const void *func, dim3 gridDim, dim3 blockDim, void **args, size_t sharedMem, cudaStream_t stream) "cudaLaunchKernel (C API)",
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncGetAttributes(struct cudaFuncAttributes*, const void*) "cudaFuncGetAttributes (C API)",
 * \ref ::cudaLaunch(const void*) "cudaLaunch (C API)",
 * ::cudaSetDoubleForDevice,
 * ::cudaSetDoubleForHost,
 * \ref ::cudaSetupArgument(T, size_t) "cudaSetupArgument (C++ API)",
 */
public static native @Cast("cudaError_t") int cudaSetupArgument(@Const Pointer arg, @Cast("size_t") long size, @Cast("size_t") long offset);

/**
 * \brief Launches a device function
 *
 * @deprecated This function is deprecated as of CUDA 7.0
 *
 * Launches the function \p func on the device. The parameter \p func must
 * be a device function symbol. The parameter specified by \p func must be
 * declared as a \p __global__ function. For templated functions, pass the
 * function symbol as follows: func_name<template_arg_0,...,template_arg_N>
 * \ref ::cudaLaunch(const void*) "cudaLaunch()" must be preceded by a call to
 * ::cudaConfigureCall() since it pops the data that was pushed by
 * ::cudaConfigureCall() from the execution stack.
 *
 * @param func - Device function symbol
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDeviceFunction,
 * ::cudaErrorInvalidConfiguration,
 * ::cudaErrorLaunchFailure,
 * ::cudaErrorLaunchTimeout,
 * ::cudaErrorLaunchOutOfResources,
 * ::cudaErrorSharedObjectInitFailed
 * \notefnerr
 * \note_string_api_deprecation_50
 *
 * \ref ::cudaLaunchKernel(const void *func, dim3 gridDim, dim3 blockDim, void **args, size_t sharedMem, cudaStream_t stream) "cudaLaunchKernel (C API)",
 * \ref ::cudaFuncSetCacheConfig(const void*, enum cudaFuncCache) "cudaFuncSetCacheConfig (C API)",
 * \ref ::cudaFuncGetAttributes(struct cudaFuncAttributes*, const void*) "cudaFuncGetAttributes (C API)",
 * \ref ::cudaLaunch(T*) "cudaLaunch (C++ API)",
 * ::cudaSetDoubleForDevice,
 * ::cudaSetDoubleForHost,
 * \ref ::cudaSetupArgument(const void*, size_t, size_t) "cudaSetupArgument (C API)",
 * ::cudaThreadGetCacheConfig,
 * ::cudaThreadSetCacheConfig
 */
public static native @Cast("cudaError_t") int cudaLaunch(@Const Pointer func);


/** \} */ /* END CUDART_EXECUTION_DEPRECATED */


/**
 * \defgroup CUDART_MEMORY Memory Management
 *
 * ___MANBRIEF___ memory management functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the memory management functions of the CUDA runtime
 * application programming interface.
 *
 * Some functions have overloaded C++ API template versions documented separately in the
 * \ref CUDART_HIGHLEVEL "C++ API Routines" module.
 *
 * \{
 */

/**
 * \brief Allocates memory that will be automatically managed by the Unified Memory system
 *
 * Allocates \p size bytes of managed memory on the device and returns in
 * \p *devPtr a pointer to the allocated memory. If the device doesn't support
 * allocating managed memory, ::cudaErrorNotSupported is returned. Support
 * for managed memory can be queried using the device attribute
 * ::cudaDevAttrManagedMemory. The allocated memory is suitably
 * aligned for any kind of variable. The memory is not cleared. If \p size
 * is 0, ::cudaMallocManaged returns ::cudaErrorInvalidValue. The pointer
 * is valid on the CPU and on all GPUs in the system that support managed memory.
 * All accesses to this pointer must obey the Unified Memory programming model.
 *
 * \p flags specifies the default stream association for this allocation.
 * \p flags must be one of ::cudaMemAttachGlobal or ::cudaMemAttachHost.
 * If ::cudaMemAttachGlobal is specified, then this memory is accessible from
 * any stream on any device. If ::cudaMemAttachHost is specified, then the
 * allocation is created with initial visibility restricted to host access only;
 * an explicit call to ::cudaStreamAttachMemAsync will be required to enable access
 * on the device.
 *
 * If the association is later changed via ::cudaStreamAttachMemAsync to
 * a single stream, the default association, as specifed during ::cudaMallocManaged,
 * is restored when that stream is destroyed. For __managed__ variables, the
 * default association is always ::cudaMemAttachGlobal. Note that destroying a
 * stream is an asynchronous operation, and as a result, the change to default
 * association won't happen until all work in the stream has completed.
 *
 * Memory allocated with ::cudaMallocManaged should be released with ::cudaFree.
 *
 * On a multi-GPU system with peer-to-peer support, where multiple GPUs support
 * managed memory, the physical storage is created on the GPU which is active
 * at the time ::cudaMallocManaged is called. All other GPUs will reference the
 * data at reduced bandwidth via peer mappings over the PCIe bus. The Unified
 * Memory management system does not migrate memory between GPUs.
 *
 * On a multi-GPU system where multiple GPUs support managed memory, but not
 * all pairs of such GPUs have peer-to-peer support between them, the physical
 * storage is created in 'zero-copy' or system memory. All GPUs will reference
 * the data at reduced bandwidth over the PCIe bus. In these circumstances,
 * use of the environment variable, CUDA_VISIBLE_DEVICES, is recommended to
 * restrict CUDA to only use those GPUs that have peer-to-peer support.
 * Alternatively, users can also set CUDA_MANAGED_FORCE_DEVICE_ALLOC to a non-zero
 * value to force the driver to always use device memory for physical storage.
 * When this environment variable is set to a non-zero value, all devices used in
 * that process that support managed memory have to be peer-to-peer compatible
 * with each other. The error ::cudaErrorInvalidDevice will be returned if a device
 * that supports managed memory is used and it is not peer-to-peer compatible with
 * any of the other managed memory supporting devices that were previously used in
 * that process, even if ::cudaDeviceReset has been called on those devices. These
 * environment variables are described in the CUDA programming guide under the
 * "CUDA environment variables" section.
 *
 * @param devPtr - Pointer to allocated device memory
 * @param size   - Requested allocation size in bytes
 * @param flags  - Must be either ::cudaMemAttachGlobal or ::cudaMemAttachHost
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * ::cudaErrorNotSupported
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaMallocPitch, ::cudaFree, ::cudaMallocArray, ::cudaFreeArray,
 * ::cudaMalloc3D, ::cudaMalloc3DArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc, ::cudaDeviceGetAttribute, ::cudaStreamAttachMemAsync
 */
public static native @Cast("cudaError_t") int cudaMallocManaged(@Cast("void**") PointerPointer devPtr, @Cast("size_t") long size, @Cast("unsigned int") int flags);
public static native @Cast("cudaError_t") int cudaMallocManaged(@Cast("void**") @ByPtrPtr Pointer devPtr, @Cast("size_t") long size, @Cast("unsigned int") int flags);


/**
 * \brief Allocate memory on the device
 *
 * Allocates \p size bytes of linear memory on the device and returns in
 * \p *devPtr a pointer to the allocated memory. The allocated memory is
 * suitably aligned for any kind of variable. The memory is not cleared.
 * ::cudaMalloc() returns ::cudaErrorMemoryAllocation in case of failure.
 *
 * The device version of ::cudaFree cannot be used with a \p *devPtr
 * allocated using the host API, and vice versa.
 *
 * @param devPtr - Pointer to allocated device memory
 * @param size   - Requested allocation size in bytes
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 *
 * \sa ::cudaMallocPitch, ::cudaFree, ::cudaMallocArray, ::cudaFreeArray,
 * ::cudaMalloc3D, ::cudaMalloc3DArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaMalloc(@Cast("void**") PointerPointer devPtr, @Cast("size_t") long size);
public static native @Cast("cudaError_t") int cudaMalloc(@Cast("void**") @ByPtrPtr Pointer devPtr, @Cast("size_t") long size);

/**
 * \brief Allocates page-locked memory on the host
 *
 * Allocates \p size bytes of host memory that is page-locked and accessible
 * to the device. The driver tracks the virtual memory ranges allocated with
 * this function and automatically accelerates calls to functions such as
 * ::cudaMemcpy*(). Since the memory can be accessed directly by the device,
 * it can be read or written with much higher bandwidth than pageable memory
 * obtained with functions such as ::malloc(). Allocating excessive amounts of
 * memory with ::cudaMallocHost() may degrade system performance, since it
 * reduces the amount of memory available to the system for paging. As a
 * result, this function is best used sparingly to allocate staging areas for
 * data exchange between host and device.
 *
 * @param ptr  - Pointer to allocated host memory
 * @param size - Requested allocation size in bytes
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaMalloc, ::cudaMallocPitch, ::cudaMallocArray, ::cudaMalloc3D,
 * ::cudaMalloc3DArray, ::cudaHostAlloc, ::cudaFree, ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t, unsigned int) "cudaMallocHost (C++ API)",
 * ::cudaFreeHost, ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaMallocHost(@Cast("void**") PointerPointer ptr, @Cast("size_t") long size);
public static native @Cast("cudaError_t") int cudaMallocHost(@Cast("void**") @ByPtrPtr Pointer ptr, @Cast("size_t") long size);

/**
 * \brief Allocates pitched memory on the device
 *
 * Allocates at least \p width (in bytes) * \p height bytes of linear memory
 * on the device and returns in \p *devPtr a pointer to the allocated memory.
 * The function may pad the allocation to ensure that corresponding pointers
 * in any given row will continue to meet the alignment requirements for
 * coalescing as the address is updated from row to row. The pitch returned in
 * \p *pitch by ::cudaMallocPitch() is the width in bytes of the allocation.
 * The intended usage of \p pitch is as a separate parameter of the allocation,
 * used to compute addresses within the 2D array. Given the row and column of
 * an array element of type \p T, the address is computed as:
 * <pre>{@code
    T* pElement = (T*)((char*)BaseAddress + Row * pitch) + Column;
   }</pre>
 *
 * For allocations of 2D arrays, it is recommended that programmers consider
 * performing pitch allocations using ::cudaMallocPitch(). Due to pitch
 * alignment restrictions in the hardware, this is especially true if the
 * application will be performing 2D memory copies between different regions
 * of device memory (whether linear memory or CUDA arrays).
 *
 * @param devPtr - Pointer to allocated pitched device memory
 * @param pitch  - Pitch for allocation
 * @param width  - Requested pitched allocation width (in bytes)
 * @param height - Requested pitched allocation height
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaMalloc, ::cudaFree, ::cudaMallocArray, ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaMalloc3D, ::cudaMalloc3DArray,
 * ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaMallocPitch(@Cast("void**") PointerPointer devPtr, @Cast("size_t*") SizeTPointer pitch, @Cast("size_t") long width, @Cast("size_t") long height);
public static native @Cast("cudaError_t") int cudaMallocPitch(@Cast("void**") @ByPtrPtr Pointer devPtr, @Cast("size_t*") SizeTPointer pitch, @Cast("size_t") long width, @Cast("size_t") long height);

/**
 * \brief Allocate an array on the device
 *
 * Allocates a CUDA array according to the ::cudaChannelFormatDesc structure
 * \p desc and returns a handle to the new CUDA array in \p *array.
 *
 * The ::cudaChannelFormatDesc is defined as:
 * <pre>{@code
    struct cudaChannelFormatDesc {
        int x, y, z, w;
    enum cudaChannelFormatKind f;
    };
    }</pre>
 * where ::cudaChannelFormatKind is one of ::cudaChannelFormatKindSigned,
 * ::cudaChannelFormatKindUnsigned, or ::cudaChannelFormatKindFloat.
 *
 * The \p flags parameter enables different options to be specified that affect
 * the allocation, as follows.
 * - ::cudaArrayDefault: This flag's value is defined to be 0 and provides default array allocation
 * - ::cudaArraySurfaceLoadStore: Allocates an array that can be read from or written to using a surface reference
 * - ::cudaArrayTextureGather: This flag indicates that texture gather operations will be performed on the array.
 *
 * \p width and \p height must meet certain size requirements. See ::cudaMalloc3DArray() for more details.
 *
 * @param array  - Pointer to allocated array in device memory
 * @param desc   - Requested channel format
 * @param width  - Requested array allocation width
 * @param height - Requested array allocation height
 * @param flags  - Requested properties of allocated array
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaMalloc, ::cudaMallocPitch, ::cudaFree, ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaMalloc3D, ::cudaMalloc3DArray,
 * ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaMallocArray(@ByPtrPtr cudaArray array, @Const cudaChannelFormatDesc desc, @Cast("size_t") long width, @Cast("size_t") long height/*=0*/, @Cast("unsigned int") int flags/*=0*/);
public static native @Cast("cudaError_t") int cudaMallocArray(@ByPtrPtr cudaArray array, @Const cudaChannelFormatDesc desc, @Cast("size_t") long width);

/**
 * \brief Frees memory on the device
 *
 * Frees the memory space pointed to by \p devPtr, which must have been
 * returned by a previous call to ::cudaMalloc() or ::cudaMallocPitch().
 * Otherwise, or if ::cudaFree(\p devPtr) has already been called before,
 * an error is returned. If \p devPtr is 0, no operation is performed.
 * ::cudaFree() returns ::cudaErrorInvalidDevicePointer in case of failure.
 *
 * The device version of ::cudaFree cannot be used with a \p *devPtr
 * allocated using the host API, and vice versa.
 *
 * @param devPtr - Device pointer to memory to free
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaMalloc, ::cudaMallocPitch, ::cudaMallocArray, ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaMalloc3D, ::cudaMalloc3DArray,
 * ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaFree(Pointer devPtr);

/**
 * \brief Frees page-locked memory
 *
 * Frees the memory space pointed to by \p hostPtr, which must have been
 * returned by a previous call to ::cudaMallocHost() or ::cudaHostAlloc().
 *
 * @param ptr - Pointer to memory to free
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaMalloc, ::cudaMallocPitch, ::cudaFree, ::cudaMallocArray,
 * ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaMalloc3D, ::cudaMalloc3DArray, ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaFreeHost(Pointer ptr);

/**
 * \brief Frees an array on the device
 *
 * Frees the CUDA array \p array, which must have been * returned by a
 * previous call to ::cudaMallocArray(). If ::cudaFreeArray(\p array) has
 * already been called before, ::cudaErrorInvalidValue is returned. If
 * \p devPtr is 0, no operation is performed.
 *
 * @param array - Pointer to array to free
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaMalloc, ::cudaMallocPitch, ::cudaFree, ::cudaMallocArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaFreeArray(cudaArray array);

/**
 * \brief Frees a mipmapped array on the device
 *
 * Frees the CUDA mipmapped array \p mipmappedArray, which must have been 
 * returned by a previous call to ::cudaMallocMipmappedArray(). 
 * If ::cudaFreeMipmappedArray(\p mipmappedArray) has already been called before,
 * ::cudaErrorInvalidValue is returned.
 *
 * @param mipmappedArray - Pointer to mipmapped array to free
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInitializationError
 * \notefnerr
 *
 * \sa ::cudaMalloc, ::cudaMallocPitch, ::cudaFree, ::cudaMallocArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaFreeMipmappedArray(cudaMipmappedArray mipmappedArray);


/**
 * \brief Allocates page-locked memory on the host
 *
 * Allocates \p size bytes of host memory that is page-locked and accessible
 * to the device. The driver tracks the virtual memory ranges allocated with
 * this function and automatically accelerates calls to functions such as
 * ::cudaMemcpy(). Since the memory can be accessed directly by the device, it
 * can be read or written with much higher bandwidth than pageable memory
 * obtained with functions such as ::malloc(). Allocating excessive amounts of
 * pinned memory may degrade system performance, since it reduces the amount
 * of memory available to the system for paging. As a result, this function is
 * best used sparingly to allocate staging areas for data exchange between host
 * and device.
 *
 * The \p flags parameter enables different options to be specified that affect
 * the allocation, as follows.
 * - ::cudaHostAllocDefault: This flag's value is defined to be 0 and causes
 * ::cudaHostAlloc() to emulate ::cudaMallocHost().
 * - ::cudaHostAllocPortable: The memory returned by this call will be
 * considered as pinned memory by all CUDA contexts, not just the one that
 * performed the allocation.
 * - ::cudaHostAllocMapped: Maps the allocation into the CUDA address space.
 * The device pointer to the memory may be obtained by calling
 * ::cudaHostGetDevicePointer().
 * - ::cudaHostAllocWriteCombined: Allocates the memory as write-combined (WC).
 * WC memory can be transferred across the PCI Express bus more quickly on some
 * system configurations, but cannot be read efficiently by most CPUs.  WC
 * memory is a good option for buffers that will be written by the CPU and read
 * by the device via mapped pinned memory or host->device transfers.
 *
 * All of these flags are orthogonal to one another: a developer may allocate
 * memory that is portable, mapped and/or write-combined with no restrictions.
 *
 * ::cudaSetDeviceFlags() must have been called with the ::cudaDeviceMapHost
 * flag in order for the ::cudaHostAllocMapped flag to have any effect.
 *
 * The ::cudaHostAllocMapped flag may be specified on CUDA contexts for devices
 * that do not support mapped pinned memory. The failure is deferred to
 * ::cudaHostGetDevicePointer() because the memory may be mapped into other
 * CUDA contexts via the ::cudaHostAllocPortable flag.
 *
 * Memory allocated by this function must be freed with ::cudaFreeHost().
 *
 * @param pHost - Device pointer to allocated memory
 * @param size  - Requested allocation size in bytes
 * @param flags - Requested properties of allocated memory
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaSetDeviceFlags,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost
 */
public static native @Cast("cudaError_t") int cudaHostAlloc(@Cast("void**") PointerPointer pHost, @Cast("size_t") long size, @Cast("unsigned int") int flags);
public static native @Cast("cudaError_t") int cudaHostAlloc(@Cast("void**") @ByPtrPtr Pointer pHost, @Cast("size_t") long size, @Cast("unsigned int") int flags);

/**
 * \brief Registers an existing host memory range for use by CUDA
 *
 * Page-locks the memory range specified by \p ptr and \p size and maps it
 * for the device(s) as specified by \p flags. This memory range also is added
 * to the same tracking mechanism as ::cudaHostAlloc() to automatically accelerate
 * calls to functions such as ::cudaMemcpy(). Since the memory can be accessed 
 * directly by the device, it can be read or written with much higher bandwidth 
 * than pageable memory that has not been registered.  Page-locking excessive
 * amounts of memory may degrade system performance, since it reduces the amount
 * of memory available to the system for paging. As a result, this function is
 * best used sparingly to register staging areas for data exchange between
 * host and device.
 *
 * The \p flags parameter enables different options to be specified that
 * affect the allocation, as follows.
 *
 * - ::cudaHostRegisterDefault: On a system with unified virtual addressing,
 *   the memory will be both mapped and portable.  On a system with no unified
 *   virtual addressing, the memory will be neither mapped nor portable.
 *
 * - ::cudaHostRegisterPortable: The memory returned by this call will be
 *   considered as pinned memory by all CUDA contexts, not just the one that
 *   performed the allocation.
 *
 * - ::cudaHostRegisterMapped: Maps the allocation into the CUDA address
 *   space. The device pointer to the memory may be obtained by calling
 *   ::cudaHostGetDevicePointer().
 *
 * - ::cudaHostRegisterIoMemory: The passed memory pointer is treated as
 *   pointing to some memory-mapped I/O space, e.g. belonging to a
 *   third-party PCIe device, and it will marked as non cache-coherent and
 *   contiguous.
 *
 * All of these flags are orthogonal to one another: a developer may page-lock
 * memory that is portable or mapped with no restrictions.
 *
 * The CUDA context must have been created with the ::cudaMapHost flag in
 * order for the ::cudaHostRegisterMapped flag to have any effect.
 *
 * The ::cudaHostRegisterMapped flag may be specified on CUDA contexts for
 * devices that do not support mapped pinned memory. The failure is deferred
 * to ::cudaHostGetDevicePointer() because the memory may be mapped into
 * other CUDA contexts via the ::cudaHostRegisterPortable flag.
 *
 * The memory page-locked by this function must be unregistered with ::cudaHostUnregister().
 *
 * @param ptr   - Host pointer to memory to page-lock
 * @param size  - Size in bytes of the address range to page-lock in bytes
 * @param flags - Flags for allocation request
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorMemoryAllocation,
 * ::cudaErrorHostMemoryAlreadyRegistered
 * \notefnerr
 *
 * \sa ::cudaHostUnregister, ::cudaHostGetFlags, ::cudaHostGetDevicePointer
 */
public static native @Cast("cudaError_t") int cudaHostRegister(Pointer ptr, @Cast("size_t") long size, @Cast("unsigned int") int flags);

/**
 * \brief Unregisters a memory range that was registered with cudaHostRegister
 *
 * Unmaps the memory range whose base address is specified by \p ptr, and makes
 * it pageable again.
 *
 * The base address must be the same one specified to ::cudaHostRegister().
 *
 * @param ptr - Host pointer to memory to unregister
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaHostUnregister
 */
public static native @Cast("cudaError_t") int cudaHostUnregister(Pointer ptr);

/**
 * \brief Passes back device pointer of mapped host memory allocated by
 * cudaHostAlloc or registered by cudaHostRegister
 *
 * Passes back the device pointer corresponding to the mapped, pinned host
 * buffer allocated by ::cudaHostAlloc() or registered by ::cudaHostRegister().
 *
 * ::cudaHostGetDevicePointer() will fail if the ::cudaDeviceMapHost flag was
 * not specified before deferred context creation occurred, or if called on a
 * device that does not support mapped, pinned memory.
 *
 * \p flags provides for future releases.  For now, it must be set to 0.
 *
 * @param pDevice - Returned device pointer for mapped memory
 * @param pHost   - Requested host pointer mapping
 * @param flags   - Flags for extensions (must be 0 for now)
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaSetDeviceFlags, ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaHostGetDevicePointer(@Cast("void**") PointerPointer pDevice, Pointer pHost, @Cast("unsigned int") int flags);
public static native @Cast("cudaError_t") int cudaHostGetDevicePointer(@Cast("void**") @ByPtrPtr Pointer pDevice, Pointer pHost, @Cast("unsigned int") int flags);

/**
 * \brief Passes back flags used to allocate pinned host memory allocated by
 * cudaHostAlloc
 *
 * ::cudaHostGetFlags() will fail if the input pointer does not
 * reside in an address range allocated by ::cudaHostAlloc().
 *
 * @param pFlags - Returned flags word
 * @param pHost - Host pointer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaHostAlloc
 */
public static native @Cast("cudaError_t") int cudaHostGetFlags(@Cast("unsigned int*") IntPointer pFlags, Pointer pHost);
public static native @Cast("cudaError_t") int cudaHostGetFlags(@Cast("unsigned int*") IntBuffer pFlags, Pointer pHost);
public static native @Cast("cudaError_t") int cudaHostGetFlags(@Cast("unsigned int*") int[] pFlags, Pointer pHost);

/**
 * \brief Allocates logical 1D, 2D, or 3D memory objects on the device
 *
 * Allocates at least \p width * \p height * \p depth bytes of linear memory
 * on the device and returns a ::cudaPitchedPtr in which \p ptr is a pointer
 * to the allocated memory. The function may pad the allocation to ensure
 * hardware alignment requirements are met. The pitch returned in the \p pitch
 * field of \p pitchedDevPtr is the width in bytes of the allocation.
 *
 * The returned ::cudaPitchedPtr contains additional fields \p xsize and
 * \p ysize, the logical width and height of the allocation, which are
 * equivalent to the \p width and \p height \p extent parameters provided by
 * the programmer during allocation.
 *
 * For allocations of 2D and 3D objects, it is highly recommended that
 * programmers perform allocations using ::cudaMalloc3D() or
 * ::cudaMallocPitch(). Due to alignment restrictions in the hardware, this is
 * especially true if the application will be performing memory copies
 * involving 2D or 3D objects (whether linear memory or CUDA arrays).
 *
 * @param pitchedDevPtr  - Pointer to allocated pitched device memory
 * @param extent         - Requested allocation size (\p width field in bytes)
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaMallocPitch, ::cudaFree, ::cudaMemcpy3D, ::cudaMemset3D,
 * ::cudaMalloc3DArray, ::cudaMallocArray, ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc, ::make_cudaPitchedPtr, ::make_cudaExtent
 */
public static native @Cast("cudaError_t") int cudaMalloc3D(cudaPitchedPtr pitchedDevPtr, @ByVal cudaExtent extent);

/**
 * \brief Allocate an array on the device
 *
 * Allocates a CUDA array according to the ::cudaChannelFormatDesc structure
 * \p desc and returns a handle to the new CUDA array in \p *array.
 *
 * The ::cudaChannelFormatDesc is defined as:
 * <pre>{@code
    struct cudaChannelFormatDesc {
        int x, y, z, w;
        enum cudaChannelFormatKind f;
    };
    }</pre>
 * where ::cudaChannelFormatKind is one of ::cudaChannelFormatKindSigned,
 * ::cudaChannelFormatKindUnsigned, or ::cudaChannelFormatKindFloat.
 *
 * ::cudaMalloc3DArray() can allocate the following:
 *
 * - A 1D array is allocated if the height and depth extents are both zero.
 * - A 2D array is allocated if only the depth extent is zero.
 * - A 3D array is allocated if all three extents are non-zero.
 * - A 1D layered CUDA array is allocated if only the height extent is zero and
 * the cudaArrayLayered flag is set. Each layer is a 1D array. The number of layers is 
 * determined by the depth extent.
 * - A 2D layered CUDA array is allocated if all three extents are non-zero and 
 * the cudaArrayLayered flag is set. Each layer is a 2D array. The number of layers is 
 * determined by the depth extent.
 * - A cubemap CUDA array is allocated if all three extents are non-zero and the
 * cudaArrayCubemap flag is set. Width must be equal to height, and depth must be six. A cubemap is
 * a special type of 2D layered CUDA array, where the six layers represent the six faces of a cube. 
 * The order of the six layers in memory is the same as that listed in ::cudaGraphicsCubeFace.
 * - A cubemap layered CUDA array is allocated if all three extents are non-zero, and both,
 * cudaArrayCubemap and cudaArrayLayered flags are set. Width must be equal to height, and depth must be 
 * a multiple of six. A cubemap layered CUDA array is a special type of 2D layered CUDA array that consists 
 * of a collection of cubemaps. The first six layers represent the first cubemap, the next six layers form 
 * the second cubemap, and so on.
 *
 *
 * The \p flags parameter enables different options to be specified that affect
 * the allocation, as follows.
 * - ::cudaArrayDefault: This flag's value is defined to be 0 and provides default array allocation
 * - ::cudaArrayLayered: Allocates a layered CUDA array, with the depth extent indicating the number of layers
 * - ::cudaArrayCubemap: Allocates a cubemap CUDA array. Width must be equal to height, and depth must be six.
 *   If the cudaArrayLayered flag is also set, depth must be a multiple of six.
 * - ::cudaArraySurfaceLoadStore: Allocates a CUDA array that could be read from or written to using a surface
 *   reference.
 * - ::cudaArrayTextureGather: This flag indicates that texture gather operations will be performed on the CUDA 
 *   array. Texture gather can only be performed on 2D CUDA arrays.
 *
 * The width, height and depth extents must meet certain size requirements as listed in the following table.
 * All values are specified in elements.
 *
 * Note that 2D CUDA arrays have different size requirements if the ::cudaArrayTextureGather flag is set. In that
 * case, the valid range for (width, height, depth) is ((1,maxTexture2DGather[0]), (1,maxTexture2DGather[1]), 0).
 *
 * \xmlonly
 * <table outputclass="xmlonly">
 * <tgroup cols="3" colsep="1" rowsep="1">
 * <colspec colname="c1" colwidth="1.0*"/>
 * <colspec colname="c2" colwidth="3.0*"/>
 * <colspec colname="c3" colwidth="3.0*"/>
 * <thead>
 * <row>
 * <entry>CUDA array type</entry>
 * <entry>Valid extents that must always be met {(width range in elements),
 * (height range), (depth range)}</entry>
 * <entry>Valid extents with cudaArraySurfaceLoadStore set {(width range in
 * elements), (height range), (depth range)}</entry>
 * </row>
 * </thead>
 * <tbody>
 * <row>
 * <entry>1D</entry>
 * <entry>{ (1,maxTexture1D), 0, 0 }</entry>
 * <entry>{ (1,maxSurface1D), 0, 0 }</entry>
 * </row>
 * <row>
 * <entry>2D</entry>
 * <entry>{ (1,maxTexture2D[0]), (1,maxTexture2D[1]), 0 }</entry>
 * <entry>{ (1,maxSurface2D[0]), (1,maxSurface2D[1]), 0 }</entry>
 * </row>
 * <row>
 * <entry>3D</entry>
 * <entry>{ (1,maxTexture3D[0]), (1,maxTexture3D[1]), (1,maxTexture3D[2]) }
 * OR { (1,maxTexture3DAlt[0]), (1,maxTexture3DAlt[1]),
 * (1,maxTexture3DAlt[2]) }</entry>
 * <entry>{ (1,maxSurface3D[0]), (1,maxSurface3D[1]), (1,maxSurface3D[2]) }</entry>
 * </row>
 * <row>
 * <entry>1D Layered</entry>
 * <entry>{ (1,maxTexture1DLayered[0]), 0, (1,maxTexture1DLayered[1]) }</entry>
 * <entry>{ (1,maxSurface1DLayered[0]), 0, (1,maxSurface1DLayered[1]) }</entry>
 * </row>
 * <row>
 * <entry>2D Layered</entry>
 * <entry>{ (1,maxTexture2DLayered[0]), (1,maxTexture2DLayered[1]),
 * (1,maxTexture2DLayered[2]) }</entry>
 * <entry>{ (1,maxSurface2DLayered[0]), (1,maxSurface2DLayered[1]),
 * (1,maxSurface2DLayered[2]) }</entry>
 * </row>
 * <row>
 * <entry>Cubemap</entry>
 * <entry>{ (1,maxTextureCubemap), (1,maxTextureCubemap), 6 }</entry>
 * <entry>{ (1,maxSurfaceCubemap), (1,maxSurfaceCubemap), 6 }</entry>
 * </row>
 * <row>
 * <entry>Cubemap Layered</entry>
 * <entry>{ (1,maxTextureCubemapLayered[0]), (1,maxTextureCubemapLayered[0]),
 * (1,maxTextureCubemapLayered[1]) }</entry>
 * <entry>{ (1,maxSurfaceCubemapLayered[0]), (1,maxSurfaceCubemapLayered[0]),
 * (1,maxSurfaceCubemapLayered[1]) }</entry>
 * </row>
 * </tbody>
 * </tgroup>
 * </table>
 * \endxmlonly
 *
 * @param array  - Pointer to allocated array in device memory
 * @param desc   - Requested channel format
 * @param extent - Requested allocation size (\p width field in elements)
 * @param flags  - Flags for extensions
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaMalloc3D, ::cudaMalloc, ::cudaMallocPitch, ::cudaFree,
 * ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc,
 * ::make_cudaExtent
 */
public static native @Cast("cudaError_t") int cudaMalloc3DArray(@ByPtrPtr cudaArray array, @Const cudaChannelFormatDesc desc, @ByVal cudaExtent extent, @Cast("unsigned int") int flags/*=0*/);
public static native @Cast("cudaError_t") int cudaMalloc3DArray(@ByPtrPtr cudaArray array, @Const cudaChannelFormatDesc desc, @ByVal cudaExtent extent);

/**
 * \brief Allocate a mipmapped array on the device
 *
 * Allocates a CUDA mipmapped array according to the ::cudaChannelFormatDesc structure
 * \p desc and returns a handle to the new CUDA mipmapped array in \p *mipmappedArray.
 * \p numLevels specifies the number of mipmap levels to be allocated. This value is
 * clamped to the range [1, 1 + floor(log2(max(width, height, depth)))].
 *
 * The ::cudaChannelFormatDesc is defined as:
 * <pre>{@code
    struct cudaChannelFormatDesc {
        int x, y, z, w;
        enum cudaChannelFormatKind f;
    };
    }</pre>
 * where ::cudaChannelFormatKind is one of ::cudaChannelFormatKindSigned,
 * ::cudaChannelFormatKindUnsigned, or ::cudaChannelFormatKindFloat.
 *
 * ::cudaMallocMipmappedArray() can allocate the following:
 *
 * - A 1D mipmapped array is allocated if the height and depth extents are both zero.
 * - A 2D mipmapped array is allocated if only the depth extent is zero.
 * - A 3D mipmapped array is allocated if all three extents are non-zero.
 * - A 1D layered CUDA mipmapped array is allocated if only the height extent is zero and
 * the cudaArrayLayered flag is set. Each layer is a 1D mipmapped array. The number of layers is 
 * determined by the depth extent.
 * - A 2D layered CUDA mipmapped array is allocated if all three extents are non-zero and 
 * the cudaArrayLayered flag is set. Each layer is a 2D mipmapped array. The number of layers is 
 * determined by the depth extent.
 * - A cubemap CUDA mipmapped array is allocated if all three extents are non-zero and the
 * cudaArrayCubemap flag is set. Width must be equal to height, and depth must be six.
 * The order of the six layers in memory is the same as that listed in ::cudaGraphicsCubeFace.
 * - A cubemap layered CUDA mipmapped array is allocated if all three extents are non-zero, and both,
 * cudaArrayCubemap and cudaArrayLayered flags are set. Width must be equal to height, and depth must be 
 * a multiple of six. A cubemap layered CUDA mipmapped array is a special type of 2D layered CUDA mipmapped
 * array that consists of a collection of cubemap mipmapped arrays. The first six layers represent the 
 * first cubemap mipmapped array, the next six layers form the second cubemap mipmapped array, and so on.
 *
 *
 * The \p flags parameter enables different options to be specified that affect
 * the allocation, as follows.
 * - ::cudaArrayDefault: This flag's value is defined to be 0 and provides default mipmapped array allocation
 * - ::cudaArrayLayered: Allocates a layered CUDA mipmapped array, with the depth extent indicating the number of layers
 * - ::cudaArrayCubemap: Allocates a cubemap CUDA mipmapped array. Width must be equal to height, and depth must be six.
 *   If the cudaArrayLayered flag is also set, depth must be a multiple of six.
 * - ::cudaArraySurfaceLoadStore: This flag indicates that individual mipmap levels of the CUDA mipmapped array 
 *   will be read from or written to using a surface reference.
 * - ::cudaArrayTextureGather: This flag indicates that texture gather operations will be performed on the CUDA 
 *   array. Texture gather can only be performed on 2D CUDA mipmapped arrays, and the gather operations are
 *   performed only on the most detailed mipmap level.
 *
 * The width, height and depth extents must meet certain size requirements as listed in the following table.
 * All values are specified in elements.
 *
 * \xmlonly
 * <table outputclass="xmlonly">
 * <tgroup cols="2" colsep="1" rowsep="1">
 * <colspec colname="c1" colwidth="1.0*"/>
 * <colspec colname="c2" colwidth="3.0*"/>
 * <thead>
 * <row>
 * <entry>CUDA array type</entry>
 * <entry>Valid extents {(width range in elements), (height range), (depth
 * range)}</entry>
 * </row>
 * </thead>
 * <tbody>
 * <row>
 * <entry>1D</entry>
 * <entry>{ (1,maxTexture1DMipmap), 0, 0 }</entry>
 * </row>
 * <row>
 * <entry>2D</entry>
 * <entry>{ (1,maxTexture2DMipmap[0]), (1,maxTexture2DMipmap[1]), 0 }</entry>
 * </row>
 * <row>
 * <entry>3D</entry>
 * <entry>{ (1,maxTexture3D[0]), (1,maxTexture3D[1]), (1,maxTexture3D[2]) }</entry>
 * </row>
 * <row>
 * <entry>1D Layered</entry>
 * <entry>{ (1,maxTexture1DLayered[0]), 0, (1,maxTexture1DLayered[1]) }</entry>
 * </row>
 * <row>
 * <entry>2D Layered</entry>
 * <entry>{ (1,maxTexture2DLayered[0]), (1,maxTexture2DLayered[1]),
 * (1,maxTexture2DLayered[2]) }</entry>
 * </row>
 * <row>
 * <entry>Cubemap</entry>
 * <entry>{ (1,maxTextureCubemap), (1,maxTextureCubemap), 6 }</entry>
 * </row>
 * <row>
 * <entry>Cubemap Layered</entry>
 * <entry>{ (1,maxTextureCubemapLayered[0]), (1,maxTextureCubemapLayered[0]),
 * (1,maxTextureCubemapLayered[1]) }</entry>
 * </row>
 * </tbody>
 * </tgroup>
 * </table>
 * \endxmlonly
 *
 * @param mipmappedArray  - Pointer to allocated mipmapped array in device memory
 * @param desc            - Requested channel format
 * @param extent          - Requested allocation size (\p width field in elements)
 * @param numLevels       - Number of mipmap levels to allocate
 * @param flags           - Flags for extensions
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorMemoryAllocation
 * \notefnerr
 *
 * \sa ::cudaMalloc3D, ::cudaMalloc, ::cudaMallocPitch, ::cudaFree,
 * ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc,
 * ::make_cudaExtent
 */
public static native @Cast("cudaError_t") int cudaMallocMipmappedArray(@ByPtrPtr cudaMipmappedArray mipmappedArray, @Const cudaChannelFormatDesc desc, @ByVal cudaExtent extent, @Cast("unsigned int") int numLevels, @Cast("unsigned int") int flags/*=0*/);
public static native @Cast("cudaError_t") int cudaMallocMipmappedArray(@ByPtrPtr cudaMipmappedArray mipmappedArray, @Const cudaChannelFormatDesc desc, @ByVal cudaExtent extent, @Cast("unsigned int") int numLevels);

/**
 * \brief Gets a mipmap level of a CUDA mipmapped array
 *
 * Returns in \p *levelArray a CUDA array that represents a single mipmap level
 * of the CUDA mipmapped array \p mipmappedArray.
 *
 * If \p level is greater than the maximum number of levels in this mipmapped array,
 * ::cudaErrorInvalidValue is returned.
 *
 * @param levelArray     - Returned mipmap level CUDA array
 * @param mipmappedArray - CUDA mipmapped array
 * @param level          - Mipmap level
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaMalloc3D, ::cudaMalloc, ::cudaMallocPitch, ::cudaFree,
 * ::cudaFreeArray,
 * \ref ::cudaMallocHost(void**, size_t) "cudaMallocHost (C API)",
 * ::cudaFreeHost, ::cudaHostAlloc,
 * ::make_cudaExtent
 */
public static native @Cast("cudaError_t") int cudaGetMipmappedArrayLevel(@ByPtrPtr cudaArray levelArray, cudaMipmappedArray mipmappedArray, @Cast("unsigned int") int level);

/**
 * \brief Copies data between 3D objects
 *
<pre>{@code
struct cudaExtent {
  size_t width;
  size_t height;
  size_t depth;
};
struct cudaExtent make_cudaExtent(size_t w, size_t h, size_t d);

struct cudaPos {
  size_t x;
  size_t y;
  size_t z;
};
struct cudaPos make_cudaPos(size_t x, size_t y, size_t z);

struct cudaMemcpy3DParms {
  cudaArray_t           srcArray;
  struct cudaPos        srcPos;
  struct cudaPitchedPtr srcPtr;
  cudaArray_t           dstArray;
  struct cudaPos        dstPos;
  struct cudaPitchedPtr dstPtr;
  struct cudaExtent     extent;
  enum cudaMemcpyKind   kind;
};
}</pre>
 *
 * ::cudaMemcpy3D() copies data betwen two 3D objects. The source and
 * destination objects may be in either host memory, device memory, or a CUDA
 * array. The source, destination, extent, and kind of copy performed is
 * specified by the ::cudaMemcpy3DParms struct which should be initialized to
 * zero before use:
<pre>{@code
cudaMemcpy3DParms myParms = {0};
}</pre>
 *
 * The struct passed to ::cudaMemcpy3D() must specify one of \p srcArray or
 * \p srcPtr and one of \p dstArray or \p dstPtr. Passing more than one
 * non-zero source or destination will cause ::cudaMemcpy3D() to return an
 * error.
 *
 * The \p srcPos and \p dstPos fields are optional offsets into the source and
 * destination objects and are defined in units of each object's elements. The
 * element for a host or device pointer is assumed to be <b>unsigned char</b>.
 * For CUDA arrays, positions must be in the range [0, 2048) for any
 * dimension.
 *
 * The \p extent field defines the dimensions of the transferred area in
 * elements. If a CUDA array is participating in the copy, the extent is
 * defined in terms of that array's elements. If no CUDA array is
 * participating in the copy then the extents are defined in elements of
 * <b>unsigned char</b>.
 *
 * The \p kind field defines the direction of the copy. It must be one of
 * ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost,
 * or ::cudaMemcpyDeviceToDevice.
 *
 * If the source and destination are both arrays, ::cudaMemcpy3D() will return
 * an error if they do not have the same element size.
 *
 * The source and destination object may not overlap. If overlapping source
 * and destination objects are specified, undefined behavior will result.
 *
 * The source object must lie entirely within the region defined by \p srcPos
 * and \p extent. The destination object must lie entirely within the region
 * defined by \p dstPos and \p extent.
 *
 * ::cudaMemcpy3D() returns an error if the pitch of \p srcPtr or \p dstPtr
 * exceeds the maximum allowed. The pitch of a ::cudaPitchedPtr allocated
 * with ::cudaMalloc3D() will always be valid.
 *
 * @param p - 3D memory copy parameters
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMalloc3D, ::cudaMalloc3DArray, ::cudaMemset3D, ::cudaMemcpy3DAsync,
 * ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync,
 * ::make_cudaExtent, ::make_cudaPos
 */
public static native @Cast("cudaError_t") int cudaMemcpy3D(@Const cudaMemcpy3DParms p);

/**
 * \brief Copies memory between devices
 *
 * Perform a 3D memory copy according to the parameters specified in
 * \p p.  See the definition of the ::cudaMemcpy3DPeerParms structure
 * for documentation of its parameters.
 *
 * Note that this function is synchronous with respect to the host only if
 * the source or destination of the transfer is host memory.  Note also 
 * that this copy is serialized with respect to all pending and future 
 * asynchronous work in to the current device, the copy's source device,
 * and the copy's destination device (use ::cudaMemcpy3DPeerAsync to avoid 
 * this synchronization).
 *
 * @param p - Parameters for the memory copy
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMemcpy, ::cudaMemcpyPeer, ::cudaMemcpyAsync, ::cudaMemcpyPeerAsync,
 * ::cudaMemcpy3DPeerAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy3DPeer(@Const cudaMemcpy3DPeerParms p);

/**
 * \brief Copies data between 3D objects
 *
<pre>{@code
struct cudaExtent {
  size_t width;
  size_t height;
  size_t depth;
};
struct cudaExtent make_cudaExtent(size_t w, size_t h, size_t d);

struct cudaPos {
  size_t x;
  size_t y;
  size_t z;
};
struct cudaPos make_cudaPos(size_t x, size_t y, size_t z);

struct cudaMemcpy3DParms {
  cudaArray_t           srcArray;
  struct cudaPos        srcPos;
  struct cudaPitchedPtr srcPtr;
  cudaArray_t           dstArray;
  struct cudaPos        dstPos;
  struct cudaPitchedPtr dstPtr;
  struct cudaExtent     extent;
  enum cudaMemcpyKind   kind;
};
}</pre>
 *
 * ::cudaMemcpy3DAsync() copies data betwen two 3D objects. The source and
 * destination objects may be in either host memory, device memory, or a CUDA
 * array. The source, destination, extent, and kind of copy performed is
 * specified by the ::cudaMemcpy3DParms struct which should be initialized to
 * zero before use:
<pre>{@code
cudaMemcpy3DParms myParms = {0};
}</pre>
 *
 * The struct passed to ::cudaMemcpy3DAsync() must specify one of \p srcArray
 * or \p srcPtr and one of \p dstArray or \p dstPtr. Passing more than one
 * non-zero source or destination will cause ::cudaMemcpy3DAsync() to return an
 * error.
 *
 * The \p srcPos and \p dstPos fields are optional offsets into the source and
 * destination objects and are defined in units of each object's elements. The
 * element for a host or device pointer is assumed to be <b>unsigned char</b>.
 * For CUDA arrays, positions must be in the range [0, 2048) for any
 * dimension.
 *
 * The \p extent field defines the dimensions of the transferred area in
 * elements. If a CUDA array is participating in the copy, the extent is
 * defined in terms of that array's elements. If no CUDA array is
 * participating in the copy then the extents are defined in elements of
 * <b>unsigned char</b>.
 *
 * The \p kind field defines the direction of the copy. It must be one of
 * ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost,
 * or ::cudaMemcpyDeviceToDevice.
 *
 * If the source and destination are both arrays, ::cudaMemcpy3DAsync() will
 * return an error if they do not have the same element size.
 *
 * The source and destination object may not overlap. If overlapping source
 * and destination objects are specified, undefined behavior will result.
 *
 * The source object must lie entirely within the region defined by \p srcPos
 * and \p extent. The destination object must lie entirely within the region
 * defined by \p dstPos and \p extent.
 *
 * ::cudaMemcpy3DAsync() returns an error if the pitch of \p srcPtr or
 * \p dstPtr exceeds the maximum allowed. The pitch of a
 * ::cudaPitchedPtr allocated with ::cudaMalloc3D() will always be valid.
 *
 * ::cudaMemcpy3DAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally
 * be associated to a stream by passing a non-zero \p stream argument. If
 * \p kind is ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToHost and \p stream
 * is non-zero, the copy may overlap with operations in other streams.
 *
 * The device version of this function only handles device to device copies and
 * cannot be given local or shared pointers.
 *
 * @param p      - 3D memory copy parameters
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMalloc3D, ::cudaMalloc3DArray, ::cudaMemset3D, ::cudaMemcpy3D,
 * ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync,
 * ::make_cudaExtent, ::make_cudaPos
 */
public static native @Cast("cudaError_t") int cudaMemcpy3DAsync(@Const cudaMemcpy3DParms p, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpy3DAsync(@Const cudaMemcpy3DParms p);

/**
 * \brief Copies memory between devices asynchronously.
 *
 * Perform a 3D memory copy according to the parameters specified in
 * \p p.  See the definition of the ::cudaMemcpy3DPeerParms structure
 * for documentation of its parameters.
 *
 * @param p      - Parameters for the memory copy
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpyPeer, ::cudaMemcpyAsync, ::cudaMemcpyPeerAsync,
 * ::cudaMemcpy3DPeerAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy3DPeerAsync(@Const cudaMemcpy3DPeerParms p, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpy3DPeerAsync(@Const cudaMemcpy3DPeerParms p);

/**
 * \brief Gets free and total device memory
 *
 * Returns in \p *free and \p *total respectively, the free and total amount of
 * memory available for allocation by the device in bytes.
 *
 * @param free  - Returned free memory in bytes
 * @param total - Returned total memory in bytes
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInitializationError,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorLaunchFailure
 * \notefnerr
 *
 */
public static native @Cast("cudaError_t") int cudaMemGetInfo(@Cast("size_t*") SizeTPointer free, @Cast("size_t*") SizeTPointer total);

/**
 * \brief Gets info about the specified cudaArray
 * 
 * Returns in \p *desc, \p *extent and \p *flags respectively, the type, shape 
 * and flags of \p array.
 *
 * Any of \p *desc, \p *extent and \p *flags may be specified as NULL.
 *
 * @param desc   - Returned array type
 * @param extent - Returned array shape. 2D arrays will have depth of zero
 * @param flags  - Returned array flags
 * @param array  - The ::cudaArray to get info for
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 */
public static native @Cast("cudaError_t") int cudaArrayGetInfo(cudaChannelFormatDesc desc, cudaExtent extent, @Cast("unsigned int*") IntPointer flags, cudaArray array);
public static native @Cast("cudaError_t") int cudaArrayGetInfo(cudaChannelFormatDesc desc, cudaExtent extent, @Cast("unsigned int*") IntBuffer flags, cudaArray array);
public static native @Cast("cudaError_t") int cudaArrayGetInfo(cudaChannelFormatDesc desc, cudaExtent extent, @Cast("unsigned int*") int[] flags, cudaArray array);

/**
 * \brief Copies data between host and device
 *
 * Copies \p count bytes from the memory area pointed to by \p src to the
 * memory area pointed to by \p dst, where \p kind is one of
 * ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost,
 * or ::cudaMemcpyDeviceToDevice, and specifies the direction of the copy. The
 * memory areas may not overlap. Calling ::cudaMemcpy() with \p dst and \p src
 * pointers that do not match the direction of the copy results in an
 * undefined behavior.
 *
 * @param dst   - Destination memory address
 * @param src   - Source memory address
 * @param count - Size in bytes to copy
 * @param kind  - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 *
 * \note_sync
 *
 * \sa ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy(Pointer dst, @Const Pointer src, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies memory between two devices
 *
 * Copies memory from one device to memory on another device.  \p dst is the 
 * base device pointer of the destination memory and \p dstDevice is the 
 * destination device.  \p src is the base device pointer of the source memory 
 * and \p srcDevice is the source device.  \p count specifies the number of bytes 
 * to copy.
 *
 * Note that this function is asynchronous with respect to the host, but 
 * serialized with respect all pending and future asynchronous work in to the 
 * current device, \p srcDevice, and \p dstDevice (use ::cudaMemcpyPeerAsync 
 * to avoid this synchronization).
 *
 * @param dst       - Destination device pointer
 * @param dstDevice - Destination device
 * @param src       - Source device pointer
 * @param srcDevice - Source device
 * @param count     - Size of memory copy in bytes
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMemcpy, ::cudaMemcpyAsync, ::cudaMemcpyPeerAsync,
 * ::cudaMemcpy3DPeerAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyPeer(Pointer dst, int dstDevice, @Const Pointer src, int srcDevice, @Cast("size_t") long count);

/**
 * \brief Copies data between host and device
 *
 * Copies \p count bytes from the memory area pointed to by \p src to the
 * CUDA array \p dst starting at the upper left corner
 * (\p wOffset, \p hOffset), where \p kind is one of ::cudaMemcpyHostToHost,
 * ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost, or
 * ::cudaMemcpyDeviceToDevice, and specifies the direction of the copy.
 *
 * @param dst     - Destination memory address
 * @param wOffset - Destination starting X offset
 * @param hOffset - Destination starting Y offset
 * @param src     - Source memory address
 * @param count   - Size in bytes to copy
 * @param kind    - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyToArray(cudaArray dst, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Const Pointer src, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies \p count bytes from the CUDA array \p src starting at the upper
 * left corner (\p wOffset, hOffset) to the memory area pointed to by \p dst,
 * where \p kind is one of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy.
 *
 * @param dst     - Destination memory address
 * @param src     - Source memory address
 * @param wOffset - Source starting X offset
 * @param hOffset - Source starting Y offset
 * @param count   - Size in bytes to copy
 * @param kind    - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyFromArray(Pointer dst, cudaArray src, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies \p count bytes from the CUDA array \p src starting at the upper
 * left corner (\p wOffsetSrc, \p hOffsetSrc) to the CUDA array \p dst
 * starting at the upper left corner (\p wOffsetDst, \p hOffsetDst) where
 * \p kind is one of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy.
 *
 * @param dst        - Destination memory address
 * @param wOffsetDst - Destination starting X offset
 * @param hOffsetDst - Destination starting Y offset
 * @param src        - Source memory address
 * @param wOffsetSrc - Source starting X offset
 * @param hOffsetSrc - Source starting Y offset
 * @param count      - Size in bytes to copy
 * @param kind       - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyArrayToArray(cudaArray dst, @Cast("size_t") long wOffsetDst, @Cast("size_t") long hOffsetDst, cudaArray src, @Cast("size_t") long wOffsetSrc, @Cast("size_t") long hOffsetSrc, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind/*=cudaMemcpyDeviceToDevice*/);
public static native @Cast("cudaError_t") int cudaMemcpyArrayToArray(cudaArray dst, @Cast("size_t") long wOffsetDst, @Cast("size_t") long hOffsetDst, cudaArray src, @Cast("size_t") long wOffsetSrc, @Cast("size_t") long hOffsetSrc, @Cast("size_t") long count);

/**
 * \brief Copies data between host and device
 *
 * Copies a matrix (\p height rows of \p width bytes each) from the memory
 * area pointed to by \p src to the memory area pointed to by \p dst, where
 * \p kind is one of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy. \p dpitch and \p spitch are the widths in memory in
 * bytes of the 2D arrays pointed to by \p dst and \p src, including any
 * padding added to the end of each row. The memory areas may not overlap.
 * \p width must not exceed either \p dpitch or \p spitch.
 * Calling ::cudaMemcpy2D() with \p dst and \p src pointers that do not match
 * the direction of the copy results in an undefined behavior.
 * ::cudaMemcpy2D() returns an error if \p dpitch or \p spitch exceeds
 * the maximum allowed.
 *
 * @param dst    - Destination memory address
 * @param dpitch - Pitch of destination memory
 * @param src    - Source memory address
 * @param spitch - Pitch of source memory
 * @param width  - Width of matrix transfer (columns in bytes)
 * @param height - Height of matrix transfer (rows)
 * @param kind   - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 *
 * \sa ::cudaMemcpy, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy2D(Pointer dst, @Cast("size_t") long dpitch, @Const Pointer src, @Cast("size_t") long spitch, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies a matrix (\p height rows of \p width bytes each) from the memory
 * area pointed to by \p src to the CUDA array \p dst starting at the
 * upper left corner (\p wOffset, \p hOffset) where \p kind is one of
 * ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost,
 * or ::cudaMemcpyDeviceToDevice, and specifies the direction of the copy.
 * \p spitch is the width in memory in bytes of the 2D array pointed to by
 * \p src, including any padding added to the end of each row. \p wOffset +
 * \p width must not exceed the width of the CUDA array \p dst. \p width must
 * not exceed \p spitch. ::cudaMemcpy2DToArray() returns an error if \p spitch
 * exceeds the maximum allowed.
 *
 * @param dst     - Destination memory address
 * @param wOffset - Destination starting X offset
 * @param hOffset - Destination starting Y offset
 * @param src     - Source memory address
 * @param spitch  - Pitch of source memory
 * @param width   - Width of matrix transfer (columns in bytes)
 * @param height  - Height of matrix transfer (rows)
 * @param kind    - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy2DToArray(cudaArray dst, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Const Pointer src, @Cast("size_t") long spitch, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies a matrix (\p height rows of \p width bytes each) from the CUDA
 * array \p srcArray starting at the upper left corner
 * (\p wOffset, \p hOffset) to the memory area pointed to by \p dst, where
 * \p kind is one of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy. \p dpitch is the width in memory in bytes of the 2D
 * array pointed to by \p dst, including any padding added to the end of each
 * row. \p wOffset + \p width must not exceed the width of the CUDA array
 * \p src. \p width must not exceed \p dpitch. ::cudaMemcpy2DFromArray()
 * returns an error if \p dpitch exceeds the maximum allowed.
 *
 * @param dst     - Destination memory address
 * @param dpitch  - Pitch of destination memory
 * @param src     - Source memory address
 * @param wOffset - Source starting X offset
 * @param hOffset - Source starting Y offset
 * @param width   - Width of matrix transfer (columns in bytes)
 * @param height  - Height of matrix transfer (rows)
 * @param kind    - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy2DFromArray(Pointer dst, @Cast("size_t") long dpitch, cudaArray src, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies a matrix (\p height rows of \p width bytes each) from the CUDA
 * array \p srcArray starting at the upper left corner
 * (\p wOffsetSrc, \p hOffsetSrc) to the CUDA array \p dst starting at
 * the upper left corner (\p wOffsetDst, \p hOffsetDst), where \p kind is one
 * of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy. \p wOffsetDst + \p width must not exceed the width
 * of the CUDA array \p dst. \p wOffsetSrc + \p width must not exceed the width
 * of the CUDA array \p src.
 *
 * @param dst        - Destination memory address
 * @param wOffsetDst - Destination starting X offset
 * @param hOffsetDst - Destination starting Y offset
 * @param src        - Source memory address
 * @param wOffsetSrc - Source starting X offset
 * @param hOffsetSrc - Source starting Y offset
 * @param width      - Width of matrix transfer (columns in bytes)
 * @param height     - Height of matrix transfer (rows)
 * @param kind       - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy2DArrayToArray(cudaArray dst, @Cast("size_t") long wOffsetDst, @Cast("size_t") long hOffsetDst, cudaArray src, @Cast("size_t") long wOffsetSrc, @Cast("size_t") long hOffsetSrc, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind/*=cudaMemcpyDeviceToDevice*/);
public static native @Cast("cudaError_t") int cudaMemcpy2DArrayToArray(cudaArray dst, @Cast("size_t") long wOffsetDst, @Cast("size_t") long hOffsetDst, cudaArray src, @Cast("size_t") long wOffsetSrc, @Cast("size_t") long hOffsetSrc, @Cast("size_t") long width, @Cast("size_t") long height);

/**
 * \brief Copies data to the given symbol on the device
 *
 * Copies \p count bytes from the memory area pointed to by \p src
 * to the memory area pointed to by \p offset bytes from the start of symbol
 * \p symbol. The memory areas may not overlap. \p symbol is a variable that
 * resides in global or constant memory space. \p kind can be either
 * ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToDevice.
 *
 * @param symbol - Device symbol address
 * @param src    - Source memory address
 * @param count  - Size in bytes to copy
 * @param offset - Offset from start of symbol in bytes
 * @param kind   - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidSymbol,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 * \note_string_api_deprecation
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyToSymbol(@Const Pointer symbol, @Const Pointer src, @Cast("size_t") long count, @Cast("size_t") long offset/*=0*/, @Cast("cudaMemcpyKind") int kind/*=cudaMemcpyHostToDevice*/);
public static native @Cast("cudaError_t") int cudaMemcpyToSymbol(@Const Pointer symbol, @Const Pointer src, @Cast("size_t") long count);

/**
 * \brief Copies data from the given symbol on the device
 *
 * Copies \p count bytes from the memory area pointed to by \p offset bytes
 * from the start of symbol \p symbol to the memory area pointed to by \p dst.
 * The memory areas may not overlap. \p symbol is a variable that
 * resides in global or constant memory space. \p kind can be either
 * ::cudaMemcpyDeviceToHost or ::cudaMemcpyDeviceToDevice.
 *
 * @param dst    - Destination memory address
 * @param symbol - Device symbol address
 * @param count  - Size in bytes to copy
 * @param offset - Offset from start of symbol in bytes
 * @param kind   - Type of transfer
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidSymbol,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_sync
 * \note_string_api_deprecation
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyFromSymbol(Pointer dst, @Const Pointer symbol, @Cast("size_t") long count, @Cast("size_t") long offset/*=0*/, @Cast("cudaMemcpyKind") int kind/*=cudaMemcpyDeviceToHost*/);
public static native @Cast("cudaError_t") int cudaMemcpyFromSymbol(Pointer dst, @Const Pointer symbol, @Cast("size_t") long count);


/**
 * \brief Copies data between host and device
 *
 * Copies \p count bytes from the memory area pointed to by \p src to the
 * memory area pointed to by \p dst, where \p kind is one of
 * ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost,
 * or ::cudaMemcpyDeviceToDevice, and specifies the direction of the copy. The
 * memory areas may not overlap. Calling ::cudaMemcpyAsync() with \p dst and
 * \p src pointers that do not match the direction of the copy results in an
 * undefined behavior.
 *
 * ::cudaMemcpyAsync() is asynchronous with respect to the host, so the call
 * may return before the copy is complete. The copy can optionally be
 * associated to a stream by passing a non-zero \p stream argument. If \p kind
 * is ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToHost and the \p stream is
 * non-zero, the copy may overlap with operations in other streams.
 *
 * The device version of this function only handles device to device copies and
 * cannot be given local or shared pointers.
 *
 * @param dst    - Destination memory address
 * @param src    - Source memory address
 * @param count  - Size in bytes to copy
 * @param kind   - Type of transfer
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyAsync(Pointer dst, @Const Pointer src, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpyAsync(Pointer dst, @Const Pointer src, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies memory between two devices asynchronously.
 *
 * Copies memory from one device to memory on another device.  \p dst is the 
 * base device pointer of the destination memory and \p dstDevice is the 
 * destination device.  \p src is the base device pointer of the source memory 
 * and \p srcDevice is the source device.  \p count specifies the number of bytes 
 * to copy.
 *
 * Note that this function is asynchronous with respect to the host and all work
 * on other devices.
 *
 * @param dst       - Destination device pointer
 * @param dstDevice - Destination device
 * @param src       - Source device pointer
 * @param srcDevice - Source device
 * @param count     - Size of memory copy in bytes
 * @param stream    - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpyPeer, ::cudaMemcpyAsync,
 * ::cudaMemcpy3DPeerAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyPeerAsync(Pointer dst, int dstDevice, @Const Pointer src, int srcDevice, @Cast("size_t") long count, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpyPeerAsync(Pointer dst, int dstDevice, @Const Pointer src, int srcDevice, @Cast("size_t") long count);

/**
 * \brief Copies data between host and device
 *
 * Copies \p count bytes from the memory area pointed to by \p src to the
 * CUDA array \p dst starting at the upper left corner
 * (\p wOffset, \p hOffset), where \p kind is one of ::cudaMemcpyHostToHost,
 * ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost, or
 * ::cudaMemcpyDeviceToDevice, and specifies the direction of the copy.
 *
 * ::cudaMemcpyToArrayAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally
 * be associated to a stream by passing a non-zero \p stream argument. If \p
 * kind is ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToHost and \p stream
 * is non-zero, the copy may overlap with operations in other streams.
 *
 * @param dst     - Destination memory address
 * @param wOffset - Destination starting X offset
 * @param hOffset - Destination starting Y offset
 * @param src     - Source memory address
 * @param count   - Size in bytes to copy
 * @param kind    - Type of transfer
 * @param stream  - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyToArrayAsync(cudaArray dst, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Const Pointer src, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpyToArrayAsync(cudaArray dst, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Const Pointer src, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies \p count bytes from the CUDA array \p src starting at the upper
 * left corner (\p wOffset, hOffset) to the memory area pointed to by \p dst,
 * where \p kind is one of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy.
 *
 * ::cudaMemcpyFromArrayAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally
 * be associated to a stream by passing a non-zero \p stream argument. If \p
 * kind is ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToHost and \p stream
 * is non-zero, the copy may overlap with operations in other streams.
 *
 * @param dst     - Destination memory address
 * @param src     - Source memory address
 * @param wOffset - Source starting X offset
 * @param hOffset - Source starting Y offset
 * @param count   - Size in bytes to copy
 * @param kind    - Type of transfer
 * @param stream  - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyFromArrayAsync(Pointer dst, cudaArray src, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpyFromArrayAsync(Pointer dst, cudaArray src, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Cast("size_t") long count, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies a matrix (\p height rows of \p width bytes each) from the memory
 * area pointed to by \p src to the memory area pointed to by \p dst, where
 * \p kind is one of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy. \p dpitch and \p spitch are the widths in memory in
 * bytes of the 2D arrays pointed to by \p dst and \p src, including any
 * padding added to the end of each row. The memory areas may not overlap.
 * \p width must not exceed either \p dpitch or \p spitch.
 * Calling ::cudaMemcpy2DAsync() with \p dst and \p src pointers that do not
 * match the direction of the copy results in an undefined behavior.
 * ::cudaMemcpy2DAsync() returns an error if \p dpitch or \p spitch is greater
 * than the maximum allowed.
 *
 * ::cudaMemcpy2DAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally
 * be associated to a stream by passing a non-zero \p stream argument. If
 * \p kind is ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToHost and
 * \p stream is non-zero, the copy may overlap with operations in other
 * streams.
 *
 * The device version of this function only handles device to device copies and
 * cannot be given local or shared pointers.
 *
 * @param dst    - Destination memory address
 * @param dpitch - Pitch of destination memory
 * @param src    - Source memory address
 * @param spitch - Pitch of source memory
 * @param width  - Width of matrix transfer (columns in bytes)
 * @param height - Height of matrix transfer (rows)
 * @param kind   - Type of transfer
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy2DAsync(Pointer dst, @Cast("size_t") long dpitch, @Const Pointer src, @Cast("size_t") long spitch, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpy2DAsync(Pointer dst, @Cast("size_t") long dpitch, @Const Pointer src, @Cast("size_t") long spitch, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies a matrix (\p height rows of \p width bytes each) from the memory
 * area pointed to by \p src to the CUDA array \p dst starting at the
 * upper left corner (\p wOffset, \p hOffset) where \p kind is one of
 * ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice, ::cudaMemcpyDeviceToHost,
 * or ::cudaMemcpyDeviceToDevice, and specifies the direction of the copy.
 * \p spitch is the width in memory in bytes of the 2D array pointed to by
 * \p src, including any padding added to the end of each row. \p wOffset +
 * \p width must not exceed the width of the CUDA array \p dst. \p width must
 * not exceed \p spitch. ::cudaMemcpy2DToArrayAsync() returns an error if
 * \p spitch exceeds the maximum allowed.
 *
 * ::cudaMemcpy2DToArrayAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally
 * be associated to a stream by passing a non-zero \p stream argument. If
 * \p kind is ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToHost and
 * \p stream is non-zero, the copy may overlap with operations in other
 * streams.
 *
 * @param dst     - Destination memory address
 * @param wOffset - Destination starting X offset
 * @param hOffset - Destination starting Y offset
 * @param src     - Source memory address
 * @param spitch  - Pitch of source memory
 * @param width   - Width of matrix transfer (columns in bytes)
 * @param height  - Height of matrix transfer (rows)
 * @param kind    - Type of transfer
 * @param stream  - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy2DToArrayAsync(cudaArray dst, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Const Pointer src, @Cast("size_t") long spitch, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpy2DToArrayAsync(cudaArray dst, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Const Pointer src, @Cast("size_t") long spitch, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data between host and device
 *
 * Copies a matrix (\p height rows of \p width bytes each) from the CUDA
 * array \p srcArray starting at the upper left corner
 * (\p wOffset, \p hOffset) to the memory area pointed to by \p dst, where
 * \p kind is one of ::cudaMemcpyHostToHost, ::cudaMemcpyHostToDevice,
 * ::cudaMemcpyDeviceToHost, or ::cudaMemcpyDeviceToDevice, and specifies the
 * direction of the copy. \p dpitch is the width in memory in bytes of the 2D
 * array pointed to by \p dst, including any padding added to the end of each
 * row. \p wOffset + \p width must not exceed the width of the CUDA array
 * \p src. \p width must not exceed \p dpitch. ::cudaMemcpy2DFromArrayAsync()
 * returns an error if \p dpitch exceeds the maximum allowed.
 *
 * ::cudaMemcpy2DFromArrayAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally be
 * associated to a stream by passing a non-zero \p stream argument. If \p kind
 * is ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToHost and \p stream is
 * non-zero, the copy may overlap with operations in other streams.
 *
 * @param dst     - Destination memory address
 * @param dpitch  - Pitch of destination memory
 * @param src     - Source memory address
 * @param wOffset - Source starting X offset
 * @param hOffset - Source starting Y offset
 * @param width   - Width of matrix transfer (columns in bytes)
 * @param height  - Height of matrix transfer (rows)
 * @param kind    - Type of transfer
 * @param stream  - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidPitchValue,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync, ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpy2DFromArrayAsync(Pointer dst, @Cast("size_t") long dpitch, cudaArray src, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpy2DFromArrayAsync(Pointer dst, @Cast("size_t") long dpitch, cudaArray src, @Cast("size_t") long wOffset, @Cast("size_t") long hOffset, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data to the given symbol on the device
 *
 * Copies \p count bytes from the memory area pointed to by \p src
 * to the memory area pointed to by \p offset bytes from the start of symbol
 * \p symbol. The memory areas may not overlap. \p symbol is a variable that
 * resides in global or constant memory space. \p kind can be either
 * ::cudaMemcpyHostToDevice or ::cudaMemcpyDeviceToDevice.
 *
 * ::cudaMemcpyToSymbolAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally
 * be associated to a stream by passing a non-zero \p stream argument. If
 * \p kind is ::cudaMemcpyHostToDevice and \p stream is non-zero, the copy
 * may overlap with operations in other streams.
 *
 * @param symbol - Device symbol address
 * @param src    - Source memory address
 * @param count  - Size in bytes to copy
 * @param offset - Offset from start of symbol in bytes
 * @param kind   - Type of transfer
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidSymbol,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 * \note_string_api_deprecation
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyFromSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyToSymbolAsync(@Const Pointer symbol, @Const Pointer src, @Cast("size_t") long count, @Cast("size_t") long offset, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpyToSymbolAsync(@Const Pointer symbol, @Const Pointer src, @Cast("size_t") long count, @Cast("size_t") long offset, @Cast("cudaMemcpyKind") int kind);

/**
 * \brief Copies data from the given symbol on the device
 *
 * Copies \p count bytes from the memory area pointed to by \p offset bytes
 * from the start of symbol \p symbol to the memory area pointed to by \p dst.
 * The memory areas may not overlap. \p symbol is a variable that resides in
 * global or constant memory space. \p kind can be either
 * ::cudaMemcpyDeviceToHost or ::cudaMemcpyDeviceToDevice.
 *
 * ::cudaMemcpyFromSymbolAsync() is asynchronous with respect to the host, so
 * the call may return before the copy is complete. The copy can optionally be
 * associated to a stream by passing a non-zero \p stream argument. If \p kind
 * is ::cudaMemcpyDeviceToHost and \p stream is non-zero, the copy may overlap
 * with operations in other streams.
 *
 * @param dst    - Destination memory address
 * @param symbol - Device symbol address
 * @param count  - Size in bytes to copy
 * @param offset - Offset from start of symbol in bytes
 * @param kind   - Type of transfer
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidSymbol,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidMemcpyDirection
 * \notefnerr
 * \note_async
 * \note_null_stream
 * \note_string_api_deprecation
 *
 * \sa ::cudaMemcpy, ::cudaMemcpy2D, ::cudaMemcpyToArray,
 * ::cudaMemcpy2DToArray, ::cudaMemcpyFromArray, ::cudaMemcpy2DFromArray,
 * ::cudaMemcpyArrayToArray, ::cudaMemcpy2DArrayToArray, ::cudaMemcpyToSymbol,
 * ::cudaMemcpyFromSymbol, ::cudaMemcpyAsync, ::cudaMemcpy2DAsync,
 * ::cudaMemcpyToArrayAsync, ::cudaMemcpy2DToArrayAsync,
 * ::cudaMemcpyFromArrayAsync, ::cudaMemcpy2DFromArrayAsync,
 * ::cudaMemcpyToSymbolAsync
 */
public static native @Cast("cudaError_t") int cudaMemcpyFromSymbolAsync(Pointer dst, @Const Pointer symbol, @Cast("size_t") long count, @Cast("size_t") long offset, @Cast("cudaMemcpyKind") int kind, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemcpyFromSymbolAsync(Pointer dst, @Const Pointer symbol, @Cast("size_t") long count, @Cast("size_t") long offset, @Cast("cudaMemcpyKind") int kind);


/**
 * \brief Initializes or sets device memory to a value
 *
 * Fills the first \p count bytes of the memory area pointed to by \p devPtr
 * with the constant byte value \p value.
 *
 * Note that this function is asynchronous with respect to the host unless
 * \p devPtr refers to pinned host memory.
 *
 * @param devPtr - Pointer to device memory
 * @param value  - Value to set for each byte of specified memory
 * @param count  - Size in bytes to set
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer
 * \notefnerr
 * \note_memset
 *
 * \sa ::cudaMemset2D, ::cudaMemset3D, ::cudaMemsetAsync,
 * ::cudaMemset2DAsync, ::cudaMemset3DAsync
 */
public static native @Cast("cudaError_t") int cudaMemset(Pointer devPtr, int value, @Cast("size_t") long count);

/**
 * \brief Initializes or sets device memory to a value
 *
 * Sets to the specified value \p value a matrix (\p height rows of \p width
 * bytes each) pointed to by \p dstPtr. \p pitch is the width in bytes of the
 * 2D array pointed to by \p dstPtr, including any padding added to the end
 * of each row. This function performs fastest when the pitch is one that has
 * been passed back by ::cudaMallocPitch().
 *
 * Note that this function is asynchronous with respect to the host unless
 * \p devPtr refers to pinned host memory.
 *
 * @param devPtr - Pointer to 2D device memory
 * @param pitch  - Pitch in bytes of 2D device memory
 * @param value  - Value to set for each byte of specified memory
 * @param width  - Width of matrix set (columns in bytes)
 * @param height - Height of matrix set (rows)
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer
 * \notefnerr
 * \note_memset
 *
 * \sa ::cudaMemset, ::cudaMemset3D, ::cudaMemsetAsync,
 * ::cudaMemset2DAsync, ::cudaMemset3DAsync
 */
public static native @Cast("cudaError_t") int cudaMemset2D(Pointer devPtr, @Cast("size_t") long pitch, int value, @Cast("size_t") long width, @Cast("size_t") long height);

/**
 * \brief Initializes or sets device memory to a value
 *
 * Initializes each element of a 3D array to the specified value \p value.
 * The object to initialize is defined by \p pitchedDevPtr. The \p pitch field
 * of \p pitchedDevPtr is the width in memory in bytes of the 3D array pointed
 * to by \p pitchedDevPtr, including any padding added to the end of each row.
 * The \p xsize field specifies the logical width of each row in bytes, while
 * the \p ysize field specifies the height of each 2D slice in rows.
 *
 * The extents of the initialized region are specified as a \p width in bytes,
 * a \p height in rows, and a \p depth in slices.
 *
 * Extents with \p width greater than or equal to the \p xsize of
 * \p pitchedDevPtr may perform significantly faster than extents narrower
 * than the \p xsize. Secondarily, extents with \p height equal to the
 * \p ysize of \p pitchedDevPtr will perform faster than when the \p height is
 * shorter than the \p ysize.
 *
 * This function performs fastest when the \p pitchedDevPtr has been allocated
 * by ::cudaMalloc3D().
 *
 * Note that this function is asynchronous with respect to the host unless
 * \p pitchedDevPtr refers to pinned host memory.
 *
 * @param pitchedDevPtr - Pointer to pitched device memory
 * @param value         - Value to set for each byte of specified memory
 * @param extent        - Size parameters for where to set device memory (\p width field in bytes)
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer
 * \notefnerr
 * \note_memset
 *
 * \sa ::cudaMemset, ::cudaMemset2D,
 * ::cudaMemsetAsync, ::cudaMemset2DAsync, ::cudaMemset3DAsync,
 * ::cudaMalloc3D, ::make_cudaPitchedPtr,
 * ::make_cudaExtent
 */
public static native @Cast("cudaError_t") int cudaMemset3D(@ByVal cudaPitchedPtr pitchedDevPtr, int value, @ByVal cudaExtent extent);

/**
 * \brief Initializes or sets device memory to a value
 *
 * Fills the first \p count bytes of the memory area pointed to by \p devPtr
 * with the constant byte value \p value.
 *
 * ::cudaMemsetAsync() is asynchronous with respect to the host, so
 * the call may return before the memset is complete. The operation can optionally
 * be associated to a stream by passing a non-zero \p stream argument.
 * If \p stream is non-zero, the operation may overlap with operations in other streams.
 *
 * The device version of this function only handles device to device copies and
 * cannot be given local or shared pointers.
 *
 * @param devPtr - Pointer to device memory
 * @param value  - Value to set for each byte of specified memory
 * @param count  - Size in bytes to set
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cudaMemset, ::cudaMemset2D, ::cudaMemset3D,
 * ::cudaMemset2DAsync, ::cudaMemset3DAsync
 */
public static native @Cast("cudaError_t") int cudaMemsetAsync(Pointer devPtr, int value, @Cast("size_t") long count, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemsetAsync(Pointer devPtr, int value, @Cast("size_t") long count);

/**
 * \brief Initializes or sets device memory to a value
 *
 * Sets to the specified value \p value a matrix (\p height rows of \p width
 * bytes each) pointed to by \p dstPtr. \p pitch is the width in bytes of the
 * 2D array pointed to by \p dstPtr, including any padding added to the end
 * of each row. This function performs fastest when the pitch is one that has
 * been passed back by ::cudaMallocPitch().
 *
 * ::cudaMemset2DAsync() is asynchronous with respect to the host, so
 * the call may return before the memset is complete. The operation can optionally
 * be associated to a stream by passing a non-zero \p stream argument.
 * If \p stream is non-zero, the operation may overlap with operations in other streams.
 *
 * The device version of this function only handles device to device copies and
 * cannot be given local or shared pointers.
 *
 * @param devPtr - Pointer to 2D device memory
 * @param pitch  - Pitch in bytes of 2D device memory
 * @param value  - Value to set for each byte of specified memory
 * @param width  - Width of matrix set (columns in bytes)
 * @param height - Height of matrix set (rows)
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cudaMemset, ::cudaMemset2D, ::cudaMemset3D,
 * ::cudaMemsetAsync, ::cudaMemset3DAsync
 */
public static native @Cast("cudaError_t") int cudaMemset2DAsync(Pointer devPtr, @Cast("size_t") long pitch, int value, @Cast("size_t") long width, @Cast("size_t") long height, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemset2DAsync(Pointer devPtr, @Cast("size_t") long pitch, int value, @Cast("size_t") long width, @Cast("size_t") long height);

/**
 * \brief Initializes or sets device memory to a value
 *
 * Initializes each element of a 3D array to the specified value \p value.
 * The object to initialize is defined by \p pitchedDevPtr. The \p pitch field
 * of \p pitchedDevPtr is the width in memory in bytes of the 3D array pointed
 * to by \p pitchedDevPtr, including any padding added to the end of each row.
 * The \p xsize field specifies the logical width of each row in bytes, while
 * the \p ysize field specifies the height of each 2D slice in rows.
 *
 * The extents of the initialized region are specified as a \p width in bytes,
 * a \p height in rows, and a \p depth in slices.
 *
 * Extents with \p width greater than or equal to the \p xsize of
 * \p pitchedDevPtr may perform significantly faster than extents narrower
 * than the \p xsize. Secondarily, extents with \p height equal to the
 * \p ysize of \p pitchedDevPtr will perform faster than when the \p height is
 * shorter than the \p ysize.
 *
 * This function performs fastest when the \p pitchedDevPtr has been allocated
 * by ::cudaMalloc3D().
 *
 * ::cudaMemset3DAsync() is asynchronous with respect to the host, so
 * the call may return before the memset is complete. The operation can optionally
 * be associated to a stream by passing a non-zero \p stream argument.
 * If \p stream is non-zero, the operation may overlap with operations in other streams.
 *
 * The device version of this function only handles device to device copies and
 * cannot be given local or shared pointers.
 *
 * @param pitchedDevPtr - Pointer to pitched device memory
 * @param value         - Value to set for each byte of specified memory
 * @param extent        - Size parameters for where to set device memory (\p width field in bytes)
 * @param stream - Stream identifier
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer
 * \notefnerr
 * \note_memset
 * \note_null_stream
 *
 * \sa ::cudaMemset, ::cudaMemset2D, ::cudaMemset3D,
 * ::cudaMemsetAsync, ::cudaMemset2DAsync,
 * ::cudaMalloc3D, ::make_cudaPitchedPtr,
 * ::make_cudaExtent
 */
public static native @Cast("cudaError_t") int cudaMemset3DAsync(@ByVal cudaPitchedPtr pitchedDevPtr, int value, @ByVal cudaExtent extent, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaMemset3DAsync(@ByVal cudaPitchedPtr pitchedDevPtr, int value, @ByVal cudaExtent extent);

/**
 * \brief Finds the address associated with a CUDA symbol
 *
 * Returns in \p *devPtr the address of symbol \p symbol on the device.
 * \p symbol is a variable that resides in global or constant memory space.
 * If \p symbol cannot be found, or if \p symbol is not declared in the
 * global or constant memory space, \p *devPtr is unchanged and the error
 * ::cudaErrorInvalidSymbol is returned.
 *
 * @param devPtr - Return device pointer associated with symbol
 * @param symbol - Device symbol address
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidSymbol
 * \notefnerr
 * \note_string_api_deprecation
 *
 * \sa \ref ::cudaGetSymbolAddress(void**, const T&) "cudaGetSymbolAddress (C++ API)",
 * \ref ::cudaGetSymbolSize(size_t*, const void*) "cudaGetSymbolSize (C API)"
 */
public static native @Cast("cudaError_t") int cudaGetSymbolAddress(@Cast("void**") PointerPointer devPtr, @Const Pointer symbol);
public static native @Cast("cudaError_t") int cudaGetSymbolAddress(@Cast("void**") @ByPtrPtr Pointer devPtr, @Const Pointer symbol);

/**
 * \brief Finds the size of the object associated with a CUDA symbol
 *
 * Returns in \p *size the size of symbol \p symbol. \p symbol is a variable that
 * resides in global or constant memory space. If \p symbol cannot be found, or
 * if \p symbol is not declared in global or constant memory space, \p *size is
 * unchanged and the error ::cudaErrorInvalidSymbol is returned.
 *
 * @param size   - Size of object associated with symbol
 * @param symbol - Device symbol address
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidSymbol
 * \notefnerr
 * \note_string_api_deprecation
 *
 * \sa \ref ::cudaGetSymbolAddress(void**, const void*) "cudaGetSymbolAddress (C API)",
 * \ref ::cudaGetSymbolSize(size_t*, const T&) "cudaGetSymbolSize (C++ API)"
 */
public static native @Cast("cudaError_t") int cudaGetSymbolSize(@Cast("size_t*") SizeTPointer size, @Const Pointer symbol);

/** \} */ /* END CUDART_MEMORY */

/**
 * \defgroup CUDART_UNIFIED Unified Addressing
 *
 * ___MANBRIEF___ unified addressing functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the unified addressing functions of the CUDA 
 * runtime application programming interface.
 *
 * \{
 *
 * \section CUDART_UNIFIED_overview Overview
 *
 * CUDA devices can share a unified address space with the host.  
 * For these devices there is no distinction between a device
 * pointer and a host pointer -- the same pointer value may be 
 * used to access memory from the host program and from a kernel 
 * running on the device (with exceptions enumerated below).
 *
 * \section CUDART_UNIFIED_support Supported Platforms
 * 
 * Whether or not a device supports unified addressing may be 
 * queried by calling ::cudaGetDeviceProperties() with the device 
 * property ::cudaDeviceProp::unifiedAddressing.
 *
 * Unified addressing is automatically enabled in 64-bit processes .
 *
 * Unified addressing is not yet supported on Windows Vista or
 * Windows 7 for devices that do not use the TCC driver model.
 *
 * \section CUDART_UNIFIED_lookup Looking Up Information from Pointer Values
 *
 * It is possible to look up information about the memory which backs a 
 * pointer value.  For instance, one may want to know if a pointer points
 * to host or device memory.  As another example, in the case of device 
 * memory, one may want to know on which CUDA device the memory 
 * resides.  These properties may be queried using the function 
 * ::cudaPointerGetAttributes()
 *
 * Since pointers are unique, it is not necessary to specify information
 * about the pointers specified to ::cudaMemcpy() and other copy functions.  
 * The copy direction ::cudaMemcpyDefault may be used to specify that the 
 * CUDA runtime should infer the location of the pointer from its value.
 *
 * \section CUDART_UNIFIED_automaphost Automatic Mapping of Host Allocated Host Memory
 *
 * All host memory allocated through all devices using ::cudaMallocHost() and
 * ::cudaHostAlloc() is always directly accessible from all devices that 
 * support unified addressing.  This is the case regardless of whether or 
 * not the flags ::cudaHostAllocPortable and ::cudaHostAllocMapped are 
 * specified.
 *
 * The pointer value through which allocated host memory may be accessed 
 * in kernels on all devices that support unified addressing is the same 
 * as the pointer value through which that memory is accessed on the host.
 * It is not necessary to call ::cudaHostGetDevicePointer() to get the device 
 * pointer for these allocations.  
 *
 * Note that this is not the case for memory allocated using the flag
 * ::cudaHostAllocWriteCombined, as discussed below.
 *
 * \section CUDART_UNIFIED_autopeerregister Direct Access of Peer Memory
 
 * Upon enabling direct access from a device that supports unified addressing 
 * to another peer device that supports unified addressing using 
 * ::cudaDeviceEnablePeerAccess() all memory allocated in the peer device using 
 * ::cudaMalloc() and ::cudaMallocPitch() will immediately be accessible 
 * by the current device.  The device pointer value through 
 * which any peer's memory may be accessed in the current device 
 * is the same pointer value through which that memory may be 
 * accessed from the peer device. 
 *
 * \section CUDART_UNIFIED_exceptions Exceptions, Disjoint Addressing
 * 
 * Not all memory may be accessed on devices through the same pointer
 * value through which they are accessed on the host.  These exceptions
 * are host memory registered using ::cudaHostRegister() and host memory
 * allocated using the flag ::cudaHostAllocWriteCombined.  For these 
 * exceptions, there exists a distinct host and device address for the
 * memory.  The device address is guaranteed to not overlap any valid host
 * pointer range and is guaranteed to have the same value across all devices
 * that support unified addressing.  
 * 
 * This device address may be queried using ::cudaHostGetDevicePointer() 
 * when a device using unified addressing is current.  Either the host 
 * or the unified device pointer value may be used to refer to this memory 
 * in ::cudaMemcpy() and similar functions using the ::cudaMemcpyDefault 
 * memory direction.
 *
 */

/**
 * \brief Returns attributes about a specified pointer
 *
 * Returns in \p *attributes the attributes of the pointer \p ptr.
 * If pointer was not allocated in, mapped by or registered with context
 * supporting unified addressing ::cudaErrorInvalidValue is returned.
 *
 * The ::cudaPointerAttributes structure is defined as:
 * <pre>{@code
    struct cudaPointerAttributes {
        enum cudaMemoryType memoryType;
        int device;
        void *devicePointer;
        void *hostPointer;
        int isManaged;
    }
    }</pre>
 * In this structure, the individual fields mean
 *
 * - \ref ::cudaPointerAttributes::memoryType "memoryType" identifies the physical 
 *   location of the memory associated with pointer \p ptr.  It can be
 *   ::cudaMemoryTypeHost for host memory or ::cudaMemoryTypeDevice for device
 *   memory.
 *
 * - \ref ::cudaPointerAttributes::device "device" is the device against which
 *   \p ptr was allocated.  If \p ptr has memory type ::cudaMemoryTypeDevice
 *   then this identifies the device on which the memory referred to by \p ptr
 *   physically resides.  If \p ptr has memory type ::cudaMemoryTypeHost then this
 *   identifies the device which was current when the allocation was made
 *   (and if that device is deinitialized then this allocation will vanish
 *   with that device's state).
 *
 * - \ref ::cudaPointerAttributes::devicePointer "devicePointer" is
 *   the device pointer alias through which the memory referred to by \p ptr
 *   may be accessed on the current device.
 *   If the memory referred to by \p ptr cannot be accessed directly by the 
 *   current device then this is NULL.  
 *
 * - \ref ::cudaPointerAttributes::hostPointer "hostPointer" is
 *   the host pointer alias through which the memory referred to by \p ptr
 *   may be accessed on the host.
 *   If the memory referred to by \p ptr cannot be accessed directly by the
 *   host then this is NULL.
 *
 * - \ref ::cudaPointerAttributes::isManaged "isManaged" indicates if
 *   the pointer \p ptr points to managed memory or not.
 *
 * @param attributes - Attributes for the specified pointer
 * @param ptr        - Pointer to get attributes for
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaGetDeviceCount, ::cudaGetDevice, ::cudaSetDevice,
 * ::cudaChooseDevice
 */
public static native @Cast("cudaError_t") int cudaPointerGetAttributes(cudaPointerAttributes attributes, @Const Pointer ptr);

/** \} */ /* END CUDART_UNIFIED */

/**
 * \defgroup CUDART_PEER Peer Device Memory Access
 *
 * ___MANBRIEF___ peer device memory access functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the peer device memory access functions of the CUDA runtime
 * application programming interface.
 *
 * \{
 */

/**
 * \brief Queries if a device may directly access a peer device's memory.
 *
 * Returns in \p *canAccessPeer a value of 1 if device \p device is capable of
 * directly accessing memory from \p peerDevice and 0 otherwise.  If direct
 * access of \p peerDevice from \p device is possible, then access may be
 * enabled by calling ::cudaDeviceEnablePeerAccess().
 *
 * @param canAccessPeer - Returned access capability
 * @param device        - Device from which allocations on \p peerDevice are to
 *                        be directly accessed.
 * @param peerDevice    - Device on which the allocations to be directly accessed 
 *                        by \p device reside.
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 *
 * \sa ::cudaDeviceEnablePeerAccess,
 * ::cudaDeviceDisablePeerAccess
 */
public static native @Cast("cudaError_t") int cudaDeviceCanAccessPeer(IntPointer canAccessPeer, int device, int peerDevice);
public static native @Cast("cudaError_t") int cudaDeviceCanAccessPeer(IntBuffer canAccessPeer, int device, int peerDevice);
public static native @Cast("cudaError_t") int cudaDeviceCanAccessPeer(int[] canAccessPeer, int device, int peerDevice);

/**
 * \brief Enables direct access to memory allocations on a peer device.
 *
 * On success, all allocations from \p peerDevice will immediately be accessible by
 * the current device.  They will remain accessible until access is explicitly
 * disabled using ::cudaDeviceDisablePeerAccess() or either device is reset using
 * ::cudaDeviceReset().
 *
 * Note that access granted by this call is unidirectional and that in order to access
 * memory on the current device from \p peerDevice, a separate symmetric call 
 * to ::cudaDeviceEnablePeerAccess() is required.
 *
 * Each device can support a system-wide maximum of eight peer connections.
 *
 * Peer access is not supported in 32 bit applications.
 *
 * Returns ::cudaErrorInvalidDevice if ::cudaDeviceCanAccessPeer() indicates
 * that the current device cannot directly access memory from \p peerDevice.
 *
 * Returns ::cudaErrorPeerAccessAlreadyEnabled if direct access of
 * \p peerDevice from the current device has already been enabled.
 *
 * Returns ::cudaErrorInvalidValue if \p flags is not 0.
 *
 * @param peerDevice  - Peer device to enable direct access to from the current device
 * @param flags       - Reserved for future use and must be set to 0
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidDevice,
 * ::cudaErrorPeerAccessAlreadyEnabled,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaDeviceCanAccessPeer,
 * ::cudaDeviceDisablePeerAccess
 */
public static native @Cast("cudaError_t") int cudaDeviceEnablePeerAccess(int peerDevice, @Cast("unsigned int") int flags);

/**
 * \brief Disables direct access to memory allocations on a peer device.
 *
 * Returns ::cudaErrorPeerAccessNotEnabled if direct access to memory on
 * \p peerDevice has not yet been enabled from the current device.
 *
 * @param peerDevice - Peer device to disable direct access to
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorPeerAccessNotEnabled,
 * ::cudaErrorInvalidDevice
 * \notefnerr
 *
 * \sa ::cudaDeviceCanAccessPeer,
 * ::cudaDeviceEnablePeerAccess
 */
public static native @Cast("cudaError_t") int cudaDeviceDisablePeerAccess(int peerDevice);

/** \} */ /* END CUDART_PEER */

/** \defgroup CUDART_OPENGL OpenGL Interoperability */

/** \defgroup CUDART_OPENGL_DEPRECATED OpenGL Interoperability [DEPRECATED] */

/** \defgroup CUDART_D3D9 Direct3D 9 Interoperability */

/** \defgroup CUDART_D3D9_DEPRECATED Direct3D 9 Interoperability [DEPRECATED] */

/** \defgroup CUDART_D3D10 Direct3D 10 Interoperability */

/** \defgroup CUDART_D3D10_DEPRECATED Direct3D 10 Interoperability [DEPRECATED] */

/** \defgroup CUDART_D3D11 Direct3D 11 Interoperability */

/** \defgroup CUDART_D3D11_DEPRECATED Direct3D 11 Interoperability [DEPRECATED] */

/** \defgroup CUDART_VDPAU VDPAU Interoperability */

/**
 * \defgroup CUDART_INTEROP Graphics Interoperability
 *
 * ___MANBRIEF___ graphics interoperability functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the graphics interoperability functions of the CUDA
 * runtime application programming interface.
 *
 * \{
 */

/**
 * \brief Unregisters a graphics resource for access by CUDA
 *
 * Unregisters the graphics resource \p resource so it is not accessible by
 * CUDA unless registered again.
 *
 * If \p resource is invalid then ::cudaErrorInvalidResourceHandle is
 * returned.
 *
 * @param resource - Resource to unregister
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorUnknown
 * \notefnerr
 *
 * \sa
 * ::cudaGraphicsD3D9RegisterResource,
 * ::cudaGraphicsD3D10RegisterResource,
 * ::cudaGraphicsD3D11RegisterResource,
 * ::cudaGraphicsGLRegisterBuffer,
 * ::cudaGraphicsGLRegisterImage
 */
public static native @Cast("cudaError_t") int cudaGraphicsUnregisterResource(cudaGraphicsResource resource);

/**
 * \brief Set usage flags for mapping a graphics resource
 *
 * Set \p flags for mapping the graphics resource \p resource.
 *
 * Changes to \p flags will take effect the next time \p resource is mapped.
 * The \p flags argument may be any of the following:
 * - ::cudaGraphicsMapFlagsNone: Specifies no hints about how \p resource will
 *     be used. It is therefore assumed that CUDA may read from or write to \p resource.
 * - ::cudaGraphicsMapFlagsReadOnly: Specifies that CUDA will not write to \p resource.
 * - ::cudaGraphicsMapFlagsWriteDiscard: Specifies CUDA will not read from \p resource and will
 *   write over the entire contents of \p resource, so none of the data
 *   previously stored in \p resource will be preserved.
 *
 * If \p resource is presently mapped for access by CUDA then ::cudaErrorUnknown is returned.
 * If \p flags is not one of the above values then ::cudaErrorInvalidValue is returned.
 *
 * @param resource - Registered resource to set flags for
 * @param flags    - Parameters for resource mapping
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorUnknown,
 * \notefnerr
 *
 * \sa
 * ::cudaGraphicsMapResources
 */
public static native @Cast("cudaError_t") int cudaGraphicsResourceSetMapFlags(cudaGraphicsResource resource, @Cast("unsigned int") int flags);

/**
 * \brief Map graphics resources for access by CUDA
 *
 * Maps the \p count graphics resources in \p resources for access by CUDA.
 *
 * The resources in \p resources may be accessed by CUDA until they
 * are unmapped. The graphics API from which \p resources were registered
 * should not access any resources while they are mapped by CUDA. If an
 * application does so, the results are undefined.
 *
 * This function provides the synchronization guarantee that any graphics calls
 * issued before ::cudaGraphicsMapResources() will complete before any subsequent CUDA
 * work issued in \p stream begins.
 *
 * If \p resources contains any duplicate entries then ::cudaErrorInvalidResourceHandle
 * is returned. If any of \p resources are presently mapped for access by
 * CUDA then ::cudaErrorUnknown is returned.
 *
 * @param count     - Number of resources to map
 * @param resources - Resources to map for CUDA
 * @param stream    - Stream for synchronization
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorUnknown
 * \note_null_stream
 * \notefnerr
 *
 * \sa
 * ::cudaGraphicsResourceGetMappedPointer,
 * ::cudaGraphicsSubResourceGetMappedArray,
 * ::cudaGraphicsUnmapResources
 */
public static native @Cast("cudaError_t") int cudaGraphicsMapResources(int count, @ByPtrPtr cudaGraphicsResource resources, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaGraphicsMapResources(int count, @ByPtrPtr cudaGraphicsResource resources);

/**
 * \brief Unmap graphics resources.
 *
 * Unmaps the \p count graphics resources in \p resources.
 *
 * Once unmapped, the resources in \p resources may not be accessed by CUDA
 * until they are mapped again.
 *
 * This function provides the synchronization guarantee that any CUDA work issued
 * in \p stream before ::cudaGraphicsUnmapResources() will complete before any
 * subsequently issued graphics work begins.
 *
 * If \p resources contains any duplicate entries then ::cudaErrorInvalidResourceHandle
 * is returned. If any of \p resources are not presently mapped for access by
 * CUDA then ::cudaErrorUnknown is returned.
 *
 * @param count     - Number of resources to unmap
 * @param resources - Resources to unmap
 * @param stream    - Stream for synchronization
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorUnknown
 * \note_null_stream
 * \notefnerr
 *
 * \sa
 * ::cudaGraphicsMapResources
 */
public static native @Cast("cudaError_t") int cudaGraphicsUnmapResources(int count, @ByPtrPtr cudaGraphicsResource resources, CUstream_st stream/*=0*/);
public static native @Cast("cudaError_t") int cudaGraphicsUnmapResources(int count, @ByPtrPtr cudaGraphicsResource resources);

/**
 * \brief Get an device pointer through which to access a mapped graphics resource.
 *
 * Returns in \p *devPtr a pointer through which the mapped graphics resource
 * \p resource may be accessed.
 * Returns in \p *size the size of the memory in bytes which may be accessed from that pointer.
 * The value set in \p devPtr may change every time that \p resource is mapped.
 *
 * If \p resource is not a buffer then it cannot be accessed via a pointer and
 * ::cudaErrorUnknown is returned.
 * If \p resource is not mapped then ::cudaErrorUnknown is returned.
 * *
 * @param devPtr     - Returned pointer through which \p resource may be accessed
 * @param size       - Returned size of the buffer accessible starting at \p *devPtr
 * @param resource   - Mapped resource to access
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorUnknown
 * \notefnerr
 *
 * \sa
 * ::cudaGraphicsMapResources,
 * ::cudaGraphicsSubResourceGetMappedArray
 */
public static native @Cast("cudaError_t") int cudaGraphicsResourceGetMappedPointer(@Cast("void**") PointerPointer devPtr, @Cast("size_t*") SizeTPointer size, cudaGraphicsResource resource);
public static native @Cast("cudaError_t") int cudaGraphicsResourceGetMappedPointer(@Cast("void**") @ByPtrPtr Pointer devPtr, @Cast("size_t*") SizeTPointer size, cudaGraphicsResource resource);

/**
 * \brief Get an array through which to access a subresource of a mapped graphics resource.
 *
 * Returns in \p *array an array through which the subresource of the mapped
 * graphics resource \p resource which corresponds to array index \p arrayIndex
 * and mipmap level \p mipLevel may be accessed.  The value set in \p array may
 * change every time that \p resource is mapped.
 *
 * If \p resource is not a texture then it cannot be accessed via an array and
 * ::cudaErrorUnknown is returned.
 * If \p arrayIndex is not a valid array index for \p resource then
 * ::cudaErrorInvalidValue is returned.
 * If \p mipLevel is not a valid mipmap level for \p resource then
 * ::cudaErrorInvalidValue is returned.
 * If \p resource is not mapped then ::cudaErrorUnknown is returned.
 *
 * @param array       - Returned array through which a subresource of \p resource may be accessed
 * @param resource    - Mapped resource to access
 * @param arrayIndex  - Array index for array textures or cubemap face
 *                      index as defined by ::cudaGraphicsCubeFace for
 *                      cubemap textures for the subresource to access
 * @param mipLevel    - Mipmap level for the subresource to access
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorUnknown
 * \notefnerr
 *
 * \sa ::cudaGraphicsResourceGetMappedPointer
 */
public static native @Cast("cudaError_t") int cudaGraphicsSubResourceGetMappedArray(@ByPtrPtr cudaArray array, cudaGraphicsResource resource, @Cast("unsigned int") int arrayIndex, @Cast("unsigned int") int mipLevel);

/**
 * \brief Get a mipmapped array through which to access a mapped graphics resource.
 *
 * Returns in \p *mipmappedArray a mipmapped array through which the mapped
 * graphics resource \p resource may be accessed. The value set in \p mipmappedArray may
 * change every time that \p resource is mapped.
 *
 * If \p resource is not a texture then it cannot be accessed via an array and
 * ::cudaErrorUnknown is returned.
 * If \p resource is not mapped then ::cudaErrorUnknown is returned.
 *
 * @param mipmappedArray - Returned mipmapped array through which \p resource may be accessed
 * @param resource       - Mapped resource to access
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidResourceHandle,
 * ::cudaErrorUnknown
 * \notefnerr
 *
 * \sa ::cudaGraphicsResourceGetMappedPointer
 */
public static native @Cast("cudaError_t") int cudaGraphicsResourceGetMappedMipmappedArray(@ByPtrPtr cudaMipmappedArray mipmappedArray, cudaGraphicsResource resource);

/** \} */ /* END CUDART_INTEROP */

/**
 * \defgroup CUDART_TEXTURE Texture Reference Management
 *
 * ___MANBRIEF___ texture reference management functions of the CUDA runtime
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the low level texture reference management functions
 * of the CUDA runtime application programming interface.
 *
 * Some functions have overloaded C++ API template versions documented separately in the
 * \ref CUDART_HIGHLEVEL "C++ API Routines" module.
 *
 * \{
 */

/**
 * \brief Get the channel descriptor of an array
 *
 * Returns in \p *desc the channel descriptor of the CUDA array \p array.
 *
 * @param desc  - Channel format
 * @param array - Memory array on device
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct textureReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaUnbindTexture (C API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)"
 */
public static native @Cast("cudaError_t") int cudaGetChannelDesc(cudaChannelFormatDesc desc, cudaArray array);

/**
 * \brief Returns a channel descriptor using the specified format
 *
 * Returns a channel descriptor with format \p f and number of bits of each
 * component \p x, \p y, \p z, and \p w.  The ::cudaChannelFormatDesc is
 * defined as:
 * <pre>{@code
  struct cudaChannelFormatDesc {
    int x, y, z, w;
    enum cudaChannelFormatKind f;
  };
 * }</pre>
 *
 * where ::cudaChannelFormatKind is one of ::cudaChannelFormatKindSigned,
 * ::cudaChannelFormatKindUnsigned, or ::cudaChannelFormatKindFloat.
 *
 * @param x - X component
 * @param y - Y component
 * @param z - Z component
 * @param w - W component
 * @param f - Channel format
 *
 * @return
 * Channel descriptor with format \p f
 *
 * \sa \ref ::cudaCreateChannelDesc(void) "cudaCreateChannelDesc (C++ API)",
 * ::cudaGetChannelDesc, ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct textureReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaUnbindTexture (C API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)"
 */
public static native @ByVal cudaChannelFormatDesc cudaCreateChannelDesc(int x, int y, int z, int w, @Cast("cudaChannelFormatKind") int f);


/**
 * \brief Binds a memory area to a texture
 *
 * Binds \p size bytes of the memory area pointed to by \p devPtr to the
 * texture reference \p texref. \p desc describes how the memory is interpreted
 * when fetching values from the texture. Any memory previously bound to
 * \p texref is unbound.
 *
 * Since the hardware enforces an alignment requirement on texture base
 * addresses,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture()"
 * returns in \p *offset a byte offset that
 * must be applied to texture fetches in order to read from the desired memory.
 * This offset must be divided by the texel size and passed to kernels that
 * read from the texture so they can be applied to the ::tex1Dfetch() function.
 * If the device memory pointer was returned from ::cudaMalloc(), the offset is
 * guaranteed to be 0 and NULL may be passed as the \p offset parameter.
 *
 * The total number of elements (or texels) in the linear address range
 * cannot exceed ::cudaDeviceProp::maxTexture1DLinear[0].
 * The number of elements is computed as (\p size / elementSize),
 * where elementSize is determined from \p desc.
 *
 * @param offset - Offset in bytes
 * @param texref - Texture to bind
 * @param devPtr - Memory area on device
 * @param desc   - Channel format
 * @param size   - Size of the memory area pointed to by devPtr
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidTexture
 * \notefnerr
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetChannelDesc, ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct texture< T, dim, readMode>&, const void*, const struct cudaChannelFormatDesc&, size_t) "cudaBindTexture (C++ API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct textureReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaUnbindTexture (C API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)"
 */
public static native @Cast("cudaError_t") int cudaBindTexture(@Cast("size_t*") SizeTPointer offset, @Const textureReference texref, @Const Pointer devPtr, @Const cudaChannelFormatDesc desc, @Cast("size_t") long size/*=UINT_MAX*/);
public static native @Cast("cudaError_t") int cudaBindTexture(@Cast("size_t*") SizeTPointer offset, @Const textureReference texref, @Const Pointer devPtr, @Const cudaChannelFormatDesc desc);

/**
 * \brief Binds a 2D memory area to a texture
 *
 * Binds the 2D memory area pointed to by \p devPtr to the
 * texture reference \p texref. The size of the area is constrained by
 * \p width in texel units, \p height in texel units, and \p pitch in byte
 * units. \p desc describes how the memory is interpreted when fetching values
 * from the texture. Any memory previously bound to \p texref is unbound.
 *
 * Since the hardware enforces an alignment requirement on texture base
 * addresses, ::cudaBindTexture2D() returns in \p *offset a byte offset that
 * must be applied to texture fetches in order to read from the desired memory.
 * This offset must be divided by the texel size and passed to kernels that
 * read from the texture so they can be applied to the ::tex2D() function.
 * If the device memory pointer was returned from ::cudaMalloc(), the offset is
 * guaranteed to be 0 and NULL may be passed as the \p offset parameter.
 *
 * \p width and \p height, which are specified in elements (or texels), cannot
 * exceed ::cudaDeviceProp::maxTexture2DLinear[0] and ::cudaDeviceProp::maxTexture2DLinear[1]
 * respectively. \p pitch, which is specified in bytes, cannot exceed
 * ::cudaDeviceProp::maxTexture2DLinear[2].
 *
 * The driver returns ::cudaErrorInvalidValue if \p pitch is not a multiple of
 * ::cudaDeviceProp::texturePitchAlignment.
 *
 * @param offset - Offset in bytes
 * @param texref - Texture reference to bind
 * @param devPtr - 2D memory area on device
 * @param desc   - Channel format
 * @param width  - Width in texel units
 * @param height - Height in texel units
 * @param pitch  - Pitch in bytes
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidTexture
 * \notefnerr
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetChannelDesc, ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct texture< T, dim, readMode>&, const void*, const struct cudaChannelFormatDesc&, size_t, size_t, size_t) "cudaBindTexture2D (C++ API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct texture<T, dim, readMode>&, const void*, size_t, size_t, size_t) "cudaBindTexture2D (C++ API, inherited channel descriptor)",
 * \ref ::cudaBindTextureToArray(const struct textureReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)"
 */
public static native @Cast("cudaError_t") int cudaBindTexture2D(@Cast("size_t*") SizeTPointer offset, @Const textureReference texref, @Const Pointer devPtr, @Const cudaChannelFormatDesc desc, @Cast("size_t") long width, @Cast("size_t") long height, @Cast("size_t") long pitch);

/**
 * \brief Binds an array to a texture
 *
 * Binds the CUDA array \p array to the texture reference \p texref.
 * \p desc describes how the memory is interpreted when fetching values from
 * the texture. Any CUDA array previously bound to \p texref is unbound.
 *
 * @param texref - Texture to bind
 * @param array  - Memory array on device
 * @param desc   - Channel format
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidTexture
 * \notefnerr
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetChannelDesc, ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct texture< T, dim, readMode>&, cudaArray_const_t, const struct cudaChannelFormatDesc&) "cudaBindTextureToArray (C++ API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaUnbindTexture (C API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)"
 */
public static native @Cast("cudaError_t") int cudaBindTextureToArray(@Const textureReference texref, cudaArray array, @Const cudaChannelFormatDesc desc);

/**
 * \brief Binds a mipmapped array to a texture
 *
 * Binds the CUDA mipmapped array \p mipmappedArray to the texture reference \p texref.
 * \p desc describes how the memory is interpreted when fetching values from
 * the texture. Any CUDA mipmapped array previously bound to \p texref is unbound.
 *
 * @param texref         - Texture to bind
 * @param mipmappedArray - Memory mipmapped array on device
 * @param desc           - Channel format
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidDevicePointer,
 * ::cudaErrorInvalidTexture
 * \notefnerr
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetChannelDesc, ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct texture< T, dim, readMode>&, cudaArray_const_t, const struct cudaChannelFormatDesc&) "cudaBindTextureToArray (C++ API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaUnbindTexture (C API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)"
 */
public static native @Cast("cudaError_t") int cudaBindTextureToMipmappedArray(@Const textureReference texref, cudaMipmappedArray mipmappedArray, @Const cudaChannelFormatDesc desc);

/**
 * \brief Unbinds a texture
 *
 * Unbinds the texture bound to \p texref.
 *
 * @param texref - Texture to unbind
 *
 * @return
 * ::cudaSuccess
 * \notefnerr
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetChannelDesc, ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct textureReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaUnbindTexture(const struct texture< T, dim, readMode>&) "cudaUnbindTexture (C++ API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)"
 */
public static native @Cast("cudaError_t") int cudaUnbindTexture(@Const textureReference texref);

/**
 * \brief Get the alignment offset of a texture
 *
 * Returns in \p *offset the offset that was returned when texture reference
 * \p texref was bound.
 *
 * @param offset - Offset of texture reference in bytes
 * @param texref - Texture to get offset of
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidTexture,
 * ::cudaErrorInvalidTextureBinding
 * \notefnerr
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetChannelDesc, ::cudaGetTextureReference,
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct textureReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaUnbindTexture (C API)",
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct texture< T, dim, readMode>&) "cudaGetTextureAlignmentOffset (C++ API)"
 */
public static native @Cast("cudaError_t") int cudaGetTextureAlignmentOffset(@Cast("size_t*") SizeTPointer offset, @Const textureReference texref);

/**
 * \brief Get the texture reference associated with a symbol
 *
 * Returns in \p *texref the structure associated to the texture reference
 * defined by symbol \p symbol.
 *
 * @param texref - Texture reference associated with symbol
 * @param symbol - Texture to get reference for
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidTexture
 * \notefnerr
 * \note_string_api_deprecation_50
 *
 * \sa \ref ::cudaCreateChannelDesc(int, int, int, int, cudaChannelFormatKind) "cudaCreateChannelDesc (C API)",
 * ::cudaGetChannelDesc,
 * \ref ::cudaGetTextureAlignmentOffset(size_t*, const struct textureReference*) "cudaGetTextureAlignmentOffset (C API)",
 * \ref ::cudaBindTexture(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t) "cudaBindTexture (C API)",
 * \ref ::cudaBindTexture2D(size_t*, const struct textureReference*, const void*, const struct cudaChannelFormatDesc*, size_t, size_t, size_t) "cudaBindTexture2D (C API)",
 * \ref ::cudaBindTextureToArray(const struct textureReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindTextureToArray (C API)",
 * \ref ::cudaUnbindTexture(const struct textureReference*) "cudaUnbindTexture (C API)"
 */
public static native @Cast("cudaError_t") int cudaGetTextureReference(@Cast("const textureReference**") PointerPointer texref, @Const Pointer symbol);
public static native @Cast("cudaError_t") int cudaGetTextureReference(@Const @ByPtrPtr textureReference texref, @Const Pointer symbol);

/** \} */ /* END CUDART_TEXTURE */

/**
 * \defgroup CUDART_SURFACE Surface Reference Management
 *
 * ___MANBRIEF___ surface reference management functions of the CUDA runtime
 * API (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the low level surface reference management functions
 * of the CUDA runtime application programming interface.
 *
 * Some functions have overloaded C++ API template versions documented separately in the
 * \ref CUDART_HIGHLEVEL "C++ API Routines" module.
 *
 * \{
 */

/**
 * \brief Binds an array to a surface
 *
 * Binds the CUDA array \p array to the surface reference \p surfref.
 * \p desc describes how the memory is interpreted when fetching values from
 * the surface. Any CUDA array previously bound to \p surfref is unbound.
 *
 * @param surfref - Surface to bind
 * @param array  - Memory array on device
 * @param desc   - Channel format
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue,
 * ::cudaErrorInvalidSurface
 * \notefnerr
 *
 * \sa \ref ::cudaBindSurfaceToArray(const struct surface< T, dim>&, cudaArray_const_t, const struct cudaChannelFormatDesc&) "cudaBindSurfaceToArray (C++ API)",
 * \ref ::cudaBindSurfaceToArray(const struct surface< T, dim>&, cudaArray_const_t) "cudaBindSurfaceToArray (C++ API, inherited channel descriptor)",
 * ::cudaGetSurfaceReference
 */
public static native @Cast("cudaError_t") int cudaBindSurfaceToArray(@Const surfaceReference surfref, cudaArray array, @Const cudaChannelFormatDesc desc);

/**
 * \brief Get the surface reference associated with a symbol
 *
 * Returns in \p *surfref the structure associated to the surface reference
 * defined by symbol \p symbol.
 *
 * @param surfref - Surface reference associated with symbol
 * @param symbol - Surface to get reference for
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidSurface
 * \notefnerr
 * \note_string_api_deprecation_50
 *
 * \sa \ref ::cudaBindSurfaceToArray(const struct surfaceReference*, cudaArray_const_t, const struct cudaChannelFormatDesc*) "cudaBindSurfaceToArray (C API)"
 */
public static native @Cast("cudaError_t") int cudaGetSurfaceReference(@Cast("const surfaceReference**") PointerPointer surfref, @Const Pointer symbol);
public static native @Cast("cudaError_t") int cudaGetSurfaceReference(@Const @ByPtrPtr surfaceReference surfref, @Const Pointer symbol);

/** \} */ /* END CUDART_SURFACE */

/**
 * \defgroup CUDART_TEXTURE_OBJECT Texture Object Management
 *
 * ___MANBRIEF___ texture object management functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the low level texture object management functions
 * of the CUDA runtime application programming interface. The texture
 * object API is only supported on devices of compute capability 3.0 or higher.
 *
 * \{
 */

/**
 * \brief Creates a texture object
 *
 * Creates a texture object and returns it in \p pTexObject. \p pResDesc describes
 * the data to texture from. \p pTexDesc describes how the data should be sampled.
 * \p pResViewDesc is an optional argument that specifies an alternate format for
 * the data described by \p pResDesc, and also describes the subresource region
 * to restrict access to when texturing. \p pResViewDesc can only be specified if
 * the type of resource is a CUDA array or a CUDA mipmapped array.
 *
 * Texture objects are only supported on devices of compute capability 3.0 or higher.
 * Additionally, a texture object is an opaque value, and, as such, should only be
 * accessed through CUDA API calls.
 *
 * The ::cudaResourceDesc structure is defined as:
 * <pre>{@code
        struct cudaResourceDesc {
	        enum cudaResourceType resType;
        	
	        union {
		        struct {
			        cudaArray_t array;
		        } array;
                struct {
                    cudaMipmappedArray_t mipmap;
                } mipmap;
		        struct {
			        void *devPtr;
			        struct cudaChannelFormatDesc desc;
			        size_t sizeInBytes;
		        } linear;
		        struct {
			        void *devPtr;
			        struct cudaChannelFormatDesc desc;
			        size_t width;
			        size_t height;
			        size_t pitchInBytes;
		        } pitch2D;
	        } res;
        };
 * }</pre>
 * where:
 * - ::cudaResourceDesc::resType specifies the type of resource to texture from.
 * CUresourceType is defined as:
 * <pre>{@code
        enum cudaResourceType {
            cudaResourceTypeArray          = 0x00,
            cudaResourceTypeMipmappedArray = 0x01,
            cudaResourceTypeLinear         = 0x02,
            cudaResourceTypePitch2D        = 0x03
        };
 * }</pre>
 *
 * \par
 * If ::cudaResourceDesc::resType is set to ::cudaResourceTypeArray, ::cudaResourceDesc::res::array::array
 * must be set to a valid CUDA array handle.
 *
 * \par
 * If ::cudaResourceDesc::resType is set to ::cudaResourceTypeMipmappedArray, ::cudaResourceDesc::res::mipmap::mipmap
 * must be set to a valid CUDA mipmapped array handle and ::cudaTextureDesc::normalizedCoords must be set to true.
 *
 * \par
 * If ::cudaResourceDesc::resType is set to ::cudaResourceTypeLinear, ::cudaResourceDesc::res::linear::devPtr
 * must be set to a valid device pointer, that is aligned to ::cudaDeviceProp::textureAlignment.
 * ::cudaResourceDesc::res::linear::desc describes the format and the number of components per array element. ::cudaResourceDesc::res::linear::sizeInBytes
 * specifies the size of the array in bytes. The total number of elements in the linear address range cannot exceed 
 * ::cudaDeviceProp::maxTexture1DLinear. The number of elements is computed as (sizeInBytes / sizeof(desc)).
 *
 * \par
 * If ::cudaResourceDesc::resType is set to ::cudaResourceTypePitch2D, ::cudaResourceDesc::res::pitch2D::devPtr
 * must be set to a valid device pointer, that is aligned to ::cudaDeviceProp::textureAlignment.
 * ::cudaResourceDesc::res::pitch2D::desc describes the format and the number of components per array element. ::cudaResourceDesc::res::pitch2D::width
 * and ::cudaResourceDesc::res::pitch2D::height specify the width and height of the array in elements, and cannot exceed
 * ::cudaDeviceProp::maxTexture2DLinear[0] and ::cudaDeviceProp::maxTexture2DLinear[1] respectively.
 * ::cudaResourceDesc::res::pitch2D::pitchInBytes specifies the pitch between two rows in bytes and has to be aligned to 
 * ::cudaDeviceProp::texturePitchAlignment. Pitch cannot exceed ::cudaDeviceProp::maxTexture2DLinear[2].
 *
 *
 * The ::cudaTextureDesc struct is defined as
 * <pre>{@code
        struct cudaTextureDesc {
            enum cudaTextureAddressMode addressMode[3];
            enum cudaTextureFilterMode  filterMode;
            enum cudaTextureReadMode    readMode;
            int                         sRGB;
            int                         normalizedCoords;
            unsigned int                maxAnisotropy;
            enum cudaTextureFilterMode  mipmapFilterMode;
            float                       mipmapLevelBias;
            float                       minMipmapLevelClamp;
            float                       maxMipmapLevelClamp;
        };
 * }</pre>
 * where
 * - ::cudaTextureDesc::addressMode specifies the addressing mode for each dimension of the texture data. ::cudaTextureAddressMode is defined as:
 *   <pre>{@code
        enum cudaTextureAddressMode {
            cudaAddressModeWrap   = 0,
            cudaAddressModeClamp  = 1,
            cudaAddressModeMirror = 2,
            cudaAddressModeBorder = 3
        };
 *   }</pre>
 *   This is ignored if ::cudaResourceDesc::resType is ::cudaResourceTypeLinear. Also, if ::cudaTextureDesc::normalizedCoords
 *   is set to zero, ::cudaAddressModeWrap and ::cudaAddressModeMirror won't be supported and will be switched to ::cudaAddressModeClamp.
 *
 * - ::cudaTextureDesc::filterMode specifies the filtering mode to be used when fetching from the texture. ::cudaTextureFilterMode is defined as:
 *   <pre>{@code
        enum cudaTextureFilterMode {
            cudaFilterModePoint  = 0,
            cudaFilterModeLinear = 1
        };
 *   }</pre>
 *   This is ignored if ::cudaResourceDesc::resType is ::cudaResourceTypeLinear.
 *
 * - ::cudaTextureDesc::readMode specifies whether integer data should be converted to floating point or not. ::cudaTextureReadMode is defined as:
 *   <pre>{@code
        enum cudaTextureReadMode {
            cudaReadModeElementType     = 0,
            cudaReadModeNormalizedFloat = 1
        };
 *   }</pre>
 *   Note that this applies only to 8-bit and 16-bit integer formats. 32-bit integer format would not be promoted, regardless of 
 *   whether or not this ::cudaTextureDesc::readMode is set ::cudaReadModeNormalizedFloat is specified.
 *
 * - ::cudaTextureDesc::sRGB specifies whether sRGB to linear conversion should be performed during texture fetch.
 *
 * - ::cudaTextureDesc::normalizedCoords specifies whether the texture coordinates will be normalized or not.
 *
 * - ::cudaTextureDesc::maxAnisotropy specifies the maximum anistropy ratio to be used when doing anisotropic filtering. This value will be
 *   clamped to the range [1,16].
 *
 * - ::cudaTextureDesc::mipmapFilterMode specifies the filter mode when the calculated mipmap level lies between two defined mipmap levels.
 *
 * - ::cudaTextureDesc::mipmapLevelBias specifies the offset to be applied to the calculated mipmap level.
 *
 * - ::cudaTextureDesc::minMipmapLevelClamp specifies the lower end of the mipmap level range to clamp access to.
 *
 * - ::cudaTextureDesc::maxMipmapLevelClamp specifies the upper end of the mipmap level range to clamp access to.
 *
 *
 * The ::cudaResourceViewDesc struct is defined as
 * <pre>{@code
        struct cudaResourceViewDesc {
            enum cudaResourceViewFormat format;
            size_t                      width;
            size_t                      height;
            size_t                      depth;
            unsigned int                firstMipmapLevel;
            unsigned int                lastMipmapLevel;
            unsigned int                firstLayer;
            unsigned int                lastLayer;
        };
 * }</pre>
 * where:
 * - ::cudaResourceViewDesc::format specifies how the data contained in the CUDA array or CUDA mipmapped array should
 *   be interpreted. Note that this can incur a change in size of the texture data. If the resource view format is a block
 *   compressed format, then the underlying CUDA array or CUDA mipmapped array has to have a 32-bit unsigned integer format
 *   with 2 or 4 channels, depending on the block compressed format. For ex., BC1 and BC4 require the underlying CUDA array to have
 *   a 32-bit unsigned int with 2 channels. The other BC formats require the underlying resource to have the same 32-bit unsigned int
 *   format but with 4 channels.
 *
 * - ::cudaResourceViewDesc::width specifies the new width of the texture data. If the resource view format is a block
 *   compressed format, this value has to be 4 times the original width of the resource. For non block compressed formats,
 *   this value has to be equal to that of the original resource.
 *
 * - ::cudaResourceViewDesc::height specifies the new height of the texture data. If the resource view format is a block
 *   compressed format, this value has to be 4 times the original height of the resource. For non block compressed formats,
 *   this value has to be equal to that of the original resource.
 *
 * - ::cudaResourceViewDesc::depth specifies the new depth of the texture data. This value has to be equal to that of the
 *   original resource.
 *
 * - ::cudaResourceViewDesc::firstMipmapLevel specifies the most detailed mipmap level. This will be the new mipmap level zero.
 *   For non-mipmapped resources, this value has to be zero.::cudaTextureDesc::minMipmapLevelClamp and ::cudaTextureDesc::maxMipmapLevelClamp
 *   will be relative to this value. For ex., if the firstMipmapLevel is set to 2, and a minMipmapLevelClamp of 1.2 is specified,
 *   then the actual minimum mipmap level clamp will be 3.2.
 *
 * - ::cudaResourceViewDesc::lastMipmapLevel specifies the least detailed mipmap level. For non-mipmapped resources, this value
 *   has to be zero.
 *
 * - ::cudaResourceViewDesc::firstLayer specifies the first layer index for layered textures. This will be the new layer zero.
 *   For non-layered resources, this value has to be zero.
 *
 * - ::cudaResourceViewDesc::lastLayer specifies the last layer index for layered textures. For non-layered resources, 
 *   this value has to be zero.
 *
 *
 * @param pTexObject   - Texture object to create
 * @param pResDesc     - Resource descriptor
 * @param pTexDesc     - Texture descriptor
 * @param pResViewDesc - Resource view descriptor
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaDestroyTextureObject
 */

public static native @Cast("cudaError_t") int cudaCreateTextureObject(@Cast("cudaTextureObject_t*") LongPointer pTexObject, @Const cudaResourceDesc pResDesc, @Const cudaTextureDesc pTexDesc, @Const cudaResourceViewDesc pResViewDesc);
public static native @Cast("cudaError_t") int cudaCreateTextureObject(@Cast("cudaTextureObject_t*") LongBuffer pTexObject, @Const cudaResourceDesc pResDesc, @Const cudaTextureDesc pTexDesc, @Const cudaResourceViewDesc pResViewDesc);
public static native @Cast("cudaError_t") int cudaCreateTextureObject(@Cast("cudaTextureObject_t*") long[] pTexObject, @Const cudaResourceDesc pResDesc, @Const cudaTextureDesc pTexDesc, @Const cudaResourceViewDesc pResViewDesc);

/**
 * \brief Destroys a texture object
 *
 * Destroys the texture object specified by \p texObject.
 *
 * @param texObject - Texture object to destroy
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaCreateTextureObject
 */
public static native @Cast("cudaError_t") int cudaDestroyTextureObject(@Cast("cudaTextureObject_t") long texObject);

/**
 * \brief Returns a texture object's resource descriptor
 *
 * Returns the resource descriptor for the texture object specified by \p texObject.
 *
 * @param pResDesc  - Resource descriptor
 * @param texObject - Texture object
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaCreateTextureObject
 */
public static native @Cast("cudaError_t") int cudaGetTextureObjectResourceDesc(cudaResourceDesc pResDesc, @Cast("cudaTextureObject_t") long texObject);

/**
 * \brief Returns a texture object's texture descriptor
 *
 * Returns the texture descriptor for the texture object specified by \p texObject.
 *
 * @param pTexDesc  - Texture descriptor
 * @param texObject - Texture object
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaCreateTextureObject
 */
public static native @Cast("cudaError_t") int cudaGetTextureObjectTextureDesc(cudaTextureDesc pTexDesc, @Cast("cudaTextureObject_t") long texObject);

/**
 * \brief Returns a texture object's resource view descriptor
 *
 * Returns the resource view descriptor for the texture object specified by \p texObject.
 * If no resource view was specified, ::cudaErrorInvalidValue is returned.
 *
 * @param pResViewDesc - Resource view descriptor
 * @param texObject    - Texture object
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaCreateTextureObject
 */
public static native @Cast("cudaError_t") int cudaGetTextureObjectResourceViewDesc(cudaResourceViewDesc pResViewDesc, @Cast("cudaTextureObject_t") long texObject);

/** \} */ /* END CUDART_TEXTURE_OBJECT */

/**
 * \defgroup CUDART_SURFACE_OBJECT Surface Object Management
 *
 * ___MANBRIEF___ surface object management functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the low level texture object management functions
 * of the CUDA runtime application programming interface. The surface object 
 * API is only supported on devices of compute capability 3.0 or higher.
 *
 * \{
 */

/**
 * \brief Creates a surface object
 *
 * Creates a surface object and returns it in \p pSurfObject. \p pResDesc describes
 * the data to perform surface load/stores on. ::cudaResourceDesc::resType must be 
 * ::cudaResourceTypeArray and  ::cudaResourceDesc::res::array::array
 * must be set to a valid CUDA array handle.
 *
 * Surface objects are only supported on devices of compute capability 3.0 or higher.
 * Additionally, a surface object is an opaque value, and, as such, should only be
 * accessed through CUDA API calls.
 *
 * @param pSurfObject - Surface object to create
 * @param pResDesc    - Resource descriptor
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaDestroySurfaceObject
 */

public static native @Cast("cudaError_t") int cudaCreateSurfaceObject(@Cast("cudaSurfaceObject_t*") LongPointer pSurfObject, @Const cudaResourceDesc pResDesc);
public static native @Cast("cudaError_t") int cudaCreateSurfaceObject(@Cast("cudaSurfaceObject_t*") LongBuffer pSurfObject, @Const cudaResourceDesc pResDesc);
public static native @Cast("cudaError_t") int cudaCreateSurfaceObject(@Cast("cudaSurfaceObject_t*") long[] pSurfObject, @Const cudaResourceDesc pResDesc);

/**
 * \brief Destroys a surface object
 *
 * Destroys the surface object specified by \p surfObject.
 *
 * @param surfObject - Surface object to destroy
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaCreateSurfaceObject
 */
public static native @Cast("cudaError_t") int cudaDestroySurfaceObject(@Cast("cudaSurfaceObject_t") long surfObject);

/**
 * \brief Returns a surface object's resource descriptor
 * Returns the resource descriptor for the surface object specified by \p surfObject.
 *
 * @param pResDesc   - Resource descriptor
 * @param surfObject - Surface object
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaCreateSurfaceObject
 */
public static native @Cast("cudaError_t") int cudaGetSurfaceObjectResourceDesc(cudaResourceDesc pResDesc, @Cast("cudaSurfaceObject_t") long surfObject);

/** \} */ /* END CUDART_SURFACE_OBJECT */

/**
 * \defgroup CUDART__VERSION Version Management
 *
 * \{
 */

/**
 * \brief Returns the CUDA driver version
 *
 * Returns in \p *driverVersion the version number of the installed CUDA
 * driver. If no driver is installed, then 0 is returned as the driver
 * version (via \p driverVersion). This function automatically returns
 * ::cudaErrorInvalidValue if the \p driverVersion argument is NULL.
 *
 * @param driverVersion - Returns the CUDA driver version.
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 * \notefnerr
 *
 * \sa ::cudaRuntimeGetVersion
 */
public static native @Cast("cudaError_t") int cudaDriverGetVersion(IntPointer driverVersion);
public static native @Cast("cudaError_t") int cudaDriverGetVersion(IntBuffer driverVersion);
public static native @Cast("cudaError_t") int cudaDriverGetVersion(int[] driverVersion);

/**
 * \brief Returns the CUDA Runtime version
 *
 * Returns in \p *runtimeVersion the version number of the installed CUDA
 * Runtime. This function automatically returns ::cudaErrorInvalidValue if
 * the \p runtimeVersion argument is NULL.
 *
 * @param runtimeVersion - Returns the CUDA Runtime version.
 *
 * @return
 * ::cudaSuccess,
 * ::cudaErrorInvalidValue
 *
 * \sa ::cudaDriverGetVersion
 */
public static native @Cast("cudaError_t") int cudaRuntimeGetVersion(IntPointer runtimeVersion);
public static native @Cast("cudaError_t") int cudaRuntimeGetVersion(IntBuffer runtimeVersion);
public static native @Cast("cudaError_t") int cudaRuntimeGetVersion(int[] runtimeVersion);

/** \} */ /* END CUDART__VERSION */

/** \cond impl_private */
public static native @Cast("cudaError_t") int cudaGetExportTable(@Cast("const void**") PointerPointer ppExportTable, @Const cudaUUID_t pExportTableId);
public static native @Cast("cudaError_t") int cudaGetExportTable(@Cast("const void**") @ByPtrPtr Pointer ppExportTable, @Const cudaUUID_t pExportTableId);
/** \endcond impl_private */

/**
 * \defgroup CUDART_HIGHLEVEL C++ API Routines
 *
 * ___MANBRIEF___ C++ high level API functions of the CUDA runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the C++ high level API functions of the CUDA runtime
 * application programming interface. To use these functions, your
 * application needs to be compiled with the \p nvcc compiler.
 *
 * \brief C++-style interface built on top of CUDA runtime API
 */

/**
 * \defgroup CUDART_DRIVER Interactions with the CUDA Driver API
 *
 * ___MANBRIEF___ interactions between CUDA Driver API and CUDA Runtime API
 * (___CURRENT_FILE___) ___ENDMANBRIEF___
 *
 * This section describes the interactions between the CUDA Driver API and the CUDA Runtime API
 *
 * \{
 *
 * \section CUDART_CUDA_primary Primary Contexts
 *
 * There exists a one to one relationship between CUDA devices in the CUDA Runtime
 * API and ::CUcontext s in the CUDA Driver API within a process.  The specific
 * context which the CUDA Runtime API uses for a device is called the device's
 * primary context.  From the perspective of the CUDA Runtime API, a device and 
 * its primary context are synonymous.
 *
 * \section CUDART_CUDA_init Initialization and Tear-Down
 *
 * CUDA Runtime API calls operate on the CUDA Driver API ::CUcontext which is current to
 * to the calling host thread.  
 *
 * The function ::cudaSetDevice() makes the primary context for the
 * specified device current to the calling thread by calling ::cuCtxSetCurrent().
 *
 * The CUDA Runtime API will automatically initialize the primary context for
 * a device at the first CUDA Runtime API call which requires an active context.
 * If no ::CUcontext is current to the calling thread when a CUDA Runtime API call 
 * which requires an active context is made, then the primary context for a device 
 * will be selected, made current to the calling thread, and initialized.
 *
 * The context which the CUDA Runtime API initializes will be initialized using 
 * the parameters specified by the CUDA Runtime API functions
 * ::cudaSetDeviceFlags(), 
 * ::cudaD3D9SetDirect3DDevice(), 
 * ::cudaD3D10SetDirect3DDevice(), 
 * ::cudaD3D11SetDirect3DDevice(), 
 * ::cudaGLSetGLDevice(), and
 * ::cudaVDPAUSetVDPAUDevice().
 * Note that these functions will fail with ::cudaErrorSetOnActiveProcess if they are 
 * called when the primary context for the specified device has already been initialized.
 * (or if the current device has already been initialized, in the case of 
 * ::cudaSetDeviceFlags()). 
 *
 * Primary contexts will remain active until they are explicitly deinitialized 
 * using ::cudaDeviceReset().  The function ::cudaDeviceReset() will deinitialize the 
 * primary context for the calling thread's current device immediately.  The context 
 * will remain current to all of the threads that it was current to.  The next CUDA 
 * Runtime API call on any thread which requires an active context will trigger the 
 * reinitialization of that device's primary context.
 *
 * Note that there is no reference counting of the primary context's lifetime.  It is
 * recommended that the primary context not be deinitialized except just before exit
 * or to recover from an unspecified launch failure.
 * 
 * \section CUDART_CUDA_context Context Interoperability
 *
 * Note that the use of multiple ::CUcontext s per device within a single process 
 * will substantially degrade performance and is strongly discouraged.  Instead,
 * it is highly recommended that the implicit one-to-one device-to-context mapping
 * for the process provided by the CUDA Runtime API be used.
 *
 * If a non-primary ::CUcontext created by the CUDA Driver API is current to a
 * thread then the CUDA Runtime API calls to that thread will operate on that 
 * ::CUcontext, with some exceptions listed below.  Interoperability between data
 * types is discussed in the following sections.
 *
 * The function ::cudaPointerGetAttributes() will return the error 
 * ::cudaErrorIncompatibleDriverContext if the pointer being queried was allocated by a 
 * non-primary context.  The function ::cudaDeviceEnablePeerAccess() and the rest of 
 * the peer access API may not be called when a non-primary ::CUcontext is current.  
 * To use the pointer query and peer access APIs with a context created using the 
 * CUDA Driver API, it is necessary that the CUDA Driver API be used to access
 * these features.
 *
 * All CUDA Runtime API state (e.g, global variables' addresses and values) travels
 * with its underlying ::CUcontext.  In particular, if a ::CUcontext is moved from one 
 * thread to another then all CUDA Runtime API state will move to that thread as well.
 *
 * Please note that attaching to legacy contexts (those with a version of 3010 as returned
 * by ::cuCtxGetApiVersion()) is not possible. The CUDA Runtime will return
 * ::cudaErrorIncompatibleDriverContext in such cases.
 *
 * \section CUDART_CUDA_stream Interactions between CUstream and cudaStream_t
 *
 * The types ::CUstream and ::cudaStream_t are identical and may be used interchangeably.
 *
 * \section CUDART_CUDA_event Interactions between CUevent and cudaEvent_t
 *
 * The types ::CUevent and ::cudaEvent_t are identical and may be used interchangeably.
 *
 * \section CUDART_CUDA_array Interactions between CUarray and cudaArray_t 
 *
 * The types ::CUarray and struct ::cudaArray * represent the same data type and may be used
 * interchangeably by casting the two types between each other.
 *
 * In order to use a ::CUarray in a CUDA Runtime API function which takes a struct ::cudaArray *,
 * it is necessary to explicitly cast the ::CUarray to a struct ::cudaArray *.
 *
 * In order to use a struct ::cudaArray * in a CUDA Driver API function which takes a ::CUarray,
 * it is necessary to explicitly cast the struct ::cudaArray * to a ::CUarray .
 *
 * \section CUDART_CUDA_graphicsResource Interactions between CUgraphicsResource and cudaGraphicsResource_t
 *
 * The types ::CUgraphicsResource and ::cudaGraphicsResource_t represent the same data type and may be used
 * interchangeably by casting the two types between each other.
 *
 * In order to use a ::CUgraphicsResource in a CUDA Runtime API function which takes a 
 * ::cudaGraphicsResource_t, it is necessary to explicitly cast the ::CUgraphicsResource 
 * to a ::cudaGraphicsResource_t.
 *
 * In order to use a ::cudaGraphicsResource_t in a CUDA Driver API function which takes a
 * ::CUgraphicsResource, it is necessary to explicitly cast the ::cudaGraphicsResource_t 
 * to a ::CUgraphicsResource.
 *
 * \}
 */

// #if defined(__CUDA_API_VERSION_INTERNAL)
// #elif defined(__CUDART_API_PER_THREAD_DEFAULT_STREAM)
// #endif

// #if defined(__cplusplus)

// #endif /* __cplusplus */

// #undef __dv

// #endif /* !__CUDA_RUNTIME_API_H__ */


// Parsed from <driver_functions.h>

/*
 * Copyright 1993-2012 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__DRIVER_FUNCTIONS_H__)
// #define __DRIVER_FUNCTIONS_H__

// #include "builtin_types.h"
// #include "host_defines.h"
// #include "driver_types.h"

/**
 * \addtogroup CUDART_MEMORY
 *
 * \{
 */

/**
 * \brief Returns a cudaPitchedPtr based on input parameters
 *
 * Returns a ::cudaPitchedPtr based on the specified input parameters \p d,
 * \p p, \p xsz, and \p ysz.
 *
 * @param d   - Pointer to allocated memory
 * @param p   - Pitch of allocated memory in bytes
 * @param xsz - Logical width of allocation in elements
 * @param ysz - Logical height of allocation in elements
 *
 * @return
 * ::cudaPitchedPtr specified by \p d, \p p, \p xsz, and \p ysz
 *
 * \sa make_cudaExtent, make_cudaPos
 */
public static native @ByVal cudaPitchedPtr make_cudaPitchedPtr(Pointer d, @Cast("size_t") long p, @Cast("size_t") long xsz, @Cast("size_t") long ysz);

/**
 * \brief Returns a cudaPos based on input parameters
 *
 * Returns a ::cudaPos based on the specified input parameters \p x,
 * \p y, and \p z.
 *
 * @param x - X position
 * @param y - Y position
 * @param z - Z position
 *
 * @return
 * ::cudaPos specified by \p x, \p y, and \p z
 *
 * \sa make_cudaExtent, make_cudaPitchedPtr
 */
public static native @ByVal cudaPos make_cudaPos(@Cast("size_t") long x, @Cast("size_t") long y, @Cast("size_t") long z);

/**
 * \brief Returns a cudaExtent based on input parameters
 *
 * Returns a ::cudaExtent based on the specified input parameters \p w,
 * \p h, and \p d.
 *
 * @param w - Width in bytes
 * @param h - Height in elements
 * @param d - Depth in elements
 *
 * @return
 * ::cudaExtent specified by \p w, \p h, and \p d
 *
 * \sa make_cudaPitchedPtr, make_cudaPos
 */
public static native @ByVal cudaExtent make_cudaExtent(@Cast("size_t") long w, @Cast("size_t") long h, @Cast("size_t") long d);

/** \} */ /* END CUDART_MEMORY */

// #endif /* !__DRIVER_FUNCTIONS_H__ */


// Parsed from <vector_functions.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(__VECTOR_FUNCTIONS_H__)
// #define __VECTOR_FUNCTIONS_H__

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

// #include "builtin_types.h"
// #include "host_defines.h"
// #include "vector_types.h"

// #if defined(__CUDACC_RTC__)
// #define __VECTOR_FUNCTIONS_DECL__ __host__ __device__
// #else /* !__CUDACC_RTC__ */
// #define __VECTOR_FUNCTIONS_DECL__ static __inline__ __host__ __device__
// #endif /* __CUDACC_RTC__ */

/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

public static native @ByVal char1 make_char1(byte x);

public static native @ByVal uchar1 make_uchar1(@Cast("unsigned char") byte x);

public static native @ByVal char2 make_char2(byte x, byte y);

public static native @ByVal uchar2 make_uchar2(@Cast("unsigned char") byte x, @Cast("unsigned char") byte y);

public static native @ByVal char3 make_char3(byte x, byte y, byte z);

public static native @ByVal uchar3 make_uchar3(@Cast("unsigned char") byte x, @Cast("unsigned char") byte y, @Cast("unsigned char") byte z);

public static native @ByVal char4 make_char4(byte x, byte y, byte z, byte w);

public static native @ByVal uchar4 make_uchar4(@Cast("unsigned char") byte x, @Cast("unsigned char") byte y, @Cast("unsigned char") byte z, @Cast("unsigned char") byte w);

public static native @ByVal short1 make_short1(short x);

public static native @ByVal ushort1 make_ushort1(@Cast("unsigned short") short x);

public static native @ByVal short2 make_short2(short x, short y);

public static native @ByVal ushort2 make_ushort2(@Cast("unsigned short") short x, @Cast("unsigned short") short y);

public static native @ByVal short3 make_short3(short x,short y, short z);

public static native @ByVal ushort3 make_ushort3(@Cast("unsigned short") short x, @Cast("unsigned short") short y, @Cast("unsigned short") short z);

public static native @ByVal short4 make_short4(short x, short y, short z, short w);

public static native @ByVal ushort4 make_ushort4(@Cast("unsigned short") short x, @Cast("unsigned short") short y, @Cast("unsigned short") short z, @Cast("unsigned short") short w);

public static native @ByVal int1 make_int1(int x);

public static native @ByVal uint1 make_uint1(@Cast("unsigned int") int x);

public static native @ByVal int2 make_int2(int x, int y);

public static native @ByVal uint2 make_uint2(@Cast("unsigned int") int x, @Cast("unsigned int") int y);

public static native @ByVal int3 make_int3(int x, int y, int z);

public static native @ByVal uint3 make_uint3(@Cast("unsigned int") int x, @Cast("unsigned int") int y, @Cast("unsigned int") int z);

public static native @ByVal int4 make_int4(int x, int y, int z, int w);

public static native @ByVal uint4 make_uint4(@Cast("unsigned int") int x, @Cast("unsigned int") int y, @Cast("unsigned int") int z, @Cast("unsigned int") int w);

public static native @ByVal long1 make_long1(long x);

public static native @ByVal ulong1 make_ulong1(@Cast("unsigned long int") long x);

public static native @ByVal long2 make_long2(long x, long y);

public static native @ByVal ulong2 make_ulong2(@Cast("unsigned long int") long x, @Cast("unsigned long int") long y);

public static native @ByVal long3 make_long3(long x, long y, long z);

public static native @ByVal ulong3 make_ulong3(@Cast("unsigned long int") long x, @Cast("unsigned long int") long y, @Cast("unsigned long int") long z);

public static native @ByVal long4 make_long4(long x, long y, long z, long w);

public static native @ByVal ulong4 make_ulong4(@Cast("unsigned long int") long x, @Cast("unsigned long int") long y, @Cast("unsigned long int") long z, @Cast("unsigned long int") long w);

public static native @ByVal float1 make_float1(float x);

public static native @ByVal float2 make_float2(float x, float y);

public static native @ByVal float3 make_float3(float x, float y, float z);

public static native @ByVal float4 make_float4(float x, float y, float z, float w);

public static native @ByVal longlong1 make_longlong1(long x);

public static native @ByVal ulonglong1 make_ulonglong1(@Cast("unsigned long long int") long x);

public static native @ByVal longlong2 make_longlong2(long x, long y);

public static native @ByVal ulonglong2 make_ulonglong2(@Cast("unsigned long long int") long x, @Cast("unsigned long long int") long y);

public static native @ByVal longlong3 make_longlong3(long x, long y, long z);

public static native @ByVal ulonglong3 make_ulonglong3(@Cast("unsigned long long int") long x, @Cast("unsigned long long int") long y, @Cast("unsigned long long int") long z);

public static native @ByVal longlong4 make_longlong4(long x, long y, long z, long w);

public static native @ByVal ulonglong4 make_ulonglong4(@Cast("unsigned long long int") long x, @Cast("unsigned long long int") long y, @Cast("unsigned long long int") long z, @Cast("unsigned long long int") long w);

public static native @ByVal double1 make_double1(double x);

public static native @ByVal double2 make_double2(double x, double y);

public static native @ByVal double3 make_double3(double x, double y, double z);

public static native @ByVal double4 make_double4(double x, double y, double z, double w);

// #undef __VECTOR_FUNCTIONS_DECL__

// #if !defined(__CUDACC_RTC__)
// #include "vector_functions.hpp"
// #endif /* !__CUDACC_RTC__ */

// #endif /* !__VECTOR_FUNCTIONS_H__ */


// Parsed from <cuComplex.h>

/*
 * Copyright 1993-2012 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #if !defined(CU_COMPLEX_H_)
// #define CU_COMPLEX_H_

/* When trying to include C header file in C++ Code extern "C" is required
 * But the Standard QNX headers already have ifdef extern in them when compiling C++ Code
 * extern "C" cannot be nested
 * Hence keep the header out of extern "C" block
 */

// #include <math.h>       /* import fabsf, sqrt */

// #if defined(__cplusplus)
// #endif /* __cplusplus */

// #include "vector_types.h"

public static native float cuCrealf(@ByVal @Cast("cuFloatComplex*") float2 x);

public static native float cuCimagf(@ByVal @Cast("cuFloatComplex*") float2 x);

public static native @ByVal @Cast("cuFloatComplex*") float2 make_cuFloatComplex(float r, float i);

public static native @ByVal @Cast("cuFloatComplex*") float2 cuConjf(@ByVal @Cast("cuFloatComplex*") float2 x);
public static native @ByVal @Cast("cuFloatComplex*") float2 cuCaddf(@ByVal @Cast("cuFloatComplex*") float2 x,
                                                              @ByVal @Cast("cuFloatComplex*") float2 y);

public static native @ByVal @Cast("cuFloatComplex*") float2 cuCsubf(@ByVal @Cast("cuFloatComplex*") float2 x,
                                                              @ByVal @Cast("cuFloatComplex*") float2 y);

/* This implementation could suffer from intermediate overflow even though
 * the final result would be in range. However, various implementations do
 * not guard against this (presumably to avoid losing performance), so we 
 * don't do it either to stay competitive.
 */
public static native @ByVal @Cast("cuFloatComplex*") float2 cuCmulf(@ByVal @Cast("cuFloatComplex*") float2 x,
                                                              @ByVal @Cast("cuFloatComplex*") float2 y);

/* This implementation guards against intermediate underflow and overflow
 * by scaling. Such guarded implementations are usually the default for
 * complex library implementations, with some also offering an unguarded,
 * faster version.
 */
public static native @ByVal @Cast("cuFloatComplex*") float2 cuCdivf(@ByVal @Cast("cuFloatComplex*") float2 x,
                                                              @ByVal @Cast("cuFloatComplex*") float2 y);

/* 
 * We would like to call hypotf(), but it's not available on all platforms.
 * This discrete implementation guards against intermediate underflow and 
 * overflow by scaling. Otherwise we would lose half the exponent range. 
 * There are various ways of doing guarded computation. For now chose the 
 * simplest and fastest solution, however this may suffer from inaccuracies 
 * if sqrt and division are not IEEE compliant. 
 */
public static native float cuCabsf(@ByVal @Cast("cuFloatComplex*") float2 x);

/* Double precision */

public static native double cuCreal(@ByVal @Cast("cuDoubleComplex*") double2 x);

public static native double cuCimag(@ByVal @Cast("cuDoubleComplex*") double2 x);

public static native @ByVal @Cast("cuDoubleComplex*") double2 make_cuDoubleComplex(double r, double i);

public static native @ByVal @Cast("cuDoubleComplex*") double2 cuConj(@ByVal @Cast("cuDoubleComplex*") double2 x);

public static native @ByVal @Cast("cuDoubleComplex*") double2 cuCadd(@ByVal @Cast("cuDoubleComplex*") double2 x,
                                                             @ByVal @Cast("cuDoubleComplex*") double2 y);

public static native @ByVal @Cast("cuDoubleComplex*") double2 cuCsub(@ByVal @Cast("cuDoubleComplex*") double2 x,
                                                             @ByVal @Cast("cuDoubleComplex*") double2 y);

/* This implementation could suffer from intermediate overflow even though
 * the final result would be in range. However, various implementations do
 * not guard against this (presumably to avoid losing performance), so we 
 * don't do it either to stay competitive.
 */
public static native @ByVal @Cast("cuDoubleComplex*") double2 cuCmul(@ByVal @Cast("cuDoubleComplex*") double2 x,
                                                             @ByVal @Cast("cuDoubleComplex*") double2 y);

/* This implementation guards against intermediate underflow and overflow
 * by scaling. Such guarded implementations are usually the default for
 * complex library implementations, with some also offering an unguarded,
 * faster version.
 */
public static native @ByVal @Cast("cuDoubleComplex*") double2 cuCdiv(@ByVal @Cast("cuDoubleComplex*") double2 x,
                                                             @ByVal @Cast("cuDoubleComplex*") double2 y);

/* This implementation guards against intermediate underflow and overflow
 * by scaling. Otherwise we would lose half the exponent range. There are
 * various ways of doing guarded computation. For now chose the simplest
 * and fastest solution, however this may suffer from inaccuracies if sqrt
 * and division are not IEEE compliant.
 */
public static native double cuCabs(@ByVal @Cast("cuDoubleComplex*") double2 x);

// #if defined(__cplusplus)
// #endif /* __cplusplus */

/* aliases */
public static native @ByVal @Cast("cuComplex*") float2 make_cuComplex(float x, 
                                                                float y);

/* float-to-double promotion */
public static native @ByVal @Cast("cuDoubleComplex*") double2 cuComplexFloatToDouble(@ByVal @Cast("cuFloatComplex*") float2 c);

public static native @ByVal @Cast("cuFloatComplex*") float2 cuComplexDoubleToFloat(@ByVal @Cast("cuDoubleComplex*") double2 c);


public static native @ByVal @Cast("cuComplex*") float2 cuCfmaf( @ByVal @Cast("cuComplex*") float2 x, @ByVal @Cast("cuComplex*") float2 y, @ByVal @Cast("cuComplex*") float2 d);

public static native @ByVal @Cast("cuDoubleComplex*") double2 cuCfma( @ByVal @Cast("cuDoubleComplex*") double2 x, @ByVal @Cast("cuDoubleComplex*") double2 y, @ByVal @Cast("cuDoubleComplex*") double2 d);

// #endif /* !defined(CU_COMPLEX_H_) */


// Parsed from <cuda_fp16.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

/**
 * \defgroup CUDA_MATH_INTRINSIC_HALF Half Precision Intrinsics
 * This section describes half precision intrinsic functions that are
 * only supported in device code.
 */

/**
 * \defgroup CUDA_MATH__HALF_ARITHMETIC Half Arithmetic Functions
 * \ingroup CUDA_MATH_INTRINSIC_HALF
 */

/**
 * \defgroup CUDA_MATH__HALF2_ARITHMETIC Half2 Arithmetic Functions
 * \ingroup CUDA_MATH_INTRINSIC_HALF
 */

/**
 * \defgroup CUDA_MATH__HALF_COMPARISON Half Comparison Functions
 * \ingroup CUDA_MATH_INTRINSIC_HALF
 */

/**
 * \defgroup CUDA_MATH__HALF2_COMPARISON Half2 Comparison Functions
 * \ingroup CUDA_MATH_INTRINSIC_HALF
 */

/**
 * \defgroup CUDA_MATH__HALF_MISC Half Precision Conversion And Data Movement
 * \ingroup CUDA_MATH_INTRINSIC_HALF
 */

// #ifndef CUDA_FP16_H_JNESTUG4
// #define CUDA_FP16_H_JNESTUG4

public static class __half extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __half() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public __half(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __half(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public __half position(int position) {
        return (__half)super.position(position);
    }

   public native @Cast("unsigned short") short x(); public native __half x(short x);
}

public static class __half2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __half2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public __half2(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __half2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public __half2 position(int position) {
        return (__half2)super.position(position);
    }

   public native @Cast("unsigned int") int x(); public native __half2 x(int x);
}

// #ifndef CUDA_NO_HALF
// #endif /*CUDA_NO_HALF*/

// #if defined(__CUDACC__)

// #if !defined(__cplusplus)
// #include <stdbool.h>
// #endif /*!defined(__cplusplus)*/

// #if defined(__CUDACC_RTC__)
// #define __CUDA_FP16_DECL__ __host__ __device__
// #else /* !__CUDACC_RTC__ */
// #define __CUDA_FP16_DECL__ static __device__ __inline__
// #endif /* __CUDACC_RTC__ */

/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts float number to half precision in round-to-nearest mode and
 * returns \p half with converted value.
 *
 * Converts float number \p a to half precision in round-to-nearest mode.
 *
 * @return Returns \p half result with converted value.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts \p half number to float.
 *
 * Converts half number \p a to float.
 *
 * @return Returns float result with converted value.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts input to half precision in round-to-nearest mode and
 * populates both halves of \p half2 with converted value.
 *
 * Converts input \p a to half precision in round-to-nearest mode and populates
 * both halves of \p half2 with converted value.
 *
 * @return Returns \p half2 with both halves equal to the converted half
 * precision number.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts both input floats to half precision in round-to-nearest mode
 * and returns \p half2 with converted values.
 *
 * Converts both input floats to half precision in round-to-nearest mode and
 * combines the results into one \p half2 number. Low 16 bits of the return
 * value correspond to the input \p a, high 16 bits correspond to the input \p
 * b.
 *
 * @return Returns \p half2 which has corresponding halves equal to the converted
 * input floats.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts both components of float2 number to half precision in
 * round-to-nearest mode and returns \p half2 with converted values.
 *
 * Converts both components of float2 to half precision in round-to-nearest mode
 * and combines the results into one \p half2 number. Low 16 bits of the return
 * value correspond to \p a.x and high 16 bits of the return value correspond to
 * \p a.y.
 *
 * @return Returns \p half2 which has corresponding halves equal to the converted
 * float2 components.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts both halves of \p half2 to float2 and returns the result.
 *
 * Converts both halves of \p half2 input \p a to float2 and returns the result.
 *
 * @return Returns converted float2.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts low 16 bits of \p half2 to float and returns the result
 *
 * Converts low 16 bits of \p half2 input \p a to 32 bit floating point number
 * and returns the result.
 *
 * @return Returns low 16 bits of \p a converted to float.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Returns \p half2 with both halves equal to the input value.
 *
 * Returns \p half2 number with both halves equal to the input \p a \p half
 * number.
 *
 * @return Returns \p half2 with both halves equal to the input \p a.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Converts high 16 bits of \p half2 to float and returns the result
 *
 * Converts high 16 bits of \p half2 input \p a to 32 bit floating point number
 * and returns the result.
 *
 * @return Returns high 16 bits of \p a converted to float.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Swaps both halves of the \p half2 input.
 *
 * Swaps both halves of the \p half2 input and returns a new \p half2 number
 * with swapped halves.
 *
 * @return Returns \p half2 with halves swapped.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Extracts low 16 bits from each of the two \p half2 inputs and combines
 * into one \p half2 number.
 *
 * Extracts low 16 bits from each of the two \p half2 inputs and combines into
 * one \p half2 number. Low 16 bits from input \p a is stored in low 16 bits of
 * the return value, low 16 bits from input \p b is stored in high 16 bits of
 * the return value.
 *
 * @return Returns \p half2 which contains low 16 bits from \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Extracts high 16 bits from each of the two \p half2 inputs and combines
 * into one \p half2 number.
 *
 * Extracts high 16 bits from each of the two \p half2 inputs and combines into
 * one \p half2 number. High 16 bits from input \p a is stored in low 16 bits of
 * the return value, high 16 bits from input \p b is stored in high 16 bits of
 * the return value.
 *
 * @return Returns \p half2 which contains high 16 bits from \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Returns high 16 bits of \p half2 input.
 *
 * Returns high 16 bits of \p half2 input \p a.
 *
 * @return Returns \p half which contains high 16 bits of the input.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Returns low 16 bits of \p half2 input.
 *
 * Returns low 16 bits of \p half2 input \p a.
 *
 * @return Returns \p half which contains low 16 bits of the input.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Checks if the input \p half number is infinite.
 *
 * Checks if the input \p half number \p a is infinite.
 *
 * @return Returns -1 iff \p a is equal to negative infinity, 1 iff \p a is
 * equal to positive infinity and 0 otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Combines two \p half numbers into one \p half2 number.
 *
 * Combines two input \p half number \p a and \p b into one \p half2 number.
 * Input \p a is stored in low 16 bits of the return value, input \p b is stored
 * in high 16 bits of the return value.
 *
 * @return Returns \p half2 number which has one half equal to \p a and the
 * other to \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Extracts low 16 bits from \p half2 input.
 *
 * Extracts low 16 bits from \p half2 input \p a and returns a new \p half2
 * number which has both halves equal to the extracted bits.
 *
 * @return Returns \p half2 with both halves equal to low 16 bits from the input.
 */
/**
 * \ingroup CUDA_MATH__HALF_MISC
 * \brief Extracts high 16 bits from \p half2 input.
 *
 * Extracts high 16 bits from \p half2 input \p a and returns a new \p half2
 * number which has both halves equal to the extracted bits.
 *
 * @return Returns \p half2 with both halves equal to high 16 bits from the
 * input.
 */

// #if __CUDA_ARCH__ >= 300 || !defined(__CUDA_ARCH__)
// #endif /*__CUDA_ARCH__ >= 300 || !defined(__CUDA_ARCH__) */

// #if defined(__cplusplus) && ( __CUDA_ARCH__ >=320 || !defined(__CUDA_ARCH__) )
// #endif /*defined(__cplusplus) && ( __CUDA_ARCH__ >=320 || !defined(__CUDA_ARCH__) )*/

// #if __CUDA_ARCH__ >= 530 || !defined(__CUDA_ARCH__)
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs half2 vector if-equal comparison.
 *
 * Performs \p half2 vector if-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate false results.
 *
 * @return Returns the \p half2 vector result of if-equal comparison of vectors
 * \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector not-equal comparison.
 *
 * Performs \p half2 vector not-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate false results.
 *
 * @return Returns the \p half2 vector result of not-equal comparison of vectors
 * \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector less-equal comparison.
 *
 * Performs \p half2 vector less-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate false results.
 *
 * @return Returns the \p half2 vector result of less-equal comparison of
 * vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector greater-equal comparison.
 *
 * Performs \p half2 vector greater-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate false results.
 *
 * @return Returns the \p half2 vector result of greater-equal comparison of
 * vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector less-than comparison.
 *
 * Performs \p half2 vector less-than comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate false results.
 *
 * @return Returns the \p half2 vector result of less-than comparison of vectors
 * \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector greater-than comparison.
 *
 * Performs \p half2 vector greater-than comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate false results.
 *
 * @return Returns the half2 vector result of greater-than comparison of vectors
 * \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered if-equal comparison.
 *
 * Performs \p half2 vector if-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate true results.
 *
 * @return Returns the \p half2 vector result of unordered if-equal comparison
 * of vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered not-equal comparison.
 *
 * Performs \p half2 vector not-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate true results.
 *
 * @return Returns the \p half2 vector result of unordered not-equal comparison
 * of vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered less-equal comparison.
 *
 * Performs \p half2 vector less-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate true results.
 *
 * @return Returns the \p half2 vector result of unordered less-equal comparison
 * of vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered greater-equal comparison.
 *
 * Performs \p half2 vector greater-equal comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate true results.
 *
 * @return Returns the \p half2 vector result of unordered greater-equal
 * comparison of vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered less-than comparison.
 *
 * Performs \p half2 vector less-than comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate true results.
 *
 * @return Returns the \p half2 vector result of unordered less-than comparison
 * of vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered greater-than comparison.
 *
 * Performs \p half2 vector greater-than comparison of inputs \p a and \p b.
 * The corresponding \p half results are set to 1.0 for true, or 0.0 for false.
 * NaN inputs generate true results.
 *
 * @return Returns the \p half2 vector result of unordered greater-than
 * comparison of vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Determine whether \p half2 argument is a NaN.
 *
 * Determine whether each half of input \p half2 number \p a is a NaN.
 *
 * @return Returns \p half2 which has the corresponding \p half results set to
 * 1.0 for true, or 0.0 for false.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector addition in round-to-nearest mode.
 *
 * Performs \p half2 vector add of inputs \p a and \p b, in round-to-nearest
 * mode.
 *
 * @return Returns the \p half2 vector result of adding vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector subtraction in round-to-nearest mode.
 *
 * Subtracts \p half2 input vector \p b from input vector \p a in round-to-nearest
 * mode.
 *
 * @return Returns the \p half2 vector result of subtraction vector \p b from \p
 * a.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector multiplication in round-to-nearest mode.
 *
 * Performs \p half2 vector multiplication of inputs \p a and \p b, in
 * round-to-nearest mode.
 *
 * @return Returns the \p half2 vector result of multiplying vectors \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector addition in round-to-nearest mode, with
 * saturation to [0.0, 1.0].
 *
 * Performs \p half2 vector add of inputs \p a and \p b, in round-to-nearest mode,
 * and clamps the results to range [0.0, 1.0]. NaN results are flushed to +0.0.
 *
 * @return Returns the \p half2 vector result of adding vectors \p a and \p b
 * with saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector subtraction in round-to-nearest mode, with
 * saturation to [0.0, 1.0].
 *
 * Subtracts \p half2 input vector \p b from input vector \p a in round-to-nearest
 * mode,
 * and clamps the results to range [0.0, 1.0]. NaN results are flushed to +0.0.
 *
 * @return Returns the \p half2 vector result of subtraction vector \p b from \p a
 * with saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector multiplication in round-to-nearest mode, with
 * saturation to [0.0, 1.0].
 *
 * Performs \p half2 vector multiplication of inputs \p a and \p b, in
 * round-to-nearest mode, and clamps the results to range [0.0, 1.0]. NaN
 * results are flushed to +0.0.
 *
 * @return Returns the \p half2 vector result of multiplying vectors \p a and \p
 * b with saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector fused multiply-add in round-to-nearest mode.
 *
 * Performs \p half2 vector multiply on inputs \p a and \p b,
 * then performs a \p half2 vector add of the result with \p c,
 * rounding the result once in round-to-nearest mode.
 *
 * @return Returns the \p half2 vector result of the fused multiply-add
 * operation on vectors \p a, \p b, and \p c.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Performs \p half2 vector fused multiply-add in round-to-nearest mode,
 * with saturation to [0.0, 1.0].
 *
 * Performs \p half2 vector multiply on inputs \p a and \p b,
 * then performs a \p half2 vector add of the result with \p c,
 * rounding the result once in round-to-nearest mode, and clamps the results to
 * range [0.0, 1.0]. NaN results are flushed to +0.0.
 *
 * @return Returns the \p half2 vector result of the fused multiply-add
 * operation on vectors \p a, \p b, and \p c with saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF2_ARITHMETIC
 * \brief Negates both halves of the input \p half2 number and returns the result.
 *
 * Negates both halves of the input \p half2 number \p a and returns the result.
 *
 * @return Returns \p half2 number with both halves negated.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half addition in round-to-nearest mode.
 *
 * Performs \p half addition of inputs \p a and \p b, in round-to-nearest mode.
 *
 * @return Returns the \p half result of adding \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half subtraction in round-to-nearest mode.
 *
 * Subtracts \p half input \p b from input \p a in round-to-nearest
 * mode.
 *
 * @return Returns the \p half result of subtraction \p b from \p a.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half multiplication in round-to-nearest mode.
 *
 * Performs \p half multiplication of inputs \p a and \p b, in round-to-nearest
 * mode.
 *
 * @return Returns the \p half result of multiplying \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half addition in round-to-nearest mode, with saturation to
 * [0.0, 1.0].
 *
 * Performs \p half add of inputs \p a and \p b, in round-to-nearest mode,
 * and clamps the result to range [0.0, 1.0]. NaN results are flushed to +0.0.
 *
 * @return Returns the \p half result of adding \p a and \p b with saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half subtraction in round-to-nearest mode, with saturation
 * to [0.0, 1.0].
 *
 * Subtracts \p half input \p b from input \p a in round-to-nearest
 * mode,
 * and clamps the result to range [0.0, 1.0]. NaN results are flushed to +0.0.
 *
 * @return Returns the \p half result of subtraction \p b from \p a
 * with saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half multiplication in round-to-nearest mode, with
 * saturation to [0.0, 1.0].
 *
 * Performs \p half multiplication of inputs \p a and \p b, in round-to-nearest
 * mode, and clamps the result to range [0.0, 1.0]. NaN results are flushed to
 * +0.0.
 *
 * @return Returns the \p half result of multiplying \p a and \p b with
 * saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half fused multiply-add in round-to-nearest mode.
 *
 * Performs \p half multiply on inputs \p a and \p b,
 * then performs a \p half add of the result with \p c,
 * rounding the result once in round-to-nearest mode.
 *
 * @return Returns the \p half result of the fused multiply-add operation on \p
 * a, \p b, and \p c.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Performs \p half fused multiply-add in round-to-nearest mode,
 * with saturation to [0.0, 1.0].
 *
 * Performs \p half multiply on inputs \p a and \p b,
 * then performs a \p half add of the result with \p c,
 * rounding the result once in round-to-nearest mode, and clamps the result to
 * range [0.0, 1.0]. NaN results are flushed to +0.0.
 *
 * @return Returns the \p half result of the fused multiply-add operation on \p
 * a, \p b, and \p c with saturation.
 */
/**
 * \ingroup CUDA_MATH__HALF_ARITHMETIC
 * \brief Negates input \p half number and returns the result.
 *
 * Negates input \p half number and returns the result.
 *
 * @return Returns negated \p half input \p a.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector if-equal comparison, and returns boolean true
 * iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector if-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half if-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate false results.
 *
 * @return Returns boolean true if both \p half results of if-equal comparison
 * of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector not-equal comparison, and returns boolean
 * true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector not-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half not-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate false results.
 *
 * @return Returns boolean true if both \p half results of not-equal comparison
 * of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector less-equal comparison, and returns boolean
 * true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector less-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half less-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate false results.
 *
 * @return Returns boolean true if both \p half results of less-equal comparison
 * of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector greater-equal comparison, and returns boolean
 * true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector greater-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half greater-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate false results.
 *
 * @return Returns boolean true if both \p half results of greater-equal
 * comparison of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector less-than comparison, and returns boolean
 * true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector less-than comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half less-than comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate false results.
 *
 * @return Returns boolean true if both \p half results of less-than comparison
 * of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector greater-than comparison, and returns boolean
 * true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector greater-than comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half greater-than comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate false results.
 *
 * @return Returns boolean true if both \p half results of greater-than
 * comparison of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered if-equal comparison, and returns
 * boolean true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector if-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half if-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate true results.
 *
 * @return Returns boolean true if both \p half results of unordered if-equal
 * comparison of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered not-equal comparison, and returns
 * boolean true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector not-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half not-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate true results.
 *
 * @return Returns boolean true if both \p half results of unordered not-equal
 * comparison of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered less-equal comparison, and returns
 * boolean true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector less-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half less-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate true results.
 *
 * @return Returns boolean true if both \p half results of unordered less-equal
 * comparison of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered greater-equal comparison, and
 * returns boolean true iff both \p half results are true, boolean false
 * otherwise.
 *
 * Performs \p half2 vector greater-equal comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half greater-equal comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate true results.
 *
 * @return Returns boolean true if both \p half results of unordered
 * greater-equal comparison of vectors \p a and \p b are true, boolean false
 * otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered less-than comparison, and returns
 * boolean true iff both \p half results are true, boolean false otherwise.
 *
 * Performs \p half2 vector less-than comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half less-than comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate true results.
 *
 * @return Returns boolean true if both \p half results of unordered less-than
 * comparison of vectors \p a and \p b are true, boolean false otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF2_COMPARISON
 * \brief Performs \p half2 vector unordered greater-than comparison, and
 * returns boolean true iff both \p half results are true, boolean false
 * otherwise.
 *
 * Performs \p half2 vector greater-than comparison of inputs \p a and \p b.
 * The bool result is set to true only if both \p half greater-than comparisons
 * evaluate to true, or false otherwise.
 * NaN inputs generate true results.
 *
 * @return Returns boolean true if both \p half results of unordered
 * greater-than comparison of vectors \p a and \p b are true, boolean false
 * otherwise.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half if-equal comparison.
 *
 * Performs \p half if-equal comparison of inputs \p a and \p b.
 * NaN inputs generate false results.
 *
 * @return Returns boolean result of if-equal comparison of \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half not-equal comparison.
 *
 * Performs \p half not-equal comparison of inputs \p a and \p b.
 * NaN inputs generate false results.
 *
 * @return Returns boolean result of not-equal comparison of \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half less-equal comparison.
 *
 * Performs \p half less-equal comparison of inputs \p a and \p b.
 * NaN inputs generate false results.
 *
 * @return Returns boolean result of less-equal comparison of \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half greater-equal comparison.
 *
 * Performs \p half greater-equal comparison of inputs \p a and \p b.
 * NaN inputs generate false results.
 *
 * @return Returns boolean result of greater-equal comparison of \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half less-than comparison.
 *
 * Performs \p half less-than comparison of inputs \p a and \p b.
 * NaN inputs generate false results.
 *
 * @return Returns boolean result of less-than comparison of \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half greater-than comparison.
 *
 * Performs \p half greater-than comparison of inputs \p a and \p b.
 * NaN inputs generate false results.
 *
 * @return Returns boolean result of greater-than comparison of \p a and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half unordered if-equal comparison.
 *
 * Performs \p half if-equal comparison of inputs \p a and \p b.
 * NaN inputs generate true results.
 *
 * @return Returns boolean result of unordered if-equal comparison of \p a and
 * \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half unordered not-equal comparison.
 *
 * Performs \p half not-equal comparison of inputs \p a and \p b.
 * NaN inputs generate true results.
 *
 * @return Returns boolean result of unordered not-equal comparison of \p a and
 * \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half unordered less-equal comparison.
 *
 * Performs \p half less-equal comparison of inputs \p a and \p b.
 * NaN inputs generate true results.
 *
 * @return Returns boolean result of unordered less-equal comparison of \p a and
 * \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half unordered greater-equal comparison.
 *
 * Performs \p half greater-equal comparison of inputs \p a and \p b.
 * NaN inputs generate true results.
 *
 * @return Returns boolean result of unordered greater-equal comparison of \p a
 * and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half unordered less-than comparison.
 *
 * Performs \p half less-than comparison of inputs \p a and \p b.
 * NaN inputs generate true results.
 *
 * @return Returns boolean result of unordered less-than comparison of \p a and
 * \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Performs \p half unordered greater-than comparison.
 *
 * Performs \p half greater-than comparison of inputs \p a and \p b.
 * NaN inputs generate true results.
 *
 * @return Returns boolean result of unordered greater-than comparison of \p a
 * and \p b.
 */
/**
 * \ingroup CUDA_MATH__HALF_COMPARISON
 * \brief Determine whether \p half argument is a NaN.
 *
 * Determine whether \p half value \p a is a NaN.
 *
 * @return Returns boolean true iff argument is a NaN, boolean false otherwise.
 */

// #endif /*if __CUDA_ARCH__ >= 530 || !defined(__CUDA_ARCH__)*/
// #if __CUDA_ARCH__ >= 300 || !defined(__CUDA_ARCH__)
/******************************************************************************
 *                            __half2 warp shuffle                            *
 ******************************************************************************/
// #define SHUFFLE_HALF2_MACRO(name) do {
//    __half2 r;
//    asm("{"#name" %0,%1,%2,%3;\n}"
//        :"=r"(r.x): "r"(var.x), "r"(delta), "r"(c));
//    return r;
// } while(0);
// #undef SHUFFLE_HALF2_MACRO
// #endif /*__CUDA_ARCH__ >= 300 || !defined(__CUDA_ARCH__)*/
/******************************************************************************
 *                          __half and __half2 __ldg                          *
 ******************************************************************************/
// #if defined(__cplusplus) && (__CUDA_ARCH__ >= 320 || !defined(__CUDA_ARCH__))
// #if (defined(_MSC_VER) && defined(_WIN64)) || defined(__LP64__) || defined(__CUDACC_RTC__)
// #define __LDG_PTR   "l"
// #else
// #define __LDG_PTR   "r"
// #endif /*(defined(_MSC_VER) && defined(_WIN64)) || defined(__LP64__) || defined(__CUDACC_RTC__)*/
// #undef __LDG_PTR
// #endif /*defined(__cplusplus) && (__CUDA_ARCH__ >= 320 || !defined(__CUDA_ARCH__))*/
// #if __CUDA_ARCH__ >= 530 || !defined(__CUDA_ARCH__)
/******************************************************************************
 *                             __half2 comparison                             *
 ******************************************************************************/
// #define COMPARISON_OP_HALF2_MACRO(name) do {
//    __half2 val;
//    asm( "{ "#name".f16x2.f16x2 %0,%1,%2;\n}"
//         :"=r"(val.x) : "r"(a.x),"r"(b.x));
//    return val;
// } while(0);
// #undef COMPARISON_OP_HALF2_MACRO
// #define BOOL_COMPARISON_OP_HALF2_MACRO(name) do {
//    __half2 val;
//    asm( "{ "#name".f16x2.f16x2 %0,%1,%2;\n}"
//         :"=r"(val.x) : "r"(a.x),"r"(b.x));
//    if (val.x == 0x3C003C00)
//       return true;
//    else
//       return false;
// } while(0);
// #undef BOOL_COMPARISON_OP_HALF2_MACRO
/******************************************************************************
 *                             __half comparison                              *
 ******************************************************************************/
// #define COMPARISON_OP_HALF_MACRO(name) do {
//    unsigned short val;
//    asm( "{ .reg .pred __$temp3;\n"
//         "  setp."#name".f16  __$temp3, %1, %2;\n"
//         "  selp.u16 %0, 1, 0, __$temp3;}"
//         : "=h"(val) : "h"(a.x), "h"(b.x));
//    return val ? true : false;
// } while(0);
// #undef COMPARISON_OP_HALF_MACRO
/******************************************************************************
 *                            __half2 arithmetic                             *
 ******************************************************************************/
// #define BINARY_OP_HALF2_MACRO(name) do {
//    __half2 val;
//    asm( "{"#name".f16x2 %0,%1,%2;\n}"
//         :"=r"(val.x) : "r"(a.x),"r"(b.x));
//    return val;
// } while(0);
// #undef BINARY_OP_HALF2_MACRO
// #define TERNARY_OP_HALF2_MACRO(name) do {
//    __half2 val;
//    asm( "{"#name".f16x2 %0,%1,%2,%3;\n}"
//         :"=r"(val.x) : "r"(a.x),"r"(b.x),"r"(c.x));
//    return val;
// } while(0);
// #undef TERNARY_OP_HALF2_MACRO
/******************************************************************************
 *                             __half arithmetic                             *
 ******************************************************************************/
// #define BINARY_OP_HALF_MACRO(name) do {
//    __half val;
//    asm( "{"#name".f16 %0,%1,%2;\n}"
//         :"=h"(val.x) : "h"(a.x),"h"(b.x));
//    return val;
// } while(0);
// #undef BINARY_OP_HALF_MACRO
// #define TERNARY_OP_HALF_MACRO(name) do {
//    __half val;
//    asm( "{"#name".f16 %0,%1,%2,%3;\n}"
//         :"=h"(val.x) : "h"(a.x),"h"(b.x),"h"(c.x));
//    return val;
// } while(0);
// #undef TERNARY_OP_HALF2_MACRO
// #endif /*__CUDA_ARCH__ >= 530 || !defined(__CUDA_ARCH__)*/
// #undef __CUDA_FP16_DECL__
// #endif /*defined(__CUDACC__)*/
// #endif /* end of include guard: CUDA_FP16_H_JNESTUG4 */


}
