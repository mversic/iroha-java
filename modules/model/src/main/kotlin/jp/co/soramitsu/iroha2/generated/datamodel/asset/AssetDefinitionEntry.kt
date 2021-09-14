//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.asset

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.account.Id
import jp.co.soramitsu.iroha2.wrapException

/**
 * AssetDefinitionEntry
 *
 * Generated from 'iroha_data_model::asset::AssetDefinitionEntry' regular structure
 */
public data class AssetDefinitionEntry(
    public val definition: AssetDefinition,
    public val registeredBy: Id
) {
    public companion object : ScaleReader<AssetDefinitionEntry>, ScaleWriter<AssetDefinitionEntry> {
        public override fun read(reader: ScaleCodecReader): AssetDefinitionEntry = try {
            AssetDefinitionEntry(
                AssetDefinition.read(reader),
                Id.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: AssetDefinitionEntry) = try {
            AssetDefinition.write(writer, instance.definition)
            Id.write(writer, instance.registeredBy)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
