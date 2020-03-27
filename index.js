
import { NativeModules } from 'react-native'

const { RNTBadge } = NativeModules

export default {

  getBadge() {
    return RNTBadge.getBadge()
  },

  setBadge(value) {
    RNTBadge.setBadge(value)
  },

}
