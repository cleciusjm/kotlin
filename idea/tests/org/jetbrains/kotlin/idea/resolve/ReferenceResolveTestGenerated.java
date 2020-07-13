/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/references")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ReferenceResolveTestGenerated extends AbstractReferenceResolveTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInReferences() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @TestMetadata("AnnotationForClass.kt")
    public void testAnnotationForClass() throws Exception {
        runTest("idea/testData/resolve/references/AnnotationForClass.kt");
    }

    @TestMetadata("AnnotationInsideFunction.kt")
    public void testAnnotationInsideFunction() throws Exception {
        runTest("idea/testData/resolve/references/AnnotationInsideFunction.kt");
    }

    @TestMetadata("AnnotationOnFile.kt")
    public void testAnnotationOnFile() throws Exception {
        runTest("idea/testData/resolve/references/AnnotationOnFile.kt");
    }

    @TestMetadata("AnnotationOnFileWithImport.kt")
    public void testAnnotationOnFileWithImport() throws Exception {
        runTest("idea/testData/resolve/references/AnnotationOnFileWithImport.kt");
    }

    @TestMetadata("AnnotationParameter.kt")
    public void testAnnotationParameter() throws Exception {
        runTest("idea/testData/resolve/references/AnnotationParameter.kt");
    }

    @TestMetadata("AnnotationTypeParameter.kt")
    public void testAnnotationTypeParameter() throws Exception {
        runTest("idea/testData/resolve/references/AnnotationTypeParameter.kt");
    }

    @TestMetadata("ClassInTypeConstraint.kt")
    public void testClassInTypeConstraint() throws Exception {
        runTest("idea/testData/resolve/references/ClassInTypeConstraint.kt");
    }

    @TestMetadata("ClassNameBeforeDot.kt")
    public void testClassNameBeforeDot() throws Exception {
        runTest("idea/testData/resolve/references/ClassNameBeforeDot.kt");
    }

    @TestMetadata("ClassObjectClassLiteralReference.kt")
    public void testClassObjectClassLiteralReference() throws Exception {
        runTest("idea/testData/resolve/references/ClassObjectClassLiteralReference.kt");
    }

    @TestMetadata("ClassObjectClassLiteralReferenceWithField.kt")
    public void testClassObjectClassLiteralReferenceWithField() throws Exception {
        runTest("idea/testData/resolve/references/ClassObjectClassLiteralReferenceWithField.kt");
    }

    @TestMetadata("ClassQualifierForNestedClassConstructorCall.kt")
    public void testClassQualifierForNestedClassConstructorCall() throws Exception {
        runTest("idea/testData/resolve/references/ClassQualifierForNestedClassConstructorCall.kt");
    }

    @TestMetadata("ClassReferenceInImport.kt")
    public void testClassReferenceInImport() throws Exception {
        runTest("idea/testData/resolve/references/ClassReferenceInImport.kt");
    }

    @TestMetadata("CollectionLiteralLeft.kt")
    public void testCollectionLiteralLeft() throws Exception {
        runTest("idea/testData/resolve/references/CollectionLiteralLeft.kt");
    }

    @TestMetadata("CollectionLiteralRight.kt")
    public void testCollectionLiteralRight() throws Exception {
        runTest("idea/testData/resolve/references/CollectionLiteralRight.kt");
    }

    @TestMetadata("CoroutineSuspensionPoint.kt")
    public void testCoroutineSuspensionPoint() throws Exception {
        runTest("idea/testData/resolve/references/CoroutineSuspensionPoint.kt");
    }

    @TestMetadata("CtrlClickResolve.kt")
    public void testCtrlClickResolve() throws Exception {
        runTest("idea/testData/resolve/references/CtrlClickResolve.kt");
    }

    @TestMetadata("DataClassCopy.kt")
    public void testDataClassCopy() throws Exception {
        runTest("idea/testData/resolve/references/DataClassCopy.kt");
    }

    @TestMetadata("DefaultObjectAsExtensionReceiverForFunction.kt")
    public void testDefaultObjectAsExtensionReceiverForFunction() throws Exception {
        runTest("idea/testData/resolve/references/DefaultObjectAsExtensionReceiverForFunction.kt");
    }

    @TestMetadata("DefaultObjectAsExtensionReceiverForProperty.kt")
    public void testDefaultObjectAsExtensionReceiverForProperty() throws Exception {
        runTest("idea/testData/resolve/references/DefaultObjectAsExtensionReceiverForProperty.kt");
    }

    @TestMetadata("DefaultObjectAsReceiverForExtensionFunctionOnSuperType.kt")
    public void testDefaultObjectAsReceiverForExtensionFunctionOnSuperType() throws Exception {
        runTest("idea/testData/resolve/references/DefaultObjectAsReceiverForExtensionFunctionOnSuperType.kt");
    }

    @TestMetadata("DefaultObjectAsReceiverForMemberPropertyInSuperType.kt")
    public void testDefaultObjectAsReceiverForMemberPropertyInSuperType() throws Exception {
        runTest("idea/testData/resolve/references/DefaultObjectAsReceiverForMemberPropertyInSuperType.kt");
    }

    @TestMetadata("DefaultObjectInShortReferenceFormCall.kt")
    public void testDefaultObjectInShortReferenceFormCall() throws Exception {
        runTest("idea/testData/resolve/references/DefaultObjectInShortReferenceFormCall.kt");
    }

    @TestMetadata("EnumValues.kt")
    public void testEnumValues() throws Exception {
        runTest("idea/testData/resolve/references/EnumValues.kt");
    }

    @TestMetadata("FakeJavaLang1.kt")
    public void testFakeJavaLang1() throws Exception {
        runTest("idea/testData/resolve/references/FakeJavaLang1.kt");
    }

    @TestMetadata("FakeJavaLang2.kt")
    public void testFakeJavaLang2() throws Exception {
        runTest("idea/testData/resolve/references/FakeJavaLang2.kt");
    }

    @TestMetadata("FakeJavaLang3.kt")
    public void testFakeJavaLang3() throws Exception {
        runTest("idea/testData/resolve/references/FakeJavaLang3.kt");
    }

    @TestMetadata("FakeJavaLang4.kt")
    public void testFakeJavaLang4() throws Exception {
        runTest("idea/testData/resolve/references/FakeJavaLang4.kt");
    }

    @TestMetadata("fileRefInRawStringLiteral.kt")
    public void testFileRefInRawStringLiteral() throws Exception {
        runTest("idea/testData/resolve/references/fileRefInRawStringLiteral.kt");
    }

    @TestMetadata("fileRefInStringLiteral.kt")
    public void testFileRefInStringLiteral() throws Exception {
        runTest("idea/testData/resolve/references/fileRefInStringLiteral.kt");
    }

    @TestMetadata("GenericFunctionParameter.kt")
    public void testGenericFunctionParameter() throws Exception {
        runTest("idea/testData/resolve/references/GenericFunctionParameter.kt");
    }

    @TestMetadata("GenericTypeInFunctionParameter.kt")
    public void testGenericTypeInFunctionParameter() throws Exception {
        runTest("idea/testData/resolve/references/GenericTypeInFunctionParameter.kt");
    }

    @TestMetadata("ImportFromRootScope.kt")
    public void testImportFromRootScope() throws Exception {
        runTest("idea/testData/resolve/references/ImportFromRootScope.kt");
    }

    @TestMetadata("InClassParameter.kt")
    public void testInClassParameter() throws Exception {
        runTest("idea/testData/resolve/references/InClassParameter.kt");
    }

    @TestMetadata("InClassParameterField.kt")
    public void testInClassParameterField() throws Exception {
        runTest("idea/testData/resolve/references/InClassParameterField.kt");
    }

    @TestMetadata("InEnumEntry.kt")
    public void testInEnumEntry() throws Exception {
        runTest("idea/testData/resolve/references/InEnumEntry.kt");
    }

    @TestMetadata("InFunctionParameterType.kt")
    public void testInFunctionParameterType() throws Exception {
        runTest("idea/testData/resolve/references/InFunctionParameterType.kt");
    }

    @TestMetadata("InMethodParameter.kt")
    public void testInMethodParameter() throws Exception {
        runTest("idea/testData/resolve/references/InMethodParameter.kt");
    }

    @TestMetadata("InObjectClassObject.kt")
    public void testInObjectClassObject() throws Exception {
        runTest("idea/testData/resolve/references/InObjectClassObject.kt");
    }

    @TestMetadata("InSecondClassObject.kt")
    public void testInSecondClassObject() throws Exception {
        runTest("idea/testData/resolve/references/InSecondClassObject.kt");
    }

    @TestMetadata("JavaAnnotationParameter.kt")
    public void testJavaAnnotationParameter() throws Exception {
        runTest("idea/testData/resolve/references/JavaAnnotationParameter.kt");
    }

    @TestMetadata("JavaConstructorNotNullParameter.kt")
    public void testJavaConstructorNotNullParameter() throws Exception {
        runTest("idea/testData/resolve/references/JavaConstructorNotNullParameter.kt");
    }

    @TestMetadata("JavaEnumEntry.kt")
    public void testJavaEnumEntry() throws Exception {
        runTest("idea/testData/resolve/references/JavaEnumEntry.kt");
    }

    @TestMetadata("JavaEnumValueOf.kt")
    public void testJavaEnumValueOf() throws Exception {
        runTest("idea/testData/resolve/references/JavaEnumValueOf.kt");
    }

    @TestMetadata("JavaParameter.kt")
    public void testJavaParameter() throws Exception {
        runTest("idea/testData/resolve/references/JavaParameter.kt");
    }

    @TestMetadata("JavaReference.kt")
    public void testJavaReference() throws Exception {
        runTest("idea/testData/resolve/references/JavaReference.kt");
    }

    @TestMetadata("MultiDeclarationExtension.kt")
    public void testMultiDeclarationExtension() throws Exception {
        runTest("idea/testData/resolve/references/MultiDeclarationExtension.kt");
    }

    @TestMetadata("MultiDeclarationMember.kt")
    public void testMultiDeclarationMember() throws Exception {
        runTest("idea/testData/resolve/references/MultiDeclarationMember.kt");
    }

    @TestMetadata("NamedClassObject.kt")
    public void testNamedClassObject() throws Exception {
        runTest("idea/testData/resolve/references/NamedClassObject.kt");
    }

    @TestMetadata("PackageReference.kt")
    public void testPackageReference() throws Exception {
        runTest("idea/testData/resolve/references/PackageReference.kt");
    }

    @TestMetadata("PackageReferenceInImport.kt")
    public void testPackageReferenceInImport() throws Exception {
        runTest("idea/testData/resolve/references/PackageReferenceInImport.kt");
    }

    @TestMetadata("PropertyPlaceInClassObjectInObject.kt")
    public void testPropertyPlaceInClassObjectInObject() throws Exception {
        runTest("idea/testData/resolve/references/PropertyPlaceInClassObjectInObject.kt");
    }

    @TestMetadata("ReferenceInClassWhereConstraint.kt")
    public void testReferenceInClassWhereConstraint() throws Exception {
        runTest("idea/testData/resolve/references/ReferenceInClassWhereConstraint.kt");
    }

    @TestMetadata("ReferenceInFunWhereConstraint.kt")
    public void testReferenceInFunWhereConstraint() throws Exception {
        runTest("idea/testData/resolve/references/ReferenceInFunWhereConstraint.kt");
    }

    @TestMetadata("ReferenceToSam.kt")
    public void testReferenceToSam() throws Exception {
        runTest("idea/testData/resolve/references/ReferenceToSam.kt");
    }

    @TestMetadata("ResolveClass.kt")
    public void testResolveClass() throws Exception {
        runTest("idea/testData/resolve/references/ResolveClass.kt");
    }

    @TestMetadata("ResolvePackageInProperty.kt")
    public void testResolvePackageInProperty() throws Exception {
        runTest("idea/testData/resolve/references/ResolvePackageInProperty.kt");
    }

    @TestMetadata("ResolvePackageInTheEndInProperty.kt")
    public void testResolvePackageInTheEndInProperty() throws Exception {
        runTest("idea/testData/resolve/references/ResolvePackageInTheEndInProperty.kt");
    }

    @TestMetadata("ResolvePackageInTheMiddleInProperty.kt")
    public void testResolvePackageInTheMiddleInProperty() throws Exception {
        runTest("idea/testData/resolve/references/ResolvePackageInTheMiddleInProperty.kt");
    }

    @TestMetadata("ResolvePackageInTheTypeNameInProperty.kt")
    public void testResolvePackageInTheTypeNameInProperty() throws Exception {
        runTest("idea/testData/resolve/references/ResolvePackageInTheTypeNameInProperty.kt");
    }

    @TestMetadata("SamAdapter.kt")
    public void testSamAdapter() throws Exception {
        runTest("idea/testData/resolve/references/SamAdapter.kt");
    }

    @TestMetadata("SamConstructor.kt")
    public void testSamConstructor() throws Exception {
        runTest("idea/testData/resolve/references/SamConstructor.kt");
    }

    @TestMetadata("SamConstructorTypeArguments.kt")
    public void testSamConstructorTypeArguments() throws Exception {
        runTest("idea/testData/resolve/references/SamConstructorTypeArguments.kt");
    }

    @TestMetadata("SeveralOverrides.kt")
    public void testSeveralOverrides() throws Exception {
        runTest("idea/testData/resolve/references/SeveralOverrides.kt");
    }

    @TestMetadata("SyntheticProperty.kt")
    public void testSyntheticProperty() throws Exception {
        runTest("idea/testData/resolve/references/SyntheticProperty.kt");
    }

    @TestMetadata("TypeAlias.kt")
    public void testTypeAlias() throws Exception {
        runTest("idea/testData/resolve/references/TypeAlias.kt");
    }

    @TestMetadata("TypeAliasAsSupertypeConstructor.kt")
    public void testTypeAliasAsSupertypeConstructor() throws Exception {
        runTest("idea/testData/resolve/references/TypeAliasAsSupertypeConstructor.kt");
    }

    @TestMetadata("TypeAliasRHS.kt")
    public void testTypeAliasRHS() throws Exception {
        runTest("idea/testData/resolve/references/TypeAliasRHS.kt");
    }

    @TestMetadata("TypeArgumentBeforeDot.kt")
    public void testTypeArgumentBeforeDot() throws Exception {
        runTest("idea/testData/resolve/references/TypeArgumentBeforeDot.kt");
    }

    @TestMetadata("TypeArgumentBeforeDot2.kt")
    public void testTypeArgumentBeforeDot2() throws Exception {
        runTest("idea/testData/resolve/references/TypeArgumentBeforeDot2.kt");
    }

    @TestMetadata("TypeArgumentUnresolvedClass.kt")
    public void testTypeArgumentUnresolvedClass() throws Exception {
        runTest("idea/testData/resolve/references/TypeArgumentUnresolvedClass.kt");
    }

    @TestMetadata("TypeArgumentUnresolvedConstructor.kt")
    public void testTypeArgumentUnresolvedConstructor() throws Exception {
        runTest("idea/testData/resolve/references/TypeArgumentUnresolvedConstructor.kt");
    }

    @TestMetadata("TypeArgumentWrongNumber.kt")
    public void testTypeArgumentWrongNumber() throws Exception {
        runTest("idea/testData/resolve/references/TypeArgumentWrongNumber.kt");
    }

    @TestMetadata("TypeParameterInAnonymousObject.kt")
    public void testTypeParameterInAnonymousObject() throws Exception {
        runTest("idea/testData/resolve/references/TypeParameterInAnonymousObject.kt");
    }

    @TestMetadata("TypeParameterInFunctionLiteral.kt")
    public void testTypeParameterInFunctionLiteral() throws Exception {
        runTest("idea/testData/resolve/references/TypeParameterInFunctionLiteral.kt");
    }

    @TestMetadata("ValueParameter.kt")
    public void testValueParameter() throws Exception {
        runTest("idea/testData/resolve/references/ValueParameter.kt");
    }

    @TestMetadata("WrongNumberOfTypeArguments.kt")
    public void testWrongNumberOfTypeArguments() throws Exception {
        runTest("idea/testData/resolve/references/WrongNumberOfTypeArguments.kt");
    }

    @TestMetadata("WrongNumberOfTypeArguments2.kt")
    public void testWrongNumberOfTypeArguments2() throws Exception {
        runTest("idea/testData/resolve/references/WrongNumberOfTypeArguments2.kt");
    }

    @TestMetadata("WrongNumberOfTypeArgumentsInSupertype.kt")
    public void testWrongNumberOfTypeArgumentsInSupertype() throws Exception {
        runTest("idea/testData/resolve/references/WrongNumberOfTypeArgumentsInSupertype.kt");
    }

    @TestMetadata("idea/testData/resolve/references/arrayAccess")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ArrayAccess extends AbstractReferenceResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInArrayAccess() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/arrayAccess"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("get.kt")
        public void testGet() throws Exception {
            runTest("idea/testData/resolve/references/arrayAccess/get.kt");
        }

        @TestMetadata("set.kt")
        public void testSet() throws Exception {
            runTest("idea/testData/resolve/references/arrayAccess/set.kt");
        }
    }

    @TestMetadata("idea/testData/resolve/references/delegatedPropertyAccessors")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DelegatedPropertyAccessors extends AbstractReferenceResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDelegatedPropertyAccessors() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/delegatedPropertyAccessors"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("unresolved.kt")
        public void testUnresolved() throws Exception {
            runTest("idea/testData/resolve/references/delegatedPropertyAccessors/unresolved.kt");
        }

        @TestMetadata("idea/testData/resolve/references/delegatedPropertyAccessors/inSource")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InSource extends AbstractReferenceResolveTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInInSource() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/delegatedPropertyAccessors/inSource"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
            }

            @TestMetadata("getExtension.kt")
            public void testGetExtension() throws Exception {
                runTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getExtension.kt");
            }

            @TestMetadata("getMember.kt")
            public void testGetMember() throws Exception {
                runTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getMember.kt");
            }

            @TestMetadata("getMultipleDeclarations.kt")
            public void testGetMultipleDeclarations() throws Exception {
                runTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getMultipleDeclarations.kt");
            }

            @TestMetadata("getOneFakeOverride.kt")
            public void testGetOneFakeOverride() throws Exception {
                runTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getOneFakeOverride.kt");
            }
        }

        @TestMetadata("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InStandardLibrary extends AbstractReferenceResolveTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInInStandardLibrary() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
            }

            @TestMetadata("lazy.kt")
            public void testLazy() throws Exception {
                runTest("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary/lazy.kt");
            }

            @TestMetadata("notNull.kt")
            public void testNotNull() throws Exception {
                runTest("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary/notNull.kt");
            }
        }
    }

    @TestMetadata("idea/testData/resolve/references/forLoopIn")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ForLoopIn extends AbstractReferenceResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInForLoopIn() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/forLoopIn"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("unresolvedIterator.kt")
        public void testUnresolvedIterator() throws Exception {
            runTest("idea/testData/resolve/references/forLoopIn/unresolvedIterator.kt");
        }

        @TestMetadata("idea/testData/resolve/references/forLoopIn/inBuiltIns")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InBuiltIns extends AbstractReferenceResolveTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInInBuiltIns() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/forLoopIn/inBuiltIns"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
            }

            @TestMetadata("extension.kt")
            public void testExtension() throws Exception {
                runTest("idea/testData/resolve/references/forLoopIn/inBuiltIns/extension.kt");
            }

            @TestMetadata("member.kt")
            public void testMember() throws Exception {
                runTest("idea/testData/resolve/references/forLoopIn/inBuiltIns/member.kt");
            }
        }

        @TestMetadata("idea/testData/resolve/references/forLoopIn/inLibrary")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InLibrary extends AbstractReferenceResolveTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInInLibrary() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/forLoopIn/inLibrary"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
            }

            @TestMetadata("extension.kt")
            public void testExtension() throws Exception {
                runTest("idea/testData/resolve/references/forLoopIn/inLibrary/extension.kt");
            }
        }

        @TestMetadata("idea/testData/resolve/references/forLoopIn/inSource")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InSource extends AbstractReferenceResolveTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("allExtensions.kt")
            public void testAllExtensions() throws Exception {
                runTest("idea/testData/resolve/references/forLoopIn/inSource/allExtensions.kt");
            }

            public void testAllFilesPresentInInSource() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/forLoopIn/inSource"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
            }

            @TestMetadata("allMembers.kt")
            public void testAllMembers() throws Exception {
                runTest("idea/testData/resolve/references/forLoopIn/inSource/allMembers.kt");
            }

            @TestMetadata("nextMissing.kt")
            public void testNextMissing() throws Exception {
                runTest("idea/testData/resolve/references/forLoopIn/inSource/nextMissing.kt");
            }
        }
    }

    @TestMetadata("idea/testData/resolve/references/invoke")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Invoke extends AbstractReferenceResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInInvoke() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/references/invoke"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("lambdaAndParens.kt")
        public void testLambdaAndParens() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaAndParens.kt");
        }

        @TestMetadata("lambdaAndParensIncorrectVararg.kt")
        public void testLambdaAndParensIncorrectVararg() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaAndParensIncorrectVararg.kt");
        }

        @TestMetadata("lambdaNoPar.kt")
        public void testLambdaNoPar() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaNoPar.kt");
        }

        @TestMetadata("lambdaNoParIncorrectVararg.kt")
        public void testLambdaNoParIncorrectVararg() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaNoParIncorrectVararg.kt");
        }

        @TestMetadata("lambdaNoParLabel.kt")
        public void testLambdaNoParLabel() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaNoParLabel.kt");
        }

        @TestMetadata("lambdaNoParLabelIncorrectVararg.kt")
        public void testLambdaNoParLabelIncorrectVararg() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaNoParLabelIncorrectVararg.kt");
        }

        @TestMetadata("lambdaNoParRCurly.kt")
        public void testLambdaNoParRCurly() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaNoParRCurly.kt");
        }

        @TestMetadata("lambdaNoParRCurlyIncorrectVararg.kt")
        public void testLambdaNoParRCurlyIncorrectVararg() throws Exception {
            runTest("idea/testData/resolve/references/invoke/lambdaNoParRCurlyIncorrectVararg.kt");
        }

        @TestMetadata("noParams.kt")
        public void testNoParams() throws Exception {
            runTest("idea/testData/resolve/references/invoke/noParams.kt");
        }

        @TestMetadata("noParamsRPar.kt")
        public void testNoParamsRPar() throws Exception {
            runTest("idea/testData/resolve/references/invoke/noParamsRPar.kt");
        }

        @TestMetadata("nonemptyLambdaRPar.kt")
        public void testNonemptyLambdaRPar() throws Exception {
            runTest("idea/testData/resolve/references/invoke/nonemptyLambdaRPar.kt");
        }

        @TestMetadata("nonemptyLambdaRParIncorrectVararg.kt")
        public void testNonemptyLambdaRParIncorrectVararg() throws Exception {
            runTest("idea/testData/resolve/references/invoke/nonemptyLambdaRParIncorrectVararg.kt");
        }

        @TestMetadata("oneParam.kt")
        public void testOneParam() throws Exception {
            runTest("idea/testData/resolve/references/invoke/oneParam.kt");
        }

        @TestMetadata("oneParamRPar.kt")
        public void testOneParamRPar() throws Exception {
            runTest("idea/testData/resolve/references/invoke/oneParamRPar.kt");
        }
    }
}
