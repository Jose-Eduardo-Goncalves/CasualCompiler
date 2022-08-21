	.text
	.file	"benchmark.c"
	.globl	get_hello_w0rld         # -- Begin function get_hello_w0rld
	.p2align	4, 0x90
	.type	get_hello_w0rld,@function
get_hello_w0rld:                        # @get_hello_w0rld
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	movabsq	$.L.str, %rax
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end0:
	.size	get_hello_w0rld, .Lfunc_end0-get_hello_w0rld
	.cfi_endproc
                                        # -- End function
	.globl	d                       # -- Begin function d
	.p2align	4, 0x90
	.type	d,@function
d:                                      # @d
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	movl	%edi, -4(%rbp)
	movl	-4(%rbp), %eax
	shll	$1, %eax
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end1:
	.size	d, .Lfunc_end1-d
	.cfi_endproc
                                        # -- End function
	.globl	fib                     # -- Begin function fib
	.p2align	4, 0x90
	.type	fib,@function
fib:                                    # @fib
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	pushq	%rbx
	pushq	%rax
	.cfi_offset %rbx, -24
	movl	%edi, -12(%rbp)
	cmpl	$2, -12(%rbp)
	jg	.LBB2_2
# %bb.1:
	movl	$1, -16(%rbp)
	jmp	.LBB2_3
.LBB2_2:
	movl	-12(%rbp), %edi
	subl	$1, %edi
	callq	fib
	movl	%eax, %ebx
	movl	-12(%rbp), %edi
	subl	$2, %edi
	callq	fib
	addl	%eax, %ebx
	movl	%ebx, -16(%rbp)
.LBB2_3:
	movl	-16(%rbp), %eax
	addq	$8, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end2:
	.size	fib, .Lfunc_end2-fib
	.cfi_endproc
                                        # -- End function
	.globl	factorial               # -- Begin function factorial
	.p2align	4, 0x90
	.type	factorial,@function
factorial:                              # @factorial
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	movl	%edi, -12(%rbp)
	movl	$1, -8(%rbp)
	movl	$1, -4(%rbp)
.LBB3_1:                                # =>This Inner Loop Header: Depth=1
	movl	-4(%rbp), %eax
	cmpl	-12(%rbp), %eax
	jg	.LBB3_3
# %bb.2:                                #   in Loop: Header=BB3_1 Depth=1
	movl	-8(%rbp), %eax
	imull	-12(%rbp), %eax
	movl	%eax, -8(%rbp)
	movl	-4(%rbp), %eax
	addl	$1, %eax
	movl	%eax, -4(%rbp)
	jmp	.LBB3_1
.LBB3_3:
	movl	-8(%rbp), %eax
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end3:
	.size	factorial, .Lfunc_end3-factorial
	.cfi_endproc
                                        # -- End function
	.globl	main                    # -- Begin function main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$32, %rsp
	movl	$0, -20(%rbp)
	movl	%edi, -16(%rbp)
	movq	%rsi, -8(%rbp)
	callq	get_hello_w0rld
	movabsq	$.L.str.1, %rdi
	movq	%rax, %rsi
	movb	$0, %al
	callq	printf
	movl	$7, %edi
	callq	d
	movabsq	$.L.str.2, %rdi
	movl	%eax, %esi
	movb	$0, %al
	callq	printf
	movl	$5, %edi
	callq	fib
	movabsq	$.L.str.2, %rdi
	movl	%eax, %esi
	movb	$0, %al
	callq	printf
	movl	$4, %edi
	callq	factorial
	movabsq	$.L.str.2, %rdi
	movl	%eax, %esi
	movb	$0, %al
	callq	printf
	movq	-8(%rbp), %rax
	movq	(%rax), %rdi
	callq	atoi
	movl	%eax, -12(%rbp)
	xorl	%eax, %eax
	addq	$32, %rsp
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end4:
	.size	main, .Lfunc_end4-main
	.cfi_endproc
                                        # -- End function
	.type	.L.str,@object          # @.str
	.section	.rodata.str1.1,"aMS",@progbits,1
.L.str:
	.asciz	"Hello World"
	.size	.L.str, 12

	.type	.L.str.1,@object        # @.str.1
.L.str.1:
	.asciz	"%s\n"
	.size	.L.str.1, 4

	.type	.L.str.2,@object        # @.str.2
.L.str.2:
	.asciz	"%d\n"
	.size	.L.str.2, 4

	.ident	"clang version 10.0.0-4ubuntu1 "
	.section	".note.GNU-stack","",@progbits
